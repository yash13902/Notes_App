package com.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import static com.example.notesapp.MyAdapter.s1;
import static com.example.notesapp.MyAdapter.s2;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton plus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = findViewById(R.id.floatingActionButton3);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerView programmingList = findViewById(R.id.recyclerView);
        programmingList.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter adapter = new MyAdapter(this);

    }

    public void newNote(View view){

        Intent intent = new Intent(MainActivity.this,note_page.class);
        intent.putExtra("Title",s1);
        intent.putExtra("Description",s2);
        startActivity(intent);
    }
}