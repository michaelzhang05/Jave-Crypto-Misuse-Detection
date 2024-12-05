package com.airbnb.lottie.w;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* compiled from: Keyframe.java */
/* loaded from: classes.dex */
public class a<T> {
    private final com.airbnb.lottie.d a;

    /* renamed from: b, reason: collision with root package name */
    public final T f8269b;

    /* renamed from: c, reason: collision with root package name */
    public final T f8270c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f8271d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8272e;

    /* renamed from: f, reason: collision with root package name */
    public Float f8273f;

    /* renamed from: g, reason: collision with root package name */
    private float f8274g;

    /* renamed from: h, reason: collision with root package name */
    private float f8275h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f8276i;

    /* renamed from: j, reason: collision with root package name */
    public PointF f8277j;

    public a(com.airbnb.lottie.d dVar, T t, T t2, Interpolator interpolator, float f2, Float f3) {
        this.f8274g = Float.MIN_VALUE;
        this.f8275h = Float.MIN_VALUE;
        this.f8276i = null;
        this.f8277j = null;
        this.a = dVar;
        this.f8269b = t;
        this.f8270c = t2;
        this.f8271d = interpolator;
        this.f8272e = f2;
        this.f8273f = f3;
    }

    public boolean a(float f2) {
        return f2 >= c() && f2 < b();
    }

    public float b() {
        if (this.a == null) {
            return 1.0f;
        }
        if (this.f8275h == Float.MIN_VALUE) {
            if (this.f8273f == null) {
                this.f8275h = 1.0f;
            } else {
                this.f8275h = c() + ((this.f8273f.floatValue() - this.f8272e) / this.a.e());
            }
        }
        return this.f8275h;
    }

    public float c() {
        com.airbnb.lottie.d dVar = this.a;
        if (dVar == null) {
            return 0.0f;
        }
        if (this.f8274g == Float.MIN_VALUE) {
            this.f8274g = (this.f8272e - dVar.m()) / this.a.e();
        }
        return this.f8274g;
    }

    public boolean d() {
        return this.f8271d == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f8269b + ", endValue=" + this.f8270c + ", startFrame=" + this.f8272e + ", endFrame=" + this.f8273f + ", interpolator=" + this.f8271d + '}';
    }

    public a(T t) {
        this.f8274g = Float.MIN_VALUE;
        this.f8275h = Float.MIN_VALUE;
        this.f8276i = null;
        this.f8277j = null;
        this.a = null;
        this.f8269b = t;
        this.f8270c = t;
        this.f8271d = null;
        this.f8272e = Float.MIN_VALUE;
        this.f8273f = Float.valueOf(Float.MAX_VALUE);
    }
}
