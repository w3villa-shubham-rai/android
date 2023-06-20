package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class thirdactivity extends AppCompatActivity {

    TextView textView2,textView3,textView4,textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        Intent fromact=getIntent();
        String title=fromact.getStringExtra("tittle");
        String studentname=fromact.getStringExtra("studentname");
        int rollno=fromact.getIntExtra("rollno",0);

        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);

        textView2.setText(title);



    }
}