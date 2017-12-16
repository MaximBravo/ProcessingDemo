package com.maximbravo.processingdemo;

import processing.core.PApplet;
import processing.core.PConstants;

import static com.maximbravo.processingdemo.PhoneData.screenHeight;
import static com.maximbravo.processingdemo.PhoneData.screenWidth;

/**
 * Created by Maxim Bravo on 12/16/2017.
 */

class Ball {
    private float x;
    private float y;
    private float width;
    private float height;

    public Ball(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void move(float moveX, float moveY) {
        if(x + moveX > 0 + width/2 &&
                x + moveX + width/2 < screenWidth) {
            x += moveX;
        }

        if(y + moveY > 0 + height/2 &&
                y + moveY + height/2 < screenHeight) {
            y += moveY;
        }


    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
    public void draw(PApplet marker) {
        marker.pushStyle();
        marker.color(255);
        marker.ellipseMode(PConstants.CENTER);
        marker.ellipse((float) x, (float) y, (float) width, (float) height);
        marker.text("ballX: " + x + "\nballY: " + y, 400, 700, 400, 200);
        marker.popStyle();
    }
}
