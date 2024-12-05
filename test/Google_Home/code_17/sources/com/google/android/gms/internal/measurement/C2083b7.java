package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2083b7 implements InterfaceC2093c7 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16579a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16580b;

    /* renamed from: c, reason: collision with root package name */
    private static final R3 f16581c;

    /* renamed from: d, reason: collision with root package name */
    private static final R3 f16582d;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        f16579a = e8.d("measurement.consent.stop_reset_on_storage_denied.client", true);
        f16580b = e8.d("measurement.consent.stop_reset_on_storage_denied.service", true);
        f16581c = e8.d("measurement.consent.scrub_audience_data_analytics_consent", true);
        f16582d = e8.d("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2093c7
    public final boolean b() {
        return ((Boolean) f16580b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2093c7
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2093c7
    public final boolean x() {
        return ((Boolean) f16579a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2093c7
    public final boolean y() {
        return ((Boolean) f16581c.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2093c7
    public final boolean z() {
        return ((Boolean) f16582d.e()).booleanValue();
    }
}
