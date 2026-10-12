//7
//class Bird extends Animal {
//    public Bird(String food, String location) {
//        super(food, location);
//    }
//
//    @Override
//    public void makeSound() {
//        System.out.println("Птица поёт: Чик-чирик!");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("Птица клюёт: " + getFood());
//    }
//}

//9
public class Bird extends Animal {


    public Bird(String food,  String location) {
        super(food, location);
    }


    public void bird() {
        System.out.println("Птица");
    }

    @Override
    public void eat(){
        System.out.println("Птица ест: " + getFood());
    }
    @Override
    public void sleep(){
        System.out.println("Птица спит в : " + getLocation());
    }
    @Override
    public void makeNoise(){
        System.out.println("Птица издает звук:кукареку ");
    }
}