package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class q8 implements n8 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16789a;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        e8.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f16789a = e8.d("measurement.session_stitching_token_enabled", false);
        e8.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.n8
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n8
    public final boolean x() {
        return ((Boolean) f16789a.e()).booleanValue();
    }
}
