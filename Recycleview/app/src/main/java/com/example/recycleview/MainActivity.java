package com.example.recycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclercontact;
    recyclercontactadapter adapter;
    EditText edittext1,edittext2;
    Button addbtn;
    FloatingActionButton floatingActionButton;
    ArrayList<contactmodal> arrcontact=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionButton=findViewById(R.id.floatingActionButton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog=new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.coustomlayout);
               EditText edittext1=dialog.findViewById(R.id.edittext1);
                EditText edittext2=dialog.findViewById(R.id.edittext2);
                Button addbtn=dialog.findViewById(R.id.addbtn);

                addbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String  name="", number="";
                       if (!edittext1.getText().toString().equals(""))
                        {
                            name=edittext1.getText().toString();
//
                       }
                       else
                       {
                           Toast.makeText(MainActivity.this,"please Enter the contact name",Toast.LENGTH_SHORT);

                       }
                        if (!edittext2.getText().toString().equals(""))
                       {
                           number=edittext2.getText().toString();
                       }
                        else {
                          Toast.makeText(MainActivity.this,"please Enter the contact number",Toast.LENGTH_SHORT);

                        }
                        arrcontact.add(new contactmodal(name,number));
//                        adapter.notifyItemInserted(arrcontact.size());
                        recyclercontact.scrollToPosition(arrcontact.size()-1);
                       dialog.dismiss();
                    }
                });

                dialog.show();

            }
        });



        recyclercontact=findViewById(R.id.recyclercontact);
        floatingActionButton=findViewById(R.id.floatingActionButton);

        recyclercontact.setLayoutManager(new LinearLayoutManager(this));
//        recyclercontact.setLayoutManager(new GridLayoutManager(this,3));

//        modelconstructor call and fetching data from model javaclass.          (work on structure)

//        contactmodal model=new contactmodal(R.drawable.contact,"A","9936060053");

//      set data in array
//        arrcontact.add(model);



        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));
        arrcontact.add(new contactmodal(R.drawable.spider,"shubham","74387438743"));

        recyclercontactadapter adapter=new recyclercontactadapter(this,arrcontact);
        recyclercontact.setAdapter(adapter);
        ItemTouchHelper itemTouchHelper=new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(recyclercontact);




    }
//     Delete operation on swipe.
    ItemTouchHelper.SimpleCallback simpleCallback=new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viwHolder, @NonNull RecyclerView.ViewHolder target) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
            int postion=viewHolder.getAdapterPosition();
            switch (direction)
            {
                case ItemTouchHelper.LEFT:
                    arrcontact.remove(postion);
                    adapter.notifyItemRemoved(postion);
                    break;
                case  ItemTouchHelper.RIGHT:
                    arrcontact.remove(postion);
                    adapter.notifyItemRemoved(postion);
                    break;
            }
        }
    };

}

