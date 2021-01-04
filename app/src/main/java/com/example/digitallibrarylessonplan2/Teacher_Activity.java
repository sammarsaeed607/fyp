package com.example.digitallibrarylessonplan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Teacher_Activity extends AppCompatActivity {
    Button bt_courses,bt_book,bt_History;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_);

        bt_courses=(Button)findViewById(R.id.bt_courses);
        bt_book=(Button)findViewById(R.id.bt_book);
        bt_History=(Button)findViewById(R.id.bt_History);

        bt_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bookIntent = new Intent(Teacher_Activity.this,Add_Book_Activity.class);
                startActivity(bookIntent);


            }
        });

        bt_courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent courseIntent = new Intent(Teacher_Activity.this,CourseActivity.class);
                startActivity(courseIntent);
            }
        });
        bt_History.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StudentHistoryIntent = new Intent(Teacher_Activity.this,Student_History_Activity.class);
                startActivity(StudentHistoryIntent);
            }
        });
    }
}
