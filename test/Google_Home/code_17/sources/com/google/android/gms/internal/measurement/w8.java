package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class w8 implements t8 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16881a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16882b;

    /* renamed from: c, reason: collision with root package name */
    private static final R3 f16883c;

    /* renamed from: d, reason: collision with root package name */
    private static final R3 f16884d;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        f16881a = e8.d("measurement.sgtm.google_signal.enable", false);
        f16882b = e8.d("measurement.sgtm.preview_mode_enabled", true);
        f16883c = e8.d("measurement.sgtm.service", true);
        f16884d = e8.d("measurement.sgtm.upload_queue", false);
        e8.b("measurement.id.sgtm", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.t8
    public final boolean b() {
        return ((Boolean) f16882b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.t8
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.t8
    public final boolean x() {
        return ((Boolean) f16881a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.t8
    public final boolean y() {
        return ((Boolean) f16883c.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.t8
    public final boolean z() {
        return ((Boolean) f16884d.e()).booleanValue();
    }
}
