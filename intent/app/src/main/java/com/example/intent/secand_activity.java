package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secand_activity extends AppCompatActivity {
    Button buttonsecand;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secand);

        buttonsecand=findViewById(R.id.buttonsecand);

        buttonsecand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent third;
                third=new Intent(secand_activity.this,thirdactivity.class);
                third.putExtra("tittle", "home");
                third.putExtra("studentname","shubham");
                third.putExtra("rollno",72);
                startActivity(third);
            }
        });

    }
}