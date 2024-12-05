package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2307z7 implements InterfaceC2271v7 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16919a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16920b;

    /* renamed from: c, reason: collision with root package name */
    private static final R3 f16921c;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.client.ad_id_consent_fix", true);
        e8.d("measurement.service.consent.aiid_reset_fix", false);
        e8.d("measurement.service.consent.aiid_reset_fix2", true);
        f16919a = e8.d("measurement.service.consent.app_start_fix", true);
        f16920b = e8.d("measurement.service.consent.params_on_fx", true);
        f16921c = e8.d("measurement.service.consent.pfo_on_fx", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2271v7
    public final boolean b() {
        return ((Boolean) f16921c.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2271v7
    public final boolean w() {
        return ((Boolean) f16919a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2271v7
    public final boolean x() {
        return ((Boolean) f16920b.e()).booleanValue();
    }
}
