import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Vampires extends Choosen {
    public static void vampireKullanici() {
        int gece = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Vampir Listesi : " + copylist.getFirst() + "\t" + copylist.get(1));
        System.out.println("Yaşayanlar : ");
        System.out.println(playernames);
        while (playernames.size() >= 3) {
            System.out.println("Yaşayanlar : ");
            System.out.println(playernames);
            Players.delay(2000);

            System.out.println("Öldürmek istediğin kişinin indexini gir : ");
                int kill = scan.nextInt();
                if (kill < 0 || kill > playernames.size() - 1 ||
                        playernames.get(kill).equals(copylist.getFirst()) || playernames.get(kill).equals(copylist.get(1))) {
                    System.out.println("Olmadı tekrar giriniz : ");
                } else {
                    Doctor doctor = new Doctor();
                    int korunanIndex = doctor.doctorRandom();
                    if (korunanIndex == kill) {
                        System.out.println("Seçilen kişi doktor tarafından korundu. Kimse ölmedi");
                        gece += 1;
                        System.out.println("Gece : " + gece);
                        Oylama.oylamaKullaniciAlive(playernames.size(),playernames);
                    } else {
                        System.out.println(playernames.get(kill) + " öldürüldü.");
                        playernames.remove(kill);
                        gece += 1;
                        System.out.println("Gece : " + gece);
                        Oylama.oylamaKullaniciAlive(playernames.size(),playernames);
                    }
            }
        }
        if (playernames.size()<3) {
            System.out.println("Oyun bitti vampirler kazandı");
        }
    }

    public static void vampireRandomAndKullaniciDoctor () {
        int gece = 0;
        while (playernames.size() >= 3) {
            Random rand = new Random();
            int killThisIndex = rand.nextInt(0, playernames.size() - 1);
            Scanner scan = new Scanner(System.in);
            Players.delay(2000);

            System.out.println("Doktor sizsiniz. Korumak istediğiniz kişinin indexini giriniz : ");
            int korunanIndexkullanici = scan.nextInt();

            if (korunanIndexkullanici == killThisIndex) {
                System.out.println("Kişi öldürülemedi. Doktor tarafından korundu.");
                gece += 1;
                System.out.println("Gece : " + gece);
            } else {
                gece += 1;
                System.out.println("Gece : " + gece);
                System.out.println(playernames.get(killThisIndex) + " öldürüldü. Yaşayanlar listesi : ");

                if (playernames.get(killThisIndex).equals(playernames.getFirst())) {
                    playernames.remove(killThisIndex);
                    System.out.println(playernames);
                    Oylama.oylamaKullaniciDead(playernames.size()-1);
                }else{
                    playernames.remove(killThisIndex);
                    System.out.println(playernames);
                    Oylama.oylamaKullaniciAlive(playernames.size()-2 , playernames);
                }

            }
        }
        if (playernames.size()<3) {
            System.out.println("Oyun bitti vampirler kazandı");
        }
    }
    public static void everythingRandom (){
        Players.delay(2000);

        System.out.println("Köylüsünüz");

    }
}