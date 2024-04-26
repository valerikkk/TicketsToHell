package commands;

import managers.AllManagers;
import managers.CollectionManager;
import managers.ConsoleManager;

/**
 * The type Update by id.
 */
public class UpdateById extends Command{
    /**
     * Instantiates a new Update by id.
     */
    public UpdateById() {
        super("update", "обновить значение элемента коллекции, id которого равен заданному. Необходимо ввести id через пробел.","YES");
    }
    /**
     * command to update the value of a collection item whose ID is equal to the specified.
     */
    @Override
    public void run() {
        CollectionManager collectionManager = AllManagers.getManagers().getCollectionManager();
        ConsoleManager consoleManager = AllManagers.createAllManagers().getConsoleManager();
        try{
            collectionManager.updateById(Long.parseLong(consoleManager.getTokens()[1]));
        }catch (NumberFormatException ex){
            System.out.println("ID должен быть long и >=0");
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Можно хотя бы попытаться ввести id");
        }
    }
}
