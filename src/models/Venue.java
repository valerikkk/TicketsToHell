
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
