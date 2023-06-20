package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview1;
    AutoCompleteTextView autoComplete;
    Spinner spiner1;
    int[] arrNo=new int[]{1,2,3,5,6,7};
    ArrayList<String> arrnames=new ArrayList<>();
    ArrayList<String> spin=new ArrayList<>();

    ArrayList<String> autocomp=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview1=findViewById(R.id.listview1);
        spiner1=findViewById(R.id.spiner1);
        autoComplete=findViewById(R.id.autoComplete);
        arrnames.add("shubham");
        arrnames.add("shubham");
        arrnames.add("shubham");
        arrnames.add("shubham");
        arrnames.add("shubham");
        arrnames.add("shubham");

        spin.add("item1");
        spin.add("item2");
        spin.add("item3");
        spin.add("item4");
        spin.add("item5");
        spin.add("item6");
        spin.add("item7");
        spin.add("item8");



        ArrayAdapter<String> adapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrnames);
        listview1.setAdapter(adapter);

        listview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==1)
                {
                    Toast toast=Toast.makeText(getApplicationContext(),"Hello Shubham",Toast.LENGTH_SHORT);
                    toast.setMargin(50,50);
                    toast.show();


                }
            }
        });

        ArrayAdapter<String> adapter1=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,spin);
        spiner1.setAdapter(adapter1);


//            Auto complete feature

        autocomp.add("java");
        autocomp.add("c++");
        autocomp.add("c");
        autocomp.add("C#");
        ArrayAdapter<String> adapter2=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,autocomp);
        autoComplete.setAdapter(adapter2);
        autoComplete.setThreshold(1);


    }
}