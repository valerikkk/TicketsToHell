package commands;

import managers.AllManagers;
import managers.CollectionManager;

public class RemoveLast extends Command{
    public RemoveLast() {
        super("remove_last", "удалить последний добавленный элемент из коллекции");
    }

    @Override
    public void run() {
        CollectionManager collectionManager = AllManagers.getManagers().getCollectionManager();
        collectionManager.removeById(collectionManager.getLastId());
    }
}
