////10
//// Account.java
//public class Account {
//    private double balance;
//    private boolean active;
//
//    public Account(double initialBalance) {
//        this.balance = initialBalance;
//        this.active = true;
//    }
//
//    public boolean isActive() {
//        return active;
//    }
//
//    public void deactivate() {
//        active = false;
//        balance = 0;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    // Попытка списания: возвращает true, если успешно
//    public boolean debit(double amount) {
//        if (!active || amount < 0) {
//            return false;
//        }
//        if (balance >= amount) {
//            balance -= amount;
//            return true;
//        }
//        return false; // недостаточно средств
//    }
//
//    public boolean credit(double amount) {
//        if (!active || amount < 0) {
//            return false;
//        }
//        balance += amount;
//        return true;
//    }
//
//
//}
