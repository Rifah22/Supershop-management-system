
public class book{
	private String bookName;
	private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
 
public book(){
	
System.out.println("Empty-Book");

}

public book(String bookName, String bookAuthor,String bookId, String bookType, int bookCopy){
	
	this.bookName=bookName;
	this.bookAuthor=bookAuthor;
	this.bookId=bookId;
	this.bookType=bookType;
    this.bookCopy=bookCopy;
	
System.out.println("Parameterized-Book");

}

public void setbookName(String bookName){this.bookName=bookName;}
public void setbookAuthor(String bookAuthor){this.bookAuthor=bookAuthor;}
public void setbookId(String bookId){this.bookId=bookId;}
public void setbookType(String bookType){this.bookType=bookType;}
public void setbookCopy(int bookCopy){this.bookCopy=bookCopy;}

public String getbookName(){return bookName;}
public String getbookAuthor(){return bookAuthor;}
public String getbookId(){return bookId;}
public String getbookType(){return bookType;}
public int getbookCopy(){return bookCopy;}

public int bookCopy (int x){
	if (x>0){
	bookCopy=bookCopy+x;
	System.out.println("Bookcopy after adding book:" );}
	else{
	System.out.println("Invalid amount");}
	return bookCopy;
	}
	
public void ShowBookInfo(){
	
	System.out.println("BookName:"+bookName);
    System.out.println("BookAuthor:"+bookAuthor);
	System.out.println("BookId:"+bookId);
	System.out.println("BookType:"+bookType);
	System.out.println("BookCopy:"+bookCopy);
	System.out.println("");
    }
}
