package commands;

import managers.AllManagers;
import managers.CollectionManager;
import managers.DataCollector;

public class UpdateById extends Command{
    public UpdateById() {
        super("update", "обновить значение элемента коллекции, id которого равен заданному");
    }
    @Override
    public void run() {
        CollectionManager collectionManager = AllManagers.getManagers().getCollectionManager();
        DataCollector dataCollector = new DataCollector();
        collectionManager.updateById(dataCollector.collectId(), dataCollector.wrap());
    }
}
