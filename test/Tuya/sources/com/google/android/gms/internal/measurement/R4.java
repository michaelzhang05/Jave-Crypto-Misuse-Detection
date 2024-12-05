package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class R4 implements InterfaceC2034k5 {

    /* renamed from: b, reason: collision with root package name */
    private static final W4 f15538b = new O4();

    /* renamed from: a, reason: collision with root package name */
    private final W4 f15539a;

    public R4() {
        W4 w42;
        C2081q4 c8 = C2081q4.c();
        try {
            w42 = (W4) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            w42 = f15538b;
        }
        P4 p42 = new P4(c8, w42);
        byte[] bArr = B4.f15272d;
        this.f15539a = p42;
    }

    private static boolean b(V4 v42) {
        if (v42.c() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2034k5
    public final InterfaceC2026j5 a(Class cls) {
        AbstractC2042l5.c(cls);
        V4 a8 = this.f15539a.a(cls);
        if (a8.b()) {
            if (AbstractC2112u4.class.isAssignableFrom(cls)) {
                return C1965c5.j(AbstractC2042l5.V(), AbstractC2049m4.b(), a8.a());
            }
            return C1965c5.j(AbstractC2042l5.U(), AbstractC2049m4.a(), a8.a());
        }
        if (AbstractC2112u4.class.isAssignableFrom(cls)) {
            if (b(a8)) {
                return C1956b5.H(cls, a8, AbstractC1983e5.b(), M4.d(), AbstractC2042l5.V(), AbstractC2049m4.b(), U4.b());
            }
            return C1956b5.H(cls, a8, AbstractC1983e5.b(), M4.d(), AbstractC2042l5.V(), null, U4.b());
        }
        if (b(a8)) {
            return C1956b5.H(cls, a8, AbstractC1983e5.a(), M4.c(), AbstractC2042l5.U(), AbstractC2049m4.a(), U4.a());
        }
        return C1956b5.H(cls, a8, AbstractC1983e5.a(), M4.c(), AbstractC2042l5.U(), null, U4.a());
    }
}
