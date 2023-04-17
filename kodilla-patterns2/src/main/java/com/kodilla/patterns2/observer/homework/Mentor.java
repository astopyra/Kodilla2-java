package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
   private final String name;
   private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student) {
        System.out.println("New task added by: " + student.getStudentName() + " to be checked by mentor: " + name);
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
