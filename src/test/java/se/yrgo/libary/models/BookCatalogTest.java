package se.yrgo.libary.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.function.BooleanSupplier;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;
    private Book book2;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
        book2 = new Book(2,"Understanding The Digital World", "", "", "", 0);
		bc.addBook(book1);
	}

	//G
    @Test
	public void testAddABook() {
        bc.addBook(book2);
        int numberOfBooks = 2;
        assertEquals(numberOfBooks, bc.getNumberOfBooks());
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
        String nameOfRequestedBook = "Learning Java";
        bc.findBook(nameOfRequestedBook);
        assertEquals(nameOfRequestedBook, book1.getTitle());
	}

	//G //--?--//
	@Test
	public void testFindBookIgnoringCase() throws BookNotFoundException {
        bc.addBook(book2);
        Book requested = new Book(2,"understanding the digital world", "", "", "", 0);
        assertEquals(requested, book2);
        bc.findBook(requested.getTitle());
	}

	//G  //--?--//
	@Test
	public void testFindBookWithExtraSpaces() throws BookNotFoundException {
        bc.addBook(book1);
        String nameOfRequestedBook = " Learning Java";
        Book exist = bc.findBook(nameOfRequestedBook);
        assertEquals(exist, book1);
	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	//@Test
	//public void testFindBookThatDoesntExist() throws BookNotFoundException {

	//}

}
