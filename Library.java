
public class Library {
        private String libName;
        private String libAddress;
        private Book[] listOfBook;
        private int totalBook;
    int count=0;
        //setting default values
        public Library() {
                totalBook=100;
                listOfBook = new Book[100];
        }
        public Library(String libName, String libAddress, int totalBook) {
                this.libName = libName;
                this.libAddress = libAddress;
                this.totalBook = totalBook;
                this.listOfBook = new Book[totalBook];
        }
        public String getLibName() {
                return libName;
        }
        public String getLibAddress() {
                return libAddress;
        }
        public Book[] getListOfBook() {
                return listOfBook;
        }
        public int getTotalBook() {
                return totalBook;
        }
        public void setLibName(String libName) {
                this.libName = libName;
        }
        public void setLibAddress(String libAddress) {
                this.libAddress = libAddress;
        }
        public void setListOfBook(Book[] listOfBook) {
                this.listOfBook = listOfBook;
        }
        public void setTotalBook(int totalBook) {
                this.totalBook = totalBook;
        }
        void showLibInfo(){
                System.out.println(libName+" at "+ libAddress);
                for(int i=0;i<count;i++){
                        System.out.println(listOfBook[i]);
                }
        }


void addNewBook(Book book){
                if(count                listOfBook[count++]=book;
                System.out.println("Book added succesfully");
                }
                else{
                        System.out.println("Library is full, cannot add book");
                }
        }
        void deletebook(Book book){
                int i=0;
                for(i=0;i                        if(listOfBook[i]==book){
                                break;
                        }
                }
                if(i==count)
                        System.out.println("Book not found");
                else{
                        for(int k=i+1;k                                listOfBook[k-1]=listOfBook[k];
                        }
                        System.out.println("deleted succesfully");
                        count--;
                }
        }
        //adding copy number of book objects
        void addNewBook(Book book, int copy){
                int i=0;
                while(i                        listOfBook[count++]=book;
                        i++;
                }
                if(i==copy){
                        System.out.println("All copies are added suceefully");
                }else{
                        System.out.println("Only "+i+" copies are added");
                }
        }
}

