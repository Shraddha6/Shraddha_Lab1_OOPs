package basic.hotel.management;

import java.util.List;
import java.util.Set;

public class Hotel {
    private String name;
    private Address address;
    private Set<Room> rooms;
    private Booking booking;

    public Hotel( String name, Address address, Set<Room> rooms, Booking booking) {
        this.name = name;
        this.address = address;
        this.rooms = rooms;
        this.booking = booking;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public Booking getBooking() {
        return booking;
    }
}
