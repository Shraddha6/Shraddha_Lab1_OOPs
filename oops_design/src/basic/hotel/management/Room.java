package basic.hotel.management;

import java.util.List;

public class Room {
    private String roomNumber;
    private String floor;
    private HotelConstant.RoomType roomType;
    private String roomStatus;
    private boolean airConditioner;
    private boolean wIFI;
    private boolean tv;

    public Room(String roomNumber, String floor) {
        this.roomNumber = roomNumber;
        this.floor = floor;
    }

    public HotelConstant.RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(HotelConstant.RoomType roomType) {
        this.roomType = roomType;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    public boolean iswIFI() {
        return wIFI;
    }

    public void setwIFI(boolean wIFI) {
        this.wIFI = wIFI;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", floor='" + floor + '\'' +
                ", roomType=" + roomType +
                ", roomStatus='" + roomStatus + '\'' +
                ", airConditioner=" + airConditioner +
                ", wIFI=" + wIFI +
                ", tv=" + tv +
                '}';
    }
}
