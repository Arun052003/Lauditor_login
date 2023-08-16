package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
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

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    Spinner list;
    TextInputLayout password_bg;
    TextInputEditText et_login_password;;
    Button submit, cancel;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.sp_firm);
        submit = findViewById(R.id.Submit);
        cancel = findViewById(R.id.Cancel);
        password_bg = findViewById(R.id.password_back);
        et_login_password = findViewById(R.id.et_login_password);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validating person1 = new validating();
                String password = et_login_password.getText().toString();
                Boolean validate_check = person1.validate_password(password);
                if (validate_check) {
                    Intent intent = new Intent(MainActivity.this, lauditor_file.class);
                    startActivity(intent);
                } else {
                    showPopupMessage("Invalid password.");
                }
            }
        });
    }
    private void showPopupMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}