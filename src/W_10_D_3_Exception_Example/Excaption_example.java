package W_10_D_3_Exception_Example;

public class Excaption_example {
    public static void main(String[] args) {

    }
    //array içeisinde en büyük sayıyın index nosunu getiren metodu yazınız
    //eger en büyük sayıdan 2 veya fazla ise new exception throw edin

public static int maxNumberArray(int[] arr){
        int max=arr[0];
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
}
public static int maxIndexNumberForArray(int[] arr){
     int maxnum=maxNumberArray(arr) ;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]==maxnum){
            return i;
        }

    }return 0;
}

}
