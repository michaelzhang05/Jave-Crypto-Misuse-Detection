package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2253t7 implements InterfaceC2262u7 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16850a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16851b;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.collection.event_safelist", true);
        f16850a = e8.d("measurement.service.store_null_safelist", true);
        f16851b = e8.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2262u7
    public final boolean b() {
        return ((Boolean) f16851b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2262u7
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2262u7
    public final boolean x() {
        return ((Boolean) f16850a.e()).booleanValue();
    }
}
