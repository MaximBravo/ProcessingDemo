package com.maximbravo.processingdemo;

import processing.core.PApplet;

/**
 * Created by Maxim Bravo on 12/13/2017.
 */
public class Sketch extends PApplet {
    public static int screenHeight;
    public static int screenWidth;

    public void settings() {
        size(screenWidth, screenHeight);
    }


    public void setup() { }

    public void draw() {
        if (mousePressed) {
            ellipse(mouseX, mouseY, 50, 50);
        }
    }
}
