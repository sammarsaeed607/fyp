package com.example.digitallibrarylessonplan2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CourseActivity extends AppCompatActivity {
    RecyclerView recycler_c;
    CoursesAdapter adapter;

    Button tvcoursename,btnaddref,btnaddlessonplan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        recycler_c=findViewById(R.id.recycler_c);

        recycler_c.setHasFixedSize(true);
        recycler_c.setLayoutManager(new LinearLayoutManager(this));


        Call<List<StudentCources>> call = Retrofitclient
                .getInstance()
                .getApi()
                .Studentcourse("BiiT345");
        call.enqueue(new Callback<List<StudentCources>>() {
            @Override
            public void onResponse(Call<List<StudentCources>> call, Response<List<StudentCources>> response) {
                if (response.isSuccessful()) {
                    List<StudentCources> res = response.body();
                    Toast.makeText(CourseActivity.this, "SuccessFully Login " + res, Toast.LENGTH_SHORT).show();

                    adapter=new CoursesAdapter(CourseActivity.this,res);
                    recycler_c.setAdapter(adapter);
                    adapter.notifyDataSetChanged();



                }else {
                    try {
                        Toast.makeText(CourseActivity.this, "Invalid Crediential" + response.errorBody().string(), Toast.LENGTH_SHORT).show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<List<StudentCources>> call, Throwable t) {

                Toast.makeText(CourseActivity.this, "Failed  " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });




//        tvcoursename=findViewById(R.id.btnaddlessonplan);
//        btnaddlessonplan=findViewById(R.id.btnaddref);
//        btnaddref=findViewById(R.id.btnrelatedbook);
//
//
//        tvcoursename.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent courseIntent = new Intent(CourseActivity.this,Teacher_Add_Lesson_Plan.class);
//                startActivity(courseIntent);
//            }
//        });
//        btnaddlessonplan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent courseIntent = new Intent(CourseActivity.this,Add_References.class);
//                startActivity(courseIntent);
//            }
//        });
//        btnaddref.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent courseIntent = new Intent(CourseActivity.this,Teacher_Add_Book.class);
//                startActivity(courseIntent);
//            }
//        });

    }
}