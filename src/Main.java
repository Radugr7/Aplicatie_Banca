import java.util.Scanner;

/**
 * Created by Radu on 12-Dec-17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        User[] users = new User[4];
        users[0] = new User("RaduGrumazescu", "parola1", 500);
        users[1] = new User("AndreiCovaciu", "parola2", 1100);
        users[2] = new User("RazvanPop", "parola3", 860);
        users[3] = new User("RaoulCrisan", "parola4", 650);

        Login.loginUser(users);
        //new Transactions(users[0], 50);
    }
}