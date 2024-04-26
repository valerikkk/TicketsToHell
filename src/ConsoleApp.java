import commands.*;
import managers.*;
import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        AllManagers all = AllManagers.createAllManagers();
        all.setCollectionManager(new CollectionManager());
        all.setScanner(new Scanner(System.in));
        CSVparser pars = new CSVparser();
        all.setCsvParser(pars);
        CSVManager csvManager = new CSVManager();

        FileWriter fileWriter = new FileWriter();
        HistoryCommand historyCommand = new HistoryCommand();
        all.setFileWriter(fileWriter);
        all.setHistoryCommand(historyCommand);
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
                new MaxByVenue(),
                new ExecuteScript(),
                new Save(),
                new Reorder(),
                new History()));
        all.setConsoleManager(new ConsoleManager(all.getScanner(), all.getCommandManager()));
        if(args.length>0){
            String path = args[0];
            csvManager.ticketParse(pars.parse(path));
            all.setPath(path);
        }else{
            System.out.println("Передайте аргументом путь к файлу");
        }
        all.getConsoleManager().runFromConsole();
    }
}
