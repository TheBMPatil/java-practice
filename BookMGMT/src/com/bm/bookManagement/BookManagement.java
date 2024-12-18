package com.bm.bookManagement;

public class BookManagement {

	static void displayTop3(Book[] bks) {

	}

	static void displayAllBooks(Book[] bks) {
		for (int iter = 0; iter < bks.length; iter++) {
			bks[iter].display();
		}
	}

	static void hardCodedBooks(Book[] bks) {
	}

	static void addBookHelper(Book[] bks) {
	}

	static Book searchBookByName(Book[] bks, String bname) {
		return new Book();
	}

	static Book searchBookByID(Book[] bks, int id) {
		return new Book();
	}

	static void updateBook(Book[] bks, int id) {
	}

	static void removeBook(Book[] bks, int id) {
	}

	static void listAllAuthors(Book[] bks) {
	}

	static void listAllCategories(Book[] bks) {
	}

	static void listBooksByAuthor(Book[] bks, String authName) {
	}

	static void listBooksByCategory(Book[] bks, String category) {
	}

	static void sortBooksByRating(Book[] bks, char order) {
	}

	static void sortBooksByPrice(Book[] bks, char order) {
	}

	
	
	
	
static	void hardCodesdBooks(Book[] books) {


		books[0].setbId(1);
		books[0].setBookTitle("The Lord of the Rings");
		books[0].setPrice(29.99);
		books[0].setRating(5.1);
		books[0].setAuthor("J.R.R. Tolkien");
		books[0].setCategory("Fantasy");

		books[1].setbId(2);
		books[1].setBookTitle("Pride and Prejudice");
		books[1].setPrice(14.99);
		books[1].setRating(4.2);
		books[1].setAuthor("Jane Austen");
		books[1].setCategory("Romance");

		books[2].setbId(3);
		books[2].setBookTitle("To Kill a Mockingbird");
		books[2].setPrice(18.99);
		books[2].setRating(5.6);
		books[2].setAuthor("Harper Lee");
		books[2].setCategory("Fiction");

		books[3].setbId(4);
		books[3].setBookTitle("1984");
		books[3].setPrice(12.99);
		books[3].setRating(4.9);
		books[3].setAuthor("George Orwell");
		books[3].setCategory("Dystopian");

		books[4].setbId(5);
		books[4].setBookTitle("The Hitchhiker's Guide to the Galaxy");
		books[4].setPrice(15.99);
		books[4].setRating(5.3);
		books[4].setAuthor("Douglas Adams");
		books[4].setCategory("Science Fiction");

		books[5].setbId(6);
		books[5].setBookTitle("Harry Potter and the Sorcerer's Stone");
		books[5].setPrice(22.99);
		books[5].setRating(5.8);
		books[5].setAuthor("J.K. Rowling");
		books[5].setCategory("Fantasy");

		books[6].setbId(7);
		books[6].setBookTitle("The Great Gatsby");
		books[6].setPrice(16.99);
		books[6].setRating(4.6);
		books[6].setAuthor("F. Scott Fitzgerald");
		books[6].setCategory("Classics");

		books[7].setbId(8);
		books[7].setBookTitle("The Catcher in the Rye");
		books[7].setPrice(13.99);
		books[7].setRating(4.8);
		books[7].setAuthor("J.D. Salinger");
		books[7].setCategory("Classics");

		books[8].setbId(9);
		books[8].setBookTitle("The Alchemist");
		books[8].setPrice(11.99);
		books[8].setRating(5.3);
		books[8].setAuthor("Paulo Coelho");
		books[8].setCategory("Philosophy");

		books[9].setbId(10);
		books[9].setBookTitle("The Little Prince");
		books[9].setPrice(10.99);
		books[9].setRating(5.6);
		books[9].setAuthor("Antoine de Saint-Exupéry");
		books[9].setCategory("Children's Literature");

		// Additional 10 Books
		books[10].setbId(11);
		books[10].setBookTitle("War and Peace");
		books[10].setPrice(20.99);
		books[10].setRating(4.9);
		books[10].setAuthor("Leo Tolstoy");
		books[10].setCategory("Historical Fiction");

		books[11].setbId(12);
		books[11].setBookTitle("Moby Dick");
		books[11].setPrice(17.50);
		books[11].setRating(4.5);
		books[11].setAuthor("Herman Melville");
		books[11].setCategory("Adventure");

		books[12].setbId(13);
		books[12].setBookTitle("The Odyssey");
		books[12].setPrice(13.99);
		books[12].setRating(4.8);
		books[12].setAuthor("Homer");
		books[12].setCategory("Epic");

		books[13].setbId(14);
		books[13].setBookTitle("Brave New World");
		books[13].setPrice(15.99);
		books[13].setRating(5.2);
		books[13].setAuthor("Aldous Huxley");
		books[13].setCategory("Science Fiction");

		books[14].setbId(15);
		books[14].setBookTitle("Frankenstein");
		books[14].setPrice(11.99);
		books[14].setRating(4.7);
		books[14].setAuthor("Mary Shelley");
		books[14].setCategory("Horror");

		books[15].setbId(16);
		books[15].setBookTitle("The Divine Comedy");
		books[15].setPrice(18.99);
		books[15].setRating(5.4);
		books[15].setAuthor("Dante Alighieri");
		books[15].setCategory("Poetry");

		books[16].setbId(17);
		books[16].setBookTitle("Don Quixote");
		books[16].setPrice(19.99);
		books[16].setRating(4.9);
		books[16].setAuthor("Miguel de Cervantes");
		books[16].setCategory("Classics");

		books[17].setbId(18);
		books[17].setBookTitle("Crime and Punishment");
		books[17].setPrice(14.99);
		books[17].setRating(5.1);
		books[17].setAuthor("Fyodor Dostoevsky");
		books[17].setCategory("Psychological Fiction");

		books[18].setbId(19);
		books[18].setBookTitle("Jane Eyre");
		books[18].setPrice(12.99);
		books[18].setRating(4.8);
		books[18].setAuthor("Charlotte Brontë");
		books[18].setCategory("Gothic Fiction");

		books[19].setbId(20);
		books[19].setBookTitle("The Hobbit");
		books[19].setPrice(21.99);
		books[19].setRating(5.7);
		books[19].setAuthor("J.R.R. Tolkien");
		books[19].setCategory("Fantasy");
	}


}
