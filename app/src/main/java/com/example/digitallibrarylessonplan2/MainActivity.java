package com.example.digitallibrarylessonplan2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    //    //initialize drawer
//    DrawerLayout drawerLayout;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button btnLogin;
    TextView textView;
    EditText user, pass;
//    private View Teacher_drawer_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        editor = sharedPreferences.edit();
        textView = (TextView) findViewById(R.id.username);
        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);
//        //assign variables
//        drawerLayout= findViewById(R.id.Teacher_drawer_layout);


        btnLogin = (Button) findViewById(R.id.bt_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String em = user.getText().toString();
                String pas = pass.getText().toString();

                if (em.isEmpty())
                    user.setError("Please Enter Email");
                if (pas.isEmpty())
                    pass.setError("Please Enter Password");
//
//                Intent intent = new Intent(MainActivity.this, Teacher_Activity.class);
//                startActivity(intent);


                //Toast.makeText(MainActivity.this, ""+em, Toast.LENGTH_LONG).show();
                //Toast.makeText(MainActivity.this, ""+pas, Toast.LENGTH_LONG).show();

                Call<Login> call = Retrofitclient
                        .getInstance()
                        .getApi()
                        .login(em, pas);
                call.enqueue(new Callback<Login>() {
                    @Override
                    public void onResponse(Call<Login> call, Response<Login> response) {
                        if (response.isSuccessful()) {
                            Login res = response.body();
                            Toast.makeText(MainActivity.this, "SuccessFully Login " + res, Toast.LENGTH_SHORT).show();
                            String usertype = res.getReg_No();
                            if (usertype == null) {
                                usertype = res.getEmp_no();
                            }
                            if (usertype.contains("BIIT")) {
                                Intent intent = new Intent(MainActivity.this, Teacher_Activity.class);
                                startActivity(intent);
                            } else if (usertype.contains("-ARID-")) {
                                Intent intent = new Intent(MainActivity.this, Student_Activity.class);
                                startActivity(intent);
                            }
                        }else {
                            try {
                                Toast.makeText(MainActivity.this, "Invalid Crediential" + response.errorBody().string(), Toast.LENGTH_SHORT).show();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<Login> call, Throwable t) {

                        Toast.makeText(MainActivity.this, "Failed  " + t.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }

        });


    }
}

