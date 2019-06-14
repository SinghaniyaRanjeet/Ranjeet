package com.example.e_commerce;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity" ;
    EditText tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
    }

    public void onClick(View view) {
        Log.e(TAG,"On Click Method"+view.toString());
        Log.e(TAG,"Recognization use by Intent "+getIntent());

       /* Intent intent=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);

        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Say Something");

        startActivityForResult(intent,0);*/
        if (!tv.equals("")){
            Intent intent=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);

            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

            intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Say Something");

            startActivityForResult(intent,0);
        }else {
            Toast.makeText(this, "Please Voice  ", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        Log.e(TAG,"On Activity Result : ");

        try {
            List<String> list=data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

            String results=list.get(0);
            Log.e(TAG,"EditTxt Result get in list "+results.toString());
            tv.setText(results);
            super.onActivityResult(requestCode, resultCode, data);
        }catch (NullPointerException e)
        {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
