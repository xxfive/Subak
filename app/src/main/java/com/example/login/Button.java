package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class Button extends AppCompatActivity {

    android.widget.Button likeBtn, hateBtn;
    TextView likeCntView, hateCntView;
    int likeCnt = 0;
    int hateCnt = 0;


    boolean likeState=false;
    boolean hateState=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bts);

        likeBtn=(android.widget.Button)findViewById(R.id.likeBtn);
        likeCntView=(TextView)findViewById(R.id.likeCntView);
        hateBtn=(android.widget.Button)findViewById(R.id.hateBtn);
        hateCntView=(TextView)findViewById(R.id.hateCntView);
        ListView listView=(ListView)findViewById(R.id.listView);

        //CommentAdapter adapter=new CommentAdapter();
       // listView.setAdapter(adapter);

        likeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (likeState){
                    decLikeCnt();
                }else{
                    incLikeCnt();
                }
                likeState = !likeState;
            }
        });

        hateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hateState){
                    decHateCnt();
                }else{
                    incHateCnt();
                }
                hateState = !hateState;
            }
        });

    }

   // class CommentAdapter extends BaseAdapter {


      //  }





    public void incLikeCnt(){
        likeCnt += 1;
        likeCntView.setText(String.valueOf(likeCnt));
        likeBtn.setBackgroundResource(R.drawable.ic_thumb_up_selected);
    }

    public void decLikeCnt(){
        likeCnt -= 1;
        likeCntView.setText(String.valueOf(likeCnt));
        likeBtn.setBackgroundResource(R.drawable.ic_thumb_up);
    }

    public void incHateCnt(){
        hateCnt += 1;
        hateCntView.setText(String.valueOf(hateCnt));
        hateBtn.setBackgroundResource(R.drawable.ic_thumb_down_selected);
    }

    public void decHateCnt(){
        hateCnt -= 1;
        hateCntView.setText(String.valueOf(hateCnt));
        hateBtn.setBackgroundResource(R.drawable.ic_thumb_down);
    }

}

