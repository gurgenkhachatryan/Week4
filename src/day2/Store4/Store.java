package day2.Store4;

public class Store {
    int countOfWorkers;
    private String name;
    private String phoneNumber;
    private int[] arrayNumbers;

    Store(int countOfWorkers, String name, String phoneNumber, int[] arrayNumbers) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.arrayNumbers = arrayNumbers;

    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        if (countOfWorkers >= 2 && countOfWorkers <= 50)
            this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3)

            this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        boolean flag = false;
        for (int i = 0; i < phoneNumber.length(); i++) {
            if ( (phoneNumber.charAt(i) >= '0' && phoneNumber.charAt(i) <= '9'))
                flag = true;
             else {flag = false;
                 break;}
        }
        if ((phoneNumber.length() == 8) && flag == true)
            this.phoneNumber = phoneNumber;
    }

    public int[] getArrayNumbers() {
        return arrayNumbers;
    }

    public void setArrayNumbers(int[] arrayNumbers) {
        this.arrayNumbers = arrayNumbers;
    }

    void selProducts()
    {

    }
}
