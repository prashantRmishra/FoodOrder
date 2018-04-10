package com.example.android.foodorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void onBackPressed() {
        //  super.onBackPressed();
        count += 1;
        if (count == 1) {
            Toast.makeText(getApplicationContext(), "press one more time to exit the app.",
                    Toast.LENGTH_LONG).show();
        }
        if (count == 2 || count > 2) {
            moveTaskToBack(true);
        }


    }
}
