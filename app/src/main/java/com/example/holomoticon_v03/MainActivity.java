package com.example.holomoticon_v03;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        HoloMoticonAgent hma = new HoloMoticonAgent(getApplicationContext());

    }


}
