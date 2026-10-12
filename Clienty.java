//11
//public class Clienty {
//    private  String imya;
//    private Accounty accounty;
//    private CreditCardy creditCardy;
//
//    public Clienty(String imya, double moyOstatokDeneg, String nomerCarty,double cartyOstatok) {
//        this.imya = imya;
//        this.accounty = new Accounty(moyOstatokDeneg);
//        this.creditCardy = new CreditCardy(nomerCarty,cartyOstatok,accounty);
//
//
//    }
//    public String getImya() {
//        return imya;
//    }
//
//    public CreditCardy getCreditCardy() {
//        return creditCardy;
//    }
//
//    public Accounty getAccounty() {
//        return accounty;
//    }
//
//    //Оплатить покупки
//    public boolean oplatityPokupku(Ordery ordery){
//        System.out.println(imya + "пытается оплатить заказ " + ordery.getIdi() + " на сумму " + ordery.getGlavZena());
//        if(creditCardy.platity(ordery.getGlavZena())){
//            System.out.println("Заказ " + ordery.getIdi() + " оплачен.");
//            return true;
//        }else{
//            System.out.println(("Оплата заказа " + ordery.getIdi() + " отклонена."));
//            return false;
//        }
//    }
//
//    //Перевод на другой счет
//    public boolean perevod(Accounty celyAccounty,double zena){
//        System.out.println(imya + " переводит " + zena + " на другой счет.");
//        if (accounty.daut(zena)){
//            if(celyAccounty.otdaem(zena)){
//                System.out.println("Перевод выполнен.");
//                return true;
//            }else{
//                //Откат, если целевой счет не принял
//                accounty.otdaem(zena);
//                System.out.println("Ошибка при зачислении на лицевой счет, перевод отменен");
//                return false;
//            }
//        }else {
//            System.out.println("Недостаточно средств для перевода");
//            return false;
//        }
//    }
//
//    //Блокировка карты
//    public void zacrityCarty(){
//        creditCardy.zacr();
//        System.out.println(imya + " заблокировать свою карту.");
//    }
//
//    //Анулирование счета или карты
//    public void zacrityAccounty(){
//        accounty.deactive();
//        creditCardy.zacr();
//        System.out.println(imya + " аннулировать счет и заблокировать карту.");
//    }
//}
