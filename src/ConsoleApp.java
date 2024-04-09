import commands.Exit;
import commands.Help;
import commands.Show;
import managers.AllManagers;
import managers.CollectionManager;
import managers.CommandManager;
import managers.ConsoleManager;
import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        AllManagers all = AllManagers.createAllManagers();
        all.setCollectionManager(new CollectionManager());
        all.setScanner(new Scanner(System.in));
        all.setCommandManager(new CommandManager(new Exit(), new Help(), new Show()));
        all.setConsoleManager(new ConsoleManager(AllManagers.getManagers().getScanner(), AllManagers.getManagers().getCommandManager()));
        all.getConsoleManager().runFromConsole();
    }

}
