package com.example.e_commerce.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.e_commerce.R;

public class Main3Activity extends AppCompatActivity {


    private Button TextView_BuyNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView_BuyNow=findViewById(R.id.TextView_BuyNow);

        TextView_BuyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main3Activity.this, Buy_Now_Activity.class);
                startActivity(intent);
            }
        });

    }
}
