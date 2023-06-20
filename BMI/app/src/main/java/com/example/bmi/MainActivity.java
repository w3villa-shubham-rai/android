package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textresult;
        EditText edittextweight,edittextheight,edittextheightInch;
        Button calulate;
        ConstraintLayout ff;



        textresult=findViewById(R.id.textresult);
        edittextweight=findViewById(R.id.edittextweight);
        edittextheight=findViewById(R.id.edittextheight);
        edittextheightInch=findViewById(R.id.edittextheightInch);
        calulate=findViewById(R.id.calulate);

        calulate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int wt=Integer.parseInt(edittextweight.getText().toString());
               int ft=Integer.parseInt(edittextheight.getText().toString());
               int htinch=Integer.parseInt(edittextheightInch.getText().toString());

               float totalinch=ft*12+htinch;
               float totalcm= (float) (totalinch*2.53);
               double totalm=totalcm/100;
               double bmi=wt/(totalm*totalm);

               if(bmi>25)
               {
                   textresult.setText("you are Overweight");
               } else if (bmi<18) {
                   textresult.setText("you are Underweight");
               }
               else {
                   textresult.setText("you are healthy");
               }
            }
        });

    }
}