package com.flurry.sdk;

/* loaded from: classes2.dex */
public final class f5 extends r6 {

    /* renamed from: e, reason: collision with root package name */
    private static int f9878e;

    private f5(t6 t6Var) {
        super(t6Var);
    }

    public static void h(int i2) {
        if (i2 == 0 || f9878e == i2) {
            return;
        }
        f9878e = i2;
        m2.a().b(new f5(new g5(i2)));
    }

    @Override // com.flurry.sdk.u6
    public final s6 a() {
        return s6.APP_ORIENTATION;
    }
}
