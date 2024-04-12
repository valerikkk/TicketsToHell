import managers.AllManagers;
import managers.CollectionManager;
import models.*;

<<<<<<< HEAD
import java.util.Arrays;

public class Setter {
    public void set(String[] arrOfContents) {
        CollectionManager coll = AllManagers.createAllManagers().getCollectionManager();
        for (String cont:arrOfContents) {
            String[] tempArr = cont.split(",");
            Ticket ticket = new Ticket();
            Venue venue = new Venue();
            for (String el : tempArr) {
                if (ticket.getName() == null && venue.getName() == null && !el.equals(el.toUpperCase())) {
                    ticket.setName(el);
                } else if (ticket.getName() != null && venue.getName() == null && !el.equals(el.toUpperCase())) {
                    venue.setName(el);

                } else if (ticket.getCoordinates() == null && el.contains(";")) {
                    String[] tempCoordArray = el.split(";");
                    Coordinates coordinates = new Coordinates(Double.parseDouble(tempCoordArray[0]), Float.parseFloat(tempCoordArray[1]));
                    ticket.setCoordinates(coordinates);

                } else if (ticket.getPrice() == 0.0 && el.matches("[0-9]+")) {
                    ticket.setPrice(Float.parseFloat(el));

                } else if (venue.getCapacity() == null && ticket.getPrice() != 0.0 && el.matches("[0-9]+")) {
                    venue.setCapacity(Integer.parseInt(el));

                } else if (ticket.getType() == null && el.equals(el.toUpperCase())) {
                    ticket.setType(TicketType.valueOf(el));

                } else if (venue.getType() == null && el.equals(el.toUpperCase()) && !el.matches("[0-9]+")) {
                    venue.setType(VenueType.valueOf(el));
                }
=======
import java.time.LocalDateTime;

public class Setter {
    public void set(String[] arrOfContents) {
        TicketData ticketData = new TicketData();
        Venue venue = new Venue();
        for (String el : arrOfContents) {
            if (ticketData.getName() == null && venue.getName() == null && !el.equals(el.toUpperCase())) {
                ticketData.setName(el);

            }
            else if (ticketData.getName() != null && venue.getName() == null && !el.equals(el.toUpperCase())) {
                venue.setName(el);

            }
            else if (ticketData.getCoordinates() == null && el.contains(";")) {
                String[] tempCoordArray = el.split(";");
                ticketData.setCoordinates(new Coordinates(Double.parseDouble(tempCoordArray[0]), Float.parseFloat(tempCoordArray[1])));

            }
            else if (ticketData.getPrice() == 0.0 && el.matches("[0-9]+")) {
                ticketData.setPrice(Float.parseFloat(el));

            }
            else if (venue.getCapacity() == null && ticketData.getPrice()!=0.0 && el.matches("[0-9]+")) {
                venue.setCapacity(Integer.parseInt(el));

            }
            else if (ticketData.getType() == null && el.equals(el.toUpperCase())) {
                ticketData.setType(TicketType.valueOf(el));

            }
            else if (venue.getType() == null && el.equals(el.toUpperCase()) && !el.matches("[0-9]+")) {
                venue.setType(VenueType.valueOf(el));

>>>>>>> 276196415cd5ac7b25a370ab24f1ae6c439c73ce
            }
            venue.setId(Math.abs((long) venue.hashCode()));
            ticket.setCreationDate();
            ticket.setVenue(venue);
            coll.addTicket(ticket);
        }
<<<<<<< HEAD
=======
        venue.setId(Math.abs((long)venue.hashCode()));
        ticketData.setCreationDate();
        ticketData.setVenue(venue);
        CollectionManager coll = AllManagers.createAllManagers().getCollectionManager();
        coll.addTicket(ticketData);
>>>>>>> 276196415cd5ac7b25a370ab24f1ae6c439c73ce
    }
}
