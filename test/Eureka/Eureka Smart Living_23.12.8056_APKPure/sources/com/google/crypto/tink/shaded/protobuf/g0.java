package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g0 implements e1 {

    /* renamed from: b, reason: collision with root package name */
    private static final n0 f5482b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final n0 f5483a;

    /* loaded from: classes.dex */
    class a implements n0 {
        a() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n0
        public boolean a(Class cls) {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n0
        public m0 b(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements n0 {

        /* renamed from: a, reason: collision with root package name */
        private n0[] f5484a;

        b(n0... n0VarArr) {
            this.f5484a = n0VarArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n0
        public boolean a(Class cls) {
            for (n0 n0Var : this.f5484a) {
                if (n0Var.a(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.n0
        public m0 b(Class cls) {
            for (n0 n0Var : this.f5484a) {
                if (n0Var.a(cls)) {
                    return n0Var.b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public g0() {
        this(b());
    }

    private static n0 b() {
        return new b(w.c(), c());
    }

    private static n0 c() {
        try {
            return (n0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f5482b;
        }
    }

    private static boolean d(m0 m0Var) {
        return m0Var.a() == y0.PROTO2;
    }

    private static d1 e(Class cls, m0 m0Var) {
        return x.class.isAssignableFrom(cls) ? d(m0Var) ? r0.T(cls, m0Var, v0.b(), e0.b(), f1.L(), s.b(), l0.b()) : r0.T(cls, m0Var, v0.b(), e0.b(), f1.L(), null, l0.b()) : d(m0Var) ? r0.T(cls, m0Var, v0.a(), e0.a(), f1.G(), s.a(), l0.a()) : r0.T(cls, m0Var, v0.a(), e0.a(), f1.H(), null, l0.a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e1
    public d1 a(Class cls) {
        j1 G;
        q a6;
        f1.I(cls);
        m0 b6 = this.f5483a.b(cls);
        if (!b6.c()) {
            return e(cls, b6);
        }
        if (x.class.isAssignableFrom(cls)) {
            G = f1.L();
            a6 = s.b();
        } else {
            G = f1.G();
            a6 = s.a();
        }
        return s0.m(G, a6, b6.b());
    }

    private g0(n0 n0Var) {
        this.f5483a = (n0) z.b(n0Var, "messageInfoFactory");
    }
}
