package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

@zzard
/* loaded from: classes2.dex */
final class c8 implements SensorEventListener {

    /* renamed from: f, reason: collision with root package name */
    private final SensorManager f11224f;

    /* renamed from: h, reason: collision with root package name */
    private final Display f11226h;

    /* renamed from: k, reason: collision with root package name */
    private float[] f11229k;
    private Handler l;
    private e8 m;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f11227i = new float[9];

    /* renamed from: j, reason: collision with root package name */
    private final float[] f11228j = new float[9];

    /* renamed from: g, reason: collision with root package name */
    private final Object f11225g = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c8(Context context) {
        this.f11224f = (SensorManager) context.getSystemService("sensor");
        this.f11226h = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void e(int i2, int i3) {
        float[] fArr = this.f11228j;
        float f2 = fArr[i2];
        fArr[i2] = fArr[i3];
        fArr[i3] = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.l != null) {
            return;
        }
        Sensor defaultSensor = this.f11224f.getDefaultSensor(11);
        if (defaultSensor == null) {
            zzbad.g("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        zzdbh zzdbhVar = new zzdbh(handlerThread.getLooper());
        this.l = zzdbhVar;
        if (this.f11224f.registerListener(this, defaultSensor, 0, zzdbhVar)) {
            return;
        }
        zzbad.g("SensorManager.registerListener failed.");
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.l == null) {
            return;
        }
        this.f11224f.unregisterListener(this);
        this.l.post(new d8(this));
        this.l = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(e8 e8Var) {
        this.m = e8Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(float[] fArr) {
        synchronized (this.f11225g) {
            float[] fArr2 = this.f11229k;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f11225g) {
            if (this.f11229k == null) {
                this.f11229k = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f11227i, fArr);
        int rotation = this.f11226h.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f11227i, 2, 129, this.f11228j);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f11227i, 129, 130, this.f11228j);
        } else if (rotation != 3) {
            System.arraycopy(this.f11227i, 0, this.f11228j, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f11227i, 130, 1, this.f11228j);
        }
        e(1, 3);
        e(2, 6);
        e(5, 7);
        synchronized (this.f11225g) {
            System.arraycopy(this.f11228j, 0, this.f11229k, 0, 9);
        }
        e8 e8Var = this.m;
        if (e8Var != null) {
            e8Var.a();
        }
    }
}
