package com.example.e_commerce;

import android.content.Context;
import android.content.Intent;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter {


    public Context context;
    public List<ListModel> listModel;

    public RecyclerAdapter(Context context, List<ListModel> listModel) {
        this.context = context;
        this.listModel = listModel;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup vi, int i) {
        View view;
//        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_layout, null);
        view = LayoutInflater.from(vi.getContext()).inflate(R.layout.recyclerview_layout, null);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        final ListModel items = listModel.get(i);
        ((Holder)viewHolder).cat_image.setImageResource(items.getImage());
        ((Holder)viewHolder).TextView.setText(items.getName());
        ((Holder)viewHolder).TextView1.setText(items.getPrice());


    }

    @Override
    public int getItemCount() {
        return listModel.size();
    }





    public class Holder extends RecyclerView.ViewHolder   implements View.OnClickListener{

        private ImageView cat_image;
        private TextView TextView,TextView1;


        public Holder(@NonNull View itemView) {
            super(itemView);
            cat_image = (ImageView)itemView.findViewById(R.id.cat_image);
            TextView=itemView.findViewById(R.id.TextView);
            TextView1=itemView.findViewById(R.id.TextView1);

            itemView.setOnClickListener((View.OnClickListener) this);


        }

        @Override
        public void onClick(View v) {
            Intent intent=new Intent(context,Main3Activity.class);
            context.startActivity(intent);

        }
    }
}
