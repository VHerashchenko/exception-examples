package com.kpi.fict.vh;

public class Main {

    public static void main(String[] args) {
//        catchExceptionWithTryCatch();
        f(null); // StackOverflowError
    }

    public static void trowUpException() throws Throwable {
        Error errorThrow = new Error();
        throw errorThrow;
//        throw null; NullPointerException
    }

    public static void catchExceptionWithTryCatch(){
        try {
            trowUpException();
        } catch (Throwable c){
        }
    }

    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe);
        }
    }
}
