package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclercontactadapter extends RecyclerView.Adapter<recyclercontactadapter.viewholder> {

    Context context;
    ArrayList<contactmodal> arrcontact;
    recyclercontactadapter(Context context, ArrayList<contactmodal>arrcontact)
    {
        this.context=context;
        this.arrcontact=arrcontact;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v=LayoutInflater.from(context).inflate(R.layout.contact,parent,false);
        viewholder  viewholder=new viewholder(v)  ;
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
         holder.imageView.setImageResource(arrcontact.get(position).imageView);
         holder.textView2.setText(arrcontact.get(position).Contact);
        holder.textView3.setText(arrcontact.get(position).textView3);
        setAnimation(holder.itemView,position);

    }

    @Override
    public int getItemCount() {
        return arrcontact.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{
        TextView textView2,textView3;
        ImageView imageView;
        public viewholder(View itemView)
        {
            super(itemView);
            textView2=itemView.findViewById(R.id.textView2);
            textView3=itemView.findViewById(R.id.textView3);
            imageView=itemView.findViewById(R.id.imageView);

        }

    }

    private void setAnimation(View viewToAnimate ,int position)
    {
        Animation slidin= AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        viewToAnimate.startAnimation(slidin);
    }


}
