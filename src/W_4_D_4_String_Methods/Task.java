package W_4_D_4_String_Methods;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
       // String s = scan.nextLine();
        //System.out.println(counterOfChar(s));
       // System.out.println("nameLengt() = " + nameLengt());
       // System.out.println( nameBuyuk());
        //System.out.println(messageIndex());
       // downDown();
       // sirala();
        System.out.println(date());

    }

    public static int counterOfChar(String str) {

        return str.length();
    }


    public static int nameLengt() {
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();
        String name2= scan.nextLine();
        int top=(name1.length())+(name2.length());

return top;
        //return name1.concat(name2).length();
    }
    public static String nameBuyuk(){
        Scanner scan = new Scanner(System.in);
        String name1 = scan.nextLine();
        String name2= scan.nextLine();
        return name1.toUpperCase().concat("\n"+name2.toUpperCase());
        //return name1.toUpperCase()+name2.toUpperCase();
    }

    public static char messageIndex(){
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        //int endIndex =message.charAt(message.length()-1);

        return message.charAt(message.length()-1);
    }
        public static void downDown(){
            Scanner scan = new Scanner(System.in);
            String message = scan.nextLine();
            for(int i=0;i<message.length();i++){
               System.out.println(message.charAt(i));
            }

       }
       public static void sirala(){
           Scanner scan = new Scanner(System.in);
           String name1 = scan.nextLine();
           String name2= scan.nextLine();
           String name3= scan.nextLine();
           if(name1.length()>name2.length() && name1.length()>name3.length() && name2.length()>name3.length()){
               System.out.println(name1.concat(name2 + name3));
           }
           else if(name1.length()>name2.length() && name1.length()>name3.length() && name3.length()>name2.length()){
               System.out.println(name1.concat(name3 + name2));}



           else if (name2.length()>name1.length()&& name2.length()>name3.length() && name1.length()>name3.length()) {
               System.out.println(name2.concat(name1 + name3));      }

           else if (name2.length()>name1.length()&& name2.length()>name3.length() && name3.length()>name1.length()) {
               System.out.println(name2.concat(name3 + name1));      }




           else if(name3.length()>name1.length()&& name3.length()>name2.length() && name1.length()>name2.length() ){
               System.out.println(name3.concat(name1 + name2));          }

           else if(name3.length()>name1.length()&& name3.length()>name2.length() && name2.length()>name1.length() ){
               System.out.println(name3.concat(name2 + name1));          }





       }
       public static String date(){
        String date1="10/10/2022 12:23:22";
        String date2= date1.replace("/","");
        String date3 =date2.replace(":","");
        String date4=date3.replace(" ","");

        return date4;
       }





}












