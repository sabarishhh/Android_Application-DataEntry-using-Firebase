package com.starkyy.firebaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name=findViewById(R.id.name);
        final EditText course=findViewById(R.id.course);
        final EditText roll=findViewById(R.id.roll);
        submit=findViewById(R.id.submit);
        IUData db=new IUData();

        submit.setOnClickListener(v ->
        {
            Data d=new Data(name.getText().toString(),
                    roll.getText().toString(),
                    course.getText().toString());
            db.add(d).addOnSuccessListener(suc->
            {
                Toast.makeText(this,"Sucessfully Inserted!",Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er->
            {
                Toast.makeText(this,"Not Inserted!"+er.getMessage(),Toast.LENGTH_SHORT).show();
            });
        });

    }
}