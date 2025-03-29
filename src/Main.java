import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //readingFile(); List<Persoana>list = read(fisierul.txt) si dupa dai extract method
        //evaluate expresion, sa folosim debuggerul, gandire algoritmica, debugg la o functie recursiva
        List<Person> persons = readPersons("namesAndAges.txt");
        persons.sort(Comparator.comparing(Person::getName));
        printPersons(persons);

    }
    /*public static void printNames(List<String> names){
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
    }*/

    public static List<Person> readPersons(String fileName) {
        List<Person> persons = new ArrayList<>();
        try{
            File fileNames = new File("namesAndAge.txt");
            Scanner scanner = new Scanner(fileNames);
            while (scanner.hasNextLine()) {
                String names = scanner.nextLine();
                String[] nameParts = names.split(" ");
                String prenume = nameParts[0];
                String name = nameParts[1];
                int age = Integer.parseInt(nameParts[2]);
                persons.add(new Person(name, age, prenume));
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }
    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getPrenume() + " " + person.getAge());
        }
    }

}