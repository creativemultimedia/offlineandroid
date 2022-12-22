package com.example.mishalsir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    db d;
    EditText name,contact;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        contact=findViewById(R.id.contact);
        submit=findViewById(R.id.submit);
        d=new db(this);

        submit.setOnClickListener(view -> {
            String n=name.getText().toString();
            String c=contact.getText().toString();
            d.insert(n,c);
        });
    }
}