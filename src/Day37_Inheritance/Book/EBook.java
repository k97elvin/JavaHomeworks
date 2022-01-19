package Day37_Inheritance.Book;

public class EBook {
    public String title, type, author;
    public double price;
    public void setInfo(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;

    }
    public void readBook(){
        System.out.println("to read ebook " + title);
    }
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }


}
/*
3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */