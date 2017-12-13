import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String option = "";
        User loggedInUser;
        System.out.println("1) Login\n2) Register\n3) Exit");
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextLine();
        UsersFactory.users.add(new User("asa", "asa", 12));
        while (!option.equals("3")) {
            if (option.equals("1")) {
                loggedInUser = Login.loginUser();
                System.out.println("Balance:" + loggedInUser.getBalance());
                System.out.println("1) Add money\n2) Get money\n3) Back");
                option = scanner.nextLine();
                while (!option.equals("3")) {
                    if (option.equals("1")) {
                        //Transaction.ADD
                    } else if (option.equals("2")) {
                        //Transaction.GET
                    }
                    System.out.println("1) Add money\n2) Get money\n3) Back");
                    option = scanner.nextLine();
                }
            } else if (option.equals("2")) {
                Register.registerUser();
            }
            System.out.println("1) Login\n2) Register\n3) Exit");
            option = scanner.nextLine();
        }
    }
}