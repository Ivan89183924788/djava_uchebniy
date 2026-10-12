//7
//class Cat extends Animal {
//    public Cat(String food, String location) {
//        super(food, location);
//    }
//
//    @Override
//    public void makeSound() {
//        System.out.println("Кошка мяукает: Мяу-мяу!");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Кошка лакает: " + getFood());
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Кошка сладко спит клубочком в " + getLocation());
//    }
//}

//9
public class Cat extends Animal {


    public Cat(String food,  String location) {
        super(food, location);
    }


    public void cat() {
        System.out.println("Кошка");
    }

    @Override
    public void eat(){
        System.out.println("Кошка ест: " + getFood());
    }
    @Override
    public void sleep(){
        System.out.println("Кошка спит в : " + getLocation());
    }
    @Override
    public void makeNoise(){
        System.out.println("Кошка издает звук:Мяу ");
    }
}