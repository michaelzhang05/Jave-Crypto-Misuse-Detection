package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m1 implements f2 {
    private static final u1 a = new n1();

    /* renamed from: b, reason: collision with root package name */
    private final u1 f15995b;

    public m1() {
        this(new o1(c1.c(), c()));
    }

    private static boolean b(t1 t1Var) {
        return t1Var.j() == zzuo.zze.f16133h;
    }

    private static u1 c() {
        try {
            return (u1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return a;
        }
    }

    @Override // com.google.android.gms.internal.measurement.f2
    public final <T> e2<T> a(Class<T> cls) {
        g2.F(cls);
        t1 a2 = this.f15995b.a(cls);
        if (a2.i()) {
            if (zzuo.class.isAssignableFrom(cls)) {
                return x1.h(g2.X(), x0.b(), a2.g());
            }
            return x1.h(g2.V(), x0.c(), a2.g());
        }
        if (zzuo.class.isAssignableFrom(cls)) {
            if (b(a2)) {
                return w1.i(cls, a2, a2.b(), h1.d(), g2.X(), x0.b(), s1.b());
            }
            return w1.i(cls, a2, a2.b(), h1.d(), g2.X(), null, s1.b());
        }
        if (b(a2)) {
            return w1.i(cls, a2, a2.a(), h1.c(), g2.V(), x0.c(), s1.a());
        }
        return w1.i(cls, a2, a2.a(), h1.c(), g2.W(), null, s1.a());
    }

    private m1(u1 u1Var) {
        this.f15995b = (u1) zzuq.d(u1Var, "messageInfoFactory");
    }
}
