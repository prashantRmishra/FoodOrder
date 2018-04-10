package com.example.android.foodorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class Main2Activity extends AppCompatActivity {
    ImageView image2;
    Button button;
    TextView info;
    String information;
    int size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        image2=(ImageView) findViewById(R.id.foodImage);
        button=(Button) findViewById(R.id.buyButton);
        info=(TextView) findViewById(R.id.infotext);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
       // bundle.get("name");
        if(bundle.get("name").equals("pizza") || bundle.get("name").equals("")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.pizza));
            try {
                InputStream is = getAssets().open("pizza.txt");
                size=is.available();
                byte[] buffer=new byte[size];
                is.read(buffer);
                is.close();
                information = new String(buffer);
            }catch(IOException ex) {
                ex.printStackTrace();
            }
            info.setText(information);
        }
        if(bundle.get("name").equals("French fries")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.french1));
            try {
                InputStream is = getAssets().open("frenchfries.txt");
                size=is.available();
                byte[] buffer=new byte[size];
                is.read(buffer);
                is.close();
                information = new String(buffer);
            }catch(IOException ex) {
                ex.printStackTrace();
            }
            info.setText(information);

        }
        if(bundle.get("name").equals("Deep fried cheese sticks")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.deep));
            try {
                InputStream is = getAssets().open("deepfried.txt");
                size=is.available();
                byte[] buffer=new byte[size];
                is.read(buffer);
                is.close();
                information = new String(buffer);
            }catch(IOException ex) {
                ex.printStackTrace();
            }
            info.setText(information);

        }
        if(bundle.get("name").equals("Bacon cheeseburger")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.acon));
            try {
                InputStream is = getAssets().open("bacon.txt");
                size=is.available();
                byte[] buffer=new byte[size];
                is.read(buffer);
                is.close();
                information = new String(buffer);
            }catch(IOException ex) {
                ex.printStackTrace();
            }
            info.setText(information);

        }
        if(bundle.get("name").equals("Fried chicken")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.friedchicken));
            try {
                InputStream is = getAssets().open("friedchicken.txt");
                size=is.available();
                byte[] buffer=new byte[size];
                is.read(buffer);
                is.close();
                information = new String(buffer);
            }catch(IOException ex) {
                ex.printStackTrace();
            }
            info.setText(information);

        }
        if(bundle.get("name").equals("Fish and chips")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.fishandchips1));
            try {
                InputStream is = getAssets().open("fishandchips.txt");
                size=is.available();
                byte[] buffer=new byte[size];
                is.read(buffer);
                is.close();
                information = new String(buffer);
            }catch(IOException ex) {
                ex.printStackTrace();
            }
            info.setText(information);

        }
        if(bundle.get("name").equals("Milk shake")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.milkshake));
            try {
                InputStream is = getAssets().open("milkshake.txt");
                size=is.available();
                byte[] buffer=new byte[size];
                is.read(buffer);
                is.close();
                information = new String(buffer);
            }catch(IOException ex) {
                ex.printStackTrace();
            }
            info.setText(information);

        }
        if(bundle.get("name").equals("biryani")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.biryani));
            try {
                InputStream is = getAssets().open("biryani.txt");
                size=is.available();
                byte[] buffer=new byte[size];
                is.read(buffer);
                is.close();
                information = new String(buffer);
            }catch(IOException ex) {
                ex.printStackTrace();
            }
            info.setText(information);

        }
        if(bundle.get("name").equals("Tuna melt")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.tunamelt));
            try {
                InputStream is = getAssets().open("tunamelt.txt");
                size=is.available();
                byte[] buffer=new byte[size];
                is.read(buffer);
                is.close();
                information = new String(buffer);
            }catch(IOException ex) {
                ex.printStackTrace();
            }
            info.setText(information);

        }
        if(bundle.get("name").equals("Caesar salad")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.caesar));
            try {
                InputStream is = getAssets().open("caesarsalad.txt");
                size=is.available();
                byte[] buffer=new byte[size];
                is.read(buffer);
                is.close();
                information = new String(buffer);
            }catch(IOException ex) {
                ex.printStackTrace();
            }
            info.setText(information);

        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(i);
            }
        });

    }
}
