package com.example.cytelogin;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;



public class startup_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//after .put the name of the slide you want to switch the button to
        setContentView(R.layout.activity_employee__profile);


//declare the variable and button the user enters
        final Button button = (Button) findViewById(R.id.signup_main);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                startActivity(new Intent(startup_Activity.this , Employee_Profile_Activity.class));

            }
        });

    }
}