package commands;

import managers.AllManagers;
import java.util.Vector;

/**
 * The type Clear.
 */
public class Clear extends Command {
    /**
     * Instantiates a new Clear.
     */
    public Clear() {
        super("clear", "очистить коллекцию", "NO");
    }
    /**
     * Command to delete all elements from collection.
     */
    @Override
    public void run() {
        AllManagers.createAllManagers().getCollectionManager().setCollection(new Vector<>());
    }
}
