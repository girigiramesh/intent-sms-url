package com.example.apple.implicit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

private Button bwsr_send;
private Button msg_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bwsr_send = (Button) findViewById(R.id.bwsr_send);
        bwsr_send.setOnClickListener(new Button.OnClickListener(){
@Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gmail.com"));
        startActivity(intent);
        }
      });
        msg_send = (Button) findViewById(R.id.msg_send);
        msg_send.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:+150000345"));
                startActivity(intent);
            }
        });
    }
}
