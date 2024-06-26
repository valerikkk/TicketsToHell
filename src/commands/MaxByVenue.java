package commands;

import managers.AllManagers;
import managers.CollectionManager;
import managers.ComparatorVenue;
import managers.ConsoleManager;
import models.Ticket;

import java.util.Vector;

public class MaxByVenue extends Command{
    public MaxByVenue() {
        super("max_by_venue", "вывести любой объект из коллекции, значение поля venue которого является максимальным", "NO");
    }
    @Override
    public void run() {
        ConsoleManager consoleManager = AllManagers.createAllManagers().getConsoleManager();
        CollectionManager collectionManager = AllManagers.getManagers().getCollectionManager();
        ComparatorVenue comparatorVenue = new ComparatorVenue();
        Vector<Ticket> tickets = collectionManager.getTickets();
        Vector<Ticket> sortTickets = new Vector<>(tickets);
        sortTickets.sort(comparatorVenue);
        System.out.println(sortTickets.get(0));
    }
}
