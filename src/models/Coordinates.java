<<<<<<< HEAD
package models;

public class Coordinates {
    private Double x;
    private Float y;

    public Coordinates(Double x, Float y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public String fileToString() {
        return x +  ";" + y;
    }

    public void setX(Double x) {
        if (x == null){
            throw new RuntimeException();
        }
        else {
            this.x = x;
        }
    }

    public void setY(Float y) {
        if (y == null) {
            throw new RuntimeException();
        } else {
            this.y = y;
        }
    }
}
=======
package models;

import java.util.Objects;

public class Coordinates {
    private Double x; //Поле не может быть null
    private Float y; //Поле не может быть null

    public Coordinates(Double x, Float y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Float getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Coordinates that = (Coordinates) object;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
>>>>>>> a597dc2c10769a82d9e50ade21d408d527f96dac
