package p07_alonStudy;

public class Book {
	public String name;
	public String genre;
	public String writer;
	public int price;
	
	public void printBook() {
		System.out.println(name+"이라는 "+genre+"을 읽고 있고 "+"작가는 "+writer+"이며,"+"가격은"+price+"원 입니다.");
	}
}
