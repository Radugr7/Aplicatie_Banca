import java.util.Scanner;

/**
 * Created by Radu on 12-Dec-17.
 */
public class Login {

    public static User loginUser(User[] users){
        Scanner in = new Scanner(System.in);
        String userName, userPass;
        System.out.print("Username: ");
        userName = in.nextLine();
        System.out.print("Password: ");
        userPass = in.nextLine();
        while (!verifyAccountDetails(userName, userPass, users)){
            System.out.println("Incorrect Username or Password. Retry:");
            System.out.print("Username: ");
            userName = in.nextLine();
            System.out.print("Password: ");
            userPass = in.nextLine();
        }
        System.out.println(userName + " is now logged in.");
        return getUser(userName, users);
    }

    public static boolean verifyAccountDetails(String name, String pass, User[] users){
        for (User user: users) {
            if (user.getUserName().equals(name) && user.getUserPassword().equals(pass)) {
                return true;
            }
        }
        return false;
    }

    public static User getUser(String userName, User[] users){
        int i;
        for (i=0;i<users.length;i++){
            if (users[i].getUserName().equals(userName))
                break;
        }
        return users[i];
    }
}