package day3.Task2;

public class Accounting {
    int countOfEmployers;
    String departmentName;
    int income;

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
