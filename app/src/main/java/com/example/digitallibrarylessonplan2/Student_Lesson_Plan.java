package com.example.digitallibrarylessonplan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Student_Lesson_Plan extends AppCompatActivity {
    Button btnrelatedbook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__lesson__plan);

        btnrelatedbook = (Button) findViewById(R.id.btnrelatedbook);
        btnrelatedbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Student_Lesson_Plan.this, Student_Related_Book.class);
                startActivity(i);
            }
        });
    }
}