package managers;

import models.*;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class CSVManager {
    public CSVManager() {
    }
    CollectionManager collectionManager = AllManagers.managers.getCollectionManager();
    public void ticketParse(String[] data) {
        for (String cont : data) {
            String[] tempArr = cont.split(",");
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd/MM/yyyy - HH:mm:ss" );
            String name = tempArr[0]; //Поле не может быть null, Строка не может быть пустой
            Coordinates coordinates = new Coordinates(Double.parseDouble(tempArr[1]), Float.parseFloat(tempArr[2])); //Поле не может быть null
            LocalDateTime creationDate = LocalDateTime.parse(tempArr[3], dateTimeFormatter); //Поле не может быть null, Значение этого поля должно генерироваться автоматически
            float price = Float.parseFloat(tempArr[4]); //Значение поля должно быть больше 0
            TicketType type = TicketType.valueOf(tempArr[5]); //Поле не может быть null
            Venue venue = new Venue(); //Поле не может быть null\
            venue.setName(tempArr[6]);
            venue.setCapacity(Integer.parseInt(tempArr[7]));
            venue.setType(VenueType.valueOf(tempArr[8]));
            venue.setId(Math.abs((long) venue.hashCode()));
            TicketData ticketData = new TicketData();
            ticketData.setName(name);
            ticketData.setCoordinates(coordinates);
            ticketData.setPrice(price);
            ticketData.setType(type);
            ticketData.setCreationDate(creationDate);
            ticketData.setVenue(venue);
            collectionManager.addTicket(ticketData);
        }
    }
}
