package com.kpi.fict.vh.exception.extend;

public class OverridingThrowException {
    private final CustomExceptionHandler customExceptionHandler = new CustomExceptionHandler();
    private final Parent parent = new Parent();
    private final Parent child = new Child();

    public void handleException(){
        customExceptionHandler.handle(parent);
        customExceptionHandler.handle(child);
    }
}