package com.kpi.fict.vh.exception;

public class TryFinallyBlock {

    public void standardBlock(){
        try {
            System.err.println("try");
            if (true) {
                throw new RuntimeException();
            }
//            if(true) {return;} // finally-секция получает управление, даже если try-блок завершился директивой выхода из метода
//            System.exit(42); //finally-секция НЕ вызывается только если мы «прибили» JVM
        } finally {
            System.err.println("finally");
        }
        System.err.println("more"); //COMPILER ERROR: Unreachable statement that's wht if(true){throw new RuntimeException();}
    }

    public int finallyReturns() {
        try {
//            throw new RuntimeException();
            throw new Error();
        } finally {
            return 1; // finally-секция может «перебить» throw/return при помощи другого throw/return
//            throw new RuntimeException(); // Exception in thread "main" java.lang.RuntimeException
        }
    }


}
