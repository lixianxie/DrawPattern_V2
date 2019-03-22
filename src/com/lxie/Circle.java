package com.lxie;

public class Circle extends Shape {
    @Override
    void preprocessing() {
        System.out.println("preprocessing Circle...");
    }

    @Override
    void postprocessing() {
        System.out.println("postprocessing Circle...");
    }

    @Override
    void startDrawing() {
        System.out.println("start drawing Circle...");
    }
}
