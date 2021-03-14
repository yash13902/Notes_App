package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import static com.example.notesapp.MyAdapter.s1;
import static com.example.notesapp.MyAdapter.s2;

public class note_page extends AppCompatActivity {

    EditText title;
    EditText body;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_page);

        title = findViewById(R.id.heading);
        body = findViewById(R.id.body);

        MyAdapter myAdapter = new MyAdapter(this);
        s1.add(title.getText().toString());
        s2.add(body.getText().toString());

    }
}