package com.example.swapperchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyMessage extends AppCompatActivity {

    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_message);

        Intent intent = getIntent();

        message = (TextView) findViewById(R.id.message);
        String result = intent.getStringExtra("checker");

        message.setText(result);
    }
}