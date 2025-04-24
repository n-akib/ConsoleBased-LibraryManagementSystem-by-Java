import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("--Library Menu--");
            System.out.println(" 1. Add Book");
            System.out.println(" 2. View All Books");
            System.out.println(" 0. Exit");
            System.out.println("Choose an Option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

        }while (choice != 0);

        scanner.close();
    }
}

