package W_10_D_5ColletionCont;

import java.util.Arrays;
import java.util.Vector;

public class VectorStudy {
    public static void main(String[] args) {
        Vector<String> vec=new Vector<>();
        vec.add("nn");
        System.out.println("vec.size() = " + vec.size());
        System.out.println("vec = " + vec);

        //addAll

        vec.addAll(Arrays.asList("aa","mm","ll","bb","öö"));
        System.out.println("vec = " + vec);

        //addElement()
        vec.addElement("tcc");
        System.out.println("vec = " + vec);

        //capacity
        System.out.println("vec.size() = " + vec.size());
        System.out.println("vec.capacity() = " + vec.capacity());

        //clear
       // vec.clear();
        //System.out.println("vec = " + vec);  //vec = []

        //clone
        Object clone1=vec.clone();
        System.out.println("clone1 = " + clone1);

        //contains
        System.out.println("vec.contains(\"nn\") = " + vec.contains("nn"));

        //containsAll
        System.out.println("vec.containsAll(Arrays.asList(\"aa\",\"mm\")) = "
                + vec.containsAll(Arrays.asList("aa", "mm")));

        //copyInto
        String [] strings=new String[9];
        strings[0]="1";
        vec.copyInto(strings);
        System.out.println("Arrays.toString(strings) = "
                + Arrays.toString(strings));
        //[nn, aa, mm, ll, bb, öö, tcc, null, null]

        //ensureCapacity
        System.out.println("vec.capacity() = " + vec.capacity());
        vec.ensureCapacity(30);
        System.out.println("vec.capacity() = " + vec.capacity());

        //trimToSize();
        vec.trimToSize();
        System.out.println("vec.capacity() = " + vec.capacity());

        //set
        vec.set(2,"klm");
        System.out.println("vec = " + vec);

        //setElementAt
        vec.setElementAt("cccc",2);
        System.out.println("vec = " + vec);


    }
}
