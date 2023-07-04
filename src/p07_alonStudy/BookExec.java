package p07_alonStudy;

import javax.sql.rowset.JoinRowSet;

public class BookExec {
	public static void main(String[] args) {
		
		FictionBook fBook = new FictionBook();
		fBook.name = "바보들의 세계";
		fBook.genre = "장편소설";
		fBook.writer = "이보성";
		fBook.price = 21000;
//		fBook.printBook();
		
		fBook.page = 4923;
		
		ComicBook cBook = new ComicBook();
		cBook.name = "스파이더맨";
		cBook.genre = "만화책";
		cBook.writer = "이땡땡";
		fBook.price = 19000;
//		cBook.printBook();
		
		cBook.art = "그림 많음";
		
		
		Book[] books = new Book[2];
		books[0] = fBook;
		books[1] = cBook;
		
		books[0].printBook();
		books[1].printBook();
		
	}
}
