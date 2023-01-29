package com.example.areaofatriangledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button multiply;
    private TextView result;

    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        multiply = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.Ans);
        clear =  (Button) findViewById(R.id.button2);

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int area = number1 * number2 ;

                result.setText(String.valueOf(area));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String emptyString = new String();
               num1.setText(String.valueOf(emptyString));
               num2.setText(String.valueOf(emptyString));
               result.setText(String.valueOf(emptyString));
            }
        });
    }
}