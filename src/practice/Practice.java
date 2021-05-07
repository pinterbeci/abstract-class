package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
/*
        String [] simpleArray = new String[2];
        simpleArray[0] = "kóla";
        simpleArray[0] = "koksz";

        ArrayList<String> simpleArrayList = new ArrayList<>();

        simpleArrayList.add("hasis");
        simpleArrayList.add("crack");
*/
        //ArrayList<Cat> cats = new ArrayList<Cat>();

        /*
            Mivel a Cat (gyerekosztály) az Animal (szülőosztály) leszármazottja, így ha listához tudunk hozzáadni Cat-eket, viszont  ők Animal-ként
            lesznek kezelve. Így ebben az esetben, ha van olyan attributúma vagy metódusa a gyerek soztálynak osztályak,
            ami a szülőosztálnyak nincs, akkor nem tudjuk azt meghívni!
        * */
        ArrayList<Animal> cats = new ArrayList<Animal>();
        Cat firstCat = new Cat("maacska");
        cats.add(firstCat);
        Cat castOfCats = (Cat) cats.get(0);
        castOfCats.purr();


        if (cats.isEmpty()) {

            System.out.println("Nincs elmentve maaacska");
        } else {
            System.out.println(cats.get(0).getName());
        }

        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;

        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());
        System.out.println(o3.hashCode());

        Dog kutja = new Dog();
        cats.add(kutja);

        if( cats.get(0) instanceof Cat){

            Cat secondcat = (Cat) cats.get(0);
            secondcat.purr();
        }
        else{
            System.out.println("Nem a példánya, a Cat osztálynak!");
        }

        Cat macska = new Cat("gabó");
        System.out.println(macska.toString());

        File file = new File("E://file.txt");
        try {
            //mit próbálok csinálni?
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            //ha gáz van, és nem sikerül, akkor átugrok ide
            e.printStackTrace();
        }finally {
            //akár lefutott a 'try', akár a 'catch', amit csinálni, fog az amit itt megfogalmazuk.
            //mindig le fog futni!
        }
    }
}
