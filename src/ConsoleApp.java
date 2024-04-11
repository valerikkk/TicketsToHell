import commands.*;
import managers.*;

import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        AllManagers all = AllManagers.createAllManagers();
        all.setCollectionManager(new CollectionManager());
        all.setScanner(new Scanner(System.in));
        CSVparser pars = new CSVparser();
        Setter setter = new Setter();
        setter.set(pars.parse("BIMBAM.csv"));
        all.setCommandManager(new CommandManager(
                new Exit(),
                new Help(),
                new Show(),
                new Add(),
                new Info(),
                new UpdateById(),
                new RemoveLast(),
                new RemoveById(),
                new Clear(),
                new CountType()));
        all.setConsoleManager(new ConsoleManager(AllManagers.getManagers().getScanner(), AllManagers.getManagers().getCommandManager()));
        all.getConsoleManager().runFromConsole();
    }
}
