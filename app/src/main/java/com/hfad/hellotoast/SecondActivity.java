package com.hfad.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent= getIntent();
        String messageText = "Hello"+intent.getStringExtra(MainActivity.EXTRA_TEXT);
        TextView messageView = (TextView)findViewById(R.id.textView);
        messageView.setText(messageText);
    }
}
