import java.util.HashMap;
import java.util.Map;

public class Library<T extends Book> {
    public Map<Integer, T> books = new HashMap<>();
    public Map<Integer, User> users = new HashMap<>();

    //Methods for Book
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


    //Methods for User
    public void registerUsers(User user){
        users.put(user.getId(), user);
        System.out.println("User Registered: " + user.getName());
    }
    public void listUsers(){
        if(users.isEmpty()){
            System.out.println("No user Registered.");
        }else {
            for (User user : users.values()){
                System.out.println(user);
            }
        }
    }


}
