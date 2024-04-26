package managers;

import exceptions.NoSuchCommandException;
import exceptions.ScriptRecursionException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * The type Script executer.
 */
public class ScriptExecuter {
    /**
     * Instantiates a new Script executer.
     */
    public ScriptExecuter() {
    }
    ConsoleManager consoleManager = AllManagers.createAllManagers().getConsoleManager();
    /**
     * Execute script from given file.
     *
     * @param path           the path
     * @param commandManager the command manager
     * @throws NoSuchCommandException the no such command exception
     */
    public void exec(String path, CommandManager commandManager) throws NoSuchCommandException{
        String[] result;
        try {
            FileInputStream file = new FileInputStream(path);
            InputStreamReader input = new InputStreamReader(file);
            char[] arr = new char[1000];
            char[] arr2  = new char[input.read(arr)];
            System.arraycopy(arr, 0, arr2, 0, arr2.length);
            String res = String.valueOf(arr2);
            result = res.split("\n");
            for (String com:result) {
                try {
                    consoleManager.setTokens(com.split(" "));
                    if (consoleManager.getTokens().length > 1 && consoleManager.tokens[1].equals(path)) {
                        throw new ScriptRecursionException();
                    }else{
                        commandManager.callCommand(consoleManager.getTokens()[0]);
                    }
                } catch (NullPointerException ex) {
                    throw new NoSuchCommandException();
                } catch (ScriptRecursionException e) {
                    System.out.println("Скрипт вызывает рекурсию. Исправьте путь к файлу на другой");
                }
            }
        } catch (IOException ex) {
            System.out.println("Не найден файл");
        }
    }

}
