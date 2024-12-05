package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2073a7 implements X6 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16550a;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.client.consent_state_v1", true);
        e8.d("measurement.client.3p_consent_state_v1", true);
        e8.d("measurement.service.consent_state_v1_W36", true);
        f16550a = e8.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.X6
    public final long w() {
        return ((Long) f16550a.e()).longValue();
    }
}
