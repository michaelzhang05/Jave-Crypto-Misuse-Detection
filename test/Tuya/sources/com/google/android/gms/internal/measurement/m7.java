package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class m7 implements l7 {

    /* renamed from: a, reason: collision with root package name */
    public static final X2 f15769a;

    /* renamed from: b, reason: collision with root package name */
    public static final X2 f15770b;

    static {
        T2 a8 = new T2(L2.a("com.google.android.gms.measurement")).b().a();
        f15769a = a8.f("measurement.sgtm.client.dev", false);
        f15770b = a8.f("measurement.sgtm.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.l7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.l7
    public final boolean b() {
        return ((Boolean) f15769a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.l7
    public final boolean c() {
        return ((Boolean) f15770b.b()).booleanValue();
    }
}
