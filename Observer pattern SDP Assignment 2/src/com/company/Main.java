package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        CourseManagementSystemWebsite course1 = new CourseManagementSystemWebsite();
        CourseManagementSystemWebsite course2 = new CourseManagementSystemWebsite();
        CourseManagementSystemWebsite course3 = new CourseManagementSystemWebsite();
        CourseManagementSystemWebsite teachers = new CourseManagementSystemWebsite();

        User maksat = new User("Maksat", true);
        User nazym = new User("Nazym", true);
        User ali = new User("Ali", true);
        User lyazzat = new User("Lyazzat", true);
        User jay = new User("Jay", false);

        course1.subscribeObserver(nazym);
        course2.subscribeObserver(maksat);
        course3.subscribeObserver(ali);
        course3.subscribeObserver(lyazzat);
        teachers.subscribeObserver(jay);

        course1.addNews(new News("Greetings from University!", "Welcome 1st Course Students!"));
        course2.addNews(new News("Greetings from University!", "Welcome 2nd Course Students!"));
        course3.addNews(new News("Greetings from University!", "Welcome 3rd Course Students!"));
        teachers.addNews(new News("Greetings from University!", "Welcome for others!"));

        course3.unsubscribeObserver(lyazzat);
        course3.addNews(new News("Student has won a university grant in Korea!", "3rd course student Lyazzat has won a grant. Good luck!"));

    }
}
