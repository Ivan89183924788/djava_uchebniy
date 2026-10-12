//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Zadachy {
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        List<String> lines=new ArrayList<>();
//
//
//        while (true){
//            System.out.print("Введите строку(или пустую чтобы закончить): ");
//            String line=scanner.nextLine();
//
//            if(line==null || line.isEmpty()){
//                break;
//            }
//            lines.add(line);
//        }
//        System.out.println("Всего введенно строк: " + lines.size());
//
//    }
//}

//
//public class Zadachy{
//    public static void main(String[] args){
//        Houm[] houses={
//                new Apartament("ЖК Солнечный",75),
//                new House("Коттедж у озера",180),
//                new Studio("Студия в центре",27)
//        };
//
//        for(Houm h:houses){
//            h.printInfo();
//            System.out.println("-----------");
//        }
//    }
//}
//
//abstract class Houm{
//    protected String name;
//    protected double area;
//
//    public Houm(String name,double area){
//        this.name=name;
//        this.area=area;
//    }
//
//    // Абстрактный метод: каждый тип дома сам решает, как себя описать
//    public abstract String getDescription();
//
//    // Обычный метод: общая логика, использует абстрактный
//    public void printInfo(){
//        System.out.println("Дом: " + name);
//        System.out.println("Площадь: " + area + " м²");
//        System.out.println("Описание: " + getDescription());
//    }
//}
//
//class Apartament extends Houm{
//    public Apartament(String name,double area){
//        super(name,area);
//    }
//    @Override
//    public String getDescription(){
//        return "Квартира в многоэтажном доме с охраной.";
//    }
//}
//
//class House extends Houm{
//    public House(String name,double area){
//        super(name,area);
//    }
//    @Override
//    public String getDescription(){
//        return "Отдельный жилой дом с участком и гаражом";
//    }
//}
//
//class Studio extends Houm{
//    public Studio(String name, double area){
//        super(name,area);
//    }
//    @Override
//    public String getDescription(){
//        return "Компактная студия с открытой планировкой";
//    }
//
//}

//
//public class Zadachy{
//    public  static void  main(String[] args){
//        Houm[] homes={
//                new LuxuryHoum("Пентхаус",120),
//                new EconomyHoum("Эконом квартира", 55),
//                new CountryHoum("Дача",90)
//        };
//
//        System.out.println("=== Расчет стоимости дома ===");
//
//        for (Houm h:homes){
//            double pricePerSq=h.getPricePerSquareMeter();
//            double totalPrice=pricePerSq*h.getArea();
//            System.out.printf("Дом: %s%n", h.getName());
//            System.out.printf("Цена за м²: %.2f руб.%n ",pricePerSq);
//            System.out.printf("Итоговая стоимость: %.2f руб.%n", totalPrice);
//            System.out.println("------------------");
//        }
//    }
//}
//
//abstract class Houm{
//    private String name;
//    private double area;
//
//    public Houm(String name, double area){
//        this.name=name;
//        this.area=area;
//    }
//
//    public String getName(){return name;}
//    public double getArea(){return area;}
//
//    // Каждый тип дома имеет свою цену за метр
//    public abstract double getPricePerSquareMeter();
//}
//
//class LuxuryHoum extends Houm{
//    public LuxuryHoum(String name,double area){
//        super(name,area);
//    }
//
//    @Override
//    public double getPricePerSquareMeter(){
//        return 350000;
//    }
//}
//
//class EconomyHoum extends Houm{
//    public EconomyHoum(String name,double area){
//        super(name,area);
//    }
//
//    @Override
//    public double getPricePerSquareMeter(){
//        return 120000;
//    }
//}
//
//class CountryHoum extends Houm{
//    public CountryHoum(String name,double area){
//        super(name,area);
//    }
//
//    @Override
//    public double getPricePerSquareMeter(){
//        return 85000;
//    }
//}


//public class Zadachy{
//    public static void main(String[] args){
//        Dom[] mesta={
//                new HotelRoom("Стандартный номер",25,2),
//                new FamilyApartament("Семейная квартира",60,5),
//                new TinyHouse("Мини-дом",20,2)
//        };
//
//        int[] gostyProverka={1,3,6};
//
//        for(Dom mesto:mesta){
//            System.out.println("Обьект: " + mesto.polImya() +"(макс гостей: " + mesto.polMaxGosty()  + ")");
//            for (int g:gostyProverka){
//                if (mesto.mojnoGostey(g)){
//                    System.out.println(" ->" + g + "гостей:ДОПУСТИМО");
//                } else {
//                    System.out.println(" ->" + g + "гостей:НЕДОПУСТИМО");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
//
//abstract class Dom{
//    private String imya;
//    private int maxGosty;
//
//    public  Dom(String imya, int maxGosty){
//        this.imya=imya;
//        this.maxGosty=maxGosty;
//    }
//
//    public String polImya(){
//        return imya;
//    }
//
//    public int polMaxGosty(){
//        return maxGosty;
//    }
//
//    //Абстрактный метод сам решает сколько гостей
//    public abstract boolean mojnoGostey(int gosty);
//
//}
//
//class HotelRoom extends Dom{
//    private int area;
//
//    public HotelRoom(String imya, int area, int maxGosty){
//        super(imya,maxGosty);
//        this.area=area;
//    }
//
//    @Override
//    public boolean mojnoGostey(int gosty){
//        // в отеле строго по лимиту, плюс правило 4мкв на человека
//        int minPloshChel=4;
//        boolean byLimit=gosty<=polMaxGosty();
//        boolean byArea=gosty*minPloshChel<=area;
//        return byLimit && byArea;
//    }
//}
//
//class FamilyApartament extends Dom{
//    private int area;
//
//    public FamilyApartament(String imya, int area, int maxGosty){
//        super(imya,maxGosty);
//        this.area=area;
//    }
//
//    @Override
//    public boolean mojnoGostey(int gosty){
//        //Для семейной квартиры достаточно просто не превышать лимит гостей
//        return gosty<=polMaxGosty();
//    }
//}
//
//class TinyHouse extends Dom{
//    private int area;
//
//    public TinyHouse(String imya, int area, int maxGosty){
//        super(imya,maxGosty);
//        this.area=area;
//    }
//
//    @Override
//    public boolean mojnoGostey(int gosty){
//        // в мини-доме строго по лимиту, плюс правило 6мкв на человека
//        int minPloshChel=6;
//        if(gosty==0){
//            return true;
//        }
//        return gosty*minPloshChel<=area;
//
//    }
//}

//public class Zadachy{
//    public static void main(String[] args){
//        pechRes(10);
//        pechRes(3.14);
//        pechRes("Успех");
//        pechRes(10);
//        pechRes(5,34);
//        pechRes("Цена: ",1500);
//        pechRes('e');
//    }
//
//    static void pechRes(int value){
//        System.out.println("Целое число: " + value);
//    }
//    static void pechRes(double value){
//        System.out.println("Число с плавающей запятой: " + value);
//    }
//    static void pechRes(String text){
//        System.out.println("Текст: " + text);
//    }
//    static void pechRes(int a,int b){
//        System.out.println("Два числа: " + a + " и " +b);
//    }
//    static void pechRes(String label,int value){
//        System.out.println(label + " " + value);
//    }
//    static void pechRes(char ch){
//        int code=(int)ch;
//        System.out.println("Символ: '" + ch +"'(код:" + code +")");
//    }
//}

//
//public class Zadachy{
//    public static  void main(String[] args){
//        Dom domik=new Dom("Уютный домик",80,4);
//
//        domik.kniga(2);
//        domik.kniga(3,7);
//        domik.kniga("Иванов",2,5);
//        domik.kniga(10000);
//    }
//}
//
//class Dom{
//    private String imya;
//    private double plosh;
//    private int maxGosty;
//
//    public Dom(String imya, double plosh, int maxGosty){
//        this.imya=imya;
//        this.plosh=plosh;
//        this.maxGosty=maxGosty;
//    }
//    //Вариант 1: просто колшичество гостей
//    public  void kniga(int gosty){
//        if (gosty<=maxGosty){
//            System.out.println("[" + imya + "] Бронь" + " гости без срока ");
//        }
//        else {
//            System.out.println("[" + imya + "] Отказ: больше " + maxGosty + "нельзя");
//
//        }
//    }
//
//    //Вариант 2:гости + ночи
//    public void kniga(int gosty,int nochy){
//        double zenaNochy=3000;
//        double total=zenaNochy*nochy;
//        System.out.printf("[%s] Бронь: %d гостей на %d ночей. Итого:%.0f руб. %n ", imya,gosty,nochy,total);
//
//    }
//    //Вариант 3: имя гостя + гости + ночи
//    public void kniga(String gostyImya,int gosty,int nochy){
//        System.out.printf("[%s] Бронь на имя '%s': %d гостей на %d ночей. %n ",imya,gostyImya,gosty,nochy);
//
//    }
//    // Вариант 4: фиксированная сумма (например, предоплата)
//    public void book(double amount) {
//        System.out.printf("[%s] Предоплата: %.0f руб.%n", imya, amount);
//    }
//}

