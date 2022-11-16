public class Room {
    private String name;
    private String description;
    private Room roomNorth;
    private Room roomEast;
    private Room roomWest;
    private Room roomSouth;

    public Room(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public Room getRoomNorth(){
        return roomNorth;
    }

    public Room getRoomEast(){
        return roomEast;
    }

    public Room getRoomWest(){
        return roomWest;
    }

    public Room getRoomSouth(){
        return roomSouth;
    }

    /*public void setRoomNorth(Room roomNorth){
        this.roomNorth = roomNorth;
    }

    public void setRoomEast(Room roomEast){
        this.roomEast = roomEast;
    }

    public void setRoomWest(Room roomWest){
        this.roomWest = roomWest;
    }

    public void setRoomSouth(Room roomSouth){
        this.roomSouth = roomSouth;
    }*/

    public void setRooms(Room roomNorth, Room roomEast, Room roomWest, Room roomSouth){
        this.roomNorth = roomNorth;
        this.roomEast = roomEast;
        this.roomWest = roomWest;
        this.roomSouth = roomSouth;
    }

}

