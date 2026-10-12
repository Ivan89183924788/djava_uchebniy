//11
//public class Accounty {
//    private  double ostatokDeneg;
//    private boolean active;
//
//    public Accounty(double moyOstatokDeneg) {
//        this.ostatokDeneg = moyOstatokDeneg;
//        this.active = true;
//    }
//
//    public boolean isActive(){
//        return active;
//    }
//
//    public void deactive(){
//        active=false;
//        ostatokDeneg=0;
//    }
//    public double getOstatokDeneg(){
//        return ostatokDeneg;
//    }
//
//    //Попытка списания возращает true если успешно
//    public boolean otdaem(double zena){
//        if (!active || zena<0){
//            return false;
//        }
//        if(ostatokDeneg>=zena){
//            ostatokDeneg-=zena;
//            return true;
//        }
//        return false;//недостаточно средств
//    }
//
//    public boolean daut(double zena){
//        if(!active || zena<0){
//            return  false;
//        }
//        ostatokDeneg+=zena;
//        return true;
//    }
//
//}
