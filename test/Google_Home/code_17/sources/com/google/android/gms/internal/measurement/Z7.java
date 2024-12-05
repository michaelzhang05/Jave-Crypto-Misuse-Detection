package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class Z7 implements InterfaceC2074a8 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16544a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16545b;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        f16544a = e8.d("measurement.item_scoped_custom_parameters.client", true);
        f16545b = e8.d("measurement.item_scoped_custom_parameters.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2074a8
    public final boolean b() {
        return ((Boolean) f16545b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2074a8
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2074a8
    public final boolean x() {
        return ((Boolean) f16544a.e()).booleanValue();
    }
}
