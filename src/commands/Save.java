package commands;

import managers.AllManagers;
import managers.CollectionManager;
import managers.FileWriter;

/**
 * The type Save.
 */
public class Save extends Command {
    /**
     * Instantiates a new Save.
     */
    public Save() {
        super("save", "сохраняет коллекцию в файл", "NO");
    }
    /**
     * Command to save collection of tickets to file.
     */
    @Override
    public void run() {
        CollectionManager coll = AllManagers.getManagers().getCollectionManager();
        FileWriter fileWriter = AllManagers.getManagers().getFileWriter();
        fileWriter.write(coll);
    }
}
