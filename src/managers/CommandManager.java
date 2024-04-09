package managers;

import commands.Command;
import exceptions.NoSuchCommandException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    public CommandManager(Command... command){
        for(Command comms: command){
            commands.put(comms.getNameInConsole(), comms);
        }
    }
    Map<String, Command> commands = new HashMap<>();
    public void callCommand(String nameCommand) throws NoSuchCommandException{
        try {
            commands.get(nameCommand).run();
        }catch(NullPointerException ex){
            throw new NoSuchCommandException();
        }
    }
    public Map<String, Command> getCommands() {
        return commands;
    }
}
