package managers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The type CSV parser.
 */
public class CSVparser {

    /**
     * Instantiates a new CSV pparser.
     */
    public CSVparser() {
    }

    /**
     * Parse file.
     *
     * @param path the path
     * @return the string [ ]
     */
    public String[] parse(String path) {
        String[] result = new String[0];
        try {
            FileInputStream file = new FileInputStream(path);
            InputStreamReader input = new InputStreamReader(file);
            char[] arr = new char[2000];
            int count = input.read(arr);
            if (count == -1) {
                return result;
            }
            else if (count != -1) {
                char[] arr2 = new char[count];
                System.arraycopy(arr, 0, arr2, 0, arr2.length);
                String res = String.valueOf(arr2);
                result = res.split("\n");
                input.close();
                AllManagers.getManagers().setPath(path);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            System.out.println("Введите корректный путь к файлу");
        }
        return result;
    }
}