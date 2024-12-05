package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class A7 implements B7 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16074a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16075b;

    /* renamed from: c, reason: collision with root package name */
    private static final R3 f16076c;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f16074a = e8.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f16075b = e8.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f16076c = e8.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.B7
    public final boolean b() {
        return ((Boolean) f16075b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B7
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.B7
    public final boolean x() {
        return ((Boolean) f16074a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.B7
    public final boolean y() {
        return ((Boolean) f16076c.e()).booleanValue();
    }
}
