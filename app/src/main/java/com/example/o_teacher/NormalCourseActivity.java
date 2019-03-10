package com.example.o_teacher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class NormalCourseActivity extends AppCompatActivity {

    private List<Subject> subjectList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_course_layout);
        initSubjects();
        RecyclerView recyclerView = findViewById(R.id.normal_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        SubjectAdapter adapter = new SubjectAdapter(subjectList);
        recyclerView.setAdapter(adapter);
    }

    private void initSubjects() {
        for (int i = 0; i < 2; i ++) {
            Subject zhuanye = new Subject("ZhuanYe", 0, 0);
            subjectList.add(zhuanye);
            Subject yuwen = new Subject("YuWen", 0, 0);
            subjectList.add(yuwen);
            Subject shuxve = new Subject("ShuXve", 0, 0);
            subjectList.add(shuxve);
            Subject yingyu = new Subject("YingYu", 0, 0);
            subjectList.add(yingyu);
        }
    }

    public class Subject {

        private String name;

        private int timenum;

        private int requirements;

        public Subject(String name, int timenum, int requirements) {
            this.name = name;
            this.timenum = timenum;
            this.requirements = requirements;
        }

        public String getName() {
            return name;
        }


        public int getTimenum() {
            return timenum;
        }

        public int getRequirements() {
            return requirements;
        }
    }
}

