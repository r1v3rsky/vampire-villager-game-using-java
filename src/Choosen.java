import java.util.ArrayList;
import java.util.Collections;

public class Choosen extends Players{

    static ArrayList<String> copylist = new ArrayList<>(playernames);


    public static void choose() {
        Collections.shuffle(copylist);
        String vampire1 = copylist.getFirst();
        String vampire2 = copylist.get(1);
        String doctor = copylist.get(2);
        String villager1 = copylist.get(3);
        String villager2 = copylist.get(4);
        String villager3 = copylist.get(5);
        String villager4 = copylist.get(6);
        String villager5 = copylist.get(7);
//      ArrayList<String> cooppyy2 = new ArrayList<>(copylist);

        System.out.println(copylist);
        if (playernames.getFirst().equals(vampire1)||playernames.getFirst().equals(vampire2)){
            Vampires.vampireKullanici();
        }else if (playernames.getFirst().equals(doctor)){
            Vampires.vampireRandomAndKullaniciDoctor();


        }else {
            Vampires.everythingRandom();
         //   Doctor.doctorRandom();
        }

    }

}
