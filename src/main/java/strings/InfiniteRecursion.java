//: strings/InfiniteRecursion.java
package strings; /* Added by Eclipse.py */
// Accidental recursion.
// {RunByHand}

import java.util.*;

public class InfiniteRecursion {

    @Override
    public String toString() {
        return " InfiniteRecursion address: " + this + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
} ///:~
