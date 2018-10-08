package com.example.adil.help;

import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class mainservices extends AppCompatActivity {
    EditText editText;
    TextView t1;
    private FirebaseAuth firebaseAuth;
    private RecyclerView recyclerView;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainservices);
        t1=(TextView)findViewById(R.id.textView);
        //Intent intent=getIntent();
        //intent.getExtras();

        //if(intent.hasExtra("user"))
        //{

        //}
        mDatabase = FirebaseDatabase.getInstance().getReference();
        recyclerView=(RecyclerView)findViewById(R.id.recyle);
        LinearLayoutManager mlayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mlayout);

    }}