public class Book {

    private int id;
    private String title;
    private String author;
    private String category;
    private int copies;


    public Book(int id, String title, String author, String category, int copies){
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.copies = copies;
    }
    public int getId() {
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getCategory(){
        return category;
    }
    public int getCopies(){
        return copies;
    }
    public void setCopies(int copies){
        this.copies = copies;
    }


    public String toString(){
        return "Book ID:" + id + ", Title: " + title + ", Author: " + author + ", Category: " + category + ", Available Copies: " + copies;
    }


}


