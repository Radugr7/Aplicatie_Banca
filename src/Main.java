import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String option = "";
        User loggedInUser;
        System.out.println("1) Login");
        System.out.println("2) Register");
        Scanner scanner = new Scanner(System.in);
        option = scanner.next();
        if (option.equals("1")) {
            loggedInUser = Login.loginUser();
        } else {
            System.out.println("Username:");
            String username = scanner.next();

            System.out.println("Password:");
            String password = scanner.next();

            System.out.println("Balance:");
            int balance = scanner.nextInt();
            UsersFactory.users.add(new User(username, password, balance));
        }

        // operatii pe balanta / tranzactii


    }
}