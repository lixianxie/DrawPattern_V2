package com.lxie;

public class Square extends Shape {
    @Override
    void preprocessing() {
        System.out.println("preprocessing Square...");
    }

    @Override
    void postprocessing() {
        System.out.println("postprocessing Square...");
    }

    @Override
    void startDrawing() {
        System.out.println("start drawing Square...");
    }
}
