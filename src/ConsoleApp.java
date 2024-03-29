import java.io.File;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class ConsoleApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        File ticks = new File("Tickets.csv");
        Scanner scannerFile = new Scanner(ticks);
        LinkedList<String> tickets = new LinkedList<>();
        while(scannerFile.hasNext()){
            System.out.println(Arrays.toString(scannerFile.nextLine().split(",")));
        }


//        while(true) {
//            String command = scanner.nextLine();
//            if (command.equalsIgnoreCase("help")) {
//                System.out.println("help : вывести справку по доступным командам\n" +
//                        "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
//                        "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
//                        "add {element} : добавить новый элемент в коллекцию\n" +
//                        "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
//                        "remove_by_id id : удалить элемент из коллекции по его id\n" +
//                        "clear : очистить коллекцию\n" +
//                        "save : сохранить коллекцию в файл\n" +
//                        "execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
//                        "exit : завершить программу (без сохранения в файл)\n" +
//                        "remove_last : удалить последний элемент из коллекции\n" +
//                        "shuffle : перемешать элементы коллекции в случайном порядке\n" +
//                        "remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный\n" +
//                        "filter_contains_name name : вывести элементы, значение поля name которых содержит заданную подстроку\n" +
//                        "filter_starts_with_name name : вывести элементы, значение поля name которых начинается с заданной подстроки\n" +
//                        "print_unique_type : вывести уникальные значения поля type всех элементов в коллекции");
//            } else if (command.equalsIgnoreCase("exit")) {
//                System.exit(0);
//            }
//        }
    }
}
