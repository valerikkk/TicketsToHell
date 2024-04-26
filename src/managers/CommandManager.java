package managers;

import commands.Command;
import exceptions.NoSuchCommandException;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Command manager.
 */
public class CommandManager {
    /**
     * The collection of History command.
     */
    HistoryCommand historyCommand = AllManagers.getManagers().getHistoryCommand();
    /**
     * The collection of Commands.
     */
    Map<String, Command> commands = new HashMap<>();

    /**
     * Instantiates a new Command manager.
     *
     * @param command the command
     */
    public CommandManager(Command... command){
        for(Command comms: command){
            commands.put(comms.getNameInConsole(), comms);
        }
    }

    /**
     * Method that calls command from collection of commands.
     *
     * @param nameCommand the name command
     * @throws NoSuchCommandException the no such command exception
     */
    public void callCommand(String nameCommand) throws NoSuchCommandException{
        try{
            commands.get(nameCommand).run();
            if(historyCommand.getHistoryCommands().size()==11){
                historyCommand.getHistoryCommands().removeFirst();
            }
                historyCommand.addCommand(nameCommand);
        }catch(NullPointerException ex){
            throw new NoSuchCommandException();
        }
    }

    /**
     * Gets collection of commands.
     *
     * @return the commands
     */
    public Map<String, Command> getCommands() {
        return commands;
    }
}
