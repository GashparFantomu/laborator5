import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //readingFile(); List<Persoana>list = read(fisierul.txt) si dupa dai extract method
        List<String> names = new ArrayList<>(); //evaluate expresion, sa folosim debuggerul, gandire algoritmica debugg la o functie recursiva
        try {
            File fileNames = new File("namesAndAge.txt");
            Scanner readNames = new Scanner(fileNames);

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
        try{
            FileReader reader = new FileReader("namesAndAge.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            List<String> namesList = new ArrayList<>();
            System.out.println(namesList);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    /*private static void readingFile() {
        List<Person>list = read("namesAndAge");
    }*/
}