package commands;

import managers.AllManagers;
import managers.CollectionManager;
import models.Ticket;

public class Info extends Command{
    public Info() {
        super("info", " вывести в стандартный поток вывода информацию о коллекции (тип коллекции,тип элементов, количество элементов)", "NO");
    }

    @Override
    public void run() {
        CollectionManager collectionManager = AllManagers.getManagers().getCollectionManager();
        System.out.println("Тип коллекции: " + collectionManager.getTickets().getClass().getSimpleName());
        System.out.println("Тип элементов: " + Ticket.class.getSimpleName());
        System.out.println("Количество элементов: " + collectionManager.getTickets().size());
    }
}
