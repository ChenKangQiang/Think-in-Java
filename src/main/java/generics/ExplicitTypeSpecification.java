//: generics/ExplicitTypeSpecification.java
package generics; /* Added by Eclipse.py */

import typeinfo.pets.*;

import java.util.*;

/**
 * @author chen
 */
public class ExplicitTypeSpecification {
    static void f(Map<Person, List<Pet>> petPeople) {
    }

    public static void main(String[] args) {
        f(new HashMap<Person, List<Pet>>());
    }
} ///:~
