package com.example.o_teacher;

import android.view.View;

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
