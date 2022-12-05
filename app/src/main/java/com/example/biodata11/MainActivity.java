package com.example.biodata11;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,dob,father,mother,eduction,address,language,email,contact,wight,hight,hobbies;
    Button btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        name = findViewById(R.id.name);
        dob = findViewById(R.id.dob);
        father = findViewById(R.id.father);
        mother = findViewById(R.id.mother);
        eduction= findViewById(R.id.eduction);
        address = findViewById(R.id.address);
        language= findViewById(R.id.language);
        email= findViewById(R.id.email);
        contact = findViewById(R.id.contact);
        wight = findViewById(R.id.wight);
        hight = findViewById(R.id.hight);
        hobbies = findViewById(R.id.hobbies);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Name = name.getText().toString();
                String Dob = dob.getText().toString();
                String Father = father.getText().toString();
                String Mother= mother.getText().toString();
                String Eduction = eduction.getText().toString();
                String Address = address.getText().toString();
                String Language = language.getText().toString();
                String Email = email.getText().toString();
                String Contact = contact.getText().toString();
                String Wight = wight.getText().toString();
                String Hight=hight.getText().toString();
                String Hobbies = hobbies.getText().toString();

                Intent intent = new Intent(MainActivity.this,second.class);
                intent.putExtra("name",Name);
                intent.putExtra("dob",Dob);
                intent.putExtra("father",Father);
                intent.putExtra("mother",Mother);
                intent.putExtra("eduction",Eduction);
                intent.putExtra("address",Address);
                intent.putExtra("language",Language);
                intent.putExtra("email",Email);
                intent.putExtra("contact",Contact);
                intent.putExtra("wight",Wight);
                intent.putExtra("hight",Hight);
                intent.putExtra("hobbies",Hobbies);
                startActivity(intent);
            }
        });



    }
}