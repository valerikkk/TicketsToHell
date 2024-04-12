
package models;

<<<<<<< HEAD
public class Venue {
=======
import java.util.Objects;

public class Venue implements Comparable<Venue>{
>>>>>>> 276196415cd5ac7b25a370ab24f1ae6c439c73ce
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
<<<<<<< HEAD
=======
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, capacity, type);
>>>>>>> 276196415cd5ac7b25a370ab24f1ae6c439c73ce
    }
    @Override
    public int compareTo(Venue v) {
            return this.capacity.compareTo(v.getCapacity());
    }
}
<<<<<<< HEAD
=======

>>>>>>> 276196415cd5ac7b25a370ab24f1ae6c439c73ce
