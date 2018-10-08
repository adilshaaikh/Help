package com.example.adil.help;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activitysepass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_activitysepass);
        final EditText edUsername  = (EditText) findViewById(R.id.es1);
        final EditText  edPassword  = (EditText)findViewById(R.id.ps1);
        Button btnValidate = (Button)findViewById(R.id.loginse);
        btnValidate.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View arg0)
            {
                String uname  = edUsername.getText().toString();
                String pass = edPassword.getText().toString();

                if(uname.equals("adil@gmail.com") && pass.equals("12345"))
                {
                    Intent intent = new Intent(Main3Activitysepass.this,services.class);
                    intent.putExtra("username",edUsername.getText().toString());
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(Main3Activitysepass.this, "Invalid Usename password pair.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}