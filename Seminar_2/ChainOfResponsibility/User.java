package ChainOfResponsibility;

public class User {
    private String name;
    private String pass;
    private boolean blocked;
    private String location;

    public User(String name, String pass, String location) {
        this.pass = pass;
        this.name = name;
        this.location = location;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
