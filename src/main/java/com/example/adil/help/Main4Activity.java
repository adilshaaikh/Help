package com.example.adil.help;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main4Activity extends AppCompatActivity {
    private EditText txtemailaddress, txtpassword;
    private FirebaseAuth firebaseAuth;
//private DatabaseReference databaseReference;
    private Button saves;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        txtemailaddress = (EditText) findViewById(R.id.loginemail);
        txtpassword = (EditText) findViewById(R.id.loginpassword);
        firebaseAuth = FirebaseAuth.getInstance();

  //      saves=(Button)findViewById(R.id.save);
//        databaseReference=FirebaseDatabase.getInstance().getReference();
//        saves.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//if(view==saves)
//{
//    saveuserinformation();
//}
//            }
//        });
//    }
//    private void saveuserinformation(){
//
//        String emails=txtemailaddress.getText().toString().trim();
//        String pass=txtpassword.getText().toString().trim();
//        Userinformations userinformations=new Userinformations(emails,pass);
//        FirebaseUser user=firebaseAuth.getCurrentUser();
//databaseReference.child(user.getUid()).setValue(userinformations);
//Toast.makeText(this,"Information saved",Toast.LENGTH_SHORT).show();
}


    public void btnlogin(View view) {
        final ProgressDialog progressDialog = ProgressDialog.show(Main4Activity.this, "Please wait.....", "Processing...", true);
        firebaseAuth.createUserWithEmailAndPassword(txtemailaddress.getText().toString(), txtpassword.getText().toString())
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if (task.isSuccessful()) {
                            Toast.makeText(Main4Activity.this, "Register Sucessfull ", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(Main4Activity.this, ser_or_civ.class);
                            i.putExtra("user",txtemailaddress.getText().toString());

                            startActivity(i);

                        } else {
                            Log.e("ERROR", task.getException().toString());
                            Toast.makeText(Main4Activity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                        }

                    }
                });
    }


}
