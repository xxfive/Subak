package com.example.login;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity{
    private Button logoutButton, CommentButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        setTitle("SUBAK");

        logoutButton=(Button)findViewById(R.id.logoutButton);
        CommentButton=(Button)findViewById(R.id.CommentButton);

        CommentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Comment.class);
                startActivity(intent);
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        final GridView gv = (GridView) findViewById(R.id.gridView1);
        MyGridAdapter gAdapter = new MyGridAdapter(this);
        gv.setAdapter(gAdapter);
    }

    class MyGridAdapter extends BaseAdapter
    {
        Activity act;

        public MyGridAdapter(Activity act)
        {
            this.act = act;
        }

        Integer[] posterID = { R.drawable.bts, R.drawable.blackpink,
        R.drawable.bum, R.drawable.hwan, R.drawable.lim, R.drawable.mamamoo,
        R.drawable.twice, R.drawable.paul, R.drawable.crush};

        String[] posterTitle = {"Dynamite", "Lovesick Girls", "잠이 오질 않네요",
        "Don't Touch Me", "힘든 건 사랑이 아니다", "딩가딩가", "I can't stop me",
        "너도 아는", "놓아줘"};

        @Override
        public int getCount() {
            return posterID.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView iv1 = new ImageView(act);

            iv1.setLayoutParams(new AdapterView.LayoutParams(150,150));
            iv1.setScaleType(ImageView.ScaleType.FIT_CENTER);
            iv1.setPadding(5,5,5,5);
            iv1.setImageResource(posterID[position]);


            final int pos = position;

            iv1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    View v1 = (View) View.inflate(act, R.layout.bts, null);
                    AlertDialog.Builder bts = new AlertDialog.Builder(act);
                    bts.setTitle(posterTitle[pos]);
                    bts.setView(v1);
                    bts.setNegativeButton("닫기",null);
                    bts.show();
                }
            });
            return iv1;

        }

    }


}
