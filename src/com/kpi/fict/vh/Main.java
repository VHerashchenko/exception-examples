package com.kpi.fict.vh;

public class Main {

    public static void main(String[] args) {
        catchExceptionWithTryCatch();
    }

    public static void trowUpException() throws Throwable {
    }

    public static void catchExceptionWithTryCatch(){
        try {
            trowUpException();
        } catch (Throwable c){
        }
    }
}
