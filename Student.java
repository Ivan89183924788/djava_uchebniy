////6
//public class Student extends Person {
//    private String group;
//
//    public Student(String name, int age, String group) {
//        super(name, age);
//        this.group = group;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }
//    @Override
//    public void info2() {
//        System.out.println("Neban Neban Neban " + getName() + getGroup());
//    }
//}
//
////12
//public class Student extends Person {
//    private String group;
//    private double averageGrade;
//
//    public Student(String name, int age, String group, double averageGrade) {
//        super(name, age);
//        this.group = group;
//        this.averageGrade = averageGrade;
//    }
//
//    public PerformanceStatus getPerformanceStatus() {
//        if (averageGrade >= 90 && averageGrade <= 100) {
//            return PerformanceStatus.EXCELLENT;
//        } else if (averageGrade >= 75 && averageGrade < 90) {
//            return PerformanceStatus.GOOD;
//        } else if (averageGrade >= 60 && averageGrade < 75) {
//            return PerformanceStatus.SATISFACTORY;
//        } else {
//            return PerformanceStatus.UNSATISFACTORY;
//        }
//    }
//
//    @Override
//    public void printInfo() {
//        System.out.print("Имя: " + getName() + ", Возраст: " + getAge());
//        System.out.println(", Группа: " + group + ", Средний балл: " + averageGrade +
//                ", Статус: " + getPerformanceStatus().getLabel());
//    }
//
//    public double getAverageGrade() {
//        return averageGrade;
//    }
//}

////13
//public class Student implements IAboba {
//    private String group;
//
//    public Student( String group) {
//        this.group = group;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }
//    public void printAboba(){
//        System.out.println("Print Aboba");
//    }
//
//}