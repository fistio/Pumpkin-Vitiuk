package com.example.admin.pumpkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


 public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{



    EditText etAge;
    EditText etName;
    EditText etUserName;
    EditText etPassword;
    Button button;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

          etAge = (EditText) findViewById(R.id.etAge);
          etName = (EditText) findViewById(R.id.etName);
          etUserName = (EditText) findViewById(R.id.etUsername);
          etPassword = (EditText) findViewById(R.id.etPassword);

        setTitle("Register");


        button = (Button) findViewById(R.id.bRegister);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent1 = new Intent(this, UserAreaActivity.class);
        intent1.putExtra("age", etAge.getText().toString());
        intent1.putExtra("name", etName.getText().toString());
        startActivity(intent1);
    }
}
