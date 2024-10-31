package bg.technologies.adventure.service.session;

import org.springframework.stereotype.Component;

@Component
public class LoggedUser {

    private String username;

    private String email;

    private  String fullName;

    private boolean isLogged;

    public String getUsername() {
        return username;
    }

    public LoggedUser setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public LoggedUser setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public LoggedUser setLogged(boolean logged) {
        isLogged = logged;
        return this;
    }

    public LoggedUser setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public void reset() {

        setUsername(null);
        setEmail(null);
        setFullName(null);
        setLogged(false);
    }
}
