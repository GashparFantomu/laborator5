public class Person {
    public Person() {
        System.out.println("Person implicit");
    }
    private String name;
    private int age;
    private String prenume;

    public Person(String prenume, String name, int age) {
        this.name = name;
        this.age = age;
        this.prenume = prenume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }//getter, setter,

}
