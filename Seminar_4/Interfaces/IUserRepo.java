import Models.User;

import java.util.List;

public interface IUserRepo {
    int create(String userName, int passwordHash, long cardNumber);

    User read(int id);

    User read(String userName);

    List<User> readAll();

    boolean update(User client);

    boolean delete(User client);
}
