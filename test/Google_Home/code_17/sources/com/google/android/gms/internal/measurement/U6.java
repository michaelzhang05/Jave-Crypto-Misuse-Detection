package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class U6 implements W6 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16351a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16352b;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        f16351a = e8.d("measurement.consent_regional_defaults.client2", true);
        f16352b = e8.d("measurement.consent_regional_defaults.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.W6
    public final boolean b() {
        return ((Boolean) f16352b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.W6
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.W6
    public final boolean x() {
        return ((Boolean) f16351a.e()).booleanValue();
    }
}
