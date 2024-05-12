package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnlogin;
    private TextView register;
    private EditText username, password;
    //isi email dan password
    private String xusername = "admin";
    private String xpassword = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisialisasi btnlogin, username, dan password menggunakan findViewById
        btnlogin = findViewById(R.id.Btnlogin);
        username = findViewById(R.id.EmailAddress);
        password = findViewById(R.id.Password);

        // fungsi
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equalsIgnoreCase(xusername) &&
                        password.getText().toString().equals(xpassword)){
                    Intent login = new Intent(MainActivity.this, DashboardActivity.class);
                    startActivity(login);
                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Username or password is incorrect", Toast.LENGTH_LONG).show();
                }
            }
        });

        register = findViewById(R.id.txtRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register =new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(register);
            }
        });
    }
}
