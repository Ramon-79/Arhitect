package ChainOfResponsibility;

public class CheckBlock  implements ICheck  {
    private User user;

    public CheckBlock(User user) {
        this.user = user;
    }

    @Override
    public User check(){
        if(user == null) return null;

        if(user.isBlocked()){
            System.out.println(user.getName() + " Ваша учетная запись заблокирована.");
            return null;
        }else{
            System.out.println("Учетная запись " + user.getName() + " активна.");
            return user;
        }
    }
}
