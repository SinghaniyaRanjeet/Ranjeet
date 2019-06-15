package com.example.e_commerce;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText edt_Email, edt_Password;
    private TextView txt_Forget;
    private Button btn_login, btn_signUp;


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
        switch (view.getId()) {
            case R.id.login_btn:
                forword_register();
                Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
                return;
            case R.id.signUp_btn:
                Toast.makeText(this, "signUp", Toast.LENGTH_SHORT).show();
                return;
        }
    }

    private void forword_register() {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }
}
