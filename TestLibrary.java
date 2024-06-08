
public class TestLibrary {
        public static void main(String[] args) {
                Book b1 = new Book("OS","Galvin",50);
                Book b2 = new Book("CN","Caven",70);
                Book b3 = new Book("DS","Dave",40);
                Book b4 = new Book("FM","Scate",20);
                Book b5 = new Book("IS","Gitty",38);
                Library library = new Library("GEC Library", "XXXXXX", 10);
                library.addNewBook(b1);
                library.addNewBook(b2);
                library.addNewBook(b3);
                library.addNewBook(b4);
                library.addNewBook(b5, 3);
                library.showLibInfo();
                library.deletebook(b5);
                library.showLibInfo();
        }       
}

