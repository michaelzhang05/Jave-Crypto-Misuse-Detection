package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2067o6 implements InterfaceC2059n6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15833a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15834b;

    /* renamed from: c, reason: collision with root package name */
    public static final X2 f15835c;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).a();
        f15833a = a8.f("measurement.client.sessions.check_on_reset_and_enable2", true);
        f15834b = a8.f("measurement.client.sessions.check_on_startup", true);
        f15835c = a8.f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059n6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2059n6
    public final boolean b() {
        return ((Boolean) f15833a.b()).booleanValue();
    }
}
