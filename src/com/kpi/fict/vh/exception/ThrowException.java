package com.kpi.fict.vh.exception;

import java.io.EOFException;

public class ThrowException {

    public void testTrowCheckedException(){
        try{
            throwException();
        } catch (Throwable t){
            System.err.println("Throwable t"); // need to catch what method throws with checked exceptions
        }
    }

    public void testTrowUncheckedException(int arg){
        throwUncheckedException(arg); // we can not to catch Runtime (unchecked) exception, but we know that it can be in this method
    }

    private void throwException() throws Throwable {
        try {
            Throwable t = new Exception(); // а лететь будет Exception
            throw t;
        } catch (Exception e) { // и мы перехватим Exception
            System.out.println("Перехвачено!");
        }
    }

    private void throwUncheckedException(int arg) throws RuntimeException {
        try {
            if (arg % 2 == 0) {
                throw new EOFException();
            } else {
                System.err.println("RuntimeException re");
                throw new RuntimeException();
            }
        } catch (EOFException e) /* no need to write it on throws, because we already caught it*/ {
            System.err.println("EOFException e");
        }
    }
}