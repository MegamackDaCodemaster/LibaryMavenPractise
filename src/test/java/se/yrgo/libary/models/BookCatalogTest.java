package se.yrgo.libary.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

public class BookCatalogTest {

	private BookCatalog bc;
	private Book book1;

	public BookCatalogTest() {
		bc = new BookCatalog();
		book1 = new Book(1,"Learning Java","","","",0);
		bc.addBook(book1);
	}

	//G
    @Test
	public void testAddABook() {
        assertNotNull(bc);
        System.out.println(bc.getBookArray());
	}

	//G
	@Test
	public void testFindBook() throws BookNotFoundException {
        String title = "Learning Java";
        System.out.println(bc.findBook(title));
        assertTrue(true);
	}

	//G
	@Test
	public void testFindBookIgnoringCase() {

	}

	//G
	@Test
	public void testFindBookWithExtraSpaces() {

	}

	//VG
	// This test should throw BookNotFoundException in order to pass.
	@Test
	public void testFindBookThatDoesntExist() throws BookNotFoundException {

	}

}
