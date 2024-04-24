package commands;

import managers.AllManagers;
import managers.CollectionManager;
import models.Ticket;
import java.util.Vector;

public class Show extends Command{
    public Show(){
        super("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении", "NO");
    }
    @Override
    public void run(){
        CollectionManager collectionManager = AllManagers.createAllManagers().getCollectionManager();
        Vector<Ticket> tickets = collectionManager.getTickets();
        for(Ticket ticks: tickets){
            System.out.println(ticks.toString());
        }
    }
}
