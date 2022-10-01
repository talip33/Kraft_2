package W_7_D_3_Encapsulation;

public class Dog {
    private String name;
    private String breed;
    public boolean isBlack;
    private int age;

    public Dog(String name){
    }

    public String getName(){
        return this.name;
    }
    public void setName(String str){
        this.name=str;
    }
    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed=breed;
    }

}
