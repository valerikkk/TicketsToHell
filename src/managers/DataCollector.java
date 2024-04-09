package managers;
import exceptions.NullValueException;
import models.Coordinates;
import models.TicketData;
import java.util.Scanner;

public class DataCollector {
    Scanner scanner = AllManagers.getManagers().getScanner();
    public TicketData wrap(){
        TicketData ticketData = new TicketData();
        collectName(ticketData);
        collectCoordinates(ticketData);
        collectPrice(ticketData);
        return ticketData;
    }
    public Long collectId(){
        System.out.println("Введите id билета, который хотите заменить");
        Long id = collectLong();
        return id;
    }
    public void collectName(TicketData ticketData){
        System.out.println("Введите название билета");
        String name = collectString();
        ticketData.setName(name);
    }
    public void collectCoordinates(TicketData ticketData){
        System.out.println("Введите координату x (double)");
        double x = collectDouble();
        System.out.println("Введите координату y (float)");
        float y = collectFloat();
        ticketData.setCoordinates(new Coordinates(x, y));
    }
    public void collectPrice(TicketData ticketData){
        System.out.println("Введите цену билета");
        float price = collectFloat();
        ticketData.setPrice(price);
    }
    public String collectValue() throws NullValueException{
        String value = scanner.nextLine();
        if(value.isEmpty()){
            throw new NullValueException();
        }
        return value;
    }
    public String collectString(){
        while(true){
            try {
                return collectValue();
            }catch (NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }
        }
    }
    public Long collectLong(){
        while(true){
            try {
                return Long.parseLong(collectValue());
            }catch (NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }
        }
    }
    public Integer collectInteger(){
        while(true){
            try {
                return Integer.parseInt(collectValue());
            }catch (NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }
        }
    }
    public Double collectDouble(){
        while(true){
            try{
                return Double.parseDouble(collectValue());
            }catch (NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }
        }
    }
    public Float collectFloat(){
        while(true){
            try {
                return Float.parseFloat(collectValue());
            }catch(NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }
        }
    }
}
