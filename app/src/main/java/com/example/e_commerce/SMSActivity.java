package com.example.e_commerce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SMSActivity extends AppCompatActivity {
    private static final String TAG = "SMSActivity";
    private EditText mobile_edit,message_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        mobile_edit=findViewById(R.id.mobile_number_edit);
        message_edit=findViewById(R.id.send_message_edit);
    }

    public void onClick(View view) {
        Log.e(TAG,"show id in method "+view.getId());
        Log.e(TAG,"Showing method running or stopping"+view.toString());

      switch (view.getId()){
          case R.id.send_sms:

              int checkPermission= ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);

              if (checkPermission== PackageManager.PERMISSION_GRANTED){
                  send_message();
              }else {
                  ActivityCompat.requestPermissions(SMSActivity.this,new String[]
                          {Manifest.permission.SEND_SMS},0);
              }

              break;
      }

    }



    private void send_message(){
        String mobile_number=mobile_edit.getText().toString().trim();
        String message_text=message_edit.getText().toString().trim();

        Log.e(TAG,"mobile number"+mobile_edit.toString());
        Log.e(TAG,"message number"+message_edit.toString());

        if (!mobile_number.equals("")||!message_text.equals("")) {

            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(mobile_number, null, message_text, null, null);

            Toast.makeText(this, "Message send", Toast.LENGTH_SHORT).show();
        }else {
            mobile_edit.setError("required fill");
            message_edit.setError("required fill");
            Toast.makeText(this, "Please Enter Mobile number And Message", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        Log.e(TAG,"request code "+permissions.toString());
        Log.e(TAG,"request code "+grantResults.toString());

        switch (requestCode){
            case 0:
                if (grantResults.length>= 0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    send_message();
                }else
                {
                    Toast.makeText(this, "You don't have Required  Permission To Make Action ", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
