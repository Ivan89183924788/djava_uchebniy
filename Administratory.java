//11
//public class Administratory {
//    private String imya;
//
//    public Administratory(String imya) {
//        this.imya = imya;
//    }
//
//    //Принудительная блокировка карты, если сумма платежа превысила лимит
//    public  boolean zacrityCartu(CreditCardy cardy,double previsilaZena){
//        System.out.println((imya + "проверяет превышение лимита по карте."));
//        if (previsilaZena>cardy.getVozmojnosty()){
//            cardy.zacr();
//            System.out.println(imya + "заблокировать карту за превышение лимита(попытка платежа: " + previsilaZena + ").");
//            return true;
//        }
//        else{
//            System.out.println("Превышения нет, блокировка не требуется.");
//            return false;
//        }
//    }
//
//}
