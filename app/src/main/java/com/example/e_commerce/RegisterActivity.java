package com.example.e_commerce;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private EditText userName_edt, adharCard_edt, mobile_edt,
            email_edt, gst_edt, address_edt, city_edt, panCard_edt, pass_edt;
    private TextView register_edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //get Component id
        userName_edt = findViewById(R.id.user_edt);
        adharCard_edt = findViewById(R.id.adhar_edt);
        mobile_edt = findViewById(R.id.mobile_edt);
        email_edt = findViewById(R.id.email_editText);
        gst_edt = findViewById(R.id.gst_number_edt);
        address_edt = findViewById(R.id.address_edt);
        city_edt = findViewById(R.id.city_edt);
        panCard_edt = findViewById(R.id.pan_edt);
        pass_edt = findViewById(R.id.password_edt);

    }

    public void onClick(View view) {
        //Register use button
        switch (view.getId()) {
            case R.id.register_txt:
                getdataEdit();
                Toast.makeText(this, "Register Successfully", Toast.LENGTH_SHORT).show();
                return;
        }
    }

    private void getdataEdit() {
        String user_name = userName_edt.getText().toString();
        String adhar_card = adharCard_edt.getText().toString();
        String mobile_number = mobile_edt.getText().toString();
        String email_id = email_edt.getText().toString();
        String gst_number = gst_edt.getText().toString();
        String address = address_edt.getText().toString();
        String city_name = city_edt.getText().toString();
        String pan_card = panCard_edt.getText().toString();
        String password = pass_edt.getText().toString();
        loginActivity();


    }

    private void loginActivity() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


}
