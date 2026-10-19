package com.example.textcounter_2026;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputText;
    private Spinner countType;
    private TextView textResult;
    private TextCounter textCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputText = findViewById(R.id.inputText);
        countType = findViewById(R.id.countType);
        textResult = findViewById(R.id.textResult);

        textCounter = new TextCounter();
    }
    public void ButtonClick(View view) {
        String text = inputText.getText().toString();

        if (text.trim().isEmpty()) {
            Toast.makeText(this, R.string.empty_message,
                    Toast.LENGTH_SHORT).show();
            return;
        }

        TextCounter counter = new TextCounter();
        int count;

        if (countType.getSelectedItemPosition() == 0) {
            count = counter.countWords(text);
        } else {
            count = counter.countPunctuation(text);
        }

        textResult.setText(getString(R.string.result) + " " + count);
    }
}
