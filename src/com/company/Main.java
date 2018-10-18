package com.company;
class Course{
    private String name;
    private String[] students = new String[20];
    private int studentsCount;
    public Course(){
    }
    public Course(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addStudent(String name){
        students[studentsCount]=name;
        studentsCount++;
    }
    public void removeStudent(String student){
        boolean found = false;
        for(int i = 0;i<studentsCount;i++) {
            if (student == students[i]){
                for(int j = i+1;j<studentsCount;j++) {
                    students[i] = students[j];
                }
                studentsCount--;
                found = true;
            }
        }
        if(found == false) System.out.println("there no student name "+student+"in list!");
    }
    public String[] getStudents(){
        return students;
    }
    public int getStudentsCount(){
        return studentsCount;
    }
}

public class Main {
    public static void displayCourse(Course course){
        System.out.print("Course "+course.getName()+" has "+course.getStudentsCount()+" student(s): \n{");
        for(int i =0; i< course.getStudentsCount();i++){
            String[] students = course.getStudents();
            System.out.print(""+students[i]+"\t,");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Course course = new Course("javer");
        displayCourse(course);
        String andy = "andy";
        course.addStudent(andy);
        displayCourse(course);
        String booby ="booby";
        course.addStudent(booby);
        displayCourse(course);
        String samy = "samy";
        course.addStudent(samy);
        displayCourse(course);
        course.removeStudent("candy");
        displayCourse(course);

    }
}
