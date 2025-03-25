import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //readingFile(); List<Persoana>list = read(fisierul.txt) si dupa dai extract method
        List<String> names = null;
        try {
            File fileNames = new File("namesAndAge.txt");
            Scanner readNames = new Scanner(fileNames);

            names = new ArrayList<>();

            while (readNames.hasNextLine()) {
                names.add(readNames.nextLine());
                names.sort(Comparator.naturalOrder()); //comparator.comparing (persoana) -> persoana.getName()
            }//metoda afisareEcran
            /*for(String name : names){
                System.out.println(name);
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printNames(names);
    }
    public static void printNames(List<String> names){
        for(String name : names){
            System.out.println(name);
        }
    }
    /*private static void readingFile() {
        List<Person>list = read("namesAndAge");
    }*/
}