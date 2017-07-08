package hello.model;

import java.util.Date;

/**
 * POJO
 * @author oleg
 */
public class User {

    private String username = "Наташа";
    private String password = "111";
    private String xxx = new Date().toString();

    public String getXxx() {
        return xxx;
    }

    public void setXxx(String xxx) {
        this.xxx = xxx;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
