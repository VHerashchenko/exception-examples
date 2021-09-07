package com.kpi.fict.vh.exception.extend;

import java.io.FileNotFoundException;

public class Child extends Parent{
    @Override
    public void f() throws FileNotFoundException /*Throwable*/ /*COMPILATION ERROR: overridden method does not throw 'java.lang.Exception'*/ {
        throw new FileNotFoundException();
    }
}