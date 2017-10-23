//: generics/SimplerPets.java
package generics; /* Added by Eclipse.py */

import typeinfo.pets.*;

import java.util.*;

/**
 * @author chen
 */
public class SimplerPets {
    public static void main(String[] args) {
        Map<Person, List<? extends Pet>> petPeople = new HashMap<>();
        // Rest of the code is the same...
    }
} ///:~
