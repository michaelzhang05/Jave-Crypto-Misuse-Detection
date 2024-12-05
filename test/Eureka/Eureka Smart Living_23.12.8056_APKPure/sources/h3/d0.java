package h3;

import o3.d;
import t3.y;

/* loaded from: classes.dex */
public class d0 extends o3.d {

    /* loaded from: classes.dex */
    class a extends o3.m {
        a(Class cls) {
            super(cls);
        }

        @Override // o3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g3.a a(t3.e0 e0Var) {
            String W = e0Var.X().W();
            return g3.s.a(W).a(W);
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // o3.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t3.e0 a(t3.f0 f0Var) {
            return (t3.e0) t3.e0.Z().r(f0Var).s(d0.this.k()).i();
        }

        @Override // o3.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public t3.f0 d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return t3.f0.X(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // o3.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(t3.f0 f0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0() {
        super(t3.e0.class, new a(g3.a.class));
    }

    public static void m(boolean z5) {
        g3.x.l(new d0(), z5);
    }

    @Override // o3.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // o3.d
    public d.a f() {
        return new b(t3.f0.class);
    }

    @Override // o3.d
    public y.c g() {
        return y.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    @Override // o3.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public t3.e0 h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return t3.e0.a0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // o3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(t3.e0 e0Var) {
        u3.r.c(e0Var.Y(), k());
    }
}
