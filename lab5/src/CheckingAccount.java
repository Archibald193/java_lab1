public class CheckingAccount extends Account implements Loanable {

    public CheckingAccount(String acNum, double balance) {
        super(acNum, balance);
    }

    @Override
    public double calculateInterest() {
        return this.balance * 0.005;
    }

    @Override
    public void applyForLoan(double n) {
        System.out.println("Подана заявка на кредит на сумму " + n + " для счета " + acNum);
    }
    
    @Override
    public String toString() {
        return "Текущий " + super.toString();
    }
}