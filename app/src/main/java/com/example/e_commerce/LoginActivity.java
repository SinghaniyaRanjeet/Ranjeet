package com.example.e_commerce;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";
    private EditText edt_Email, edt_Password;
    private TextView txt_Forget;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt_Email = findViewById(R.id.email_edt);
        edt_Password = findViewById(R.id.password_edt);
        txt_Forget = findViewById(R.id.forget_txt);

    }

    public void onClick(View view) {
        //login
        Log.e(TAG, "ON click Method " + view.getId());
        switch (view.getId()) {
            case R.id.login_btn:

                Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
                return;
            case R.id.signUp_btn:
                forword_register();
                Toast.makeText(this, "signUp", Toast.LENGTH_SHORT).show();
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
}
