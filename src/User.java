/**
 * Created by Radu on 12-Dec-17.
 */
public class User {

    private String userName;
    private String userPassword;
    private int ballance;

    public User(String userName, String userPassword, int ballance){
        this.userName = userName;
        this.userPassword = userPassword;
        this.ballance = ballance;
    }

    public int getBallance() {
        return ballance;
    }

    public void setBallance(int ballance) {
        this.ballance = ballance;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}