package W_7_D_4_Static.StaticBlocks;

public class BlocksVs {
    static int i=10;
    public BlocksVs(int i){
        this.i=i;
        System.out.println("constructor Çalıştı");
    }
    static {
        System.out.println("static blok çalıştı");
        i=i*10;
        System.out.println(i);
    }
    {
        System.out.println("instance blok çalıştı");
    }

}
