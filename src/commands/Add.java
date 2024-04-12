package commands;

import managers.AllManagers;
import managers.CollectionManager;
import managers.DataCollector;
import models.TicketData;

public class Add extends Command{
    public Add() {
        super("add", "добавить новый элемент в коллекцию", "NO");
    }
    @Override
    public void run() {
        CollectionManager collectionManager = AllManagers.getManagers().getCollectionManager();
        DataCollector dataCollector = new DataCollector();
        TicketData ticketData = dataCollector.wrap();
        collectionManager.addTicket(ticketData);
    }
}
