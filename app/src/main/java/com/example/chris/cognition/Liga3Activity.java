package com.example.chris.cognition;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Liga3Activity extends AppCompatActivity {

    int layout_width;
    int layout_height;
    RelativeLayout layout;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liga3);
        layout = (RelativeLayout) findViewById(R.id.action_screen);
        image = (ImageView) findViewById(R.id.star);
        getLayoutSize();
        setImage();
    }

    public void getLayoutSize(){
       float x = image.getX();
        float y = image.getY();
       layout_width = layout.getWidth();
       layout_height = layout.getHeight();

            }

    public void setImage() {


    }
}
