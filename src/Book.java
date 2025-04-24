public class Book {

    private int id;
    private String title;
    private String author;
    private String category;
    private int totalCopies;
    private int availableCopies;


    public Book(int id, String title, String author, String category, int totalCopies){
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.totalCopies =totalCopies;
        this.availableCopies = totalCopies;

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
    public int getTotalCopies(){
        return totalCopies;
    }
    public int getAvailableCopies(){
        return availableCopies;
    }
    public void setAvailableCopies(int count){
        this.availableCopies = count;
    }

    public String toString(){
        return "Book ID:" + id + ", Title: " + title + ", Author: " + author + ", Category: " + ", Available Copies: "
                + availableCopies + "/" + totalCopies;
    }


}


