package managers;

import models.*;
import java.time.ZonedDateTime;
public class CSVManager  {
    public CSVManager(){}
//    @Override
//    public Vector<TicketsDatabase> read(String filename) {
//        TicketsDatabase tickets;
//        File file = new File(filename);
//        try{
//            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filename), StandardCharsets.UTF_8);
//            byte[] bytes = new byte[1024];
//            System.out.println("Содержимое файла: " + new String(bytes) );
//        }catch(FileNotFoundException es){
//            System.out.println("ecex");
//        }
//    }

    public Ticket ticketParse(String[] data){
        Long id = Long.parseLong(data[0]); //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
        String name = data[1]; //Поле не может быть null, Строка не может быть пустой
        Coordinates coordinates = new Coordinates(Double.parseDouble(data[2]), Float.parseFloat(data[3])); //Поле не может быть null
        java.time.ZonedDateTime creationDate = ZonedDateTime.parse(data[4]); //Поле не может быть null, Значение этого поля должно генерироваться автоматически
        float price = Float.parseFloat(data[5]); //Значение поля должно быть больше 0
        TicketType type = TicketType.valueOf(data[6]); //Поле не может быть null
        Venue venue = new Venue(Long.parseLong(data[7]), data[8], Integer.parseInt(data[9]), VenueType.valueOf(data[10])); //Поле не может быть null\
        TicketData ticketData = new TicketData();
        ticketData.setName(name);
        ticketData.setCoordinates(coordinates);
        ticketData.setPrice(price);
        ticketData.setType(type);
        ticketData.setCreationDate(creationDate);
        ticketData.setVenue(venue);
        return new Ticket(id, ticketData);
    }


//    @Override
//    public void write() {
//    }
}
