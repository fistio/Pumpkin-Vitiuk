package com.example.admin.pumpkin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;


public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{



    EditText etUserName;
    EditText etPassword;
    EditText etConfirmPassword;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        etUserName = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);

        setTitle("Register");



        button = (Button) findViewById(R.id.bRegister);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etUserName.getText().toString())) {
                    etUserName.setError("Enter Username please");
                    etUserName.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(etPassword.getText().toString())) {
                    etPassword.setError("Enter Password");
                    etPassword.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(etConfirmPassword.getText().toString())) {
                    etConfirmPassword.setError("Enter Confirm Password");
                    etConfirmPassword.requestFocus();
                    return;
                }
                if (etPassword.getText().toString().equals(etConfirmPassword.getText().toString())) {
                    Toast.makeText(getBaseContext(), "Successful", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(RegisterActivity.this, UserAreaActivity.class);
                    RegisterActivity.this.startActivity(intent);
                } else{

                    Toast.makeText(getBaseContext(), "Check your password", Toast.LENGTH_LONG).show();

                }
                /*
                SharedPreferences preferences = getSharedPreferences("MYPREF", MODE_PRIVATE);
                String newPassword = etPassword.getText().toString();
                String newUserName = etUserName.getText().toString();
                String newConfirmPassword = etConfirmPassword.getText().toString();

                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("username", newUserName);
                editor.putString("pass", newPassword);
                editor.putString("conpass", newConfirmPassword);
                editor.commit();

                Intent loginScreen = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(loginScreen);
                */
            }
        });

    }
    @Override
    public void onClick(View v) {
        Intent intent1 = new Intent(this, UserAreaActivity.class);
        intent1.putExtra("Username", etUserName.getText().toString());
        startActivity(intent1);

    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(getBaseContext(), "Register Please", Toast.LENGTH_LONG).show();
    }

}

