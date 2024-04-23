package managers;

import exceptions.NoSuchCommandException;
import managers.CommandManager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScriptExecuter {
    public ScriptExecuter() {
    }

    public void exec(String path, CommandManager commandManager) throws NoSuchCommandException {
        String[] result = new String[0];
        try {
            FileInputStream file = new FileInputStream(path);
            InputStreamReader input = new InputStreamReader(file);
            char[] arr = new char[100];
            char[] arr2  = new char[input.read(arr)];
            System.arraycopy(arr, 0, arr2, 0, arr2.length);
            String res = String.valueOf(arr2);
            result = res.split("\r\n");
            input.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        for (String com:result) {
            try{
                commandManager.getCommands().get(com).run();
            }catch(NullPointerException ex){
                throw new NoSuchCommandException();
            }
        }
    }
}
