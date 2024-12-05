package com.facebook.t.v;

/* compiled from: MTensor.java */
/* loaded from: classes.dex */
public class a {
    private float[] a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f9645b;

    /* renamed from: c, reason: collision with root package name */
    private int f9646c;

    public a(int[] iArr) {
        this.f9645b = iArr;
        int a = a(iArr);
        this.f9646c = a;
        this.a = new float[a];
    }

    private static int a(int[] iArr) {
        int i2 = 1;
        for (int i3 : iArr) {
            i2 *= i3;
        }
        return i2;
    }

    public float[] b() {
        return this.a;
    }

    public int c(int i2) {
        return this.f9645b[i2];
    }

    public int d() {
        return this.f9645b.length;
    }

    public void e(int[] iArr) {
        this.f9645b = iArr;
        int a = a(iArr);
        float[] fArr = new float[a];
        System.arraycopy(this.a, 0, fArr, 0, Math.min(this.f9646c, a));
        this.a = fArr;
        this.f9646c = a;
    }
}
