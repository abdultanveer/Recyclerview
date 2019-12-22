package com.spot.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void handleLogin(View view) {
        EditText nameEditText = findViewById(R.id.editTextName);
        String name = nameEditText.getText().toString();

        TextView msgTextView = findViewById(R.id.textViewMessage);
        msgTextView.setText(name);
    }
}
