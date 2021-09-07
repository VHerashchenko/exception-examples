package com.kpi.fict.vh.exception;

public class FirstException {
    public void trowUpException() throws Throwable {
        Error errorThrow = new Error();
        throw errorThrow;
//        throw null; NullPointerException
    }

    public void catchExceptionWithTryCatch(){
        try {
            trowUpException();
        } catch (Throwable c){
        }
    }

    public void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe); //recursion NullPointerException -> StackOverflowException
        }
    }

    public void outputMessageErrAndOut(String message){
        System.out.println(message + " from out");
        System.err.println(message + " from err");
        throw new Error();
    }
}