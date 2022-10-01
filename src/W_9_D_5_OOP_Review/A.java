package W_9_D_5_OOP_Review;

public interface A {
   // int i; instance variable olmaz
    public static final int i=10;
                        int j=20;

    public abstract void M1();
    public abstract void M2();
    public abstract void M3();
    public abstract void M4();






    default void M5(){};//java 8
    static void  M6(){};//java 8

//    private void M7(){};//java 9
}
