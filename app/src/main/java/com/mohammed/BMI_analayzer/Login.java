package com.mohammed.BMI_analayzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    EditText Username ;
    EditText password;
    Button Login;
    TextView SignUp;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Username=findViewById(R.id.Username);
        password=findViewById(R.id.passwordinlogin);
        Login=findViewById(R.id.log_in_btn);
        SignUp=findViewById(R.id.sign_up);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,HomePage.class);
                startActivity(i);
            }
        });


    }

}
