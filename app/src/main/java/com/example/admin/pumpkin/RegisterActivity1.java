package com.example.admin.pumpkin;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

/**
 * Created by Admin on 28.01.2017.
 */

public class RegisterActivity1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);

        final EditText etAge = (EditText) findViewById(R.id.etConfirmPassword);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        Button bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                String newPassword = etPassword.getText().toString();
                String newUsername = etUsername.getText().toString();
                String newName = etName.getText().toString();
                String newAge = etAge.getText().toString();


                SharedPreferences.Editor editor = preferences.edit();
             //   editor.putString((newPassword) = (newUsername) = "date", newName newAge"/n"):
                editor.commit();

            }
        });




    }
}
