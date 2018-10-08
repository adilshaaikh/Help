package com.example.adil.help;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnregistration(View v){
        Intent i=new Intent(MainActivity.this,Main4Activity.class);
        startActivity(i);
    }

    public  void  login(View view){
        Intent i=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(i);
    }
}
