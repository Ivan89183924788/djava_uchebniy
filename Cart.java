//18
//import java.util.ArrayList;
//import java.util.List;
//
//public class Cart<T extends Product>{
//    private final List<T> items;
//
//    public Cart(){
//        items=new ArrayList<>();
//    }
//
//    public void addItem(T product){
//        items.add(product);
//        System.out.println("Добавлен: " + product.getName());
//    }
//
//    public  void  printAllitems(){
//        if(items.isEmpty()){
//            System.out.println("Корзина пуста.");
//            return;
//        }
//        System.out.println("--- Товары в корзине ---");
//        for  (T item:items){
//            System.out.println(item);
//        }
//        System.out.println("---------------");
//    }
//
//    public double calculateTotal(){
//        double total=0.0;
//        for (T item:items){
//            total+=item.getPrice();
//
//        }
//        return total;
//    }
//}
