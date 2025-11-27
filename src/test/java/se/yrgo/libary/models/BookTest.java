package se.yrgo.libary.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {
    BookCatalog bc;
    Book[] bookArray;
    Book book1;
    Book book2;
    Book book3;

    @BeforeEach
    void setUp() {
        bookArray = new Book[10];
        bc = new BookCatalog();
        book1 = new Book(1,"Learning Java","","","",0);
        book2 = new Book(1,"Learning Java","","","",0);
        book3 = new Book(2,"Understanding The Digital World", "", "", "", 0);

        bc.addBook(book1);
        bc.addBook(book2);
    }
	//G
	@Test
	public void test2EqualBooks() {
        boolean sameBook = book1.equals(book2);
        assertTrue(sameBook);
	}

	//G
	@Test
	public void test2NonEqualBooks() {
        boolean sameBook = book1.equals(book3);
        assertFalse(sameBook);
	}

}
