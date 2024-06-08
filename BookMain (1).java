
public class BookMain extends Book{

public static void main (String [] args){
	
	Book b=new Book("Fighter Zet","Captain.MC","22-33-44","Newsprint",10);
	b.addBookCopy(3);
	b.showBookInfo();
	
	Book b1=new Book();
	b1.setbookName("The Red Rose");
	b1.setbookAuthor("Padrix Strange");
	b1.setbookId("11-22-33");
	b1.setbookType("White print");
	b1.setbookCopy(5);
	
	b1.showBookInfo();
}
}