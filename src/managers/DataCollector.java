package managers;
import exceptions.NullValueException;
import models.*;

import java.time.LocalDateTime;
import java.util.EnumSet;
import java.util.Scanner;

public class DataCollector{
    Scanner scanner = AllManagers.getManagers().getScanner();
    public TicketData wrap(){
        TicketData ticketData = new TicketData();
        ticketData.setCreationDate(LocalDateTime.now());
        collectName(ticketData);
        collectCoordinates(ticketData);
        collectPrice(ticketData);
        collectTicketType(ticketData);
        collectVenue(ticketData);
        System.out.println("NORM");
        return ticketData;
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
        float y = collectAllFloat();
        ticketData.setCoordinates(new Coordinates(x, y));
    }
    public void collectPrice(TicketData ticketData){
        System.out.println("Введите цену билета");
        float price=collectFloat();
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
    public String collectValue() throws NullValueException, IllegalArgumentException{
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
    public Integer collectInteger(){
        while(true){
            try {
                int capacity = Integer.parseInt(collectValue());
                if(capacity<=0){
                    System.out.println("значение должно быть >=0");
                    continue;
                }
                return capacity;
            }catch (NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }catch(IllegalArgumentException ex){
                System.out.println("Введите тип int, ");
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
                float price = Float.parseFloat(collectValue());
                if(price<=0){
                    System.out.println("Значение этого поля должно быть >= 0");
                    continue;
                }
                return price;
            }catch(NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }catch(IllegalArgumentException ex){
                System.out.println("Введите тип float, значение больше или равно 0");
            }
        }
    }
    public float collectAllFloat(){
        while(true){
            try {
                return Float.parseFloat(collectValue());
            }catch(NullValueException ex){
                System.out.println("Значение этого поля не может быть пустым");
            }catch(IllegalArgumentException ex){
                System.out.println("Введите тип float, значение больше или равно 0");
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
        public long getIdFromTokens(String[] tokens){
        long id = 0;
        ConsoleManager consoleManager = AllManagers.createAllManagers().getConsoleManager();
        try{
            id = Long.parseLong(consoleManager.getTokens()[1]);
        }catch(NumberFormatException ex){
            System.out.println("ID должно быть long");
        }catch (IndexOutOfBoundsException r){
            System.out.println("Напишите хотя бы id");
        }
        return id;
    }
}
