public class Menu {
    public void printOptions(){
        System.out.println("=== === === === === === === === === === === === === === === === ===");
        System.out.println("      [help]      ===      [exit]     ===      [look]");
        System.out.println("=== === === === === === === === === === === === === === === === ===");
    }

    public void help(){
        //System.out.println("I will not help you ò.ó");
        //System.out.println("JK");
        System.out.println("To move around in the house, you can either go north, east, west or south");
        System.out.println("To move in one of these four directions type [go 'direction'], ['direction'] or ['n', 'e', 'w' or 's']");
        System.out.println("\nIf you have forgotten how the room that you are in looks type [l] or [look]");
        System.out.println("You have to find a way out quickly, so better hurry up!");
    }
}