package com.kpi.fict.vh;

import com.kpi.fict.vh.exception.FirstException;
import com.kpi.fict.vh.exception.NonlocalControlTransfer;
import com.kpi.fict.vh.exception.ReturnConversion;

public class Main {

    public static void main(String[] args) {
        FirstException fExc = new FirstException();
        ReturnConversion retConv = new ReturnConversion();
        NonlocalControlTransfer nonlocalCT = new NonlocalControlTransfer();

        fExc.catchExceptionWithTryCatch();
//        fExc.f(null); // StackOverflowError recursion
//        fExc.outputMessageErrAndOut("Error");

        retConv.sqrExplicit(10);
        retConv.sqrIfOperator(10); // is ok;
//        retConv.sqrIfOperator(9); //while(true);
//        retConv.sqrExceptionThrow(10); // RUNTIME ERROR: Exception in thread "main" java.lang.RuntimeException

//        retConv.area(-1, -1);

//        nonlocalCT.nonCatchException();
        nonlocalCT.catchException();
    }
}
