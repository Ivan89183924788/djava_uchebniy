////10
//// CreditCard.java
//public class CreditCard {
//    private String cardNumber;
//    private double limit;
//    private boolean blocked;
//    private Account account; // привязка к счёту
//
//    public CreditCard(String cardNumber, double limit, Account account) {
//        this.cardNumber = cardNumber;
//        this.limit = limit;
//        this.account = account;
//        this.blocked = false;
//    }
//
//    public String getCardNumber() {
//        return cardNumber;
//    }
//
//    public boolean isBlocked() {
//        return blocked;
//    }
//
//    public void block() {
//        blocked = true;
//    }
//
//    public void unblock() {
//        blocked = false;
//    }
//
//    public double getLimit() {
//        return limit;
//    }
//
//    public boolean canPay(double amount) {
//        return !blocked && account.isActive() && amount <= limit;
//    }
//
//    // Оплата через карту: списывает со счёта, если карта не заблокирована и есть лимит
//    public boolean pay(double amount) {
//        if (!canPay(amount)) {
//            return false;
//        }
//        return account.debit(amount);
//    }
//}
