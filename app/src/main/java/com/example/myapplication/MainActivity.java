package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartisshowing = true;

    public void fade(View view) {
        ImageView bart = (ImageView) findViewById(R.id.imageView);
        ImageView bartboard = (ImageView) findViewById(R.id.imageView2);

        if(bartisshowing) {
            bartisshowing = false;

            bart.animate().alpha(0).setDuration(2000);
            bartboard.animate().alpha(1).setDuration(2000);
        } else {
            bart.animate().alpha(1).setDuration(2000);
            bartboard.animate().alpha(0).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
