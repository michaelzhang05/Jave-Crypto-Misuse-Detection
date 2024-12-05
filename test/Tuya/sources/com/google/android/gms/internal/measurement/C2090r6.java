package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2090r6 implements InterfaceC2083q6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15877a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15878b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15879c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15880d;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15877a = a8.f("measurement.client.global_params", true);
        f15878b = a8.f("measurement.service.global_params_in_payload", true);
        f15879c = a8.f("measurement.service.clear_global_params_on_uninstall", true);
        f15880d = a8.f("measurement.service.global_params", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2083q6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2083q6
    public final boolean b() {
        return ((Boolean) f15879c.b()).booleanValue();
    }
}
