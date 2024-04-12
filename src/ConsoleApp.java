import commands.*;
import managers.*;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        AllManagers all = AllManagers.createAllManagers();
        all.setCollectionManager(new CollectionManager());
        all.setScanner(new Scanner(System.in));
        CSVparser pars = new CSVparser();
        Setter setter = new Setter();
        FileWriter fr = new FileWriter();
        setter.set(pars.parse("BIMBAM.csv"));
        fr.write(all.getCollectionManager());
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
