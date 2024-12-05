package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class r8 implements s8 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16800a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16801b;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.client.sessions.background_sessions_enabled", true);
        f16800a = e8.d("measurement.client.sessions.enable_fix_background_engagement", false);
        e8.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f16801b = e8.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        e8.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e8.d("measurement.client.sessions.session_id_enabled", true);
        e8.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.s8
    public final boolean w() {
        return ((Boolean) f16800a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.s8
    public final boolean x() {
        return ((Boolean) f16801b.e()).booleanValue();
    }
}
