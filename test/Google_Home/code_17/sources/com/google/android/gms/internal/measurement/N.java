package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class N implements P {

    /* renamed from: a, reason: collision with root package name */
    private final V2 f16233a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16234b;

    public N(V2 v22, String str) {
        this.f16233a = v22;
        this.f16234b = str;
    }

    @Override // com.google.android.gms.internal.measurement.P
    public final V2 a(InterfaceC2236s interfaceC2236s) {
        V2 d8 = this.f16233a.d();
        d8.f(this.f16234b, interfaceC2236s);
        return d8;
    }
}
