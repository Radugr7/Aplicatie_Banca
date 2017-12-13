import java.util.Scanner;

public class Login {

    public static User loginUser(){
        Scanner in = new Scanner(System.in);
        String userName, userPass;
        User userToBeLoggedIn = null;
        System.out.print("Username: ");
        userName = in.nextLine();
        System.out.print("Password: ");
        userPass = in.nextLine();
        while ((userToBeLoggedIn = verifyAccountDetails(userName, userPass)) == null){
            System.out.println("Incorrect Username or Password. Retry:");
            System.out.print("Username: ");
            userName = in.nextLine();
            System.out.print("Password: ");
            userPass = in.nextLine();
        }
        System.out.println(userName + " is now logged in.");
        return userToBeLoggedIn;
    }

    public static User verifyAccountDetails(String name, String pass){
        for (User user: UsersFactory.users) {
            if (user.getUserName().equals(name) && user.getUserPassword().equals(pass)) {
                return user;
            }
        }
        return null;
    }
}