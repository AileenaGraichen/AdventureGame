public class Player {
    private String name;
    private boolean status = true;
    private Room position;
    private int health = 100;

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void updateStatus(){
        if(health <= 0){
            status = false;
        }
    }

    /*public void updateHealth(Item item){
        health = health + item.getBuff();
    }*/

    public int getHealth(){
        return health;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public Room getPosition(){
        return position;
    }
    public void setPosition(Room position){
        this.position = position;
    }

    public void goNorth(){
        if(position.getRoomNorth() != null){
            position = position.getRoomNorth();
            System.out.println(position.getDescription());
        } else {
            System.out.println("You hear something scream behind that wall. Better go another way. Hurry.");}
    }

    public void goEast() {
        if (position.getRoomEast() != null) {
            position = position.getRoomEast();
            System.out.println(position.getDescription());
        } else {
            System.out.println("It seems, this way, there's no way out. Try another one. - Good luck. You'll need it.");
        }
    }
        public void goWest(){
            if (position.getRoomWest() != null) {
                position = position.getRoomWest();
                System.out.println(position.getDescription());
            } else {
                System.out.println("The door is locked, try another way.");
            }
        }
        public void goSouth() {
            if (position.getRoomSouth() != null) {
                position = position.getRoomSouth();
                System.out.println(position.getDescription());
            } else {
                System.out.println("You cannot go that way, hurry up if you want a chance at surviving");
            }
        }
    }