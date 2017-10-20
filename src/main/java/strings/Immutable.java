//: strings/Immutable.java
package strings; /* Added by Eclipse.py */

import static net.mindview.util.Print.*;

/**
 * @author
 */
public class Immutable {
    public static String upCase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        print(q); // howdy
        String qq = upCase(q);
        print(qq); // HOWDY
        print(q); // howdy
    }
} /* Output:
howdy
HOWDY
howdy
*///:~
