package com.example.swapperchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText firstinput, secondinput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.checker);
        firstinput = (EditText) findViewById(R.id.firstinput);
        secondinput = (EditText) findViewById(R.id.secondinput);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MyMessage.class);
                String fInt = firstinput.getText().toString();
                String sInt = secondinput.getText().toString();
                if (fInt.equalsIgnoreCase(sInt)){
                    i.putExtra("checker", "THE SAME");
                    startActivity(i);
                }
                else {
                    i.putExtra("checker", "NOT THE SAME");
                    startActivity(i);
                }
            }


        });
        
    }
    public void onSwap (View view){
        firstinput = (EditText) findViewById(R.id.firstinput);
        secondinput = (EditText) findViewById(R.id.secondinput);
        String getFirstString = String.valueOf(firstinput.getText());
        String getSecondString = String.valueOf(secondinput.getText());
        firstinput.setText(getSecondString);
        secondinput.setText(getFirstString);
    }



}