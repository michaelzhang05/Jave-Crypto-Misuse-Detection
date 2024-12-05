package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.y5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2145y5 {

    /* renamed from: a, reason: collision with root package name */
    final Unsafe f15966a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2145y5(Unsafe unsafe) {
        this.f15966a = unsafe;
    }

    public abstract double a(Object obj, long j8);

    public abstract float b(Object obj, long j8);

    public abstract void c(Object obj, long j8, boolean z8);

    public abstract void d(Object obj, long j8, byte b8);

    public abstract void e(Object obj, long j8, double d8);

    public abstract void f(Object obj, long j8, float f8);

    public abstract boolean g(Object obj, long j8);
}
