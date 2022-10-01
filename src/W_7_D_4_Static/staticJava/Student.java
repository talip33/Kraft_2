package W_7_D_4_Static.staticJava;

public class Student {
     static String name;
    public Student(String name){
        Student.name=name;
    }
    public void printName(){
        System.out.println("name = " + name);
    }
}
