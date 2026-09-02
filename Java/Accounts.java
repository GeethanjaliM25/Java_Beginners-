class Accounts {

    private double balance;

    public Accounts(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance!");
        return balance;
    }

    public static void main(String[] args) {

        Accounts a1 = new Accounts(1000);

        System.out.println(a1.getBalance());

        System.out.println("After deposit of 500, " + a1.deposit(500));

        System.out.println("After withdrawal of 800, " + a1.withdraw(800));

        a1.withdraw(2000);
    }
}