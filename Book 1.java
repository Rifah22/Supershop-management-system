public class Book{
        private String title;
        private String author;
        private double price;   
        public Book(String title, String author, double price) {
                super();
                this.title = title;
                this.author = author;
                this.price = price;
        }
        public Book() {
                super();
        }
        public String getTitle() {
                return title;
        }
        public double getPrice() {
                return price;
        }
        public void setTitle(String title) {
                this.title = title;
        }
        public String getAuthor() {
                return author;
        }
        public void setAuthor(String author) {
                this.author = author;
        }
        public void setPrice(double price) {
                this.price = price;
        }
        
        public String toString() {
                return title+" by "+author+" at a cost of $"+price;
        }  
}

