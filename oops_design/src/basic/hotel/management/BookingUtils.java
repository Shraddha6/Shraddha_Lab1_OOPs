package basic.hotel.management;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

public class BookingUtils {
    public static Booking bookRoom(BookingRequest bookingRequest, Hotel hotel) {
        UUID bookingId = UUID.randomUUID();
        Date date = new Date();
        Booking booking = null;
        Set<Room> rooms = hotel.getRooms();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (Room room : rooms) {
            if(room.getRoomStatus() != "Available"){
                return null;
            }
            else {
                if ((bookingRequest.isAc() == room.isAirConditioner()) &&
                        bookingRequest.getFloorNumber().equalsIgnoreCase(room.getFloor()) &&
                        room.getRoomType().equals(HotelConstant.RoomType.valueOf(bookingRequest.getRoomType().toUpperCase()))) {
                    booking = new Booking(bookingId.toString(), true, "3 days",
                            room, date, date);
                    room.setRoomStatus("FULL");
                    break;
                }
            }
        }
        hotel.setBooking(booking);
        System.out.println("Rom has been booked " + booking);
        return booking;
    }

    public static double getEstimatedCostPerDay(Room room){
        if(room.getRoomType().equals(HotelConstant.RoomType.SINGLE))
            return 2000+(room.isAirConditioner()?1000:0);
        if(room.getRoomType().equals(HotelConstant.RoomType.DOUBLE))
            return 3000+(room.isAirConditioner()?1000:0);
        if(room.getRoomType().equals(HotelConstant.RoomType.TRIPLE))
            return 4000+(room.isAirConditioner()?1000:0);
        return 0;
    }
}
