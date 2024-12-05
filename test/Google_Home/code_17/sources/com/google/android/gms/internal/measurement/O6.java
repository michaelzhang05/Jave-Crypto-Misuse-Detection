package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class O6 implements P6 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16246a;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        f16246a = e8.d("measurement.service.ad_impression.convert_value_to_double", true);
        e8.d("measurement.client.ad_impression", true);
        e8.d("measurement.service.separate_public_internal_event_blacklisting", true);
        e8.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.P6
    public final boolean w() {
        return ((Boolean) f16246a.e()).booleanValue();
    }
}
