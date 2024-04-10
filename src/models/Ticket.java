<<<<<<< HEAD
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
    private Float price;
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

    public Float getPrice() {
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
=======
package models;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Ticket implements Comparable<Ticket>{
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private float price; //Значение поля должно быть больше 0
    private TicketType type; //Поле не может быть null
    private Venue venue; //Поле не может быть null

    public Ticket(Long id, TicketData ticketData){
        this.id = id;
        this.name = ticketData.getName();
        this.coordinates = ticketData.getCoordinates();
        this.creationDate = ticketData.getCreationDate();
        this.price = ticketData.getPrice();
        this.type = ticketData.getType();
        this.venue = ticketData.getVenue();
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public TicketType getType() {
        return type;
    }

    public Venue getVenue() {
        return venue;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", price=" + price +
                ", type=" + type +
                ", venue=" + venue +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Ticket ticket = (Ticket) object;
        return Float.compare(price, ticket.price) == 0 && Objects.equals(id, ticket.id) && Objects.equals(name, ticket.name) && Objects.equals(coordinates, ticket.coordinates) && Objects.equals(creationDate, ticket.creationDate) && type == ticket.type && Objects.equals(venue, ticket.venue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, coordinates, creationDate, price, type, venue);
    }
    @Override
    public int compareTo(Ticket tick) {
        int compareByName = this.name.compareTo(tick.getName());
        if (compareByName != 0) {
            return compareByName;
        }
        int compareById = this.id.compareTo(tick.getId());
        if (compareById != 0) {
            return compareById;
        }
        return this.type.compareTo(tick.getType());
    }
}
>>>>>>> a597dc2c10769a82d9e50ade21d408d527f96dac
