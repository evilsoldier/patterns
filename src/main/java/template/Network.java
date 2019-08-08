package template;

/**
 * Base class of social network
 *
 * @author Georgi Trendafilov
 */
public abstract class Network {

    String userName;

    String password;

    Network() {
    }

    /**
     * Publish the data to whatever network.
     */
    public boolean post(String message) {

        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);

    abstract boolean sendData(byte[] data);

    abstract boolean logOut();
}
