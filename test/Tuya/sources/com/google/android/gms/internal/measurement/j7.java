package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class j7 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15747a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15748b;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15747a = a8.f("measurement.sfmc.client", true);
        f15748b = a8.f("measurement.sfmc.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.i7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.i7
    public final boolean b() {
        return ((Boolean) f15747a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.i7
    public final boolean c() {
        return ((Boolean) f15748b.b()).booleanValue();
    }
}
