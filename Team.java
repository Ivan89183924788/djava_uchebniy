////19
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class Team<T extends Attackable> {
//    private  final List<T> members;
//
//    public  Team(){
//        members=new ArrayList<>();
//    }
//    public void addMember(T member){
//        members.add(member);
//        System.out.println("В команду добавлен: " + member.getClass().getSimpleName());
//
//    }
//
//    public  void performAttack(){
//        if(members.isEmpty()){
//            System.out.println("Команда пуста - некому аттаковать.");
//            return;
//        }
//        System.out.println("=== Команда атакует! ===");
//        for(T member:members){
//            member.attack();
//        }
//        System.out.println("==================");
//    }
//}
