<<<<<<< HEAD
=======

>>>>>>> 276196415cd5ac7b25a370ab24f1ae6c439c73ce
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
<<<<<<< HEAD
=======

>>>>>>> 276196415cd5ac7b25a370ab24f1ae6c439c73ce
