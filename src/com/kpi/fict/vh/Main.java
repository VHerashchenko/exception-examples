package com.kpi.fict.vh;

import com.kpi.fict.vh.exception.FirstException;
import com.kpi.fict.vh.exception.ReturnConversion;

public class Main {

    public static void main(String[] args) {
        FirstException fExc = new FirstException();
        ReturnConversion retConv = new ReturnConversion();

        fExc.catchExceptionWithTryCatch();
//        fExc.f(null); // StackOverflowError recursion
//        fExc.outputMessageErrAndOut("Error");

        retConv.sqrExplicit(10);
        retConv.sqrIfOperator(10); // is ok;
//        retConv.sqrIfOperator(9); //while(true);
    }
}
