package managers;
import exceptions.NullValueException;
import models.*;

import java.util.EnumSet;
import java.util.Scanner;

public class DataCollector{
    Scanner scanner = AllManagers.getManagers().getScanner();
    public TicketData wrap(){
        TicketData ticketData = new TicketData();
        collectName(ticketData);
        collectCoordinates(ticketData);
        collectPrice(ticketData);
        collectTicketType(ticketData);
        collectVenue(ticketData);
        return ticketData;
    }
    public Long collectId(){
        System.out.println("Введите id необходимого билета");
        return collectLong();
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
    public void collectTicketType(TicketData ticketData){
        System.out.println("Введите тип билета");
        TicketType type = collectTicketType();
        ticketData.setType(type);
    }
    public void collectVenue(TicketData ticketData){
        Venue venue = new Venue();
        System.out.println("Введите место проведения мероприятия");
        String name = collectString();
        venue.setName(name);
        System.out.println("Введите вместимость площадки");
        int capacity = collectInteger();
        venue.setCapacity(capacity);
        System.out.println("Введите тип площадки");
        VenueType venueType = collectVenueType();
        venue.setType(venueType);
        venue.setId(Math.abs((long)venue.hashCode()));
        ticketData.setVenue(venue);
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
            }catch(IllegalArgumentException ex){
                System.out.println("Введите тип long");
            }
        }
    }
    public Integer collectInteger(){
        while(true){
            try {
                return Integer.parseInt(collectValue());
            }catch (NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }catch(IllegalArgumentException ex){
                System.out.println("Введите тип int");
            }
        }
    }
    public Double collectDouble(){
        while(true){
            try{
                return Double.parseDouble(collectValue());
            }catch (NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }catch(IllegalArgumentException ex){
                System.out.println("Введите тип double");
            }
        }
    }
    public Float collectFloat(){
        while(true){
            try {
                return Float.parseFloat(collectValue());
            }catch(NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }catch(IllegalArgumentException ex){
                System.out.println("Введите тип float");
            }
        }
    }
    public TicketType collectTicketType(){
        while(true){
            try{
                return TicketType.valueOf(collectValue().toUpperCase());
            }catch(NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }catch (IllegalArgumentException ex){
                System.out.println("Введите одно из предложенных значений");
                EnumSet<TicketType> ticketTypes = EnumSet.allOf(TicketType.class);
                for (TicketType ticketType:ticketTypes) {
                    System.out.println(ticketType);
                }
            }
        }
    }
    public VenueType collectVenueType(){
        while(true){
            try{
                return VenueType.valueOf(collectValue().toUpperCase());
            }catch(NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }catch (IllegalArgumentException ex){
                System.out.println("Введите одно из предложенных значений");
                EnumSet<VenueType> venueTypes = EnumSet.allOf(VenueType.class);
                for (VenueType venueType:venueTypes) {
                    System.out.println(venueType);
                }
            }
        }
    }
}
