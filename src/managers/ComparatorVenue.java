package managers;

import models.Ticket;
import java.util.Comparator;

public class ComparatorVenue implements Comparator<Ticket> {
    public ComparatorVenue() {
    }
    @Override
    public int compare(Ticket t1, Ticket t2) {
        return t2.getVenue().getCapacity()-t1.getVenue().getCapacity();
    }
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
