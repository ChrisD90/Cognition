package com.example.chris.cognition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toLiga3Activity (View v) {
        Intent intent = new Intent(this, Liga3Activity.class);
        startActivity(intent);
}
}
