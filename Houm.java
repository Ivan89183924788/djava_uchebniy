//import  java.util.Scanner;
//public class Houm {
//    public static void main(String[] args){
//        Scanner scaner=new Scanner(System.in);
//
//        System.out.print("Введите первое число: ");
//        int a=scaner.nextInt();
//
//        System.out.print("Введите второе число: ");
//        int b=scaner.nextInt();
//
//        System.out.print("Введите третье число: ");
//        int c=scaner.nextInt();
//
//        int maximum=max(a,b,c);
//        System.out.println("Наибольшее число: " + maximum);
//
//        scaner.close();
//
//    }
//
//    public static int max(int a,int b,int c){
//        return Math.max(Math.max(a,b),c);
//    }
//}

//public class Houm{
//    public static void main(String[] args){
//        System.out.println("max(12,45,67) = " + max(12,45,67));
//        System.out.println("max(65,89,33) = " + max(65,89,33));
//        System.out.println("max(445,776,34) = " + max(445,776,34));
//        System.out.println("max(456,67,890) = " + max(456,67,890));
//
//
//    }
//    public static int max(int a, int b,int c){
//        return Math.max(Math.max(a,b),c);
//    }
//}



//public class Houm {
//    public static void main(String[] args)
//    {
//        if(args.length<3){
//            System.out.println("Передайте 3 чиссла как аргумент");
//            System.out.println("Пример: java Houm 10 45 65");
//            return;
//        }
//        int a=Integer.parseInt(args[0]);
//        int b=Integer.parseInt(args[1]);
//        int c=Integer.parseInt(args[2]);
//
//        int maximum=max(a,b,c);
//        System.out.println("Наибольшее число: " + maximum);
//    }
//    public static int max(int a, int b, int c){
//        return Math.max(Math.max(a,b),c);
//    }
//}
//
//public class Houm {
//    public static void main(String[] args){
//        System.out.println("Получено аргументов: " + args.length );
//        for (int i=0;i< args.length;i++){
//            System.out.println("Аргумент [" + i + "]: " +  args[i]);
//        }
//
//        if(args.length<3){
//            System.out.println("Передайте 3 числа как аргументы.");
//            System.out.println("Пример: java Houm 23 56 43");
//            return;
//
//        }
//        int a=Integer.parseInt(args[0]);
//        int b=Integer.parseInt(args[1]);
//        int c=Integer.parseInt(args[2]);
//
//        System.out.println("Обработанные числа: " + a + "," + b + "," + c );
//
//        int maximum=max(a,b,c);
//        System.out.println("Наибольшее число: " + maximum);
//    }
//    public static int max(int a,int b,int c){
//        return Math.max(Math.max(a,b),c);
//    }
//}

//public class Houm {
//    public static void main(String[] args) {
//        // Сначала выводим, что вообще пришло
//        System.out.println("Получено аргументов: " + args.length);
//        for (int i = 0; i < args.length; i++) {
//            System.out.println("Аргумент [" + i + "]: " + args[i]);
//        }
//
//        if (args.length < 3) {
//            System.out.println("Передайте 3 числа как аргументы.");
//            System.out.println("Пример: java Houm 10 45 65");
//            return;
//        }
//
//        int a = Integer.parseInt(args[0]);
//        int b = Integer.parseInt(args[1]);
//        int c = Integer.parseInt(args[2]);
//
//        System.out.println("Обработанные числа: " + a + ", " + b + ", " + c);
//
//        int maximum = max(a, b, c);
//        System.out.println("Наибольшее число: " + maximum);
//    }
//
//    public static int max(int a, int b, int c) {
//        return Math.max(Math.max(a, b), c);
//    }
//}


//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Houm{
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        try{
//            System.out.println("Введите первое число: ");
//            int a=scanner.nextInt();
//
//            System.out.println("Введите второе число: ");
//            int b =scanner.nextInt();
//
//            System.out.println("Введите третье число: ");
//            int c = scanner.nextInt();
//
//            int maximum=max(a,b,c);
//            System.out.println("Наибольшее число: " + maximum);
//        } catch (InputMismatchException e){
//            System.out.println("Ошибка: нужно вводить целые числа");
//
//        }
//        finally {
//            scanner.close();
//        }
//    }
//    public static int max(int a,int b,int c){
//        return Math.max(Math.max(a,b),c);
//    }
//}


//public class Houm{
//    public static void main(String[] args){
//        int score=78;
//        boolean Atribut=true;
//
//        // Множество сравнений в одном условии: оценка >= 70 И посещено >= 80%
//
//        String result=(score>=70 && Atribut)
//                ?"Зачет":"Не зачет";
//        System.out.println("Результат: " + result);
//
//    }
//}


//public class Houm{
//    public static void main(String[] args){
//        int points=85;
//        String grade=(points>=90)?"A"
//                :(points>=80)?"B"
//                :(points>=70)?"C"
//                :(points>=60)?"D"
//                :(points>=50)?"F"
//                :(points>=40)?"G"
//                :"H";
//        System.out.println("Оценка: " + grade);
//    }
//}


//public class Houm {
//    public static void main(String[] args){
//        double price=120.0;
//        boolean hasCoupon=true;
//        double discountPercent=hasCoupon?20.0:0.0;
//        double finalPrice=price*(1-discountPercent/100);
//
//        System.out.println("Цена скидки: " + price);
//        System.out.println("Скидка: " + discountPercent);
//        System.out.println("Итоговая цена: " + finalPrice);
//
//        String status=(finalPrice>100)?"Требуется подтверждение":"Автоматическое подтверждение";
//        System.out.println("Статус заказа: " + status);
//    }
//}


//public class Houm {
//    public static void main(String[] args){
//        int temperature=10;
//        System.out.println(
//                temperature>=30?"Очень жарко"
//                        :temperature>=28?"Жарко"
//                        :temperature>=25?"Тепло"
//                        :temperature>=20?"Нормально"
//                        :"Прохладно"
//
//        );
//    }
//}

//import java.util.Scanner;
//
//public class Houm {
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Введите возраст: ");
//        int age=scanner.nextInt();
//
//        System.out.println("Введите доход в месяц(руб): ");
//        int income=scanner.nextInt();
//
//        String eligibility=(age>=18 && income>=30000)?
//                 "Вы подходите для получения кредита"
//                :"Вы не подходите";
//        System.out.println(eligibility);
//
//        String riskLevel=(income<20000)?"Высокий"
//                :(income<30000)?"Средний"
//                :(income<40000)?"Низкий"
//                :"Минимальный";
//        System.out.println("Уровень риска: " + riskLevel);
//        scanner.close();
//    }
//}

//
//import java.util.Scanner;
//
//public class Houm{
//    enum TrafficLiteColor{
//        RED,
//        YELLOW,
//        GREEN,
//        ORANGE
//    }
//
//    public static void main(String[] args){
//        Scanner scanner=new Scanner((System.in));
//        String input= scanner.nextLine();
//        TrafficLiteColor trafficLiteColor=TrafficLiteColor.valueOf(input.toUpperCase());
//        switch (trafficLiteColor){
//            case RED:
//                System.out.println("Red");
//                break;
//            case YELLOW:
//                System.out.println("Yellow");
//                break;
//            case GREEN:
//                System.out.println("Green");
//                break;
//            case ORANGE:
//                System.out.println("Orange");
//                break;
//        }
//        TrafficLiteColor trafficLiteColor1=TrafficLiteColor.RED;
//        System.out.println(trafficLiteColor1.ordinal());
//        for(TrafficLiteColor color:TrafficLiteColor.values()){
//            System.out.println(color);
//        }
//    }
//
//}


