package com.example.digitallibrarylessonplan2;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface Api {
  @GET("login")
  Call<Login> login(
          @Query("UserName") String username,
          @Query("Password") String password
    );
   @GET("courses")
    Call<List<Courses>> getCourses(
           @Query("title") String status
  );

    @GET("studentcourse")
    Call<List<StudentCources>> Studentcourse(
            @Query("emp_no") String emp_no
    );

}