package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class D6 implements C6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15295a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15296b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15297c;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).a();
        f15295a = a8.d("measurement.id.lifecycle.app_in_background_parameter", 0L);
        f15296b = a8.f("measurement.lifecycle.app_backgrounded_tracking", true);
        f15297c = a8.f("measurement.lifecycle.app_in_background_parameter", false);
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final boolean a() {
        return ((Boolean) f15297c.b()).booleanValue();
    }
}
