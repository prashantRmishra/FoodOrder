package com.example.android.foodorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    ImageView image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        image2=(ImageView) findViewById(R.id.foodImage);
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
       // bundle.get("name");
        if(bundle.get("name").equals("pizza") || bundle.get("name").equals("")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.pizza));

        }
        if(bundle.get("name").equals("French fries")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.french1));

        }
        if(bundle.get("name").equals("Deep fried cheese sticks")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.deep));

        }
        if(bundle.get("name").equals("Bacon cheeseburger")){
            image2.setImageDrawable(getResources().getDrawable(R.drawable.acon));

        }
    }
}
