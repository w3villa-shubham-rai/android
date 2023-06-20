    package com.example.cardview;

import static java.lang.Integer.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    CardView cardview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardview1=findViewById(R.id.cardview1);

//        cardview1.setCardBackgroundColor(parseInt("#ffff"));
    }
}