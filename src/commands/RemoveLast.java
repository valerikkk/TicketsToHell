package commands;

import managers.AllManagers;
import managers.CollectionManager;

/**
 * The type Remove last.
 */
public class RemoveLast extends Command{
    /**
     * Instantiates a new Remove last.
     */
    public RemoveLast() {
        super("remove_last", "удалить последний добавленный элемент из коллекции", "NO");
    }
    /**
     * Command to remove last added element.
     */
    @Override
    public void run() {
        CollectionManager collectionManager = AllManagers.getManagers().getCollectionManager();
        collectionManager.removeById(collectionManager.getLastId());
        collectionManager.setLastId(collectionManager.getLastId()-1);
        System.out.println("Вызовите команду show, дабы убедиться");
    }
}
