package commands;

import managers.AllManagers;
import managers.CollectionManager;
import managers.FileWriter;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Save extends Command {
    public Save() {
        super("save", "сохраняет коллекцию в файл", "NO");
    }

    @Override
    public void run() {
        CollectionManager coll = AllManagers.getManagers().getCollectionManager();
        FileWriter fileWriter = AllManagers.getManagers().getFileWriter();
        fileWriter.write(coll);
//        try(FileOutputStream out=new FileOutputStream("notes.csv");
//            BufferedOutputStream bos = new BufferedOutputStream(out))
//        {
//            // перевод строки в байты
//            byte[] buffer = coll.toString().getBytes();
//            bos.write(buffer, 0, buffer.length);
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
    }
}
