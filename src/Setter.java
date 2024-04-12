import managers.AllManagers;
import managers.CollectionManager;
import models.*;

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
            }
            venue.setId(Math.abs((long) venue.hashCode()));
            ticket.setCreationDate();
            ticket.setVenue(venue);
            coll.addTicketTwo(ticket);
        }
    }
}