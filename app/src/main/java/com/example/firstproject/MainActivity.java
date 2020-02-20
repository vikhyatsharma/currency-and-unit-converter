package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonadd = (Button) findViewById(R.id.buttonadd);
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firsttext = (EditText) findViewById(R.id.firsttext);
                EditText firsttext2 = (EditText) findViewById(R.id.firsttext2);
                TextView result=    (TextView) findViewById(R.id.finalresult);
                String temp1 = firsttext.getText().toString();
                String temp2 = firsttext2.getText().toString();

                if(!((!temp1.equals(""))
                        && (temp1 != null)
                        && (temp1.matches("^[a-zA-Z]+$"))))

                {
                    int num1= Integer.parseInt(firsttext.getText().toString());
                    int num2= Integer.parseInt(firsttext2.getText().toString());
                    int result1= (Integer)num1+ num2;
                    String str1 = Integer.toString(result1);

                    result.setText(str1);

                }
                else
                {
                    result.setText("ENTER SOME INTEGER YOU DUMB FUCK");
                }




            }
        });
    }
}
