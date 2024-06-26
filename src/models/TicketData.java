package models;

import java.time.LocalDateTime;

import java.util.Objects;

public class TicketData {
    private String name;
    private Coordinates coordinates;
    private java.time.LocalDateTime creationDate;
    private float price;
    private TicketType type;
    private Venue venue;

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public LocalDateTime getCreationDate() {
        return LocalDateTime.now();
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

    public String getName() {
        return name;
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

    public void setPrice(float price) {
        if (price <= 0.0){
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
    public int hashCode() {
        return Objects.hash(name, coordinates, creationDate, price, type);
    }
}
