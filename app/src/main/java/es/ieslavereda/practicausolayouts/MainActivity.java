package es.ieslavereda.practicausolayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button1);
        textView = findViewById(R.id.textView5);
        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                textView.setText(b1.getText());
            }
        });
    }
}