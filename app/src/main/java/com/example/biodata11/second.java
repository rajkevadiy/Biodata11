package com.example.biodata11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class second extends AppCompatActivity {
    TextView name,dob,father,mother,eduction,address,language,email,contact,wight,hight,hobbies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



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



        String Name = getIntent().getStringExtra("name");
        String Dob = getIntent().getStringExtra("dob");
        String Father = getIntent().getStringExtra("father");
        String Mother= getIntent().getStringExtra("mother");
        String Eduction = getIntent().getStringExtra("eduction");
        String Address = getIntent().getStringExtra("address");
        String Language = getIntent().getStringExtra("language");
        String Email = getIntent().getStringExtra("email");
        String Contact = getIntent().getStringExtra("contact");
        String Wight= getIntent().getStringExtra("wight");
        String Hight = getIntent().getStringExtra("hight");
        String Hobbies= getIntent().getStringExtra("hobbies");

        name.setText(""+Name);
        dob.setText(""+Dob);
        father.setText(""+Father);
        mother.setText(""+Mother);
        eduction.setText(""+Eduction);
        address.setText(""+Address);
        language.setText(""+Language);
        email.setText(""+Email);
        contact.setText(""+Contact);
        wight.setText(""+Wight);
        hight.setText(""+Hight);
        hobbies.setText(""+Hobbies);


    }
}