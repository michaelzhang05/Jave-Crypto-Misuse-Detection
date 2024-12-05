package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class Y5 implements X5 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15629a = new T2(L2.a("com.google.android.gms.measurement")).a().f("measurement.client.firebase_feature_rollout.v1.enable", true);

    @Override // com.google.android.gms.internal.measurement.X5
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final boolean b() {
        return ((Boolean) f15629a.b()).booleanValue();
    }
}
