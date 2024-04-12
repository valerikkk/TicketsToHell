import commands.*;
import managers.*;

<<<<<<< HEAD
import java.util.Arrays;
=======
>>>>>>> 276196415cd5ac7b25a370ab24f1ae6c439c73ce
import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        AllManagers all = AllManagers.createAllManagers();
        all.setCollectionManager(new CollectionManager());
        all.setScanner(new Scanner(System.in));
        CSVparser pars = new CSVparser();
        Setter setter = new Setter();
<<<<<<< HEAD
        FileWriter fr = new FileWriter();
        setter.set(pars.parse("BIMBAM.csv"));
        fr.write(all.getCollectionManager());
=======
        setter.set(pars.parse("BIMBAM.csv"));
>>>>>>> 276196415cd5ac7b25a370ab24f1ae6c439c73ce
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
                new CountType(),
                new FilterType(),
                new MaxByVenue()));
        all.setConsoleManager(new ConsoleManager(AllManagers.getManagers().getScanner(), AllManagers.getManagers().getCommandManager()));
        all.getConsoleManager().runFromConsole();
    }
}
