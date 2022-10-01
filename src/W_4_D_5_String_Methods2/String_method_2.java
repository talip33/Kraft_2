package W_4_D_5_String_Methods2;

public class String_method_2 {
    public static void main(String[] args) {

        // System.out.println(ggg("talip", "tıraş"));
        //System.out.println(mm("javayı sev"));
        // System.out.println(sesliHarf("java alma"));
        //sevvv();
        //ucKez("talip");
        System.out.println(ortaIsim("talip"));
    }

    public static int ggg(String str, String str2) {

        return str2.indexOf(str.charAt(0));
    }


    public static int mm(String str) {

        int m = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
                m++;

            }
        }

        return m;
    }

    public static String sesliHarf(String str) {
        String hld = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    hld += str.charAt(i);
                    break;
                default:
            }

        }

        return hld;
    }

    public static void sevvv() {

        String a = "sevgiıyle kalın";

        if (a.contains("sev")) {
            System.out.println("aferim");


        }

    }

    public static void ucKez(String str) {
        String ad = "";

        for (int i = 0; i < 3; i++) {

            ad += str.substring(str.length() - 3);
            // System.out.println(ad.substring(2,5));
        }
        System.out.println(ad);

    }

    // İsminizin ortadaki 3 harfini veren bir method yazın
    public static String ortaIsim(String str) {

        return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
//     +2 son indeksi almadığindan yazıldı

    }
//    -İsminizi ve soyadınız hangisi kısa ise diğerine onun boyuna
//    kısaltın yani fazla karakterleri atın. Ve isminizle soy adınızı
//    birleştirin.

    public static String cutName(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1.substring(0, str2.length()).concat(str2);

        } else if (str2.length() > str1.length()) {

        }    return str2.substring(0, str1.length()).concat(str1);



    }

}
