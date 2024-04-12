package commands;

import managers.AllManagers;

import java.util.Map;

public class Help extends Command {

    public Help() {
        super("help", "вывести справку по доступным командам", "NO");
    }
    @Override
    public void run() {
        Map<String, Command> map= AllManagers.createAllManagers().getCommandManager().getCommands();
        for (Command command: map.values()) {
            System.out.println(command.getNameInConsole() +": " + command.getDescription());
        }
    }
}