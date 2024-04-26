package commands;

import managers.AllManagers;
import managers.CollectionManager;
import managers.DataCollector;
import models.TicketData;

/**
 * The type Add.
 */
public class Add extends Command{
    /**
     * Instantiates a new Add.
     */
    public Add() {
        super("add", "добавить новый элемент в коллекцию", "NO");
    }
    /**
     * Command to add new element to collection.
     */
    @Override
    public void run() {
        CollectionManager collectionManager = AllManagers.getManagers().getCollectionManager();
        DataCollector dataCollector = new DataCollector();
        TicketData ticketData = dataCollector.wrap();
        collectionManager.addTicket(ticketData);
    }
}
