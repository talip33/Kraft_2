package W_7_D_4_Static.staticJava;

public class Student__ {

    int number;
    String name;
    String schoolName="KRAFT";
    //static int counter;


    public Student__(int number, String name) {
        this.number = number;
        this.name = name;

    }


    public String getInfo() {
        return "Student__{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
