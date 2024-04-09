package managers;

import models.Ticket;
import models.TicketData;

import java.util.Vector;

public class CollectionManager {
    Vector<Ticket> tickets = new Vector<>();
    private long lastId = 0;
    public CollectionManager() {
    }
    public void addTicket(TicketData ticketData) {
        Ticket ticket = new Ticket(getNewId(), ticketData);
        tickets.add(ticket);
    }
    public long getNewId(){
        return lastId++;
    }
    public Ticket getTicketById(long id) {
        for (Ticket tick : tickets) {
            if (tick.getId() == id) {
                return tick;
            }
        }
        return null;
    }
    public void removeById(long id){
        for (Ticket ticks: tickets) {
            if (ticks.getId() == id) {
                tickets.remove(ticks);
            }
            System.out.println("Билета с таким id не найдено");
        }
    }
    public void updateById(long id, TicketData newTicket){
        tickets.remove(getTicketById(id));
        Ticket ticket = new Ticket(id, newTicket);
        tickets.add(ticket);
    }
    public Vector<Ticket> getTickets(){
        return tickets;
    }
    public void setCollection(Vector<Ticket> newColl){
        this.tickets = newColl;
        lastId = getNewId();
    }
}