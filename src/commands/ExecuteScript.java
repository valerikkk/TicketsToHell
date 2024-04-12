package commands;

import exceptions.NoSuchCommandException;
import managers.AllManagers;
import managers.CollectionManager;
import managers.CommandManager;
import managers.ConsoleManager;

public class ExecuteScript extends Command {
    public ExecuteScript(){
        super("execute_script", "вызывает и исполняет скрипт пользователя", "YES");
    }
    @Override
    public void run() {
        ConsoleManager consoleManager = AllManagers.getManagers().getConsoleManager();
        ScriptExecuter scriptExecuter = new ScriptExecuter();
        CommandManager commandManager = AllManagers.getManagers().getCommandManager();
        try{
            scriptExecuter.exec((consoleManager.getTokens())[1], commandManager);
        }catch (NoSuchCommandException ex){
            System.out.println(ex.getMessage());
        }
    }
}
