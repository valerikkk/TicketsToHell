package commands;

import managers.AllManagers;
import managers.CollectionManager;
import managers.ConsoleManager;
import managers.DataCollector;

import java.util.NoSuchElementException;

public class UpdateById extends Command{
    public UpdateById() {
        super("update", "обновить значение элемента коллекции, id которого равен заданному");
    }
    @Override
    public void run() {
        CollectionManager collectionManager = AllManagers.getManagers().getCollectionManager();
        DataCollector dataCollector = new DataCollector();
        ConsoleManager consoleManager = AllManagers.createAllManagers().getConsoleManager();
        try{
            collectionManager.removeById(Long.parseLong(consoleManager.getTokens()[1]));
            collectionManager.addTicket(dataCollector.wrap());
//            collectionManager.updateById(Long.parseLong(consoleManager.getTokens()[1]), dataCollector.wrap());
        }catch (NumberFormatException ex){
            System.out.println("ID должен быть long и >=0");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Можно хотя бы попытаться ввести id");
        }
    }
}
