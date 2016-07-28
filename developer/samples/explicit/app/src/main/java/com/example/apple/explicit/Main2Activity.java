package com.example.apple.explicit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView tv_received;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_received= (TextView) findViewById(R.id.tv_received);
        tv_received.setText(getIntent().getStringExtra("text"));
    }
}
