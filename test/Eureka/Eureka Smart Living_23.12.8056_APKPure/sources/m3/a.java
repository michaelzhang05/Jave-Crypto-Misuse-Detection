package m3;

import com.google.crypto.tink.shaded.protobuf.h;
import g3.e;
import g3.l;
import g3.x;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o3.d;
import o3.m;
import t3.p;
import t3.q;
import t3.y;
import u3.r;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: m3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0118a extends m {
        C0118a(Class cls) {
            super(cls);
        }

        @Override // o3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a(p pVar) {
            return new u3.d(pVar.X().x());
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
            hashMap.put("AES256_SIV", new d.a.C0127a((q) q.X().r(64).i(), l.b.TINK));
            hashMap.put("AES256_SIV_RAW", new d.a.C0127a((q) q.X().r(64).i(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o3.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p a(q qVar) {
            return (p) p.Z().r(h.l(u3.p.c(qVar.W()))).s(a.this.k()).i();
        }

        @Override // o3.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public q d(h hVar) {
            return q.Y(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // o3.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(q qVar) {
            if (qVar.W() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.W() + ". Valid keys must have 64 bytes.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        super(p.class, new C0118a(e.class));
    }

    public static void m(boolean z5) {
        x.l(new a(), z5);
    }

    @Override // o3.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // o3.d
    public d.a f() {
        return new b(q.class);
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
    public p h(h hVar) {
        return p.a0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // o3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(p pVar) {
        r.c(pVar.Y(), k());
        if (pVar.X().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + pVar.X().size() + ". Valid keys must have 64 bytes.");
    }
}
