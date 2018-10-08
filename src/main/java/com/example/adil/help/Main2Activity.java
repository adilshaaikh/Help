package com.example.adil.help;

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

public class Main2Activity extends AppCompatActivity {
    private EditText txtemailaddress,txtpassword;
    public FirebaseAuth firebaseAuth;
    private Button login2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtemailaddress=(EditText)findViewById(R.id.loginemail);
        txtpassword=(EditText)findViewById(R.id.loginpassword);
        login2=(Button)findViewById(R.id.login);
        firebaseAuth =FirebaseAuth.getInstance();
    }
    public  void  btnlogin(View view){
        final String Name=txtemailaddress.getText().toString();


        final ProgressDialog progressDialog=ProgressDialog.show(Main2Activity.this,"Please wait.....","Processing...",true);
        firebaseAuth.signInWithEmailAndPassword(txtemailaddress.getText().toString(),txtpassword.getText().toString())
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if(task.isSuccessful()){
                            Toast.makeText(Main2Activity.this,"Login Sucessful",Toast.LENGTH_LONG).show();
                            Intent i=new Intent(Main2Activity.this,maincivilian.class);


                            startActivity(i);

                        }
                        else {
                            Toast.makeText(Main2Activity.this,task.getException().getMessage(),Toast.LENGTH_LONG).show();
                        }

                    }
                });
    }
    public void btnregistration(View v){
        Intent i=new Intent(Main2Activity.this,Main4Activity.class);
        startActivity(i);
    }
    public void ser(View view){
        final ProgressDialog progressDialog=ProgressDialog.show(Main2Activity.this,"Please wait.....","Processing...",true);
        firebaseAuth.signInWithEmailAndPassword(txtemailaddress.getText().toString(),txtpassword.getText().toString())
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if(task.isSuccessful()){
                            Toast.makeText(Main2Activity.this,"Login Sucessful",Toast.LENGTH_LONG).show();
                            Intent i=new Intent(Main2Activity.this,mainservices.class);
                            i.putExtra("username",txtemailaddress.getText().toString());


                            startActivity(i);

                        }
                        else {
                            Log.e("ERROR",task.getException().toString());
                            Toast.makeText(Main2Activity.this,task.getException().getMessage(),Toast.LENGTH_LONG).show();

                        }

                    }
                });
    }
}
