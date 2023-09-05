package com.example.tugas21;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {
    public TextView nameView, passwordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        nameView = findViewById(R.id.textViewName);
        passwordView = findViewById(R.id.textViewPassword);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String password = extras.getString("Password");

            nameView.setText("Name: " + name);
            passwordView.setText("Password: " + password);
        }
    }
}
