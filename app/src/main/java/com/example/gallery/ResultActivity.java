package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ImageView imageView = (ImageView)findViewById(R.id.imageview);
        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("id",0));

    }
}
