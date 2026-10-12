//7
//abstract class Animal {
//    private String food;
//    private String location;
//
//    public Animal(String food, String location) {
//        this.food = food;
//        this.location = location;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public String getFood() {
//        return food;
//    }
//
//    public void setFood(String food) {
//        this.food = food;
//    }
//
//    // Абстрактные методы — каждый зверь обязан их реализовать
//    public abstract void makeSound();
//    public abstract void eat();
//
//    // sleep можно оставить с общей реализацией
//    public void sleep() {
//        System.out.println(this.getClass().getSimpleName() + " спит в " + location);
//    }
//}

//8
//public class Animal {
//    private String name;
//    private int age;
//
//    public Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    // Базовый вариант метода (как info2 в твоем примере)
//    public void info() {
//        System.out.println("Это животное: " + name + ", возраст: " + age);
//    }
//}


//9
public class Animal {
    private String location;
    private String food;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String name) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location=location;


    }


    public void eat() {
        System.out.println("это животное ест");
    }
     public void sleep() {
        System.out.println("это животное спит");
    }
     public void makeNoise() {
        System.out.println("это животное издает звук");
    }
}
