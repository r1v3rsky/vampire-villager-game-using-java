import java.util.ArrayList;
import java.util.Scanner;


public class Players {
    int gece = 0;

    static String player1= "Ali1";
    static String player2= "Ali2";
    static String player3= "Ali3";
    static String player4= "Ali4";
    static String player5= "Ali5";
    static String player6= "Ali6";
    static String player7= "Ali7";
    static ArrayList<String> playernames = new ArrayList<>();
    public static void players(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz : ");
        String ad = scan.nextLine();
        playernames.add(0,ad);
        playernames.add(player1);
        playernames.add(player2);
        playernames.add(player3);
        playernames.add(player4);
        playernames.add(player5);
        playernames.add(player6);
        playernames.add(player7);
        System.out.println(playernames);
    }

    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
