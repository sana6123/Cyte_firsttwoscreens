package com.example.cytelogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;



public class Employer_Profile_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.startuppage_usename_pas);
        setContentView(R.layout.employer_signuppg);

        //Temp code that shows employee form
       // Intent intent = new Intent(getApplicationContext(), Employee_Profile_Activity.class);
        //startActivity(intent);
        setContentView(R.layout.startuppage_usename_pas);


    }
}
