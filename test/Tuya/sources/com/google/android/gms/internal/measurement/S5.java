package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class S5 implements R5 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15548a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15549b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15550c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15551d;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).a();
        f15548a = a8.f("measurement.client.consent_state_v1", true);
        f15549b = a8.f("measurement.client.3p_consent_state_v1", true);
        f15550c = a8.f("measurement.service.consent_state_v1_W36", true);
        f15551d = a8.d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.R5
    public final long a() {
        return ((Long) f15551d.b()).longValue();
    }
}
