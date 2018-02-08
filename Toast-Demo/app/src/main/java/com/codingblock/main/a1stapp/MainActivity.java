package com.codingblock.main.a1stapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    static int count = 0;
    TextView textView1;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState!=null && savedInstanceState.containsKey("COUNT")){
            count = savedInstanceState.getInt("COUNT");

        }
        Log.d(TAG, "onCreate: ");
        textView1 = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText2);
    }

    public void incrementCount(View view) {
        count++;
        Log.d(TAG, "incrementCount: was called " + count + " times");
        textView1.setText(String.valueOf(count));

        Toast.makeText(this,"The current value of count is " + count,Toast.LENGTH_SHORT).show();

//        Button b = (Button) view;
//
//        b.getText();
//
//        String etContent = editText.getText().toString();
//        textView1.append(etContent);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("COUNT",count);
    }
}