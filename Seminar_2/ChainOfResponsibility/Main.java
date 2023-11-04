package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user1","user1", "SPACE1");
        User user2 = new User("user2","user2", "SPACE2");
        User user3 = new User("user3","user3", "SPACE3");
        user3.setBlocked(true);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        for(User u : userList){
            User userAuthorized = new CheckAuthorization(new CheckBlock(new CheckLocation(u).check()).check()).check();
            System.out.println();
        }
    }
}
