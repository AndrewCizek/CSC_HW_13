package com.example.myfirstapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
    }

    public void firstNameClick(View v)
    {
        TextView myTextView = this.findViewById(R.id.myTextView);
        myTextView.setText("Andrew");
    }

    public void lastNameClick(View v)
    {
        TextView myTextView = this.findViewById(R.id.myTextView);
        myTextView.setText("Cizek");
    }
}