package day2.person12;

public class Person1 {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String sex;
    private String nationality;

    public Person1() {

    }

    public Person1(String firstName, String lastName, String passportId, int age, String sex, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 15)
            this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 6 && lastName.length() <= 20)
            this.lastName = lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        boolean flag = true;
        if (passportId.charAt(0) == 'A' && passportId.charAt(1) == 'N') {
            for (int i = 2; i < 8; i++) {
                if (passportId.charAt(i) < '0' || passportId.charAt(i) > '9') {
                    flag = false;
                }
            }

            if (passportId.length() == 8 && flag == true)
                this.passportId = passportId;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age < 99)
            this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (compareToIgnoreCase(sex) == true)
            this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public void display() {

        System.out.println(" firstName= " + firstName + " lastName = " + lastName + " passportId= " + passportId);
        System.out.println(" age= " + age + " sex= " + sex + " nationality= " + nationality);
    }

    public boolean compareToIgnoreCase(String sex) {
        boolean flag = true;
        if (sex.equals("male") || (sex.equals("female"))) {
            return flag;
        } else
            return false;
    }
}
