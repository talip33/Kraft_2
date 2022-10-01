package W_7_D_4_Static.StaticBlocks;

public class staticClass { //outer
    static class nested{
       public static void message(){
            System.out.println("selam static class dan");
        }
    }
    class inner{
        public void message(){
            System.out.println("selam inner classdan");
        }
    }
}
class main{
    public static void main(String[] args) {
        staticClass.nested.message();
        staticClass.inner selam=new staticClass().new inner();
       selam.message();
    }
}