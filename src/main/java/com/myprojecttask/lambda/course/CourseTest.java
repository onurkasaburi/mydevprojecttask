package com.myprojecttask.lambda.course;

public class CourseTest {

    public static void main(String[] args) {
        Course java = new Java();
        java.study();

        Course selenium = new Selenium();
        selenium.study();

        //***********************// same thing with different way is on the below

        Course java2 = new Course() {
            @Override
            public void study() {
                System.out.println("Studying Java");
            }
        };
        java2.study();

        Course selenium2 = new Course() {
            @Override
            public void study() {
                System.out.println("Studying Selenium");
            }
        };
        selenium2.study();

        //***********************// same thing with LAMBDA

        Course javaCourse = () -> System.out.println("Java Study");
        javaCourse.study();

        Course seleniumCourse = () -> System.out.println("Selenium Study");
        seleniumCourse.study();

    }
}