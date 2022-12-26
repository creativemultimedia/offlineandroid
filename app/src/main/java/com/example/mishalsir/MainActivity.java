package com.example.mishalsir;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    db d;
    ArrayList idlist=new ArrayList();
    ArrayList namelist=new ArrayList();
    ArrayList contactlist=new ArrayList();
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
//            String n=name.getText().toString();
//            String c=contact.getText().toString();
//            d.insert(n,c);
            Cursor c=d.getdata();
            while(c.moveToNext())
            {
                idlist.add(c.getInt(0));
                namelist.add(c.getString(1));
                contactlist.add(c.getString(2));
            }



            //listview
        });
    }
}