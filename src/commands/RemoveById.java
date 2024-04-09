package commands;

import managers.AllManagers;
import managers.CollectionManager;
import managers.DataCollector;

public class RemoveById extends Command{
    public RemoveById() {
        super("remove_by_id", "удалить элемент из коллекции по его id");
    }
    @Override
    public void run() {
        CollectionManager collectionManager = AllManagers.getManagers().getCollectionManager();
        DataCollector dataCollector = AllManagers.getManagers().getDataCollector();
        collectionManager.removeById(dataCollector.collectId());
    }
}
