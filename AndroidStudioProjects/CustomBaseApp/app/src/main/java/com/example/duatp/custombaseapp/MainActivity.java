package com.example.duatp.custombaseapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);


        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.novel.naver.com/webnovel/list.nhn?novelId=333315"));
                startActivity(mintent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent mintent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/*/images/media"));
                startActivity(mintent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent mintent = getPackageManager().getLaunchIntentForPackage("com.sec.android.app.music");
                startActivity(mintent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent mintent = getPackageManager().getLaunchIntentForPackage("com.nhn.android.music");
                startActivity(mintent);
            }
        });
    }
}
