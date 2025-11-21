public class SavingsAccount extends Account {
    private double percent;

    public SavingsAccount(String acNum, double balance, double percent) {
        super(acNum, balance);
        this.percent = percent;
    }

    @Override
    public double calculateInterest() {
        return this.balance * this.percent;
    }
    
    @Override
    public String toString() {
        return "Сберегательный " + super.toString() + ", Ставка: " + (percent * 100) + "%";
    }
}