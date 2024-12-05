package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.v5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2269v5 implements X5 {

    /* renamed from: b, reason: collision with root package name */
    private static final F5 f16870b = new C2260u5();

    /* renamed from: a, reason: collision with root package name */
    private final F5 f16871a;

    public C2269v5() {
        this(new C2287x5(C2101d5.c(), f16870b));
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final Y5 a(Class cls) {
        Q4 q42;
        AbstractC2072a6.o(cls);
        G5 a8 = this.f16871a.a(cls);
        if (a8.b()) {
            return M5.i(AbstractC2072a6.f(), R4.a(), a8.w());
        }
        O5 a9 = Q5.a();
        InterfaceC2233r5 a10 = AbstractC2251t5.a();
        AbstractC2234r6 f8 = AbstractC2072a6.f();
        if (AbstractC2296y5.f16906a[a8.x().ordinal()] != 1) {
            q42 = R4.a();
        } else {
            q42 = null;
        }
        return L5.m(cls, a8, a9, a10, f8, q42, D5.a());
    }

    private C2269v5(F5 f52) {
        this.f16871a = (F5) AbstractC2111e5.f(f52, "messageInfoFactory");
    }
}
