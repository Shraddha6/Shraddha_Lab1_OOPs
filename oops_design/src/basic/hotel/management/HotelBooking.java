package basic.hotel.management;

import java.text.SimpleDateFormat;
import java.util.*;

public class HotelBooking {

    static Set<Room> createRooms() {
        Set<Room> availableRooms = new HashSet<>();
        Room singleRoomWithACFloor1 = new Room("101", "first");
        singleRoomWithACFloor1.setRoomType(HotelConstant.RoomType.SINGLE);
        singleRoomWithACFloor1.setRoomStatus("Available");
        singleRoomWithACFloor1.setAirConditioner(true);
        singleRoomWithACFloor1.setTv(true);
        singleRoomWithACFloor1.setwIFI(true);

        Room singleRoomWithACFloor2 = new Room("201", "second");
        singleRoomWithACFloor2.setRoomType(HotelConstant.RoomType.SINGLE);
        singleRoomWithACFloor2.setRoomStatus("Available");
        singleRoomWithACFloor2.setAirConditioner(true);
        singleRoomWithACFloor2.setTv(true);
        singleRoomWithACFloor2.setwIFI(true);

        Room singleRoomWithoutACFloor2 = new Room("202", "second");
        singleRoomWithoutACFloor2.setRoomType(HotelConstant.RoomType.SINGLE);
        singleRoomWithoutACFloor2.setRoomStatus("Available");
        singleRoomWithoutACFloor2.setAirConditioner(false);
        singleRoomWithoutACFloor2.setTv(true);
        singleRoomWithoutACFloor2.setwIFI(true);

        Room doubleRoomWithACFloor1 = new Room("102", "second");
        doubleRoomWithACFloor1.setRoomType(HotelConstant.RoomType.DOUBLE);
        doubleRoomWithACFloor1.setRoomStatus("Available");
        doubleRoomWithACFloor1.setAirConditioner(true);
        doubleRoomWithACFloor1.setTv(true);
        doubleRoomWithACFloor1.setwIFI(true);

        availableRooms.add(singleRoomWithACFloor1);
        availableRooms.add(singleRoomWithACFloor2);
        availableRooms.add(singleRoomWithoutACFloor2);
        availableRooms.add(doubleRoomWithACFloor1);

        return availableRooms;

    }

    public static void main(String[] args) {

        Address address = new Address("Nariman Point", 300900, "Mumbai", "MH", "IN");
        Set<Room> roooms = createRooms();
        Hotel hotel =new Hotel("Noor",address,roooms,null);
        Scanner in = new Scanner(System.in);
        char ch = 'Y';
        do {
            System.out.println("Welcome To Noor Hotel");

            System.out.println("type of room : Single or Double or Triple");
            String roomType = in.next();

            System.out.println("Do you want AC room : type Yes or No ");
            String ifAC = in.next();

            System.out.println("which floor: first or second");
            String floor = in.next();

            BookingRequest bookingRequest = new BookingRequest();
            bookingRequest.setAc(ifAC.equalsIgnoreCase("yes"));
            bookingRequest.setFloorNumber(floor);
            bookingRequest.setRoomType(roomType);
            Booking bookedRoom = BookingUtils.bookRoom(bookingRequest,hotel);
            if (null != bookedRoom) {
                System.out.println("Room number: " + bookedRoom.getRoomDetails().getRoomNumber() + ", "
                        + bookedRoom.getRoomDetails().getFloor() + ", "
                        + (bookedRoom.getRoomDetails().isAirConditioner() ? " air conditioned " : "no airconditioned") + ", "
                        + (bookedRoom.getRoomDetails().getRoomType() + " occupancy ") + ", "
                        + ("estimated: Rs. " + bookedRoom.getBookingCost() + "/ day "));

            }else{
                System.out.println(roomType +"Occupancy "+ ((ifAC.equalsIgnoreCase("yes"))
                        ? "AC" :"Non-AC") +" room"+" Not avaialble");
            }
            System.out.println("Do you want to book more rooms : press Y or N ");
            String c =  in.next();
             ch = c.charAt(0);
        }
          while(ch == 'Y' || ch == 'y');
        }
    }
