package commands;
public class Exit extends Command {
    public Exit() {
        super("exit", "завершить программу (без сохранения в файл)", "NO");
    }
    @Override
    public void run(){
        System.exit(0);
    }
}
