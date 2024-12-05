package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class M7 implements N7 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16231a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16232b;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        f16231a = e8.d("measurement.gbraid_campaign.gbraid.client", false);
        f16232b = e8.d("measurement.gbraid_campaign.gbraid.service", false);
        e8.b("measurement.id.gbraid_campaign.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.N7
    public final boolean b() {
        return ((Boolean) f16232b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.N7
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.N7
    public final boolean x() {
        return ((Boolean) f16231a.e()).booleanValue();
    }
}
