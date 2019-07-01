package com.example.e_commerce.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.e_commerce.R;
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity" ;
    EditText tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.approve_text:
                forword();
                break;
        }

    }




    private void forword() {
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);

    }
}
