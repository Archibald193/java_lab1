public class Main {
    public static void main(String[] args) {
        Account[] accounts = {
            new CheckingAccount("001", 15000),
            new SavingsAccount("002", 50000, 0.05),
            new CreditAccount("003", -20000)
        };
        
        for (Account acc : accounts) {
            System.out.println(acc); 
            double interest = acc.calculateInterest();
            
            System.out.println("Начисленные проценты: " + interest + "\n");
        }
        
        
        for (Account acc : accounts) {
            if (acc instanceof Loanable) {
                System.out.println(acc.getAcNum() + " может подать заявку на кредит");
                Loanable loanableAccount = (Loanable) acc;
                loanableAccount.applyForLoan(10000);
                System.out.println();
            }
        }
    }
}