package day3.Animal.Animal1.Task2;

public class Accounting {
    int countOfEmployers;//=50;
    String departmentName;
    int income;//=1000000;

    public Accounting(int countOfEmployers, String departmentName, int income) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
        this.income = income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void count() {
        System.out.println("Valod");
        System.out.println("income=" + income);
    }
}
