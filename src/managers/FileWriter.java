package managers;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * The type File writer.
 */
public class FileWriter {
    /**
     * Write collection to file.
     *
     * @param coll the coll
     */
    public void write(CollectionManager coll){
        try(FileOutputStream out = new FileOutputStream(AllManagers.createAllManagers().getPath());
            BufferedOutputStream bos = new BufferedOutputStream(out))
        {
            byte[] buffer = coll.toString().getBytes();
            bos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}