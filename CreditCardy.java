//11
//public class CreditCardy {
//    private String nomerCarty;
//    private double vozmojnosty;
//    private boolean zacrity;
//    private Accounty accounty;
//
//    public CreditCardy(String nomerCarty, double vozmojnosty,Accounty accounty) {
//        this.nomerCarty = nomerCarty;
//        this.vozmojnosty = vozmojnosty;
//        this.accounty = accounty;
//        this.zacrity = false;
//    }
//
//    public String getNomerCarty(){
//        return nomerCarty;
//    }
//
//    public boolean isZacrity(){
//        return zacrity;
//    }
//    public void zacr(){
//        zacrity=true;
//    }
//
//    public void nezacr(){
//        zacrity=false;
//    }
//
//    public double getVozmojnosty(){
//        return vozmojnosty;
//    }
//
//    public boolean mojnoPlatity(double zena){
//        return  !zacrity && accounty.isActive() && zena<=vozmojnosty;
//    }
//
//    //Оплата через карту: списывает со счета, если карта не заблокирована и есть лимит
//    public boolean platity(double zena){
//        if(!mojnoPlatity(zena)) {
//            return false;
//        }
//        return accounty.otdaem(zena);
//    }
//}
