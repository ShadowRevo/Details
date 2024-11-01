package com.example.details;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText etName, etYear;
    private TextView tvShowDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.etName);
        etYear = findViewById(R.id.etYear);
        tvShowDetails = findViewById(R.id.tvShowDetails);
    }

    public void shDetails(View view) {
        if (etName.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
        } else if (!etYear.getText().toString().isEmpty()) {
            String name = etName.getText().toString();
            int year = Integer.parseInt(etYear.getText().toString());
            int age = 2024 - year;
            String details = "welcome " + name + "\n Your age is " + age;
            tvShowDetails.setText(details);
        } else {
            Toast.makeText(this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
        }
    }
}