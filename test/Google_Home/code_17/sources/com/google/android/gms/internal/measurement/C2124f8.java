package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2124f8 implements InterfaceC2134g8 {

    /* renamed from: a, reason: collision with root package name */
    private static final R3 f16645a;

    /* renamed from: b, reason: collision with root package name */
    private static final R3 f16646b;

    /* renamed from: c, reason: collision with root package name */
    private static final R3 f16647c;

    /* renamed from: d, reason: collision with root package name */
    private static final R3 f16648d;

    /* renamed from: e, reason: collision with root package name */
    private static final R3 f16649e;

    /* renamed from: f, reason: collision with root package name */
    private static final R3 f16650f;

    static {
        Z3 e8 = new Z3(O3.a("com.google.android.gms.measurement")).f().e();
        f16645a = e8.d("measurement.test.boolean_flag", false);
        f16646b = e8.b("measurement.test.cached_long_flag", -1L);
        f16647c = e8.a("measurement.test.double_flag", -3.0d);
        f16648d = e8.b("measurement.test.int_flag", -2L);
        f16649e = e8.b("measurement.test.long_flag", -1L);
        f16650f = e8.c("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2134g8
    public final boolean A() {
        return ((Boolean) f16645a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2134g8
    public final long b() {
        return ((Long) f16648d.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2134g8
    public final double w() {
        return ((Double) f16647c.e()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2134g8
    public final long x() {
        return ((Long) f16646b.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2134g8
    public final long y() {
        return ((Long) f16649e.e()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2134g8
    public final String z() {
        return (String) f16650f.e();
    }
}
