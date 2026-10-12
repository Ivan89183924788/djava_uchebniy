import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

//
//public class Main {
//    public static void main(String[] args){
//        System.out.println("Hello");
//        System.out.println("hhh");
//        System.out.println("ffgggg");
//        System.out.format("Привет - %s!Как дела - %s","Саша","на работе  \n");
//
//        String name = "Djon";
//        int age=18;
//        System.out.format("Name: %s\nAge:%d\n",name,age);
//        System.out.println(name + " fffwggg\n" + age +" fggg\n");
//        System.getenv("JAVA_HOME");
//
//        String name1 = "Djon";
//        int age1=18;
//        System.out.printf("Bscz-%s,ffrrr-%d\n",name,age);
//        System.out.format("Привет-%s!Как дует %s\n","Ваня","ветер");
//        System.out.println(name +" rrrr\n" +age+ " efrffr\n");
//
//       var nn= System.currentTimeMillis();
//       System.out.println(nn/(3600000*24*365));
//
//       var cc=System.currentTimeMillis();
//        System.out.println((cc/(3600000*24*365)));
//
////       final  String Name="Aboba";
////       Name="dddd";
////        System.out.println(Name);
//    }
//}

//public class Main{
//    public static void main(String[] args){
//                var   Name1="Aboba";
//        Name1="Name1 Ivan";
//        System.out.println(Name1);
//
//        String name2="15";
//        int age2=Integer.parseInt(name2+1);
//        System.out.println("name2 + age2 = " + name2+1);
//        System.out.println("1+age2 = " +age2+1);
//
//        String name1="34566";
//        double ass=Double.parseDouble( name1);
//        int add=Integer.parseInt(name1);
//        add+=12.33;
//        System.out.println("add=name1+12.33 = "+ name1+123);
//        System.out.println("add=name1+12.33+123 = " + add+123);
//        System.out.println("add=name1+12.33+123,33 = " +ass+123.3333);
//
//        int age=359;
//        byte age1=(byte)age;
//        System.out.println("age1 byte = " + age1);
//
//        long as=1000000000;
//        int ss=(int)as;
//        System.out.println("long v in(ss) = " + ss);
//    }
//}

//import java.util.Scanner;
//
//public class Main {
//    public static void main (String[] args){
//        Scanner scanner= new Scanner(System.in);
//        System.out.print("Введите возраст ");
//        int age=scanner.nextInt();
//
//        Scanner scanner1= new Scanner(System.in);
//        int age1;
//        System.out.print("Введите возраст1: ");
//        if (scanner1.hasNextInt()){
//            age1 = scanner1.nextInt();
//            System.out.println(age1);
//        }
//        else{
//            System.out.println("kkjfjfj");
//        }
//
//        Scanner rr=new Scanner(System.in);
//        System.out.print("Введите число с плавающей запятой: ");
//        double gg;
//        if(rr.hasNextDouble()){
//            gg=rr.nextDouble();
//            System.out.println(gg);
//        }
//        else{
//            System.out.println("ffffff");
//        }
//
//        Scanner de=new Scanner(System.in);
//        System.out.print("Введите возраст: ");
//        int age2=de.nextInt();
//        System.out.print("Введите ведите число с плавающей запятой: ");
//        double as=de.nextDouble();
//        System.out.print("Введите число с плавающей запятой: ");
//        float fgg= de.nextFloat();
//        System.out.print("Введите большое число: ");
//        long ff= de.nextLong();
//
//
//    }
//}

//public class Main {
//   public static void main(String[] args){
//               String name="don";
//        String age="for "+name;
//        System.out.println(age);
//        String age1=new String(" dombay");
//        System.out.println(age+age1);
//
//        String dof="dof";
//        String dof1="dof1 "+dof;
//        System.out.println(dof1);
//        String ref=new String("ffff ff");
//        System.out.println(ref);
//
//   }
//}

//public class Main{
//    public static void main(String[] args){
//                int men=55;
//        switch (men){
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            case 5:
//                System.out.println("5");
//                break;
//            default:
//                System.out.println("no 1,2,3,5");
//        }
//    }
//}

//public class Main{
//    public static void main(String[] args){
//                int x=2;
//        int y=5;
//        int z=x<y? (x+y):(x-y);
//        int e=x-y<y?(2*x+5):(2*x-5);
//        System.out.println(z+" dddd\n"+e);
//
//    }
//}

//public  class Main {
//    public static void main(String[] args){
//                for (int i=0;i<9;i++){
//            System.out.printf("Квадрат числа %d равен %d\n",i,i*i);
//        }
//
//        int j=55;
//        while (j>0){
//            System.out.println(j);
//            j--;
//        }
//
//        int e=12;
//        double r=44;
//        while (e>3){
//            System.out.println(e);
//            e--;
//        }
//        while (r<56){
//
//
//
//         System.out.println(r);
//            r+=3;
//        }
//
//        int f=22;
//        int d=33;
//        int c=4;
//        do{
//            System.out.println(f-45+23);
//            f--;
//        }
//        while (f>33);
//        do{
//            System.out.println(d);
//            f--;
//        }
//        while (d>44);
//
//        do{
//            System.out.println(c+222);
//            f--;
//        }
//        while (c>6);
//
//        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
//        int[] err=new int[]{33,55,66,77766,777};
//        String[] rrr=new String[]{"ffff","ffff","ggredf","fffff445"};
//        for(int i:arr){
//            System.out.println(i+1);
//        }
//        for(int l:err){
//            System.out.println(j);
//        }
//        for(String s:rrr){
//            System.out.println(s);
//        }
//
//
//        for (int i=0;i<9;i++){
//            if(i==5){
//                break;
//            }
//            System.out.println(i);
//        }
//
//        for (int i=6;i<12;i++){
//            if (i==9){
//                continue;
//            }
//            System.out.println(i);
//        }
//
//    }
//}


//public class Main {
//    public static void main(String[] args){
//                StringBuffer dd=new StringBuffer("Rembo");
//        StringBuffer ddd=new StringBuffer("Not emptly");
//        System.out.println(dd);
//        System.out.println(ddd);
//
//        StringBuffer dd1=new StringBuffer("Rembo");
//        StringBuffer wdd=new StringBuffer("Not emptly");
//        StringBuffer fff=new StringBuffer("ffff");
//        System.out.println(fff);
//        System.out.println(dd);
//        System.out.println(wdd);
//
//        dd.append(new Integer(222));
//        dd.append("  ertrtwtr");
//        dd.append(false);
//        dd.append('s');
//        dd.append("  ewewwe");
//        System.out.println(dd);
//
//        StringBuffer gg=new StringBuffer(" ffff");
//        gg.append(new Integer(222));
//        gg.append(new Double(44.55));
//        gg.append("  weddff");
//        gg.append('s');
//        gg.append(false);
//        gg.delete(1,6);
//        gg.deleteCharAt(4);
//        gg.replace(1,8,"  00000");
//        System.out.println(gg);
//
//
//     //   стрингбафер мнгопоточный синхронный метод
//        StringBuffer name=new StringBuffer("Aboba+123-3455");
//        name.deleteCharAt(1);
//        name.replace(2,5,"SSSSAAAA");
//        name.append("QQQQ");
//        name.delete(0,3);
//        System.out.println(name);
//
//      //  однопоточный способ
//        StringBuilder name1=new StringBuilder("Aboba+123-3455");
//        name.deleteCharAt(1);
//        name.replace(2,5,"SSSSAAAA");
//        name.append("QQQQ");
//        name.delete(0,3);
//        System.out.println(name1);
//
//    }
//}



//import java.util.regex.Pattern;
//
//public  class Main {
//    public static void main(String[] args){
//                String name="Aboba";
//
//        boolean result = Pattern.matches("Aboba123",name);
//        if(result){
//            System.out.println("Ok");
//        }
//        else {
//            System.out.println("GGGG");
//        }
//
//        String name1="Ivan";
//        boolean fact=Pattern.matches("dddd",name1);
//        if(fact){
//            System.out.println("Ok");
//        }
//        else{
//            System.out.println("fffff");
//        }
//
//        String bool="dolya123";
//        boolean fact1=Pattern.matches("dolya\\d+",bool);
//        if(fact1){
//            System.out.println("Ok");
//        }
//        else {
//            System.out.println("no");
//        }
//
//    }
//
//}



//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args){
//
//        int[]numbers=new int[5];
//        Scanner scanner=new Scanner(System.in);
//        for(int i=0;i<5;i++){
//            numbers[i]= scanner.nextInt();
//        }
//
//        for(int i:numbers){
//            System.out.println(i);
//        }
//
//
//
//    }
//}




//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Main{
//    public static void main(String[] args) {
//        String name = "Aboba 123 4456 77 7  dggfggg";
//        Pattern pattern = Pattern.compile("\\d+");
//        Matcher matcher = pattern.matcher(name);
//        String rez = matcher.replaceAll("****");
//        System.out.println(rez);
//
//        // Один шаблон на всё приложение
//        Pattern digitPattern = Pattern.compile("\\d+");
//
//       // Много строк —для каждой свой Matcher
//        Matcher m1 = digitPattern.matcher("abc123xyz");
//        Matcher m2 = digitPattern.matcher("no digits here");
//        Matcher m3 = digitPattern.matcher("100 and 200");
//
//        System.out.println(m1.replaceAll("*")); // abc*xyz
//        System.out.println(m2.replaceAll("*")); // no digits here
//        System.out.println(m3.replaceAll("*")); // * and *
//
//        String name1 = "Aboba 123 4456 77 7  dggfggg";
//        Pattern pattern1 = Pattern.compile("Aboba");
//        Matcher matcher1 = pattern.matcher(name);
//        String rez1 = matcher.replaceAll("****");
//        System.out.println(rez);
//
//        String input = "Hello, Java! Hello Javascript,JavaSe 8";
//        Pattern pattern2 = Pattern.compile("Java(\\w*)");
//        Matcher matcher2 = pattern.matcher(input);
//        while (matcher.find())
//            System.out.println(matcher.group());
//
//        String regex = "^(?:\\+7|8)[\\s\\-]?\\(?\\d{3}\\)?(?:[\\s\\-]?\\d){7}$";
//        Scanner scanner = new Scanner(System.in);
//        Pattern pattern3 = Pattern.compile(regex);
//        String phone = scanner.nextLine().trim();
//
//        Matcher matcher3 = pattern.matcher(phone);
//        if (matcher.matches()) {
//            System.out.println("Номер коректен");
//        } else {
//            System.out.println("Некоректный телефон");
//        }
//
//
//    }
//}

//
//import java.util.Scanner;
//
//public  class Main{
//    public static void main(String[] args){
//                int[][]num1=new int[3][3];
//        int value=1;
//        Scanner scanner=new Scanner(System.in);
//        for (int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                num1[i][j]=value;
//                value++;
//
//            }
//            System.out.println(num1[i][2-i]+"");
//            System.out.println();
//        }
//
//        int[][]num21={{1,2,3},{4,5,6},{7,8,9}};
//
//            for(int j=0;j<3;j++){
//                System.out.println(num21[j][2-j]);
//            }
//            System.out.println();
//
//    }
//}


//import java.util.Random;
//
//import static java.lang.Long.toBinaryString;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // 1. Проверка функции countDigits (количество разрядов)
//        int number = -9876;
//        int digits = countDigits(number);
//        System.out.println("Число: " + number + " → количество разрядов: " + digits);
//
//        // 2. Проверка функции fillRandom (заполнение массива случайными числами)
//        int[] arr = new int[10];
//        fillRandom(arr, 1, 50);  // числа от 1 до 50 включительно
//        System.out.print("Заполненный массив: ");
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
//
//        // 3. Проверка функций перевода в двоичное
//        int decimalNum = 32;
//        String builtInBinary = toBinaryString(decimalNum);
//        String manualBinary = toBinaryManual(decimalNum);
//
//        System.out.println(decimalNum + " в двоичном (через Integer): " + builtInBinary);
//        System.out.println(decimalNum + " в двоичном (вручную): " + manualBinary);
//    }
//
//    /**
//     * Считает количество разрядов (цифр) в числе.
//     * Работает и с отрицательными числами.
//     */
//    public static int countDigits(int number) {
//        if (number == 0) {
//            return 1;
//        }
//        number = Math.abs(number);  // убираем минус, чтобы не мешал
//        int count = 0;
//        while (number > 0) {
//            number /= 10;
//            count++;
//        }
//        return count;
//    }
//
//    /**
//     * Заполняет переданный массив случайными целыми числами в диапазоне [min, max].
//     */
//    public static void fillRandom(int[] array, int min, int max) {
//        Random random = new Random();
//        int range = max - min + 1;  // количество возможных значений
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = min + random.nextInt(range);
//        }
//    }
//
//    /**
//     * Переводит десятичное число в двоичную строку с помощью встроенного метода.
//     */
//    public static String toBinaryString(int number) {
//        return Integer.toBinaryString(number);
//    }
//
//    /**
//     * Перевод в двоичную строку «вручную» (алгоритм деления на 2).
//     * Работает только для неотрицательных чисел.
//     */
//    public static String toBinaryManual(int number) {
//        if (number == 0) {
//            return "0";
//        }
//        if (number < 0) {
//            throw new IllegalArgumentException("Функция toBinaryManual принимает только неотрицательные числа");
//        }
//
//        StringBuilder sb = new StringBuilder();
//        while (number > 0) {
//
//
//
//sb.append(number % 2);   // остаток от деления на 2
//            number /= 2;            // делим на 2
//        }
//        // Так как мы собирали цифры с конца, нужно развернуть строку
//        return sb.reverse().toString();
//    }
//}

//
//import java.util.Random;
//
//public  class Main{
//    public  static void main(String[] args){
//        //1Проверка функции на разрядность числа
//        int number=-23554;
//        int digits=countDigits(number);
//        System.out.println("Число: " + number + " -> количество разрядов: " + digits);
//    }
//
//    public  static int countDigits(int number){
//        if(number==0){
//            return 1;
//        }
//        number=Math.abs(number);
//        int count=0;
//        while (number>0){
//            number/=10;
//            count++;
//        }
//        return count;
//    }
//}

/*
import java.util.Random;

public  class Main{
    public static  void main(String[] args)
    {
       int chislo=-234523543;
        int fora=opFora(chislo);
        System.out.println("Число: " + chislo + " ращ: ->" + fora);
    }

    public  static int opFora(int chislo){
        if (chislo==0){
            return 1;
        }
        int chitaty=0;
        chislo=Math.abs(chislo);
        while (chislo>0){
            chislo/=4;
            chitaty++;

        }
        return chitaty;
    }
}
 */

/*
import java.util.Random;

public class Main{
    public static void main(String[] args){
        int[] arr=new int[12];
        fillRandom(arr,0,50);
        System.out.print("Заполненый массив");
        for(int value:arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public  static  void fillRandom(int[] array,int min,int max){
        Random random=new Random();
        int range=max-min+1;

        for (int i=0;i<array.length;i++){
            array[i]=min + random.nextInt(range);
        }
    }
}
*/

/*
import java.util.Random;

public class Main {
    public  static void main(String[] args){
        int[] arr=new int[21];
        soulHas(arr,1,34);
        System.out.print("Массив: ");
        for (int value:arr){
            System.out.print(value + (" "));
        }
        System.out.println();
    }

    public static void soulHas(int[] array,int min,int max){
        Random random=new Random();
        int range=max-min+1;

        for (int i=0;i<array.length;i++){
            array[i]=min+random.nextInt(range);00
        }

    }
}
*/

/*
import java.util.Random;

public class   Main {
    public static void main(String[] args) {
        int decemal = 234;
        String mashBinary = toBinaryString(decemal);
        String ruchBinary = toBinaryManual(decemal);

        System.out.println(decemal + "в двоичном (через Integer)" +mashBinary);
        System.out.println(decemal + "в двоичном (через Integer)"+ruchBinary);

    }

    public static String toBinaryString(int num) {

        return Integer.toBinaryString(num);
    }

    public static String toBinaryManual(int num) {
        if (num == 1) {
            return "0";
        }
        if (num < 0) {
            throw new IllegalArgumentException("нужно больше 0");
        }
        StringBuilder sd = new StringBuilder();
        while (num > 0) {
            sd.append(num % 2);
            num /= 2;
        }
        return sd.reverse().toString();

    }

}
 */

/*
import java.util.Random;

public class Main{
    public  static void main(String[] args){
        int num=123344;
        String mash=mashBinary(num);
        String ruc=rucBinary(num);

        System.out.println(num + "в двошчной системе"+ mash);
        System.out.println(num + "в двошчной системе"+ ruc);
    }

    public static String mashBinary(int dol){
        return Integer.toBinaryString(dol);
    }

    public  static String rucBinary(int dol){
        if (dol==0){
            return "0";
        }
        if(dol<0){
            throw new IllegalArgumentException("fffff");
        }

        StringBuilder sd=new StringBuilder();
        while (dol>0){


sd.append(dol%2);
            dol/=2;
        }
        return sd.reverse().toString();
    }
}

 */

//public class Main{
//    public static void main(String[] args){
//        int[] num=new int[3];
//        try{
//            num[6]=45;
//        }
//        catch (Exception ex){
//
//        }
//
//    }
//}


//public class Main {
//
//    // 1. Один int
//    static void show(int value) {
//        System.out.println("Получено int: " + value);
//    }
//
//    // 2. Два int
//    static void show(int a, int b) {
//        System.out.println("Получены два int: " + a + " и " + b);
//    }
//
//    // 3. Одна строка
//    static void show(String text) {
//        System.out.println("Получена строка: \"" + text + "\"");
//    }
//
//    public static void main(String[] args) {
//        show(42);                 // вызовет show(int)
//        show(10, 20);             // вызовет show(int, int)
//        show("Привет, Java!");     // вызовет show(String)
//    }
//}

//public class Main {
//
//    static void print(int x) {
//        System.out.println("Это int: " + x);
//    }
//
//    static void print(double x) {
//        System.out.println("Это double: " + x);
//    }
//
//    public static void main(String[] args) {
//        print(5);      // будет вызван print(int)
//        print(5.0);    // будет вызван print(double)
//        // print(5L);   // ошибка: нет метода для long — можно добавить отдельный
//    }
//}
//
//public class Main {
//
//    // Считаем сумму двух int и выводим
//    static int sum(int a, int b) {
//        int result = a + b;
//        System.out.println("sum(int, int): " + a + " + " + b + " = " + result);
//        return result;
//    }
//
//    // Считаем сумму трёх int и выводим
//    static int sum(int a, int b, int c) {
//        int result = a + b + c;
//        System.out.println("sum(int, int, int): " + a + " + " + b + " + " + c + " = " + result);
//        return result;
//    }
//
//    // Считаем среднее двух double и выводим
//    static double sum(double a, double b) {
//        double result = (a + b) / 2.0;
//        System.out.println("sum(double, double): среднее (" + a + ", " + b + ") = " + result);
//        return result;
//    }
//
//    public static void main(String[] args) {
//        sum(3, 5);
//        sum(1, 2, 3);
//        sum(2.5, 4.5);
//    }
//}


//public class Main{
//    public static void main(String[] args){
//
//        try{
//            Scanner in=new Scanner(System.in);
//            int x=in.nextInt();
//            if(x>=30){
//                throw new Exception("Число х должно быть меньше 30");
//            }
//
//        }
//        catch (Exception ex){
//            System.out.println(ex.getMessage());
//
//        }
//        System.out.println("Программа завершенна");
//
//    }
//}

//import java.util.Scanner;
//import java.util.InputMismatchException;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("=== Калькулятор с перегрузкой ===");
//
//        try {
//            System.out.print("Выберите тип: 1=int, 2=double: ");
//            int type = scanner.nextInt();
//
//            if (type == 1) {
//                System.out.print("Первое число (int): ");
//                int a = scanner.nextInt();
//                System.out.print("Второе число (int): ");
//                int b = scanner.nextInt();
//                String op = getOperator(scanner);
//                int result = calculate(a, b, op); // перегруженный метод для int
//                System.out.println("Результат (int): " + result);
//            } else if (type == 2) {
//                System.out.print("Первое число (double): ");
//                double a = scanner.nextDouble();
//                System.out.print("Второе число (double): ");
//                double b = scanner.nextDouble();
//                String op = getOperator(scanner);
//                double result = calculate(a, b, op); // перегруженный метод для double
//                System.out.printf("Результат (double): %.2f%n", result);
//            } else {
//                System.out.println("Неверный выбор типа.");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Ошибка ввода: ожидается число.");
//        } catch (ArithmeticException e) {
//            System.out.println("Арифметическая ошибка: " + e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println("Логическая ошибка: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Неожиданная ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//
//    // Перегрузка для int
//    private static int calculate(int a, int b, String op) {
//        return switch (op) {
//            case "+" -> a + b;
//            case "-" -> a - b;
//            case "*" -> a * b;
//            case "/" -> {
//                if (b == 0) throw new ArithmeticException("Деление на ноль (int)");
//                yield a / b;
//            }
//            default -> throw new IllegalArgumentException("Неизвестный оператор: " + op);
//        };
//    }
//
//    // Перегрузка для double
//    private static double calculate(double a, double b, String op) {
//        return switch (op) {
//            case "+" -> a + b;
//            case "-" -> a - b;
//            case "*" -> a * b;
//            case "/" -> {
//                if (b == 0.0) throw new ArithmeticException("Деление на ноль (double)");
//                yield a / b;
//            }
//            default -> throw new IllegalArgumentException("Неизвестный оператор: " + op);
//        };
//    }
//
//    private static String getOperator(Scanner s) {
//        System.out.print("Операция (+ - * /): ");
//        return s.next();
//    }
//}
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("=== Простой калькулятор ===");
//
//        try {
//            System.out.print("Введите первое число: ");
//            double a = scanner.nextDouble();
//
//            System.out.print("Введите второе число: ");
//            double b = scanner.nextDouble();
//
//            System.out.print("Введите операцию (+ - * /): ");
//            String op = scanner.next();
//
//            double result = calculate(a, b, op);
//            System.out.printf("Результат: %.2f%n", result);
//        } catch (InputMismatchException e) {
//            System.out.println("Ошибка: введено не число. Проверьте ввод.");
//        } catch (ArithmeticException e) {
//            System.out.println("Ошибка вычислений: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//
//    private static double calculate(double a, double b, String op) {
//        switch (op) {
//            case "+":
//                return a + b;
//            case "-":
//                return a - b;
//            case "*":
//                return a * b;
//            case "/":
//                if (b == 0) {
//                    throw new ArithmeticException("Деление на ноль");
//                }
//                return a / b;
//            default:
//                throw new IllegalArgumentException("Неверная операция: " + op);
//        }
//    }
//}
//
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("=== Калькулятор по строке (формат: число оператор число) ===");
//        System.out.print("Введите выражение (например, 3 + 5): ");
//
//        String line = scanner.nextLine().trim();
//
//        try {
//            double result = evaluateExpression(line);
//            System.out.printf("Результат: %.2f%n", result);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Ошибка формата: " + e.getMessage());
//        } catch (ArithmeticException e) {
//            System.out.println("Арифметическая ошибка: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Ошибка обработки: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//
//    private static double evaluateExpression(String expr) {
//        // Регулярка: число (с точкой или без), пробел, оператор, пробел, число
//        Pattern pattern = Pattern.compile("^(-?\\d+(\\.\\d+)?)\\s*([+\\-*/])\\s*(-?\\d+(\\.\\d+)?)$");
//        Matcher matcher = pattern.matcher(expr);
//
//        if (!matcher.matches()) {
//            throw new IllegalArgumentException("Неверный формат выражения. Пример: 3.5 * 2");
//        }
//
//        double a = Double.parseDouble(matcher.group(1));
//        double b = Double.parseDouble(matcher.group(4));
//        String op = matcher.group(3);
//
//        return switch (op) {
//            case "+" -> a + b;
//            case "-" -> a - b;
//            case "*" -> a * b;
//            case "/" -> {
//                if (b == 0.0) throw new ArithmeticException("Деление на ноль");
//                yield a / b;
//            }
//            default -> throw new IllegalArgumentException("Недопустимый оператор: " + op);
//        };
//    }
//}


//public class Main{
//    enum TrafficLiteColor{
//        RED,
//        YELLOW,
//        GREEN
//    }
//
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        String input=scanner.nextLine();
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
//        }
//        TrafficLiteColor trafficLiteColor1=TrafficLiteColor.RED;
//        System.out.println(trafficLiteColor1.ordinal());
//        for (TrafficLiteColor color:TrafficLiteColor.values()){
//            System.out.println(color);
//        }
//    }
//}

//public class Main{
//    enum TrafficLiteColor{
//        RED("Стоп",3),
//        YELLOW("Внимание",34),
//        GREEN("Можно ехать",45);
//        private String message;
//        private int second;
//
//
//
//        TrafficLiteColor(String message,int second){
//            this.message=message;
//            this.second=second;
//        }
//        public  void changeColor(){
//            System.out.println(this.message);
//            System.out.println("Секунд: " + this.second);
//        }
//    }
//
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        String input=scanner.nextLine();
//        TrafficLiteColor trafficLiteColor=TrafficLiteColor.valueOf(input.toUpperCase());
//        switch (trafficLiteColor){
//            case RED:
//                trafficLiteColor.changeColor();
//
//                break;
//            case YELLOW:
//                trafficLiteColor.changeColor();
//
//                break;
//            case GREEN:
//                trafficLiteColor.changeColor();
//
//                break;
//        }
//        TrafficLiteColor trafficLiteColor1=TrafficLiteColor.RED;
//        System.out.println(trafficLiteColor1.ordinal());
//        for (TrafficLiteColor color:TrafficLiteColor.values()){
//            System.out.println(color);
//        }
//    }
//}

//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//public class Main {
//    enum TrafficLightColor {
//        RED("Стоп",30),
//        YELLOW("Внимание",5),
//        GREEN("Можно ехать",25);
//        String message;
//        int seconds;
//        TrafficLightColor(String message, int seconds) {
//            this.message = message;
//            this.seconds = seconds;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        TrafficLightColor trafficLightColor = TrafficLightColor.valueOf(input.toUpperCase());
//        switch (trafficLightColor) {
//            case RED:
//                System.out.println(trafficLightColor.message);
//                System.out.println("Секунд: "+trafficLightColor.seconds);
//                break;
//            case YELLOW:
//                System.out.println(trafficLightColor.message);
//                System.out.println("Секунд: "+trafficLightColor.seconds);
//                break;
//            case GREEN:
//                System.out.println(trafficLightColor.message);
//                System.out.println("Секунд: "+trafficLightColor.seconds);
//                break;
//
//        }
////        TrafficLightColor trafficLightColor = TrafficLightColor.RED;
////        System.out.println(trafficLightColor.ordinal());
////        for (TrafficLightColor color : TrafficLightColor.values()) {
////            System.out.println(color);
////        }
//    }
//}

//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//public class Main {
//    enum TrafficLightColor {
//        RED{
//            @Override
//            public void action(){
//                System.out.println("Стоять");
//            }
//        },
//        YELLOW{
//            @Override
//            public void action(){
//                System.out.println("Внимание");
//            }
//        },
//        GREEN
//                {
//                    @Override
//                    public void action(){
//                        System.out.println("Можно ехать");
//                    }
//                };
//        public abstract void action();
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        TrafficLightColor trafficLightColor = TrafficLightColor.valueOf(input.toUpperCase());
//        switch (trafficLightColor) {
//            case RED:
//                trafficLightColor.action();
//                break;
//            case YELLOW:
//                trafficLightColor.action();
//                break;
//            case GREEN:
//                trafficLightColor.action();
//                break;
//
//        }
////        TrafficLightColor trafficLightColor = TrafficLightColor.RED;
////        System.out.println(trafficLightColor.ordinal());
////        for (TrafficLightColor color : TrafficLightColor.values()) {
////            System.out.println(color);
////        }
//    }
//}



//import java.util.Scanner;
//
//public class Main {
//    enum TrafficLightColor {
//        RED {
//            @Override
//            public void action() {
//                System.out.println("Стоять");
//            }
//        },
//        YELLOW {
//            @Override
//            public void action() {
//                System.out.println("Внимание");
//            }
//        },
//        GREEN {
//            @Override
//            public void action() {
//                System.out.println("Можно ехать");
//            }
//        };
//
//        public abstract void action();
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine().trim();
//
//        try {
//            TrafficLightColor trafficLightColor = TrafficLightColor.valueOf(input.toUpperCase());
//            trafficLightColor.action();  // вызываем нужный метод прямо через экземпляр
//        } catch (IllegalArgumentException e) {
//            System.out.println("Неверный цвет. Допустимые значения: RED, YELLOW, GREEN");
//        }
//
//        scanner.close();
//    }
//}


//import java.util.Scanner;
//
//public class Main {
//    enum TimeYears {
//        WINTER {
//            @Override
//            public void action() {
//                System.out.println("Холодно");
//            }
//        },
//        SPRING {
//            @Override
//            public void action() {
//                System.out.println("Нормально");
//            }
//        },
//        SUMMER {
//            @Override
//            public void action() {
//                System.out.println("Жарко");
//            }
//        },
//        OTHEM {
//            @Override
//            public void action() {
//                System.out.println("Прохладно");
//            }
//        };
//
//
//        public abstract void action();
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine().trim();
//
//        try {
//            TimeYears timeYears = TimeYears.valueOf(input.toUpperCase());
//            timeYears.action();  // вызываем нужный метод прямо через экземпляр
//        } catch (IllegalArgumentException e) {
//            System.out.println("Неверное время года. Допустимые значения: WINTER,VESNA,SUMMER,OTHEM");
//        }
//
//        scanner.close();
//    }
//}

//
//public class Main{
//    enum Difficulty{
//        EASY(5),
//        NORMAL(3),
//        HARD(1);
//
//        private int live;
//
//
//
//        Difficulty(int live){
//
//            this.live=live;
//        }
//        public  void changeLive(){
//
//            System.out.println("Жизнь: " + this.live);
//        }
//    }
//
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        String input=scanner.nextLine();
//        Difficulty difficulty=Difficulty.valueOf(input.toUpperCase());
//        switch (difficulty){
//            case EASY:
//                difficulty.changeLive();
//
//                break;
//            case NORMAL:
//                difficulty.changeLive();
//
//                break;
//            case HARD:
//                difficulty.changeLive();
//
//                break;
//        }
//        Difficulty difficulty1=Difficulty.EASY;
//        System.out.println(difficulty1.ordinal());
//        for (Difficulty live:Difficulty.values()){
//            System.out.println(live);
//        }
//    }
//}


//public class Main{
//    public static void main(String[] args) throws IOException{
//        FileWriter fileWriter=new FileWriter("test.txt");
//        fileWriter.write("Hello world");
//        fileWriter.write("\n");
//        fileWriter.write("Aboba");
//        fileWriter.close();
//        FileReader fileReader=new FileReader("test.txt");
//        int symbol;
//        while ((symbol=fileReader.read()) !=-1){
//            System.out.print((char) symbol);
//        }
//
//        fileReader.close();
//    }
//
//}

//public class Main{
//    public static void main(String[] args) throws IOException{
//        FileReader fileReader=new FileReader("test.txt");
//        Scanner scanner=new Scanner(fileReader);
//        while (scanner.hasNextLine()){
//            String line=scanner.nextLine();
//            System.out.println(line);
//        }
//        scanner.close();
//    }
//}

//6
//public class Main{
//    public static void main(String[] args) throws IOException{
//
//        Person person=new Person("Aboba",45);
//        Person person1=new Person("Ivan",55);
//        person.setAge(22);
//        person1.setAge(101);
//
//        int age=person.getAge();
//        int age1=person1.getAge();
//        System.out.println(age);
//        System.out.println(age1);
//        Person.info();
////
////        person.displayInfo();
////        person.displayInfo();
//    }
//}

//6
//public class Main{
//    public Main() {
//    }
//
//    public static void main(String[] args) throws IOException{
//        Student student=new Student(" Aboba ",45," A1 ");
//        student.info2();
//        Person person=new Person("qwery",56);
//        person.info2();
//
//    }
//}

//7
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        List<Animal> zoo = new ArrayList<>();
//
//        zoo.add(new Dog("кость", "будка"));
//        zoo.add(new Cat("молоко", "диван"));
//        zoo.add(new Bird("зерно", "клетка"));
//
//        System.out.println("--- Начинаем представление зоопарка ---\n");
//
//        for (Animal animal : zoo) {
//            String name = animal.getClass().getSimpleName();
//            System.out.println("=== Это " + name + " ===");
//
//            animal.makeSound();
//            animal.eat();
//            animal.sleep();
//
//            System.out.println();
//        }
//    }
//}

//8
//public class Main {
//    public static void main(String[] args) {
//        Dog dog = new Dog("Бобик", 3, "Овчарка");
//        dog.info();                 // вызовет переопределённую версию из Dog
//
//        Animal animal = new Animal("Неизвестный зверь", 5);
//        animal.info();               // вызовет версию из Animal
//
//        // Полиморфизм: ссылка типа Animal, но объект Dog
//        Animal poly = new Dog("Рекс", 4, "Лабрадор");
//        poly.info();                // всё равно вызовет версию из Dog
//    }
//}

//9
//public class Main{
//    public Main() {
//    }
//
//    public static void main(String[] args) throws IOException{
//        Dog dog=new Dog("Myaso","Budka");
//        dog.dog();
//        dog.eat();
//        dog.sleep();
//        dog.makeNoise();
//
//        Cat cat=new Cat("Pedygry","Divan");
//        cat.cat();
//        cat.eat();
//        cat.sleep();
//        cat.makeNoise();
//
//        Bird bird=new Bird("Zerno","Gnezdo");
//        bird.bird();
//        bird.eat();
//        bird.sleep();
//        bird.makeNoise();
//
//    }
//}

//10
//// Main.java — демонстрация взаимодействия
//public class Main {
//    public static void main(String[] args) {
//        // Создаём клиента
//        Client client = new Client("Alice", 1000.0, "1111-2222-3333-4444", 500.0);
//        Administrator admin = new Administrator("AdminSuper");
//
//        // Заказ
//        Order order = new Order("ORD-001", 400.0);
//
//        // 1. Оплата заказа
//        client.payOrder(order);
//
//        // 2. Перевод на другой счёт
//        Account otherAccount = new Account(0.0);
//        client.transferTo(otherAccount, 200.0);
//
//        // 3. Попытка платежа, превышающего лимит карты
//        double bigPayment = 600.0;
//        System.out.println("Попытка платежа " + bigPayment + " (превышает лимит карты).");
//        boolean success = client.getCreditCard().pay(bigPayment);
//        if (!success) {
//            System.out.println("Платёж отклонён из-за превышения лимита.");
//            // Администратор принудительно блокирует карту
//            admin.blockCardForExcess(client.getCreditCard(), bigPayment);
//        }
//
//        // 4. Клиент пытается заблокировать карту сам (если не заблокирована администратором)
//        if (!client.getCreditCard().isBlocked()) {
//            client.blockCard();
//        }
//
//        // 5. Аннулирование счёта
//        client.cancelAccount();
//
//        // Проверка финальных состояний
//        System.out.println("\nФинальные состояния:");
//        System.out.println("Счёт клиента активен: " + client.getAccount().isActive());
//        System.out.println("Карта клиента заблокирована: " + client.getCreditCard().isBlocked());
//        System.out.println("Баланс счёта клиента: " + client.getAccount().getBalance());
//    }
//}


////11 Main.java — демонстрация взаимодействия
//public class Main {
//    public static void main(String[] args) {
//        // Создаём клиента
//        Clienty clienty = new Clienty("Alice", 1000.0, "1111-2222-3333-4444", 500.0);
//        Administratory adminy = new Administratory("AdminSuper");
//
//        // Заказ
//        Ordery ordery = new Ordery("ORD-001", 400.0);
//
//        // 1. Оплата заказа
//        clienty.oplatityPokupku(ordery);
//
//        // 2. Перевод на другой счёт
//        Accounty otherAccounty = new Accounty(0.0);
//        clienty.perevod(otherAccounty, 200.0);
//
//        // 3. Попытка платежа, превышающего лимит карты
//        double bigPaymenty = 600.0;
//        System.out.println("Попытка платежа " + bigPaymenty + " (превышает лимит карты).");
//        boolean successy = clienty.getCreditCardy().platity(bigPaymenty);
//        if (!successy) {
//            System.out.println("Платёж отклонён из-за превышения лимита.");
//            // Администратор принудительно блокирует карту
//            adminy.zacrityCartu(clienty.getCreditCardy(), bigPaymenty);
//        }
//
//        // 4. Клиент пытается заблокировать карту сам (если не заблокирована администратором)
//        if (!clienty.getCreditCardy().isZacrity()) {
//            clienty.zacrityCarty();
//        }
//
//        // 5. Аннулирование счёта
//        clienty.zacrityAccounty();
//
//        // Проверка финальных состояний
//        System.out.println("\nФинальные состояния:");
//        System.out.println("Счёт клиента активен: " + clienty.getAccounty().isActive());
//        System.out.println("Карта клиента заблокирована: " + clienty.getCreditCardy().isZacrity());
//        System.out.println("Баланс счёта клиента: " + clienty.getAccounty().getOstatokDeneg());
//    }
//}


//12
//public class Main {
//    public static void main(String[] args) {
//        Student s1 = new Student("Анна", 20, "IT-23", 92.5);
//        Student s2 = new Student("Борис", 21, "IT-23", 85.0);
//        Student s3 = new Student("Виктор", 19, "IT-24", 73.0);
//        Student s4 = new Student("Галина", 22, "IT-24", 58.0);
//
//        Teacher t1 = new Teacher("Дмитрий", 45, "Java", 12);
//        Teacher t2 = new Teacher("Елена", 38, "Базы данных", 4);
//        Teacher t3 = new Teacher("Фёдор", 50, "Алгоритмы", 25);
//
//        Person[] people = {s1, s2, s3, s4, t1, t2, t3};
//
//        System.out.println("=== Учёт людей в учебном центре ===\n");
//        for (Person p : people) {
//            p.printInfo();
//        }
//
//        int studentsWithGrade75Plus = 0;
//        int experiencedTeachers = 0;
//
//        for (Person p : people) {
//            if (p instanceof Student) {
//                Student student = (Student) p;
//                if (student.getAverageGrade() >= 75) {
//                    studentsWithGrade75Plus++;
//                }
//            } else if (p instanceof Teacher) {
//                Teacher teacher = (Teacher) p;
//                if (teacher.isExperienced()) {
//                    experiencedTeachers++;
//                }
//            }
//        }
//
//        System.out.println("\n=== Статистика ===");
//        System.out.println("Студентов со средним баллом не ниже 75: " + studentsWithGrade75Plus);
//        System.out.println("Преподавателей со стажем не менее 5 лет: " + experiencedTeachers);
//    }
//}

//interface описывает только поведение.У него нет состояния.
//13
//public class Main {
//    public static void main(String[] args) {
//    IAboba printable=new Student("Aboba");
//    String student=((Student)printable).getGroup();
//        System.out.println(student);
//    }
//}

//14
//public class Main {
//    public static void main(String[] args) {
//     Shpo shop=new Shpo();
//     IPayvent card=new CardPayment();
//     shop.chekout(card,5000);
//     IPayvent cash=new CashPayment();
//     shop.chekout(cash,1333);
//     IPayvent sbp=new SbpPayment();
//     shop.chekout(sbp,4566);
//     IPayvent cripto=new CriptoPayment();
//     shop.chekout(cripto,455566);
//
//    }
//}


//15
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Botton botton=new Botton(new BottonClickHandler());
//            botton.click();
//        SaveHandler saveHandler=new SaveHandler();
//        saveHandler.execute();
//
//
//    }
//}


//16
//public class Main {
//    public static void main(String[] args) throws IOException{
//        Box<Integer> box = new Box<>();
//        box.setValue(55);
//        System.out.println("Box<Integer>: " + box.getValue());
//
//        Box<String> box1 = new Box<>();
//        box1.setValue("flag");
//        System.out.println("Box<String>: " + box1.getValue());
//
//        Box<Double> box2 = new Box<>();
//        box2.setValue(55.44);
//        System.out.println("Box<Double>: " + box2.getValue());
//    }
//}

//17
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        Box<Integer, String> box = new Box<>(55, "Aboba");
//        printAboba(box);          // выведет Box{key=55, value='Aboba'}
//        printAboba(5);            // выведет 5
//        printAboba("qwerty");     // выведет qwerty
//    }
//
//    public static <T> void printAboba(T item) {
//        System.out.println("printAboba: " + item);
//    }
//}

////18
//public  class Main {
//    public static void main(String[] args){
//        Cart<Product> cart=new Cart<>();
//
//        cart.addItem(new Book("Джава для начинающих",556.66));
//        cart.addItem(new Food("Хлеб",566.34));
//        cart.addItem(new Phone("Дуги",78555.46));
//        cart.addItem(new Book("Питон для начинающих",7886.5));
//        cart.addItem(new Food("Кортошка",556.66));
//
//        cart.printAllitems();
//
//        double total=cart.calculateTotal();
//        System.out.printf("Общая стоимость: %.2f руб.%n",total);
//    }
//}


//19
//public  class Main {
//    public  static void main(String[] args){
//        Team<Attackable> team =new Team<>();
//
//        team.addMember(new Warrior("Торн"));
//        team.addMember(new Mage("Эльмира"));
//        team.addMember(new Archer("Лира"));
//        team.addMember(new Warrior("Грим"));
//        team.addMember(new Mage("Заяц"));
//        team.addMember(new Archer("Волк"));
//
//
//        //Все участники атакуют по очереди
//        team.performAttack();
//
//    }
////}
//
//public class Main{
//    public static void main(String[] args){
//        String input="Привет мир,как прекрасно жить на земле.";
//
//        //Получаем набор уникальных букв(без пробелов и учета регистра)
//        Set<Character> letters =new HashSet<>();
//        for (char c: input.toCharArray()){
//            if(!Character.isWhitespace(c)){
//                letters.add(Character.toLowerCase(c));
//            }
//        }
//        if(letters.isEmpty()){
//            System.out.println("В строке нет букв.");
//            return;
//        }
//        List<Character> letterList= new ArrayList<>(letters);
//        Random random=new Random();
//
//        int wordsCount=5; //сколько слов сгенерировать
//
//        System.out.println("Исходная строка :  \""+ input + "\"");
//        System.out.println("Доступные буквы: " + letterList);
//        System.out.println("Сгенерированые слова: ");
//
//        for (int i=0;i<wordsCount;i++){
//            String word=generateWord(letterList,random);
//            System.out.println((i+1) + ": " + word);
//        }
//    }
//
//    //Генерирует слово случайной длины (от 2 до 8 букв) из заданого набора букв
//    private static String generateWord(List<Character> letters, Random random) {
//        int lenght = random.nextInt(7) + 2;//длина от 2 до 8
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<lenght;i++){
//            char c=letters.get(random.nextInt(letters.size()));
//            sb.append(c);
//        }
//        return sb.toString();
//    }
//}


//
//class User{
//    private String name;
//    private String role;
//
//    public String getName() {
//        return name;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public User(String name, String role) {
//        this.name = name;
//        this.role = role;
//    }
//}
//public class Main{
//    public static void main(String[] args){
//        task1_HashSet();
//        task2_LinkedHashSet();
//        task3_TreeSet();
//
//    }
//
//    private static void task1_HashSet() {
//        String input = "Програмирование";
//        Set<Character> uniqueLetters = new HashSet<>();
//        for (char c : input.toCharArray()) {
//            if (!Character.isWhitespace(c)) {
//                uniqueLetters.add(Character.toLowerCase(c));
//            }
//        }
//        System.out.println("=== Задача 1: HashSet ===");
//        System.out.println("Исходная: " + input);
//        System.out.println("HashSet: " + uniqueLetters);
//    }
//
//    private static void task2_LinkedHashSet(){
//        List<User> users =List.of(
//                new User("Alice","admin"),
//                new User("Bob","user"),
//                new User("Alex","user"),
//                new User("Sergey","admin"),
//                new User("Dmitriy","user"),
//                new User("Roman","superadmin")
//        );
//        Set<String> roleOrdered= new LinkedHashSet<>();
//        for (User u: users){
//            roleOrdered.add(u.getRole());
//            roleOrdered.add(u.getName());
//        }
//        System.out.println("\n=== Задача 2: LinkedHashSet ===");
//        System.out.println("Роли по порядку появления: admin,user,user,admin,user,superadmin");
//        System.out.println("LinkedHashSet: " + roleOrdered);
//    }
//
//    private static void task3_TreeSet(){
//        List<String> productRaw=List.of("ябдлоко","банан","яблоко","апельсин","банан","апельсин");
//        Set<String> sortedUniqueProducts=new TreeSet<>(productRaw);
//        System.out.println("\n=== Задача 3: TreeSet ===");
//        System.out.println("Сырой список: " + productRaw);
//        System.out.println("TreeSet(отсортировано): " + sortedUniqueProducts);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите слово: ");
//        String input = scanner.nextLine();
//
//        //^- начало строки
//        //[A-Za-z] - первый символ:английская буква или_
//        //[A-Za-z0-9_]* - остальные символы ( 0 и более): буквы, цифры,_
//        //$-конец строки
//
//        String regex="^[A-Za-z_][A-Za-z0-9_]*$";
//
//        boolean isValidIndentifier=input.matches(regex);
//
//        System.out.println("Введено: \"" + input+ "\"");
//        if (isValidIndentifier){
//            System.out.println("Это корректный индификатор.");
//        }else {
//            System.out.println("Это не корректный идификатор.");
//        }
//
//    }
//}

//
//public class Main {
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Введите слово: ");
//        String input=scanner.nextLine();
//
//        if (input.isEmpty()){
//            System.out.println("Пустая строка не является индификатором.");
//            return;
//        }
//
//        char first =input.charAt(0);
//        //Первый символ:английская буква или "_"
//        if(!((first>='A' && first<='Z') ||
//                (first>='a' && first<='z')||
//                first=='_')){
//            System.out.println("Некоректный первый символ");
//            System.out.println("Это не корректный индификатор.");
//            return;
//        }
//        //Проверка остальных символов
//        for (int i=1;i<input.length();i++){
//            char c = input.charAt(i);
//            if(!((c>='A' && c<='Z') ||
//                    (c>='a' && c<='z')||
//                    c=='_')){
//                System.out.println("Недопустимый символ: '" + c + "' на позиции " + i);
//                System.out.println("Это не корректный индификаторю");
//                return;
//            }
//        }
//        System.out.println("Введено: \"" + input + "\"");
//        System.out.println("Это корректный индификатор.");
//    }
//
//}

//public class Main {
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Введите слово: ");
//        String input=scanner.nextLine();
//
//        System.out.println("Введено: \"" + input + "\"");
//        if(isValidIndentifier(input)){
//            System.out.println("Это корректный индификатор.");
//        }
//        else {
//            System.out.println("Это не корректный индификатор.");
//        }
//    }
//    public static boolean isValidIndentifier(String s){
//        if (s==null || s.isEmpty()){
//            return false;
//        }
//        char first=s.charAt(0);
//        if (!isFirstCharValid(first)){
//            return false;
//        }
//        for (int i =1;i<s.length();i++){
//            if (!isSubseqentCharValid(s.charAt(i))){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private static boolean isFirstCharValid(char c){
//        return (c>='A' && c<='Z') || (c>='a' && c<='z')||
//                 c=='_';
//    }
//
//    private static boolean isSubseqentCharValid(char c){
//        return (c>='A' && c<='Z') || (c>='a' && c<='z')||
//                (c>='0' && c<='9') || c=='_';
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        // Исходная строка для всех примеров
//        String text = "HelloWorld2025";
//
//        System.out.println("=== Исходная строка: \"" + text + "\" ===");
//
//        // 1. length() — длина строки
//        int len = text.length();
//        System.out.println("1. text.length() = " + len); // Ожидается: 14
//
//        // 2. charAt(i) — символ по индексу
//        char secondChar = text.charAt(1);
//        System.out.println("2. text.charAt(1) = '" + secondChar + "'"); // Ожидается: 'e'
//
//        // 3. substring(i) — подстрока от i до конца
//        String subFromIndex = text.substring(5);
//        System.out.println("3. text.substring(5) = \"" + subFromIndex + "\""); // Ожидается: "World2025"
//
//        // 4. substring(i, j) — подстрока от i до j-1
//        String subRange = text.substring(0, 5);
//        System.out.println("4. text.substring(0, 5) = \"" + subRange + "\""); // Ожидается: "Hello"
//
//        // 5. indexOf(str) — индекс первого вхождения
//        int indexOfWorld = text.indexOf("World");
//        System.out.println("5. text.indexOf(\"World\") = " + indexOfWorld); // Ожидается: 5
//
//        // Проверка, если подстроки нет (вернёт -1)
//        int indexOfMissing = text.indexOf("Java");
//        System.out.println("   text.indexOf(\"Java\") = " + indexOfMissing); // Ожидается: -1
//
//        // 6. startsWith(prefix) — начинается ли с префикса
//        boolean startsWithHello = text.startsWith("Hello");
//        System.out.println("6. text.startsWith(\"Hello\") = " + startsWithHello); // Ожидается: true
//
//        boolean startsWithJava = text.startsWith("Java");
//        System.out.println("   text.startsWith(\"Java\") = " + startsWithJava); // Ожидается: false
//
//        // 7. endsWith(suffix) — заканчивается ли суффиксом
//        boolean endsWith2025 = text.endsWith("2025");
//        System.out.println("7. text.endsWith(\"2025\") = " + endsWith2025); // Ожидается: true
//
//        boolean endsWithTxt = text.endsWith(".txt");
//        System.out.println("   text.endsWith(\".txt\") = " + endsWithTxt); // Ожидается: false
//
//        // 8. contains(str) — содержит ли подстроку
//        boolean hasWorld = text.contains("World");
//        System.out.println("8. text.contains(\"World\") = " + hasWorld); // Ожидается: true
//
//        boolean hasJava = text.contains("Java");
//        System.out.println("   text.contains(\"Java\") = " + hasJava); // Ожидается: false
//    }
//}

//
//public class Main {
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//
//        System.out.print("Введите строку: ");
//        String input= scanner.nextLine();
//
//        //1.Удаляем все пробелы из строки
//        //replaceAll принимает регулярное выражени.\\s
//        String noSpases=input.replaceAll("\\s+","");
//
//        //Для проверки палиндрома удобно привести строку к одному регистру
//        //чтобы "А" и"а" считались одинаковыми.Если нужна строгая проверка
//        String normalized=noSpases.toLowerCase();
//
//        //2.Проверяем является ли строка палиндромом
//        boolean isPalindrome=checkPalindrome(normalized);
//
//        if(isPalindrome){
//            System.out.println("Да это палиндром(после удаления пробелов): \"" + noSpases + "\"");
//        }
//        else {
//            System.out.println("Нет это не палиндром: \"" + noSpases + "\"");
//        }
//        scanner.close();
//    }
//
//    /**
//     * Метод проверки на палиндром.
//     * Сравниваем символы с начала и конца, двигаясь на встречу друг другу
//     */
//
//    private static boolean checkPalindrome(String str){
//        int left=0;
//        int right=str.length()-1;
//
//        while (left<right){
//            if(str.charAt(left)!=str.charAt(right)){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}

//20
//public class Main {
//    public static void main(String[] args){
//        PizzaSize selectedSize=PizzaSize.LARGE;
//
//        System.out.println("Размер: " + selectedSize.name());
//        System.out.println("Диаметр: " + selectedSize.getDiametrSm());
//        System.out.println("Цена: " + selectedSize.getPriceRub());
//    }
//}

////21
//public class Main {
//    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Введите день недели (MONDAY-SUNDAY):");
//        String input= scanner.nextLine().trim().toUpperCase();
//
//        try{
//            Day day=Day.valueOf(input);
//            if(day.isWeekend()){
//                System.out.println("Выходной");
//            }
//            else {
//                System.out.println("Рабочий день");
//            }
//        }catch (IllegalArgumentException e){
//            System.out.println("Некорректное название дня");
//        }finally {
//            scanner.close();
//        }
//    }
//}