package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    private final V2 f16251a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16252b;

    public Q(V2 v22, String str) {
        this.f16251a = v22;
        this.f16252b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final V2 a(InterfaceC2236s interfaceC2236s) {
        V2 d8 = this.f16251a.d();
        d8.e(this.f16252b, interfaceC2236s);
        return d8;
    }
}
