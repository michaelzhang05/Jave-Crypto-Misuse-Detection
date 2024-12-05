package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1994f7 implements InterfaceC1985e7 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15708a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15709b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15710c;

    /* renamed from: d, reason: collision with root package name */
    public static final X2 f15711d;

    /* renamed from: e, reason: collision with root package name */
    public static final X2 f15712e;

    /* renamed from: f, reason: collision with root package name */
    public static final X2 f15713f;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15708a = a8.f("measurement.client.sessions.background_sessions_enabled", true);
        f15709b = a8.f("measurement.client.sessions.enable_fix_background_engagement", false);
        f15710c = a8.f("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f15711d = a8.f("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f15712e = a8.f("measurement.client.sessions.session_id_enabled", true);
        f15713f = a8.d("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1985e7
    public final boolean a() {
        return ((Boolean) f15709b.b()).booleanValue();
    }
}
