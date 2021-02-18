package com.example.samapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.button);
        textView.setText("Register");
        TextView humble = findViewById(R.id.firstNameOut);
        //humble.setText("");


    }

    public void tapChange(View view) {
        TextView inputFirst = findViewById(R.id.firstNameTxt);
        TextView inputLast = findViewById(R.id.lastNameTxt);
        TextView inputEmail = findViewById(R.id.emailTxt);



        TextView humble = findViewById(R.id.firstNameOut);
        humble.setText("First name: " + inputFirst.getText().toString());

        TextView humble1 = findViewById(R.id.lastNameOut);
        humble1.setText("Last name: " + inputLast.getText().toString());

        TextView humble2 = findViewById(R.id.emailOut);
        humble2.setText("Email: " + inputEmail.getText().toString());

    }
}