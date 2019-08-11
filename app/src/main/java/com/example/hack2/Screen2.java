package com.example.hack2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        EditText text1 = (EditText)findViewById(R.id.ans1);
        EditText text2 = (EditText)findViewById(R.id.ans2);
        EditText text3 = (EditText)findViewById(R.id.ans3);
        EditText text4 = (EditText)findViewById(R.id.ans4);
        EditText text5 = (EditText)findViewById(R.id.ans5);
        String value1= text1.getText().toString();

        String value2= text2.getText().toString();

        String value3= text3.getText().toString();

        String value4= text4.getText().toString();

        String value5= text5.getText().toString();

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Screen2.this, Offline.class);
                startActivity(intent);
            }
        });
    }
}
