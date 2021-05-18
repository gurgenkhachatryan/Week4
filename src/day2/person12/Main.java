package day2.person12;

public class Main {

    public static void main(String[] args) {
        Person1 person1 = new Person1("Armen","Armenyan","AN88",18,"m","armenian");
        System.out.println(person1.getFirstName());
        person1.setFirstName("poxos");
        System.out.println(person1.getFirstName());
        person1.display();
        person1.setFirstName("Kn");
        person1.setNationality("Mongolia");
        person1.setLastName("kut");
        person1.setAge(28);
        person1.setSex("male");
        person1.setPassportId("AN123456");
        person1.display();
        person1.setPassportId("Ak123456");
        person1.display();

       // if(person1.getFirstName().compareTo(3)<0)&&
    }
}
