package h3;

import g3.l;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o3.d;
import t3.y;

/* loaded from: classes.dex */
public class z extends o3.d {

    /* loaded from: classes.dex */
    class a extends o3.m {
        a(Class cls) {
            super(cls);
        }

        @Override // o3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g3.a a(t3.r rVar) {
            return new u3.g(rVar.X().x());
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
            hashMap.put("CHACHA20_POLY1305", new d.a.C0127a(t3.s.V(), l.b.TINK));
            hashMap.put("CHACHA20_POLY1305_RAW", new d.a.C0127a(t3.s.V(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o3.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t3.r a(t3.s sVar) {
            return (t3.r) t3.r.Z().s(z.this.k()).r(com.google.crypto.tink.shaded.protobuf.h.l(u3.p.c(32))).i();
        }

        @Override // o3.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public t3.s d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return t3.s.W(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // o3.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(t3.s sVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z() {
        super(t3.r.class, new a(g3.a.class));
    }

    public static void m(boolean z5) {
        g3.x.l(new z(), z5);
        c0.c();
    }

    @Override // o3.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // o3.d
    public d.a f() {
        return new b(t3.s.class);
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
    public t3.r h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return t3.r.a0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // o3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(t3.r rVar) {
        u3.r.c(rVar.Y(), k());
        if (rVar.X().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
