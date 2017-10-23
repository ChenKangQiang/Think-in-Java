//: generics/UseList.java
package generics; /* Added by Eclipse.py */
// {CompileTimeError} (Won't compile)

import java.util.*;

public class UseList<W, T> {


    /* 具有相同疑符，编译报错

    void f(List<T> v) {

    }

    */

    /**
     *
     */
    void f(List<W> v) {

    }
} ///:~
