package day3.Task3;

public class Main {
    public static void main(String[] args) {
       FinancialAccount financialAccount=new FinancialAccount();
       financialAccount.countOfEmployers=100;
       financialAccount.companyName="ACA";
       financialAccount.departmentName="H Hakobyan";
       financialAccount.income=10000000;
       financialAccount.account();
       financialAccount.income=5000;
       financialAccount.account();
    }
}
