package com.example.chris.cognition;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Liga3Activity extends AppCompatActivity {

    int layout_width;
    int layout_height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liga3);
        getLayoutSize();
        setImage();
    }

    public void getLayoutSize(){

       RelativeLayout layout = (RelativeLayout) findViewById(R.id.action_screen);

       layout_width = layout.getWidth();
       layout_height = layout.getHeight();
            }

    public void setImage() {

    }
}
