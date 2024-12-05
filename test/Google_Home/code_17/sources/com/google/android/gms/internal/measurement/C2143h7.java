package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2143h7 implements InterfaceC2153i7 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16659a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16660b;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        f16659a = e8.d("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f16660b = e8.d("measurement.set_default_event_parameters_propagate_clear.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2153i7
    public final boolean w() {
        return ((Boolean) f16659a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2153i7
    public final boolean x() {
        return ((Boolean) f16660b.e()).booleanValue();
    }
}
