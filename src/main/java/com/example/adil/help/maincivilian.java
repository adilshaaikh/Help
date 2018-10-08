package com.example.adil.help;

import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class maincivilian extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{

    TextView mTextView;
    GestureDetector mGestureDetector;
    private FirebaseAuth firebaseAuth;
    private DatabaseReference mDatabase;


    private TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maincivilian);
        mTextView = (TextView) findViewById(R.id.text_view);
        mGestureDetector = new GestureDetector(this, this);




    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {


        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        mTextView.setText("On Double Tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        GPStracker g = new GPStracker(getApplicationContext());
        Location l = g.getLocation();
        double lat = l.getLatitude();
        double lon = l.getLongitude();
        String message="http://maps.google.com/maps?saddr="+lat+","+lon;


        Intent i = new Intent(this, maincivilian.class);
        i.putExtra("epuzzle", message);
// ...
        mDatabase = FirebaseDatabase.getInstance().getReference();
        Toast.makeText(maincivilian.this,"http://maps.google.com/maps?saddr="+lat+","+lon,Toast.LENGTH_LONG).show();
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        final DatabaseReference table_user=database.getReference("Services");
        ser user=new ser(message);
      //  FirebaseUser adil=firebaseAuth.getCurrentUser();
       // table_user.child(adil.getEmail()).setValue(user);
        mDatabase.child("users").child("username").setValue(user);



        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {

        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
