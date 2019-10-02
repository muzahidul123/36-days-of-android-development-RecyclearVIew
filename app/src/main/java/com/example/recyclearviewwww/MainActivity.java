package com.example.recyclearviewwww;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Student> studentList;
    private RecyclerView recyclerView;
    private StudentAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList = new ArrayList<>();

        recyclerView = findViewById(R.id.studentRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new StudentAdapter(studentList);
        recyclerView.setAdapter(adapter);

        studentList.add(new Student("Muzahid", 01, "muzahid@gmail.com", "01684000000", R.drawable.mujahid));
        studentList.add(new Student("Stark", 02, "stark@gmail.com", "01684111111", R.drawable.stark));
        studentList.add(new Student("Batman", 03, "batman@gmail.com", "01684222222", R.drawable.batman));
        studentList.add(new Student("Magneto", 04, "magneto@gmail.com", "01684333333", R.drawable.magneto));

        adapter.notifyDataSetChanged();
    }
}
