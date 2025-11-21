public class CreditAccount extends Account implements Loanable {

    public CreditAccount(String acNum, double balance) {
        super(acNum, balance);
    }

    @Override
    public double calculateInterest() {
        if (this.balance < 0) {
            return this.balance * 0.20;
        }
        return 0;
    }

    @Override
    public void applyForLoan(double n) {
        System.out.println("Запрос на увеличение кредитного лимита на " + n + " для счета " + acNum);
    }
    
    @Override
    public String toString() {
        return "Кредитный " + super.toString();
    }
}