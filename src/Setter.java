import managers.AllManagers;
import managers.CollectionManager;
import models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Setter {
    public static boolean isValidDate(String inDate) {
        char ch = '/';
        int cnt = 0;

        for (int i = 0; i < inDate.length(); i++) {
            if (inDate.charAt(i) == ch)
                cnt++;
        }
        return cnt <= 1;
    }

    public void set(String[] arrOfContents) {
        CollectionManager coll = AllManagers.createAllManagers().getCollectionManager();
        for (String cont:arrOfContents) {
            String[] tempArr = cont.split(",");
            Ticket ticket = new Ticket();
            Venue venue = new Venue();
            for (String el : tempArr) {
                if (isValidDate(el)){
                    tempArr = ArrayUtils.removeElement(array, element)
                    if (ticket.getName() == null && venue.getName() == null && !el.equals(el.toUpperCase())) {
                    ticket.setName(el);
                    }
                    else if (ticket.getName() != null && venue.getName() == null && !el.equals(el.toUpperCase())) {
                        venue.setName(el);

                    } else if (ticket.getCoordinates() == null && el.contains(";")) {
                        String[] tempCoordArray = el.split(";");
                        Coordinates coordinates = new Coordinates(Double.parseDouble(tempCoordArray[0]), Float.parseFloat(tempCoordArray[1]));
                        ticket.setCoordinates(coordinates);

                    } else if (el.matches("[0.0-9.0]+")) {
                            ticket.setPrice(Float.parseFloat(el));

                    } else if (venue.getCapacity() == null && ticket.getPrice() != 0.0 && el.matches("[0-9]+")) {
                        venue.setCapacity(Integer.parseInt(el));

                    } else if (ticket.getType() == null && el.equals(el.toUpperCase()) && !el.contains("/")) {
                        ticket.setType(TicketType.valueOf(el));

                    } else if (venue.getType() == null && el.equals(el.toUpperCase()) && !el.matches("[0.0-9.0]+")) {
                        venue.setType(VenueType.valueOf(el));
                    }
                    venue.setId(Math.abs((long) venue.hashCode()));
                    ticket.setCreationDate();
                    ticket.setVenue(venue);
                    coll.addTicketTwo(ticket);
                }
            }
            venue.setId(Math.abs((long) venue.hashCode()));
            ticket.setCreationDate();
            ticket.setVenue(venue);
            coll.addTicketTwo(ticket);
        }

    }
}