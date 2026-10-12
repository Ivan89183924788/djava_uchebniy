////10
//// Administrator.java
//public class Administrator {
//    private String name;
//
//    public Administrator(String name) {
//        this.name = name;
//    }
//
//    // Принудительная блокировка карты, если сумма платежа превысила лимит
//    public boolean blockCardForExcess(CreditCard card, double attemptedAmount) {
//        System.out.println(name + " проверяет превышение лимита по карте.");
//        if (attemptedAmount > card.getLimit()) {
//            card.block();
//            System.out.println(name + " заблокировал карту за превышение лимита (попытка платежа: " + attemptedAmount + ").");
//            return true;
//        } else {
//            System.out.println("Превышения лимита нет, блокировка не требуется.");
//            return false;
//        }
//    }
//}
