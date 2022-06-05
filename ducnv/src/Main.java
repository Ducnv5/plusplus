import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.Math.rint;
import static java.lang.StrictMath.ceil;
import static java.lang.StrictMath.round;

public class Main {

    public static void main(char args[]) {
        System.out.println("chars");
    }
    public static void main(String[] args) {
        int x,y,z;
        x=9;y=10;
        z=++x+y++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
//        Set set = new TreeSet<>();
//        set.add(1);
//        set.add("2");
//        set.add(3);

        String x1 = "abc";
        String x2 = "abc";
        x1.concat(x2);


        System.out.println(x1);

        List<String> l1 = new ArrayList<>();
        l1.add("foo");
        List<String> l2 = l1;
        List<String> l3 = new ArrayList<>(l2);
        l1.clear();
        l2.add("bar");
        l3.add("baz");
        System.out.println(Math.ceil(22.9));
        System.out.println(Math.round(22.9));
        System.out.println(rint(22.9));
        B b = new B();

    }

}
class A {
    static {
        System.out.println("A");
    }
}

class B extends A {
    static {
        System.out.println("B");
    }
}