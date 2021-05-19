package day3.Animal.Animal1.Task2;
public class Main {
    public static void main(String[] args) {
      //  Accounting accounting=new Accounting(50,"ARA",1000000);
        FinancialAccount financialAccount=new FinancialAccount(50,"Ara",1000000);
        financialAccount.count();
        financialAccount.setIncome(50);
        financialAccount.count();
       // accounting.count();
    }
}
