package com.example.exercisepam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

Button btnLogin;
TextView tvBuatakun;
EditText edemail, edpassword;
String nama,password;
String correct_edemail = "admin@mail.com";
String correct_edpassword = "123456";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.btSignin);
        edemail=findViewById(R.id.edEmail);
        edpassword=findViewById(R.id.edPassword);
        tvBuatakun.findViewById(R.id.tvDaftar);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();
                String email = "admin@mail.com";
                String pass = "123456";
                if(TextUtils.isEmpty(edemail.getText().toString()) || TextUtils.isEmpty(edpassword.getText().toString())){
                    Toast.makeText(MainActivity.this,"Email dan Password Salah",Toast.LENGTH_LONG).show();
                }else if(edemail.getText().toString().equals(correct_edemail)){

                    if(edpassword.getText().toString().equals(correct_edpassword)){
                        Toast.makeText(MainActivity.this,"Login Sukses",Toast.LENGTH_LONG).show();

                    }else{
                        Toast.makeText(MainActivity.this,"Password Salah",Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this,"Email Salah",Toast.LENGTH_LONG).show();
                }

                if (nama.equals(email) && password.equals(pass)) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "email anda: " + nama + " dan Password anda: " + password + "", Toast.LENGTH_LONG);
                    t.show();
                    Bundle b = new Bundle();
                    b.putString("a", nama.trim());
                    b.putString("b", password.trim());
                    Intent i = new Intent(getApplicationContext(), Home_Activity.class);
                    i.putExtras(b);

                    startActivity(i);
                } else {Toast t = Toast.makeText(getApplicationContext(),
                        "Login Gagal", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }




}