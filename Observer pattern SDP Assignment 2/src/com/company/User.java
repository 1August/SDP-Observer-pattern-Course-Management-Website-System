package com.company;

import java.util.List;

public class User implements IObserver{
    private String name;
    private boolean isStudent;

    public User(String name, boolean isStudent) {
        this.name = name;
        this.isStudent = isStudent;
    }

    @Override
    public void update(List<News> news) {
        System.out.println("Dear " + (isStudent ? "student " : "") + name + ", you have a new message!\n" + news.toString() + '\n');
    }
}
