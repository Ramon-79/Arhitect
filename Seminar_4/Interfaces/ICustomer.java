import Core.UserProvider;
import Models.Ticket;
import Models.User;

import java.util.Date;
import java.util.List;

public interface ICustomer {
    List<Ticket> getSelectedTickets();

    void setSelectedTickets(List<Ticket> selectedTickets);

    User getUser();

    void setUser(User client);

    UserProvider getUserProvider();

    boolean buyTicket(Ticket ticket) throws RuntimeException;

    List<Ticket> searchTicket(Date date, int route) throws RuntimeException;
}
