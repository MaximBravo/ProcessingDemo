package com.maximbravo.processingdemo;

import processing.core.PApplet;

import static com.maximbravo.processingdemo.PhoneData.screenHeight;
import static com.maximbravo.processingdemo.PhoneData.screenWidth;

/**
 * Created by Maxim Bravo on 12/13/2017.
 */
public class Sketch extends PApplet {

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
