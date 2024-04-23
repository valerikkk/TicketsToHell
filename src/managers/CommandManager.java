package managers;

import commands.Command;
import exceptions.NoSuchCommandException;
import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    HistoryCommand historyCommand = AllManagers.getManagers().getHistoryCommand();
    Map<String, Command> commands = new HashMap<>();
    public CommandManager(Command... command){
        for(Command comms: command){
            commands.put(comms.getNameInConsole(), comms);
        }
    }
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
    public Map<String, Command> getCommands() {
        return commands;
    }
}
