package template;

/**
 * @author Georgi Trendafilov
 */
public class Facebook extends Network {

    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("Login to Facebook");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        System.out.println("Posting message to Facebook");
        return true;
    }

    @Override
    boolean logOut() {
        System.out.println("Logged out");
        return true;
    }
}
