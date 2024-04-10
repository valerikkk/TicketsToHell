import commands.*;
import managers.*;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        AllManagers all = AllManagers.createAllManagers();
        all.setCollectionManager(new CollectionManager());
        all.setScanner(new Scanner(System.in));
        all.setCommandManager(new CommandManager(
                new Exit(),
                new Help(),
                new Show(),
                new Add(),
                new UpdateById(),
                new RemoveById(),
                new Clear()));
        all.setConsoleManager(new ConsoleManager(AllManagers.getManagers().getScanner(), AllManagers.getManagers().getCommandManager()));
        all.setDataCollector(new DataCollector());
        all.getConsoleManager().runFromConsole();
    }
}
