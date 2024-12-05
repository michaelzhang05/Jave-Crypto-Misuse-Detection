package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class W6 implements V6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15597a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15598b;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15597a = a8.f("measurement.remove_app_background.client", false);
        f15598b = a8.d("measurement.id.remove_app_background.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean b() {
        return ((Boolean) f15597a.b()).booleanValue();
    }
}
