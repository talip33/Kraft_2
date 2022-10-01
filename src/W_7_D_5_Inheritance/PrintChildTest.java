package W_7_D_5_Inheritance;

public class PrintChildTest {
    public static void main(String[] args) {
        ChildClass childClass=new ChildClass();
        childClass.print_message_P();
        childClass.print_message_C();

        Parent parent=new Parent();
        parent.print_message_P();// parent child ın metot ve
                                 // fieldlerie erişemez
    }

}
