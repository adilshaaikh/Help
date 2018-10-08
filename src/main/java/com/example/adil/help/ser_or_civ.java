package com.example.adil.help;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ser_or_civ extends AppCompatActivity {
    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ser_or_civ);
        t1=(TextView)findViewById(R.id.showemail);
        t1.setText("Welcome "+getIntent().getExtras().getString("username"));

    }
    public void btnregistration(View v){
        Intent i=new Intent(ser_or_civ.this,Main3Activitysepass.class);
        startActivity(i);
    }
    public void egistration(View v){
        Intent i=new Intent(ser_or_civ.this,civilian.class);
        startActivity(i);
    }

}
