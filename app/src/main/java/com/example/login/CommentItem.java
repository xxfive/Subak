package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

public class CommentItem extends LinearLayout {
    TextView nameText, contentText;
    RatingBar ratingBar;
    ImageView imageView;

    public CommentItem(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context){

        nameText=(TextView)findViewById(R.id.nameText);
        contentText=(TextView)findViewById(R.id.contentText);
        ratingBar=(RatingBar)findViewById(R.id.ratingBar);
        imageView=(ImageView)findViewById(R.id.imageview);
    }

    public void setName(String name){nameText.setText(name);}
    public void setContent(String content){contentText.setText(content);}
    public void setImageView(int resId){imageView.setImageResource(resId);}
    public void setStar(float star){ratingBar.setRating(star);}

}
