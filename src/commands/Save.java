package commands;

import managers.AllManagers;
import managers.CollectionManager;
import managers.FileWriter;
public class Save extends Command {
    public Save() {
        super("save", "сохраняет коллекцию в файл", "NO");
    }

    @Override
    public void run() {
        CollectionManager coll = AllManagers.getManagers().getCollectionManager();
        FileWriter fileWriter = AllManagers.getManagers().getFileWriter();
        fileWriter.write(coll);
    }
}
