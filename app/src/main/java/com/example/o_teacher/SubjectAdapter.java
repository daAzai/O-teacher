package com.example.o_teacher;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.ViewHolder> {

    private List<NormalCourseActivity.Subject> mSubjectList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View subjectView;
        TextView subject_name;
        TextView subject_timenum, subject_requirements;

        public ViewHolder(View view) {
            super(view);
            subjectView = view;
            subject_name = view.findViewById(R.id.subject_name);
            subject_timenum = view.findViewById(R.id.subject_timenum);
            subject_requirements = view.findViewById(R.id.subject_requirements);
        }
    }

    public SubjectAdapter(List<NormalCourseActivity.Subject> subjectList) {
        mSubjectList = subjectList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.subject_item, viewGroup, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.subjectView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                NormalCourseActivity.Subject subject = mSubjectList.get(position);
                Toast.makeText(v.getContext(), "you clicked view " + subject.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        holder.subject_timenum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                NormalCourseActivity.Subject subject = mSubjectList.get(position);
                Toast.makeText(v.getContext(), "you clicked button_1 " + subject.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        holder.subject_requirements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                NormalCourseActivity.Subject subject = mSubjectList.get(position);
                Toast.makeText(v.getContext(), "you clicked button_2 " + subject.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NormalCourseActivity.Subject subject = mSubjectList.get(position);
        holder.subject_name.setText(subject.getName());
        holder.subject_timenum.setText(subject.getTimenum());
        holder.subject_requirements.setText(subject.getRequirements());
    }

    public int getItemCount() {
        return mSubjectList.size();
    }
}
