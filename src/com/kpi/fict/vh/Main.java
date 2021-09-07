package com.kpi.fict.vh;

import com.kpi.fict.vh.exception.FirstException;

public class Main {

    public static void main(String[] args) {
        FirstException fExc = new FirstException();

        fExc.catchExceptionWithTryCatch();
        fExc.f(null); // StackOverflowError recursion


    }
}
