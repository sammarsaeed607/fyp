package com.example.digitallibrarylessonplan2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.MyViewHolder>
{
    private List<StudentCources> items;
    private Context context;

    public CoursesAdapter(Context context, List<StudentCources> item) {
        this.context = context;
        this.items=item;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.courses_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        holder.course_title.setText(items.get(position).getCourse_desc());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView course_title;
        Button buttonAddref,buttonAddLessonPlan,buttonRelatedBook;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            course_title=itemView.findViewById(R.id.tvcoursename);

            buttonAddref=itemView.findViewById(R.id.btnaddref);

            buttonAddLessonPlan=itemView.findViewById(R.id.btnaddlessonplan);

            buttonRelatedBook=itemView.findViewById((R.id.btnrelatedbook));
        }
    }
}


