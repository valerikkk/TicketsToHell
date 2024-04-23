package commands;

import managers.AllManagers;
import managers.CollectionManager;
import models.Ticket;

import java.util.Vector;

public class Reorder extends Command{
    public Reorder() {
        super("reorder", "отсортировать коллекцию в порядке, обратном нынешнему", "NO");
    }
    @Override
    public void run() {
        CollectionManager collectionManager = AllManagers.getManagers().getCollectionManager();
        Vector<Ticket> tickets = collectionManager.getTickets();
        Vector<Ticket> sortTickets = new Vector<>();
        for (int i = tickets.size()-1; i>=0; i--) {
            sortTickets.add(tickets.get(i));
        }
        collectionManager.setCollection(sortTickets);
    }
}
