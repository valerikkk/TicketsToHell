package commands;

import managers.AllManagers;
import managers.HistoryCommand;
import java.util.Queue;

public class History extends Command{
    public History() {
        super("history", "вывести последние 11 команд без аргументов", "NO");
    }
    @Override
    public void run() {
        HistoryCommand historyCommand = AllManagers.createAllManagers().getHistoryCommand();
        Queue<String> commandQueue = historyCommand.getHistoryCommands();
        System.out.println(commandQueue);
    }
}
