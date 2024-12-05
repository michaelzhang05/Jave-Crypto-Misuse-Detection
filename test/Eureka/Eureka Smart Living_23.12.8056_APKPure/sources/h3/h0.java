package h3;

import g3.l;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o3.d;
import t3.l0;
import t3.y;

/* loaded from: classes.dex */
public class h0 extends o3.d {

    /* loaded from: classes.dex */
    class a extends o3.m {
        a(Class cls) {
            super(cls);
        }

        @Override // o3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g3.a a(t3.k0 k0Var) {
            return new u3.s(k0Var.X().x());
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // o3.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", new d.a.C0127a(l0.V(), l.b.TINK));
            hashMap.put("XCHACHA20_POLY1305_RAW", new d.a.C0127a(l0.V(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o3.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t3.k0 a(l0 l0Var) {
            return (t3.k0) t3.k0.Z().s(h0.this.k()).r(com.google.crypto.tink.shaded.protobuf.h.l(u3.p.c(32))).i();
        }

        @Override // o3.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public l0 d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return l0.W(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // o3.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(l0 l0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0() {
        super(t3.k0.class, new a(g3.a.class));
    }

    public static void m(boolean z5) {
        g3.x.l(new h0(), z5);
        k0.c();
    }

    @Override // o3.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // o3.d
    public d.a f() {
        return new b(l0.class);
    }

    @Override // o3.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // o3.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public t3.k0 h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return t3.k0.a0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // o3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(t3.k0 k0Var) {
        u3.r.c(k0Var.Y(), k());
        if (k0Var.X().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
