<<<<<<< HEAD
package models;

public class Venue {
    private Long id;
    private String name;
    private Integer capacity;
    private VenueType type;

    public Venue() {
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public VenueType getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new RuntimeException();
        }
        else {
            this.name = name;
        }
    }

    public void setCapacity(Integer capacity) {
        if (capacity == null || capacity == 0){
            throw new RuntimeException();
        }
        else {
            this.capacity = capacity;
        }
    }

    public void setType(VenueType type) {
        if (type == null){
            throw new RuntimeException();
        }
        else {
            this.type = type;
        }
    }

    @Override
    public String toString() {
        return "Venue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type=" + type +
                '}';
    }
    public String fileToString(){
        return name + "," + capacity + "," + type;
    }
}
=======
package models;

import java.util.Objects;

public class Venue {
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Integer capacity; //Поле может быть null, Значение поля должно быть больше 0
    private VenueType type; //Поле не может быть null

    public Venue(String name, Integer capacity, VenueType type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
        this.id = Math.abs(this.hashCode());
    }
    public Venue(long id, String name, Integer capacity, VenueType type) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public VenueType getType() {
        return type;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Venue venue = (Venue) object;
        return id == venue.id && Objects.equals(name, venue.name) && Objects.equals(capacity, venue.capacity) && type == venue.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity, type);
    }
}
>>>>>>> a597dc2c10769a82d9e50ade21d408d527f96dac
