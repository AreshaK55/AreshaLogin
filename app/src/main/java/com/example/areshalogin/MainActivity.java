package com.example.areshalogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.username);
        TextView password= findViewById(R.id.password);

        MaterialButton lgnbtn = (MaterialButton) findViewById(R.id.login);

        lgnbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
             if(username.getText().toString().equals("aresha") && password.getText().toString().equals("wajeha55")){
                 Toast.makeText(MainActivity.this, "Login Successful",Toast.LENGTH_SHORT).show();
                    //correct
            }
            else
                Toast.makeText(MainActivity.this, "Login failed",Toast.LENGTH_SHORT).show();
                //incorrect
            }
        });
    }
}