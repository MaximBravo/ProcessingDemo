package com.maximbravo.processingdemo;

/**
 * Created by Maxim Bravo on 12/16/2017.
 */
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

import processing.core.PApplet;

import static com.maximbravo.processingdemo.PhoneData.screenHeight;
import static com.maximbravo.processingdemo.PhoneData.screenWidth;

public class Sketch2 extends PApplet {
    Context context;
    SensorManager manager;
    Sensor sensor;
    AccelerometerListener listener;
    float ax, ay, az;

    Ball ball = new Ball(screenWidth/2, screenHeight/2, 20, 20);
    public void settings() {
        size(screenWidth, screenHeight);
    }

    public void setup() {
        context = getActivity();
        manager = (SensorManager)context.getSystemService(Context.SENSOR_SERVICE);
        sensor = manager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        listener = new AccelerometerListener();
        manager.registerListener(listener, sensor, SensorManager.SENSOR_DELAY_GAME);

        textFont(createFont("SansSerif", 30 * displayDensity));
    }

    public void draw() {
        background(0);
        text("X: " + (int)ax + "\nY: " + (int)ay + "\nZ: " + (int)az, 0, 0, width, height);
        ball.move(ay, ax);
        ball.draw(this);
    }

    class AccelerometerListener implements SensorEventListener {
        public void onSensorChanged(SensorEvent event) {
            ax = event.values[0];
            ay = event.values[1];
            az = event.values[2];
        }
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    }
}
