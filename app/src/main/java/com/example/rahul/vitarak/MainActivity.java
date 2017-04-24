package com.example.rahul.vitarak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_username,edt_password;
    Button btn_login;
    TextView txt_forgotpassword,txt_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_username = (EditText)findViewById(R.id.edt_username);
        edt_password = (EditText)findViewById(R.id.edt_password);

        btn_login = (Button) findViewById(R.id.btn_login);

        edt_password = (EditText)findViewById(R.id.edt_password);
        edt_password = (EditText)findViewById(R.id.edt_password);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, Collections.class));

            }
        });


    }
}
