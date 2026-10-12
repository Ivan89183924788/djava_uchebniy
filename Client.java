//10
//// Client.java
//public class Client {
//    private String name;
//    private Account account;
//    private CreditCard creditCard;
//
//    public Client(String name, double initialBalance, String cardNumber, double cardLimit) {
//        this.name = name;
//        this.account = new Account(initialBalance);
//        this.creditCard = new CreditCard(cardNumber, cardLimit, account);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public CreditCard getCreditCard() {
//        return creditCard;
//    }
//
//    public Account getAccount() {
//        return account;
//    }
//
//    // Оплатить заказ
//    public boolean payOrder(Order order) {
//        System.out.println(name + " пытается оплатить заказ " + order.getId() + " на сумму " + order.getTotalAmount());
//        if (creditCard.pay(order.getTotalAmount())) {
//            System.out.println("Заказ " + order.getId() + " оплачен.");
//            return true;
//        } else {
//            System.out.println("Оплата заказа " + order.getId() + " отклонена.");
//            return false;
//        }
//    }
//
//    // Перевод на другой счёт
//    public boolean transferTo(Account targetAccount, double amount) {
//        System.out.println(name + " переводит " + amount + " на другой счёт.");
//        if (account.debit(amount)) {
//            if (targetAccount.credit(amount)) {
//                System.out.println("Перевод выполнен.");
//                return true;
//            } else {
//                // Откат, если целевой счёт не принял
//                account.credit(amount);
//                System.out.println("Ошибка при зачислении на целевой счёт, перевод отменён.");
//                return false;
//            }
//        } else {
//            System.out.println("Недостаточно средств для перевода.");
//            return false;
//        }
//    }
//
//    // Блокировка своей карты
//    public void blockCard() {
//        creditCard.block();
//        System.out.println(name + " заблокировал свою карту.");
//    }
//
//    // Аннулирование счёта (и карты)
//    public void cancelAccount() {
//        account.deactivate();
//        creditCard.block();
//        System.out.println(name + " аннулировал счёт и заблокировал карту.");
//    }
//}
