package com.kpi.fict.vh.exception;

public class ReturnConversion {

    public double sqrNormal(double arg) { // надо double
        return arg * arg;           // double * double - это double
    }

    public double sqrExplicit(double arg) { // надо double
        int k = 1;                  // есть int
        return k;                   // можно неявно преобразовать int в double
//        return "hello!"; COMPILATION ERROR: Incompatible types. Required: double. Found: java.lang.String

//        COMPILATION ERROR: Missing return statement
    }

    public double sqrIfOperator(double arg) {
        if (arg % 2 == 0) {
            return arg * arg; // если arg - четное число, то все ОК
        }
        // а если нечетное, что нам возвращать?
//        COMPILATION ERROR: Missing return statement
        while (true){
            System.out.println("while(true)" + arg);// Удивительно, но КОМПИЛИРУЕТСЯ!
        }
    }

}
