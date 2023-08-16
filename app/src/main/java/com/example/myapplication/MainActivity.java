package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    Spinner list;
    TextInputLayout password_bg;
    EditText et_login_password;
    Button submit, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.sp_firm);
        submit = findViewById(R.id.Submit);
        cancel = findViewById(R.id.Cancel);
        password_bg=findViewById(R.id.password_back);
        et_login_password=findViewById(R.id.et_login_password);
        String password=et_login_password.getText().toString();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validation person1 = new validation();
                if (person1.validate_password(password)) {
                    password_bg.setBackgroundColor(Color.GREEN);
                    Intent intent = new Intent(MainActivity.this, lauditor_file.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Password is incorrect",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}