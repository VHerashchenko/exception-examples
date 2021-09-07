package com.kpi.fict.vh.exception;

public class TryCatchFinallyBlock {

    public void standardBlock(){
        try {
            System.err.print(" 0");
            if (true) {throw new Error();} // 0 2 3 4
//            if (true) {throw new RuntimeException();} // RUNTIME ERROR: Exception in thread "main" java.lang.RuntimeException
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }

//    try-catch-finally допускает неограниченное вложение.
    public void nestedBlocks(){
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Exception();}
//                if (true) {throw new RuntimeException();} // 0 1 3 4 5 7 8 will be caught in first catch block
//                if (true) {throw new Error();} // 0 1 4 7 RUNTIME EXCEPTION: Exception in thread "main" java.lang.Error
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // не заходим - выполнение НЕ в норме
        } catch (Exception e) {
            System.err.print(" 6");     // ЗАХОДИМ - есть подходящее исключение
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
    }
}