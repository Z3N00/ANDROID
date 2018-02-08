package com.codingblock.main.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IndependentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_independent);

        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout,new BlankFragment()).commit();
    }
}
