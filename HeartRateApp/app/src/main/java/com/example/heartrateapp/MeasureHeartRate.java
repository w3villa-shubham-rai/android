package com.example.heartrateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MeasureHeartRate extends AppCompatActivity {

    TextView textView;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure_heart_rate);

        textView = findViewById(R.id.text2);
        btn = findViewById(R.id.btn);

        SensorManager sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Sensor heartRateSensor = sensorManager.getDefaultSensor(Sensor.TYPE_HEART_RATE);

        SensorEventListener sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                if (event.sensor.getType() == Sensor.TYPE_HEART_RATE) {
                    int heartRate = (int) event.values[0];
                    // Do something with the heart rate data
                    textView.setText("Sensor is present" + String.valueOf(heartRate));
                }
                else
                {
                    textView.setText("Sensor not present");
                }
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
                // Do something when the accuracy of the sensor changes
            }
        };
        sensorManager.registerListener(sensorEventListener, heartRateSensor, SensorManager.SENSOR_DELAY_NORMAL);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopListening(sensorManager,sensorEventListener);
            }
        });
    }

    public void stopListening(SensorManager sensorManager, SensorEventListener sensorEventListener)
    {
        sensorManager.unregisterListener(sensorEventListener);
        textView.setText("Stops Listening");
    }
}