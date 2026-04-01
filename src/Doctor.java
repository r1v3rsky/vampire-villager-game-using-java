import java.util.Random;
import java.util.Scanner;

public class Doctor extends Choosen{

//    public static void doctorKullanici () {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Doktor sizsiniz. Korumak istediğiniz kişinin indexini giriniz : ");
//        int korunanIndexkullanici = scan.nextInt();
//    }

    public int doctorRandom () {

        Random rand = new Random();
        int korunanIndex = rand.nextInt(0, playernames.size()-1);
        System.out.println("Doktor : ben ' " + playernames.get(korunanIndex) + " ' kişisini korudum.");

        return korunanIndex;


    }
}
