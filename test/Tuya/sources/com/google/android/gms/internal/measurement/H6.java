package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class H6 implements G6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15343a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15344b;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15343a = a8.f("measurement.collection.client.log_target_api_version", true);
        f15344b = a8.f("measurement.collection.service.log_target_api_version", true);
    }

    @Override // com.google.android.gms.internal.measurement.G6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.G6
    public final boolean b() {
        return ((Boolean) f15343a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.G6
    public final boolean c() {
        return ((Boolean) f15344b.b()).booleanValue();
    }
}
