//7
//class Dog extends Animal {
//    public Dog(String food, String location) {
//        super(food, location);
//    }
//
//    @Override
//    public void makeSound() {
//        System.out.println("Собака лает: Гав-гав!");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Собака грызёт: " + getFood());
//    }
//}


//8
//public class Dog extends Animal {
//    private String breed;
//
//    public Dog(String name, int age, String breed) {
//        super(name, age);          // передаём имя и возраст в родителя
//        this.breed = breed;        // своё поле
//    }
//
//    public String getBreed() {
//        return breed;
//    }
//
//    public void setBreed(String breed) {
//        this.breed = breed;
//    }
//
//    @Override
//    public void info() {
//        // Можно вызвать родительскую версию, если нужно
//        // super.info();
//        System.out.println("Это собака: " + getName() + ", возраст: " + getAge()
//                + ", порода: " + breed);
//    }
//}

//9
public class Dog extends Animal {


    public Dog(String food,  String location) {
        super(food, location);
    }


    public void dog() {
        System.out.println("Собака");
    }

    @Override
    public void eat(){
        System.out.println("Собака ест: " + getFood());
    }
    @Override
    public void sleep(){
        System.out.println("Собака спит в : " + getLocation());
    }
    @Override
    public void makeNoise(){
        System.out.println("Собака издает звук:Гав ");
    }
}
