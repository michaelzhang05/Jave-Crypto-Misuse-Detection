package com.facebook.t.r;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: ViewIndexingTrigger.java */
/* loaded from: classes.dex */
class f implements SensorEventListener {

    /* renamed from: f, reason: collision with root package name */
    private a f9562f;

    /* compiled from: ViewIndexingTrigger.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public void a(a aVar) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            this.f9562f = aVar;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
        if (com.facebook.internal.a0.f.a.c(this)) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            if (this.f9562f != null) {
                float[] fArr = sensorEvent.values;
                double d2 = fArr[0] / 9.80665f;
                double d3 = fArr[1] / 9.80665f;
                double d4 = fArr[2] / 9.80665f;
                Double.isNaN(d2);
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d3);
                Double.isNaN(d4);
                Double.isNaN(d4);
                if (Math.sqrt((d2 * d2) + (d3 * d3) + (d4 * d4)) > 2.299999952316284d) {
                    this.f9562f.a();
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }
}
