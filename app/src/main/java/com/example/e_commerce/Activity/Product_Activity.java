package com.example.e_commerce.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.example.e_commerce.ModelClass.ListModel;
import com.example.e_commerce.R;


import java.util.ArrayList;

public class Product_Activity extends AppCompatActivity {


    private Button TextView_BuyNow;
    private ImageView ImageView;
    private TextView TextView,TextView1;
    private ListModel product;
    private ArrayList<Integer> images;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_activity);

        TextView_BuyNow=findViewById(R.id.TextView_BuyNow);
        ImageView=findViewById(R.id.ImageView);
        TextView=findViewById(R.id.TextView);
        TextView1=findViewById(R.id.TextView1);
        toolbar=findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
        toolbar.setTitle(R.string.Product_Activity);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        if (getIntent() != null && getIntent().getExtras() != null)
        {
           product = (ListModel)getIntent().getExtras().getSerializable("Product");
        }
        ImageView.setImageResource(product.getImage());
        TextView.setText(product.getName());
        TextView1.setText(product.getPrice());


        TextView_BuyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Product_Activity.this, Buy_Now_Activity.class);
                startActivity(intent);
            }
        });

    }




}
