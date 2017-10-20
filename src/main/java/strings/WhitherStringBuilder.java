//: strings/WhitherStringBuilder.java
package strings; /* Added by Eclipse.py */

/**
 * @author
 */
public class WhitherStringBuilder {
    public String implicit(String[] fields) {
        String result = "";
        for (int i = 0; i < fields.length; i++) {
            result += fields[i];    //编译器的优化为：每次循环的时候都会new一个StringBuilder，并把StringBuilder.toString赋给result
        }

        return result;
    }

    public String explicit(String[] fields) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            result.append(fields[i]);    //只生产一个StringBuilder对象
        }
        return result.toString();
    }
} ///:~
