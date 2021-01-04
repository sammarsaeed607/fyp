package com.example.digitallibrarylessonplan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Student_Courses_Activity extends AppCompatActivity {
    Button btnlessonplan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__courses_);

        btnlessonplan = (Button) findViewById(R.id.btlessonplan);
        btnlessonplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Student_Courses_Activity.this, Student_Lesson_Plan.class);
                startActivity(i);
            }
        });
    }
}