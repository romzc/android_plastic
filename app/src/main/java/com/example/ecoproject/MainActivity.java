package com.example.ecoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ecoproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private String email = "user@unsa.com";
    private String password = "qwerty";

    public static final String LOGIN = "LOGIN";

    private Button loginButton;
    private EditText inputEmail;
    private EditText inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.login_button);
        inputEmail = findViewById(R.id.email_input);
        inputPassword = findViewById(R.id.password_input);

        addClickListeners();
    }

    protected void addClickListeners() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailInput = inputEmail.getText().toString();
                String passwordInput = inputPassword.getText().toString();

                if ( /* emailInput.compareTo(email) == 0 &&
                        passwordInput.compareTo(password) == 0 */ true) {

                    Log.d("login", "you're logged");
                    Intent intent = new Intent(MainActivity.this, Activity_home.class);
                    intent.putExtra(LOGIN, true);
                    startActivity(intent);
                }
            }
        });
    }
}