package commands;

import managers.AllManagers;
import managers.CollectionManager;
import managers.ConsoleManager;

public class UpdateById extends Command{
    public UpdateById() {
        super("update", "обновить значение элемента коллекции, id которого равен заданному","YES");
    }
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
