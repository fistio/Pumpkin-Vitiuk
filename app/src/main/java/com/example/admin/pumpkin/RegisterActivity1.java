package com.example.admin.pumpkin;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class RegisterActivity1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
        Button bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
                String newPassword = etPassword.getText().toString();
                String newUsername = etUsername.getText().toString();
                String newConfirmPassword = etConfirmPassword.getText().toString();



                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("username", newUsername);
                editor.putString("pass", newPassword);
                editor.putString("conpass", newConfirmPassword);
                editor.commit();

            }
        });




    }
}
