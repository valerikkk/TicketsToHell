

public class Main {
    public static void main(String[] args){
        CSVparser pars = new CSVparser();
        Setter setter = new Setter();
        FileWriter fw = new FileWriter();

        fw.write(setter.set(pars.parse("BIMBAM.csv")));
    }
}
