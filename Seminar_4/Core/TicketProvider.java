import Interfaces.ITicketRepo;
import Models.Ticket;
import Services.TicketRepository;

import java.util.List;

// Класс - для работы с базой данных билетов

public class TicketProvider {

    private ITicketRepo ticketRepo;

    public TicketProvider() {
        this.ticketRepo = TicketRepository.getTicketRepository();
    }

    public List<Ticket> getTickets(int routeNumber) throws RuntimeException {
        return ticketRepo.readAll(routeNumber);
    }

    public boolean updateTicketStatus(Ticket ticket) {
        ticket.setValid(false);
        return ticketRepo.update(ticket);
    }
}
