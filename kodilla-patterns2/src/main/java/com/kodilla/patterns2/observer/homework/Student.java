package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable{
    private final String studentName;
    private final List<Observer> observers;
    private final List<String> tasks;

    public Student(String studentName){
        this.studentName = studentName;
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    public void addTask(String task){
        tasks.add(task);
        notifyObserver();
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
