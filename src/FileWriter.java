import managers.CollectionManager;
import models.Ticket;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void write(CollectionManager coll){
        try(FileOutputStream out=new FileOutputStream("notes.csv");
            BufferedOutputStream bos = new BufferedOutputStream(out))
        {
            // перевод строки в байты
            byte[] buffer = coll.toString().getBytes();
            bos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}