import java.util.HashMap;
import java.util.Map;

public class Library<T extends Book> {
    public Map<Integer, T> books = new HashMap<>();

    public void addBook(T book){
        books.put(book.getId(), book);
        System.out.println("Book added: " + book.getTitle());
    }
    public void listBooks(){
        if (books.isEmpty()){
            System.out.println("No Books available.");
        }else {
            for(T book : books.values()){
                System.out.println(book);
            }
        }
    }

}
