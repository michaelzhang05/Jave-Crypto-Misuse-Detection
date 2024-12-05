package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class Z6 implements Y6 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15637a = new T2(L2.a("com.google.android.gms.measurement")).b().a().f("measurement.sessionid.enable_client_session_id", true);

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean b() {
        return ((Boolean) f15637a.b()).booleanValue();
    }
}
