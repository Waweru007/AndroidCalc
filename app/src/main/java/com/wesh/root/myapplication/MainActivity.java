package com.wesh.root.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputOne, inputTwo;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputOne = findViewById(R.id.inputOne);
        inputTwo = findViewById(R.id.inputTwo);
        txtResult = findViewById(R.id.txtResults);

    }


    public void calc(View view) {
        ///Collect the data from the Inputs
        String a= inputOne.getText().toString().trim();
        String b= inputTwo.getText().toString().trim();
        if (a.isEmpty() || b.isEmpty()) {
            Toast.makeText(this, "Fill in all values", Toast.LENGTH_SHORT).show();
            return;   //return to stop the excecution

        }

        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
         double sum = x + y;

        txtResult.setText(sum + "");
        ///String.valueOf(sum);

    }
}
