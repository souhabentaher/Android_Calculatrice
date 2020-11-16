package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  EditText num1;
    private EditText num2;
    private Button b1, b2, b3 , b4;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.result= (TextView) this.findViewById(R.id.resultat);

        this.b1=(Button) this.findViewById(R.id.b1);
        this.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 =(EditText) findViewById(R.id.num1);
                EditText num2 =(EditText) findViewById(R.id.num2);
                String add=num1.getText().toString();
                String add2=num2.getText().toString();
                int res =Integer.parseInt(add)+Integer.parseInt(add2);


                result.setText(""+res);

            }
        });

        this.b2=(Button) this.findViewById(R.id.b2);
        this.b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 =(EditText) findViewById(R.id.num1);
                EditText num2 =(EditText) findViewById(R.id.num2);
                String add=num1.getText().toString();
                String add2=num2.getText().toString();
                int res =Integer.parseInt(add)-Integer.parseInt(add2);


                result.setText(""+res);

            }
        });

        this.b3=(Button) this.findViewById(R.id.b3);
        this.b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 =(EditText) findViewById(R.id.num1);
                EditText num2 =(EditText) findViewById(R.id.num2);
                String add=num1.getText().toString();
                String add2=num2.getText().toString();
                int res =Integer.parseInt(add)*Integer.parseInt(add2);


                result.setText(""+res);

            }
        });
        this.b4=(Button) this.findViewById(R.id.b4);
        this.b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 =(EditText) findViewById(R.id.num1);
                EditText num2 =(EditText) findViewById(R.id.num2);
                String add=num1.getText().toString();
                String add2=num2.getText().toString();

                if(Integer.parseInt(add)==0){
                    Context context = getApplicationContext();
                    CharSequence text = " Impossible de diviser";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();

                }
                else {
                    int res = Integer.parseInt(add) / Integer.parseInt(add2);


                    result.setText(""+ res);
                }
            }
        });

    }
}