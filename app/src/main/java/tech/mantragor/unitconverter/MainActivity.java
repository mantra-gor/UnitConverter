package tech.mantragor.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Enter The Value", Toast.LENGTH_SHORT).show();
                }
                else{
                    double kgValue = Double.parseDouble(editText.getText().toString());
                    double poundValue = 2.20462 * kgValue;
                    textView.setText("The corresponding value in Pound is \n" + Math.round(poundValue * 100.0) / 100.0);
                }
            }
        });
    }
}