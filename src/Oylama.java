import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Oylama extends Choosen {

    public static void oylamaKullaniciAlive(int kalanOyuncu, ArrayList playernames) {
        ArrayList<Integer> maxSayi = new ArrayList<>();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int a = 0;
        for (Object playersname : playernames) {

            System.out.println(a + "\t" + playersname);

            a += 1;
        }

        System.out.println("Oylama başladı. Oyunuzun indexini girin: ");
        int kullaniciOyu = scan.nextInt();
        if (kullaniciOyu >= 0 && kullaniciOyu < playernames.size()){
            System.out.println(" Oyunuzu verdiğiniz kişi: " + playernames.get(kullaniciOyu));
            maxSayi.add(kullaniciOyu);
        }
        while ( kullaniciOyu < 0 || kullaniciOyu > playernames.size()-1){
                System.out.println("Doğru düzgün oylama yap: ");
                int kullaniciOyuTekrar = scan.nextInt();
                System.out.println(" Oyunuzu verdiğiniz kişi: " + playernames.get(kullaniciOyuTekrar));
                maxSayi.add(kullaniciOyuTekrar);
        }
        for (int i = 1; i < playernames.size(); i++){
                int x = rand.nextInt(0, playernames.size());
                System.out.println(playernames.get(i) + ": " + playernames.get(x));
                maxSayi.add(x);

                System.out.println("maxsayi"+maxSayi);
        }
        int b =0;
        ArrayList<Integer> sayaclarım = new ArrayList<>();
        int sayac0 = 0, sayac1 = 0, sayac2 = 0, sayac3 = 0, sayac4 = 0, sayac5 = 0, sayac6 = 0, sayac7 = 0;
        sayaclarım.add(sayac0);
        sayaclarım.add(sayac1);
        sayaclarım.add(sayac2);
        sayaclarım.add(sayac3);
        sayaclarım.add(sayac4);
        sayaclarım.add(sayac5);
        sayaclarım.add(sayac6);
        sayaclarım.add(sayac7);


        int enCok = sayac0;
        for (int oylar : maxSayi) {
            System.out.println("oylar ." + oylar);

//                sayaclar.add(sayac0);
//                sayaclar.add(sayac1);
//                sayaclar.add(sayac2);
//                sayaclar.add(sayac3);
//                sayaclar.add(sayac4);
//                sayaclar.add(sayac5);
//                sayaclar.add(sayac6);
//                sayaclar.add(sayac7);

                switch (oylar) {
                    case 0:
                        sayac0 += 1;
                        break;
                    case 1:
                        sayac1 += 1;
                        break;
                    case 2:
                        sayac2 += 1;
                        break;
                    case 3:
                        sayac3 += 1;
                        break;
                    case 4:
                        sayac4 += 1;
                        break;
                    case 5:
                        sayac5 += 1;
                        break;
                    case 6:
                        sayac6 += 1;
                        break;
                    case 7:
                        sayac7 += 1;
                        break;
                }
                b+=1;
                for (int i = 0; i < 1; i++) {
                    if (enCok < sayac1) {
                        enCok = sayac1;
                    }
                    if (enCok < sayac2) {
                        enCok = sayac2;
                    }
                    if (enCok < sayac3) {
                        enCok = sayac3;
                    }
                    if (enCok < sayac4) {
                        enCok = sayac4;
                    }
                    if (enCok < sayac5) {
                        enCok = sayac5;
                    }
                    if (enCok < sayac6) {
                        enCok = sayac6;
                    }
                    if (enCok < sayac7) {
                        enCok = sayac7;
                    }
                while (b == maxSayi.size()) {
                    if(enCok==sayac0){
                        enCok=0;
                    }
                    else if(enCok==sayac1){
                        enCok=1;
                    }
                    else if(enCok==sayac2){
                        enCok=2;
                    }
                    else if(enCok==sayac3){
                        enCok=3;
                    }
                    else if(enCok==sayac4){
                        enCok=4;
                    }
                    else if(enCok==sayac5){
                        enCok=5;
                    }
                    else if(enCok==sayac6){
                        enCok=6;
                    }
                    else if(enCok==sayac7){
                        enCok=7;
                    }


                    System.out.println(enCok);
                    int truesayisi = 0;
                    for (int sayaclar : sayaclarım){
                        if (sayaclar == enCok){
                            truesayisi+=1;
                        }
                    }
                    if (truesayisi<2) {
                        System.out.println(playernames);
                        System.out.println(playernames.get(enCok) + " oylanarak atıldı. Kalan kişiler : ");
                        playernames.remove(enCok);
                        System.out.println(playernames);
                    }else {
                        System.out.println(" Oylar eşit. Kimse atılamıyor.");
                    }
                    break;
                }
                }
        }
        }
    public static void oylamaKullaniciDead (int kalanOyuncu) {

    }
}
