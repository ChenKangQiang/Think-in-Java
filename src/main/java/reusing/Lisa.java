//: reusing/Lisa.java
package reusing; /* Added by Eclipse.py */
// {CompileTimeError} (Won't compile)

class Lisa extends Homer {

    @Override
    char doh(char c) {
        return super.doh(c);
    }

    @Override
    float doh(float f) {
        return super.doh(f);
    }

//  @Override void doh(Milhouse m) {
//    System.out.println("doh(Milhouse)");
//  }
} ///:~
