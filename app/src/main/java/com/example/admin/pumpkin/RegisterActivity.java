package com.example.admin.pumpkin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

 class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etAge;
    EditText etName;
    EditText etUserName;
    EditText etPassword;
    Button button;

   /* final EditText etAge = (EditText) findViewById(R.id.etAge);
    final EditText etName = (EditText) findViewById(R.id.etName);
    final EditText etUserName = (EditText) findViewById(R.id.etUsername);
    final EditText etPassword = (EditText) findViewById(R.id.etPassword);
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

          etAge = (EditText) findViewById(R.id.etAge);
          etName = (EditText) findViewById(R.id.etName);
          etUserName = (EditText) findViewById(R.id.etUsername);
          etPassword = (EditText) findViewById(R.id.etPassword);






        /* final TextView regLink = (TextView) findViewById(R.id.bRegister);
        regLink.setOnClickListener(new View.OnClickListener() {
            public void  onClick(View v){
            Intent regIntent = new Intent(RegisterActivity.this, UserAreaActivity.class);
            RegisterActivity.this.startActivity(regIntent);
        }
    });
    */

        button = (Button) findViewById(R.id.bRegister);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, UserAreaActivity.class);
        intent.putExtra("age", etAge.getText().toString());
        intent.putExtra("name", etName.getText().toString());
        startActivity(intent);
    }
}
