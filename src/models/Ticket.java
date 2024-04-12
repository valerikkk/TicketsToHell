
package models;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Ticket {
    private long id;
    private String name;
    private Coordinates coordinates;
    private java.time.LocalDateTime creationDate;
    private float price;
    private TicketType type;
    private Venue venue;

    public Ticket() {
    }
    public Ticket(long id, String name, Coordinates coordinates, LocalDateTime creationDate, float price, TicketType type, Venue venue) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.price = price;
        this.type = type;
        this.venue = venue;
    }

    public Ticket(long id, TicketData ticketData) {
        this.id = id;
        this.name = ticketData.getName();
        this.coordinates = ticketData.getCoordinates();
        this.creationDate = ticketData.getCreationDate();
        this.price = ticketData.getPrice();
        this.type = ticketData.getType();
        this.venue = ticketData.getVenue();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public float getPrice() {
        return price;
    }

    public TicketType getType() {
        return type;
    }



    public Venue getVenue() {
        return venue;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new RuntimeException();
        }
        else {
            this.name = name;
        }
    }

    public void setCoordinates(Coordinates coordinates) {
        if (coordinates == null){
            throw new RuntimeException();
        }
        else{
            this.coordinates = coordinates;
        }
    }

    public void setCreationDate() {
        this.creationDate = LocalDateTime.now();
    }

    public void setPrice(Float price) {
        if (price == null || price == 0){
            throw new RuntimeException();
        }
        else {
            this.price = price;
        }
    }

    public void setType(TicketType type) {
        if (type == null){
            throw new RuntimeException();
        }
        else {
            this.type = type;
        }
    }

    public void setVenue(Venue venue) {
        if (venue == null){
            throw new RuntimeException();
        }
        else {
            this.venue = venue;
        }
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates.toString() +
                ", creationDate=" + creationDate +
                ", price=" + price +
                ", type=" + type +
                ", venue=" + venue.toString() +
                '}';
    }
    public String fileToString(){
       return name + "," + coordinates.fileToString() + "," + creationDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss")) + "," + price + "," + type + "," + venue.fileToString();
    }
}