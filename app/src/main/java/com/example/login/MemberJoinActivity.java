package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MemberJoinActivity extends AppCompatActivity {
    private EditText editTextLoginId, editTextLoginPasswd, editTextLoginPasswdConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_join);
        setTitle("SUBAK");

        editTextLoginId=(EditText)findViewById(R.id.editTextLoginId);
        editTextLoginPasswd=(EditText)findViewById(R.id.editTextLoginPasswd);
        editTextLoginPasswdConfirm=(EditText)findViewById(R.id.editTextLoginPasswdConfirm);



        findViewById(R.id.buttonDoJoin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doJoin();
            }
        });

        findViewById(R.id.buttonCancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void doJoin(){
        String loginId=editTextLoginId.getText().toString().trim();
        String loginPasswd=editTextLoginPasswd.getText().toString().trim();
        String loginPasswdConfirm=editTextLoginPasswdConfirm.getText().toString().trim();

        if (loginId.length()==0){
            Toast.makeText(this,"아이디를 입력해주세요.", Toast.LENGTH_SHORT).show();
            editTextLoginId.requestFocus();
            return;
        }

        if (loginPasswd.length()==0){
            Toast.makeText(this,"비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show();
            editTextLoginPasswd.requestFocus();
            return;
        }

        if (loginPasswd.equals(loginPasswdConfirm)==false){
            Toast.makeText(this,"비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
            editTextLoginPasswdConfirm.requestFocus();
            return;
        }

        Member member = AppDatabase.findMember(loginId);

        if (member!=null){
            Toast.makeText(this,"이미 사용중인 아이디입니다.", Toast.LENGTH_SHORT).show();
            editTextLoginId.requestFocus();
            return;
        }
        AppDatabase.join(loginId, loginPasswd);
        Toast.makeText(this,"가입 성공", Toast.LENGTH_SHORT).show();
        finish();
    }
}