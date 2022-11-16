import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Room roomOne = new Room("Entrance Hall", "Dino-dino-land");
        Room roomTwo = new Room("Bathroom", "Hey t-rex");
        Room roomThree = new Room("Children's Bedroom", "Hey you");
        Room roomFour = new Room("Hallway", "Hey mommy");
        Room roomFive = new Room("Basement", "Hey dude");
        Room roomSix = new Room("Master Bedroom", "Hey daddy");
        Room roomSeven = new Room("Library", "Laura + Causley");
        Room roomEight = new Room("Dining Hall", "Aileena + Richardley");
        Room roomNine = new Room ("Kitchen", "Freja + Carlsley = 4 eva");

        roomOne.setRooms(null, roomTwo, null, roomFour);
        roomTwo.setRooms(null, roomThree, roomOne, null);
        roomThree.setRooms(null, null, roomTwo, roomSix);
        roomFour.setRooms(roomOne, null, null, roomSeven);
        roomFive.setRooms(null, null, null, roomEight);
        roomSix.setRooms(roomThree, null, null, roomNine);
        roomSeven.setRooms(roomFour, roomEight, null, null);
        roomEight.setRooms(roomFive, roomNine, roomSeven, null);
        roomNine.setRooms(roomSix, roomEight, null, null);

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your player name");
        Player player = new Player(scan.nextLine());
        player.setPosition(roomOne);
        String intro = "After nine hours of traveling you " +
                "and your friends have finally arrived in" +
                " Romania’s wildest forest, Hoia Baciu.\nThe journey has" +
                " been longer than expected, which means the sun is just" +
                " about to set behind the many trees.\nYou have come to " +
                "Transylvania in order to get away from all the stress in " +
                "your everyday-lives as software-developers.\n" +
                "It is time to enjoy nature in its rawest form. Jesus and Josephine " +
                "grab their backpacks from the trunk of the car.\nReady to start your" +
                " adventure, you face the forest and start walking down the path, " +
                "which hopefully leads to a place,\nwhere you can put up your tents." +
                "As you’re walking deeper in the woods, the sun is almost set and " +
                "darkness is rising.\nJosephine says: “Let’s put up our tents here. " +
                "I’ll find some wood to make a fire,\nJesus - You should try to find" +
                " some water and you, " + player.getName() + ", stay here, and put up the tents.\n" +
                "We’ll be back in ten minutes, tops.\nYou nod and start unpacking the" +
                " tents. It has almost been one hour since Jesus and Josephine left. " +
                "\nMeanwhile the entire forest is covered in darkness and your flashlight begins to crackle. " +
                "The batteries must be running low.\nYou decide to look for your friends. " +
                "Maybe they have lost their way.\nStep by step, you’re moving deeper into" +
                " the woods, yelling their names, hoping to receive an answer.\n" +
                "But: nothing. The forest is quiet. No birds are chirping. No wind is blowing. " +
                "No animals are walking through the leaves.\nIt is really quiet. Maybe too quiet. " +
                "\nThe silence makes you feels uneasy - so you start walking faster as the sky" +
                " lights up in a sudden show of lightning and thunder.\nRain starts pouring down. " +
                "And you try to find coverage. You’re completely drenched and freezing while running" +
                " further and further, hoping to find your friends.\nEvery tree looks the same. " +
                "In between two trees, you spot a light - That must be them!\nFilled with hope, " +
                "you run towards the light. But as you come closer, the light fades away and all " +
                "you can see, is a manor that looks abandoned.\nBut the front door seems to stand open. " +
                "Surely it would provide protection from the cold and rain.\nDo you want to go inside? [y/n]";


        System.out.println(intro);

        String play = scan.nextLine();
        switch(play){
            case "n": case "no":
                System.out.println("You are run down by a wolf and die - should have gone in. You stupid");
                break;
            case "y": case "yes":
                System.out.print("You entered the house - Oh no! BAM! The door slammed behind you.\nYou try to open it, without any luck. Let's find another way out. Good luck.\n");
                menu.printOptions();
                String move = " ";
                while(!move.equals("exit")) {
                    //move = scan.nextLine();
                    switch (move) {

                        case "go north":
                        case "n":
                        case "north":
                            player.goNorth();
                            break;
                        case "go east":
                        case "e":
                        case "east":
                            player.goEast();
                            break;
                        case "go west":
                        case "w":
                        case "west":
                            player.goWest();
                            break;
                        case "go south":
                        case "s":
                        case "south":
                            player.goSouth();
                            break;
                        case "look":
                        case "l":
                            System.out.println(player.getPosition().getDescription());
                            break;
                        case "help":
                            menu.help();
                        case " ":
                            break;
                        default:
                            System.out.println("Input not valid - try again");
                            break;

                    }
                    move = scan.nextLine();

            }
        }




    }
}