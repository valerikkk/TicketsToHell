package managers;

import commands.Command;
import exceptions.NoSuchCommandException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class CommandManager {
    Map<String, Command> commands = new HashMap<>();
    public CommandManager(Command... command){
        for(Command comms: command){
            commands.put(comms.getNameInConsole(), comms);
        }
    }
    public void callCommand(String nameCommand) throws NoSuchCommandException{
        try{
            commands.get(nameCommand).run();
        }catch(NullPointerException ex){
            throw new NoSuchCommandException();
        }
    }
    public Map<String, Command> getCommands() {
        return commands;
    }
}
