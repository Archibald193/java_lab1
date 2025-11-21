public abstract class Account {
    protected String acNum;
    protected double balance;

    public Account(String acNum, double balance) {
        this.acNum = acNum;
        this.balance = balance;
    }

    public String getAcNum() {
        return acNum;
    }
    public double getBalance() {
        return balance;
    }

    public abstract double calculateInterest();
    
    @Override
    public String toString() {
        return "Счет №" + acNum + ", Баланс: " + balance;
    }
}