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
    public void addTicketTwo(Ticket ticket) {
        ticket.setId(getNewId());
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
    public void updateById(long id){
        DataCollector dataCollector = new DataCollector();
        try {
            Ticket t = getTicketById(id);
            if (t!=null) {
                tickets.remove(t);
            }
            else {
                return;
            }
        }catch (IndexOutOfBoundsException ex){
            System.out.println("Введите значение long >=0");return;
        }
            Ticket ticket = new Ticket(id, dataCollector.wrap());
            tickets.add(ticket);
    }
    public Vector<Ticket> getTickets(){
        return tickets;
    }
    public void setCollection(Vector<Ticket> newColl){
        this.tickets = newColl;
        lastId = getNewId();
    }
    @Override
    public String toString() {
        String s = "";
        for (Ticket tic : tickets) {
            s += tic.fileToString() + "\n";
        }
        return s;
    }
    public long getLastId() {
        return lastId;
    }

    public void setLastId(long lastId) {
        this.lastId = lastId;
    }
}