package com.kpi.fict.vh;

import com.kpi.fict.vh.exception.*;
import com.kpi.fict.vh.exception.extend.OverridingThrowException;

public class Main {

    public static void main(String[] args) {
        FirstException fExc = new FirstException();
        ReturnConversion retConv = new ReturnConversion();
        NonlocalControlTransfer nonlocalCT = new NonlocalControlTransfer();
        RuntimeExceptionExample runtimeEx = new RuntimeExceptionExample();
        TryFinallyBlock tryFinallyBlock = new TryFinallyBlock();
        TryCatchFinallyBlock tryCatchFinallyBlock = new TryCatchFinallyBlock();
        ThrowException throwException = new ThrowException();
        OverridingThrowException overridingThrowException = new OverridingThrowException();

        fExc.catchExceptionWithTryCatch();
//        fExc.f(null); // StackOverflowError recursion
//        fExc.outputMessageErrAndOut("Error");

        retConv.sqrExplicit(10);
        retConv.sqrIfOperator(10); // is ok;
//        retConv.sqrIfOperator(9); //while(true);
//        retConv.sqrExceptionThrow(10); // RUNTIME ERROR: Exception in thread "main" java.lang.RuntimeException

//        retConv.area(-1, -1);

//        nonlocalCT.nonCatchExceptionInFirst();
//        nonlocalCT.catchException();

        runtimeEx.tryCatchOutputExample();
        runtimeEx.polymorphException();
//        runtimeEx.tryToCatchErrorWithException(); // RUNTIME EXCEPTION: Exception in thread "main" java.lang.Error
//        runtimeEx.catchDifferentRuntimeException(); //ловит только один, если кинуть второй в catch: RUNTIME EXCEPTION: Exception in thread "main" java.lang.Error
        runtimeEx.parentThrowableGetsError();
        runtimeEx.catchExceptionInRightWay();

//        tryFinallyBlock.standardBlock();
        System.out.println(tryFinallyBlock.finallyReturns());

        tryCatchFinallyBlock.standardBlock();
        tryCatchFinallyBlock.nestedBlocks();

        throwException.testTrowCheckedException();
        throwException.testTrowUncheckedException(2); // caught EOFException
//        throwException.testTrowUncheckedException(1); // Runtime

        overridingThrowException.handleException();
    }
}