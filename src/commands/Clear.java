package commands;

import managers.AllManagers;
import java.util.Vector;

public class Clear extends Command {
    public Clear() {
        super("clear", "очистить коллекцию", "NO");
    }

    @Override
    public void run() {
        AllManagers.createAllManagers().getCollectionManager().setCollection(new Vector<>());
    }
}
