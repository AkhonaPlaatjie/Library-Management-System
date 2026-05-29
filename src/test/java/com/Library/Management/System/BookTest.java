package com.Library.Management.System;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import
import java.awt.print.Book;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    //@BeforeEach runs before EVERY test method below.
    //We create a fresh Book object here so every test starts with a clean slate.
    //Think of it as: ""before  test anything, I need a book to test against

    private Book book;
    @BeforeEach
        //-------------------------------------------------------------------
        //ARRANGE - already done in setUp()
    void setUp(){
        book = new Book("978-0-06-112008-4", "To Kill a Mockingbird", "Harper Lee", 1960);
    }
    //TEST 1: Does the constructor store the values correctly?
    //assertEquals(expected, actual) - expected is what YOU know it should be,
    //actual is what your code returned.

    @Test
    void testBookConstructorStoresValues(){

        //-------------------------------------------------------------------
        //ACT + ASSERT - call the getter, check the value came back correctly
        assertEquals("978-0-06-112008-4", book.isbn);
        assertEquals("To Kill a Mockingbird", book.title());
        assertEquals("Harper Lee",book.author);
        assertEquals(1960, book.yearPublished());
        //-------------------------------------------------------

        //TEST2: Is a new book available by default?
        //assertTrue(condition) - passes if condition is true.
        //We didn't call makeAvailable() so it must default to true.

        @Test
    void testNewBookIsAvailableByDafault(){
            //ARRANGE - done is setUp()
            //ACT + ASSERT
        assertTrue(book.available);
        }


    }
}
