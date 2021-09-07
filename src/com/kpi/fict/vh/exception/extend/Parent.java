package com.kpi.fict.vh.exception.extend;

import java.io.IOException;

public class Parent {
    public void f() throws IOException, InterruptedException {
        if(System.currentTimeMillis() % 2 == 0)
            throw new IOException();
        else
            throw new InterruptedException();
    }
}