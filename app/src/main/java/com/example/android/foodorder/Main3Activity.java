package com.example.android.foodorder;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button button;
    EditText name,number;
    String ph_no,cust_name;
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    int check;
    int move=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button=(Button) findViewById(R.id.placeorder);
        name=(EditText) findViewById(R.id.name);
        number=(EditText) findViewById(R.id.number);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendSMSMessage();
              if(move==1){ Intent i =new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(i);}
            }

//7718916829
        });

    }
    protected void sendSMSMessage() {
        cust_name=name.getText().toString();
        ph_no=number.getText().toString();
      if(ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.SEND_SMS)){

            }//8169958581
            else {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.SEND_SMS},MY_PERMISSIONS_REQUEST_SEND_SMS);
            }
        }if(cust_name.equals("")|| ph_no.equals("")){
            Toast.makeText(getApplicationContext(), "please enter valid information!",
                    Toast.LENGTH_LONG).show();
        }
        else{try{check=Integer.parseInt(ph_no);}catch(Exception e){


        } move=1;
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(ph_no, null,cust_name+", you have successfully purchased your food!!!,thank you for using FoodOrder app", null, null);
        Toast.makeText(getApplicationContext(), "SMS sent.",
                Toast.LENGTH_LONG).show();}}

   // @Override
   /* public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(ph_no, null,name+", you have successfully purchased your food!!!", null, null);
                    Toast.makeText(getApplicationContext(), "SMS sent.",
                            Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "SMS faild, please try again.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        }

    }*/
   /*int count=0;
   public void onBackPressed() {
       //  super.onBackPressed();
       count+=1;
       if(count==1){ Toast.makeText(getApplicationContext(), "press one more time to exit the app.",
               Toast.LENGTH_LONG).show();}
               if(count==2){
       moveTaskToBack(true);}
   }*/
}
