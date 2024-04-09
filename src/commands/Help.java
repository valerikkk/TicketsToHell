package commands;
public class Help extends Command {

    public Help() {
        super("help", "вывести справку по доступным командам");
    }
    @Override
    public void run() {
        //TODO Передаём хэш-мапу из названий всех комманд и описаний и вызывем всё
        System.out.println("help");
    }
}