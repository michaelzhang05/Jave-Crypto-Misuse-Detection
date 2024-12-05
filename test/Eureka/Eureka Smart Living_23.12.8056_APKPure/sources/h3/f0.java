package h3;

import java.security.GeneralSecurityException;
import o3.d;
import t3.y;

/* loaded from: classes.dex */
public class f0 extends o3.d {

    /* loaded from: classes.dex */
    class a extends o3.m {
        a(Class cls) {
            super(cls);
        }

        @Override // o3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g3.a a(t3.g0 g0Var) {
            String X = g0Var.X().X();
            return new e0(g0Var.X().W(), g3.s.a(X).a(X));
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // o3.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t3.g0 a(t3.h0 h0Var) {
            return (t3.g0) t3.g0.Z().r(h0Var).s(f0.this.k()).i();
        }

        @Override // o3.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public t3.h0 d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return t3.h0.Z(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // o3.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(t3.h0 h0Var) {
            if (h0Var.X().isEmpty() || !h0Var.Y()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0() {
        super(t3.g0.class, new a(g3.a.class));
    }

    public static void m(boolean z5) {
        g3.x.l(new f0(), z5);
    }

    @Override // o3.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // o3.d
    public d.a f() {
        return new b(t3.h0.class);
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
    public t3.g0 h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return t3.g0.a0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // o3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(t3.g0 g0Var) {
        u3.r.c(g0Var.Y(), k());
    }
}
