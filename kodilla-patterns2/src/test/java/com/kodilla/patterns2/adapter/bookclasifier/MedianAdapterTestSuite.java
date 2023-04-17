package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicatiionYearMedianTest(){
        //given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("David Mitchell","Atlas chmur", 2004, "001"));
        bookSet.add(new Book("Carlos Ruiz Zafón", "Cień wiatru", 2001, "002"));
        bookSet.add(new Book("Cassandra Clare", "Miasto kości", 2007, "003"));
        bookSet.add(new Book("Paullina Simons", "Jeździec miedziany", 2000, "004"));
        bookSet.add(new Book("Kerstin Gier", "Czerwień Rubinu", 2009, "005"));
        MedianAdapter medianAdapter = new MedianAdapter();

        //when
        int median = medianAdapter.publicationYearMedian(bookSet);

        //then
        assertEquals(2004, median);
    }
}
