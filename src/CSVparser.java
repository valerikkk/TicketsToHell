import java.io.*;
public class CSVparser {
        public CSVparser() {
        }
        public String[] parse(String path) {
            String[] result = new String[0];
            try {
                FileInputStream file = new FileInputStream(path);
                InputStreamReader input = new InputStreamReader(file);
                char[] arr = new char[48];
                input.read(arr);
                String res = String.valueOf(arr);
                result = res.split(",");
                input.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            return result;
        }
    }

