package com.kpi.fict.vh.exception.extend;

public class CustomExceptionHandler {
    public void handle(Parent ref) {
        // тут все компилируется, Parent.f() пугает Exception и мы его ловим catch
        try {
            ref.f();
        } catch(Exception e) {
            System.out.println("Exception handled");
        }
    }
}