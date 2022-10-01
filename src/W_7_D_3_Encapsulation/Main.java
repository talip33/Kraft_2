package W_7_D_3_Encapsulation;

public class Main {
    public static void main(String[] args) {

      Dog dog=new Dog("karabaş");
       dog.setName("akbaş");
        System.out.println(dog.getName());
        dog.isBlack=true;

KraftBankCunstomer kraftBankCunstomer=new KraftBankCunstomer(1233,"tt",true);
        System.out.println(kraftBankCunstomer.getCustomerToken());
        kraftBankCunstomer.setCustomerFullName("fffff","1233tt12");
        System.out.println(kraftBankCunstomer.getCustomerFullName());

    }
}
