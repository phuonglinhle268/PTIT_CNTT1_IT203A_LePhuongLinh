package PTIT_CNTT1_IT203A_Session06;


// bài 5
public class Book {
        private String bookID;
        public String title;
        public String author;
        public double price;

        public Book(String bookID, String title, String author, double price) {
            this.bookID = bookID;
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void bookInfo() {
            System.out.println("Mã sách: " + bookID);
            System.out.println("Tên sách: " + title);
            System.out.println("Tác giả: " + author);
            System.out.println("Giá: " + price + " VNĐ");
        }
}
