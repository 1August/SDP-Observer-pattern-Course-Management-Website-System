package com.company;

public class News {
    private String title;
    private String text;

    public News(String title, String text) {
        this.title = title;
        this.text = text;
    }

    @Override
    public String toString() {
        return "\nTitle='" + title + "', text='" + text + "'";
    }
}
