package models;

import java.time.LocalDateTime;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCreationDate() {
        this.creationDate = LocalDateTime.now();
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }
}
