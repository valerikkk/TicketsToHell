package commands;
import managers.AllManagers;
import models.Ticket;
import java.util.Vector;

public class Show extends Command{
    public Show(){
        super("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
    }
    @Override
    public void run(){
        System.out.println("Коллекция билетов");
        //TODO Посмотреть, как будет выводиться коллекция
        Vector<Ticket> tickets = AllManagers.createAllManagers().getCollectionManager().getTickets();
        for(Ticket ticks: tickets){
            System.out.println(ticks.toString());
        }
    }
}
