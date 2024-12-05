package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class l8 implements m8 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16703a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16704b;

    /* renamed from: c, reason: collision with root package name */
    private static final R3 f16705c;

    /* renamed from: d, reason: collision with root package name */
    private static final R3 f16706d;

    /* renamed from: e, reason: collision with root package name */
    private static final R3 f16707e;

    /* renamed from: f, reason: collision with root package name */
    private static final R3 f16708f;

    /* renamed from: g, reason: collision with root package name */
    private static final R3 f16709g;

    /* renamed from: h, reason: collision with root package name */
    private static final R3 f16710h;

    /* renamed from: i, reason: collision with root package name */
    private static final R3 f16711i;

    /* renamed from: j, reason: collision with root package name */
    private static final R3 f16712j;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        e8.b("measurement.id.rb.attribution.bundle_on_backgrounded", 0L);
        f16703a = e8.d("measurement.rb.attribution.ad_campaign_info", false);
        f16704b = e8.d("measurement.rb.attribution.client.bundle_on_backgrounded", false);
        f16705c = e8.d("measurement.rb.attribution.service.bundle_on_backgrounded", false);
        f16706d = e8.d("measurement.rb.attribution.client2", true);
        e8.d("measurement.rb.attribution.dma_fix", true);
        f16707e = e8.d("measurement.rb.attribution.followup1.service", false);
        e8.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f16708f = e8.d("measurement.rb.attribution.retry_disposition", false);
        f16709g = e8.d("measurement.rb.attribution.service", true);
        f16710h = e8.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f16711i = e8.d("measurement.rb.attribution.uuid_generation", true);
        e8.b("measurement.id.rb.attribution.retry_disposition", 0L);
        f16712j = e8.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final boolean A() {
        return ((Boolean) f16707e.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final boolean B() {
        return ((Boolean) f16709g.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final boolean a() {
        return ((Boolean) f16708f.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final boolean b() {
        return ((Boolean) f16704b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final boolean c() {
        return ((Boolean) f16711i.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final boolean d() {
        return ((Boolean) f16710h.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final boolean f() {
        return ((Boolean) f16712j.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final boolean x() {
        return ((Boolean) f16703a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final boolean y() {
        return ((Boolean) f16705c.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.m8
    public final boolean z() {
        return ((Boolean) f16706d.e()).booleanValue();
    }
}
