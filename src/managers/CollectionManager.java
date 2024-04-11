package managers;

import models.Ticket;
import models.TicketData;

import java.util.NoSuchElementException;
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
        return ++lastId;
    }
    public Ticket getTicketById(long id){
        for (Ticket tick : tickets) {
            if (tick.getId() == id) {
                return tick;
                }
            }
        System.out.println("Элемента с таким id не обнаружено");
        return null;
    }
    public void removeById(long id){
        try {
            tickets.remove(getTicketById(id));
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Введите значение long >=0");
        }
    }
    public void updateById(long id, TicketData newTicket){
            Ticket tick = getTicketById(id);
            tickets.remove(tick);
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
    public long getLastId() {
        return lastId;
    }

    public void setLastId(long lastId) {
        this.lastId = lastId;
    }
}