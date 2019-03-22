package com.lxie;

public abstract class Shape {

    abstract void preprocessing();
    abstract void postprocessing();
    abstract void startDrawing();

    public final void draw() {
        preprocessing();
        startDrawing();
        postprocessing();
    }

}
