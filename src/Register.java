import java.util.Scanner;

public class Register {

    public static void registerUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username:");
        String username = scanner.nextLine();

        System.out.print("Password:");
        String password = scanner.nextLine();

        System.out.print("Balance:");
        int balance = scanner.nextInt();
        User registeredUser = new User(username, password, balance);
        System.out.println(registeredUser + "registered.");
        UsersFactory.users.add(registeredUser);
    }
}