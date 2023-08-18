package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Notify extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify);
        textView=findViewById(R.id.text1);
        String data = getIntent().getStringExtra("data");
        textView.setText(data);
    }
}