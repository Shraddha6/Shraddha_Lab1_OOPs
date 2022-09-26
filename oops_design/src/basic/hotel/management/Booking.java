package basic.hotel.management;

import java.time.DateTimeException;
import java.util.Date;

public class Booking {
    private String bookingId;
    private boolean isConfirmed;
    private String bookingDuration;
    private Room roomDetails;
    private Date checkinDateAndTime;
    private Date checkoutDateAndTime;
    private double BookingCost;

    public Booking(String bookingId, boolean isConfirmed, String bookingDuration, Room roomDetails,
                   Date checkinDateAndTime, Date checkoutDateAndTime, double bookingCost) {
        this.bookingId = bookingId;
        this.isConfirmed = isConfirmed;
        this.bookingDuration = bookingDuration;
        this.roomDetails = roomDetails;
        this.checkinDateAndTime = checkinDateAndTime;
        this.checkoutDateAndTime = checkoutDateAndTime;
        BookingCost = bookingCost;
    }

    public String getBookingId() {
        return bookingId;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public String getBookingDuration() {
        return bookingDuration;
    }

    public Room getRoomDetails() {
        return roomDetails;
    }

    public Date getCheckinDateAndTime() {
        return checkinDateAndTime;
    }

    public double getBookingCost() {
        return BookingCost;
    }

    public Date getCheckoutDateAndTime() {
        return checkoutDateAndTime;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", isConfirmed=" + isConfirmed +
                ", bookingDuration='" + bookingDuration + '\'' +
                ", roomDetails=" + roomDetails +
                ", checkinDateAndTime=" + checkinDateAndTime +
                ", checkoutDateAndTime=" + checkoutDateAndTime +
                ", BookingCost=" + BookingCost +
                '}';
    }
}
