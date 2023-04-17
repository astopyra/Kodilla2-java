package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTestSuite {

    @Test
    void testUpdate(){
        //given
        Student jack = new Student("Jack Martin");
        Student mark = new Student("Mark Roberts");
        Student jay = new Student("James Smith");
        Mentor julia = new Mentor("Julia Scholes");
        Mentor nicole = new Mentor("Nicole Bartman");
        jack.registerObserver(julia);
        mark.registerObserver(julia);
        jay.registerObserver(nicole);

        //when
        jack.addTask("jack-task1");
        mark.addTask("mark-task1");
        jack.addTask("jack-task2");
        jay.addTask("jay-task1");
        jack.addTask("jack-task3");

        //then
        assertEquals(4, julia.getUpdateCount());
        assertEquals(1, nicole.getUpdateCount());

    }
}
