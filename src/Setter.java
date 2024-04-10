import models.*;

public class Setter {
    public Ticket set(String[] arrOfContents) {
        Ticket ticket = new Ticket();
        Venue venue = new Venue();
        for (String el : arrOfContents) {
            if (ticket.getName() == null && venue.getName() == null && !el.equals(el.toUpperCase())) {
                ticket.setName(el);
            }
            else if (ticket.getName() != null && venue.getName() == null && !el.equals(el.toUpperCase())) {
                venue.setName(el);
            }
            else if (ticket.getCoordinates() == null && el.contains(";")) {
                String[] tempCoordArray = el.split(";");
                ticket.setCoordinates(new Coordinates(Double.parseDouble(tempCoordArray[0]), Float.parseFloat(tempCoordArray[1])));
            }
            else if (ticket.getPrice() == null && el.matches("[0-9]+")) {
                ticket.setPrice(Float.parseFloat(el));
            }
            else if (venue.getCapacity() == null && el.matches("[0-9]+")) {
                venue.setCapacity(Integer.parseInt(el));
            }
            else if (ticket.getType() == null && el.equals(el.toUpperCase())) {
                ticket.setType(TicketType.valueOf(el));
            }
            else if (venue.getType() == null && el.equals(el.toUpperCase())) {
                venue.setType(VenueType.valueOf(el));
            }
        }
        venue.setId(420L);
        ticket.setCreationDate();
        ticket.setId(69L);
        ticket.setVenue(venue);
        return ticket;
    }
}
