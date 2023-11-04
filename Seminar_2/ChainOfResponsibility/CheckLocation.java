package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class CheckLocation implements ICheck  {
    List<String> blockLocations = new ArrayList<>();
    private User user;

    public CheckLocation(User user) {
        this.user = user;
        blockLocations.add("SPACE1");
        blockLocations.add("SPACE2");
    }

    @Override
    public User check(){
        if(user == null) return null;

        if(blockLocations.contains(user.getLocation())){
            System.out.println("Пользователи " + user.getLocation() + " заблокированы.");
            return null;
        }else{
            System.out.println("Добро пожаловать " + user.getLocation());
            return user;
        }
    }
}
