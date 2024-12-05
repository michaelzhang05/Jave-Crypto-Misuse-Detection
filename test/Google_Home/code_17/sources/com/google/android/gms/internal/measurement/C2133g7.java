package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2133g7 implements InterfaceC2103d7 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16653a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16654b;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        f16653a = e8.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        f16654b = e8.d("measurement.set_default_event_parameters_with_backfill.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2103d7
    public final boolean b() {
        return ((Boolean) f16654b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2103d7
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2103d7
    public final boolean x() {
        return ((Boolean) f16653a.e()).booleanValue();
    }
}
