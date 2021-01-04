package com.example.digitallibrarylessonplan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Student_Activity extends AppCompatActivity {
    Button btnbook,btncourses,btndownload;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_);

        btnbook = (Button) findViewById(R.id.bt_book);
        btncourses = (Button) findViewById(R.id.bt_courses);
        btndownload = (Button) findViewById(R.id.bt_download);

        btncourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Student_Activity.this, Student_Courses_Activity.class);
                startActivity(i);
            }
        });

        btndownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Student_Activity.this, Student_Download_Book_Activity.class);
                startActivity(i);
            }
        });

        btnbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Student_Activity.this, Student_Books_Activity.class);
                startActivity(i);
            }
        });

    }
}