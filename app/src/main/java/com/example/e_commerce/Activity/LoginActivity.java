package com.example.e_commerce.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//import android.support.v7.widget.Toolbar;
//import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.e_commerce.DrawerActivity;
import com.example.e_commerce.R;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private EditText edt_Email, edt_Password;
    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt_Email = findViewById(R.id.email_edt);
        edt_Password = findViewById(R.id.password_edt);
        toolbar =  findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.abc_ic_ab_back_mtrl_am_alpha);
        toolbar.setTitle(R.string.LoginActivity);
        toolbar.setTitleTextColor(Color.WHITE);
       setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
        public void onClick(View view) {

        //login
        Log.e(TAG, "ON click Method " + view.getId());
        switch (view.getId()) {
            case R.id.login_btn:
                gotoDrawer();
                Toast.makeText(this, "drawer Activity", Toast.LENGTH_SHORT).show();
                return;
            case R.id.signUp_btn:
                forword_register();
                Toast.makeText(this, "signUp", Toast.LENGTH_SHORT).show();
                return;
            case R.id.forget_txt:
                loginnext();
                Toast.makeText(this, "search Activity", Toast.LENGTH_SHORT).show();
                return;
        }
    }

    private void forword_register() {
        Log.e(TAG, "Forword Register Activity" + getIntent());
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }

    private void logintext() {
        Log.e(TAG, "Email Id Get" + edt_Email.getId());
        Log.e(TAG, "Password Get" + edt_Password.getId());
        String email = edt_Email.getText().toString();
        String pass = edt_Password.getText().toString();

        if (email.equals("")) {
            edt_Email.setError("Please Enter Email");
        } else if (pass.equals("")) {
            edt_Password.setError("Please Enter Password");
        }
    }
    private void loginnext(){
        Intent searchIntent=new Intent(LoginActivity.this, Search_Activity1.class);
        startActivity(searchIntent);
    }

    private void gotoDrawer(){
        Log.e(TAG,"goto drawer activity from login activity");
        Intent in=new Intent(this, DrawerActivity.class);
        startActivity(in);
    }
}
