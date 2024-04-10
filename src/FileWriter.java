import models.Ticket;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
    public void write(Ticket ticket){
        String toWrite = ticket.fileToString();
        try(FileOutputStream out=new FileOutputStream("notes.csv");
            BufferedOutputStream bos = new BufferedOutputStream(out))
        {
            // перевод строки в байты
            byte[] buffer = toWrite.getBytes();
            bos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
