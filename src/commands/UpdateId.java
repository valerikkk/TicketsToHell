package commands;

import managers.AllManagers;
import managers.CollectionManager;
import managers.DataCollector;

public class UpdateId extends Command{
    public UpdateId() {
        super("update_id", "обновить значение элемента коллекции, id которого равен заданному");
    }
    @Override
    public void run() {
        CollectionManager collectionManager = AllManagers.getManagers().getCollectionManager();
        DataCollector dataCollector = new DataCollector();
        collectionManager.updateById(dataCollector.collectId(), dataCollector.wrap());
    }
}
