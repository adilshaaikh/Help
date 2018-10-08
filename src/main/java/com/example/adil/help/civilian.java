package com.example.adil.help;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class civilian extends AppCompatActivity {
    private DatabaseReference databaseReference;
    private EditText funmae,usnmae,cnic,id,addres,phon,bir;
    private Button saves;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civilian);
        funmae=(EditText)findViewById(R.id.fullname);
        usnmae=(EditText)findViewById(R.id.username);
        cnic=(EditText)findViewById(R.id.cnic);
        id=(EditText)findViewById(R.id.idno);
        addres=(EditText)findViewById(R.id.address);
        phon=(EditText)findViewById(R.id.phoneno);
        bir=(EditText)findViewById(R.id.birth);
        firebaseAuth = FirebaseAuth.getInstance();

        saves=(Button)findViewById(R.id.save);

        // firebaseAuth = FirebaseAuth.getInstance();


    }
    public void saveuserinformation(){
        String fullnme=funmae.getText().toString().trim();
        String usernme=usnmae.getText().toString().trim();
        String cnicno=cnic.getText().toString().trim();
        String idn=id.getText().toString().trim();
        String addr=addres.getText().toString().trim();
        String ph=phon.getText().toString().trim();
        String bith=bir.getText().toString().trim();


        FirebaseDatabase database=FirebaseDatabase.getInstance();
        final DatabaseReference table_user=database.getReference("civilian");
        Serviceinfo user=new Serviceinfo(fullnme,usernme,cnicno,idn,addr,ph,bith);
        FirebaseUser adil=firebaseAuth.getCurrentUser();
        table_user.child(adil.getUid()).setValue(user);
        //Toast.makeText(this,"Information saved",Toast.LENGTH_SHORT).show();



        // table_user.child("User information").push().setValue(user);
        //table_user.child("users").child(userId).setValue(userinformations);
        Toast.makeText(this,"Information saved",Toast.LENGTH_SHORT).show();
        finish();
    }

    public void btnre(View v) {
        saveuserinformation();
        Intent i=new Intent(civilian.this,Main2Activity.class);
        startActivity(i);
    }
}
