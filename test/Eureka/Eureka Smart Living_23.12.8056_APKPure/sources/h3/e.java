package h3;

import g3.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l3.b;
import o3.d;
import t3.y;

/* loaded from: classes.dex */
public final class e extends o3.d {

    /* loaded from: classes.dex */
    class a extends o3.m {
        a(Class cls) {
            super(cls);
        }

        @Override // o3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g3.a a(t3.d dVar) {
            return new u3.h((u3.l) new f().e(dVar.Y(), u3.l.class), (g3.t) new p3.k().e(dVar.Z(), g3.t.class), dVar.Z().a0().Z());
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
            t3.u uVar = t3.u.SHA256;
            l.b bVar = l.b.TINK;
            hashMap.put("AES128_CTR_HMAC_SHA256", e.l(16, 16, 32, 16, uVar, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", e.l(16, 16, 32, 16, uVar, bVar2));
            hashMap.put("AES256_CTR_HMAC_SHA256", e.l(32, 16, 32, 32, uVar, bVar));
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", e.l(32, 16, 32, 32, uVar, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o3.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t3.d a(t3.e eVar) {
            t3.f fVar = (t3.f) new f().f().a(eVar.X());
            return (t3.d) t3.d.b0().r(fVar).s((t3.v) new p3.k().f().a(eVar.Y())).t(e.this.n()).i();
        }

        @Override // o3.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public t3.e d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return t3.e.a0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // o3.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(t3.e eVar) {
            new f().f().e(eVar.X());
            new p3.k().f().e(eVar.Y());
            u3.r.a(eVar.X().Y());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        super(t3.d.class, new a(g3.a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0127a l(int i6, int i7, int i8, int i9, t3.u uVar, l.b bVar) {
        return new d.a.C0127a(m(i6, i7, i8, i9, uVar), bVar);
    }

    private static t3.e m(int i6, int i7, int i8, int i9, t3.u uVar) {
        t3.g gVar = (t3.g) t3.g.a0().s((t3.h) t3.h.Y().r(i7).i()).r(i6).i();
        return (t3.e) t3.e.Z().r(gVar).s((t3.w) t3.w.a0().s((t3.x) t3.x.a0().r(uVar).s(i9).i()).r(i8).i()).i();
    }

    public static void p(boolean z5) {
        g3.x.l(new e(), z5);
    }

    @Override // o3.d
    public b.EnumC0114b a() {
        return b.EnumC0114b.f7403b;
    }

    @Override // o3.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // o3.d
    public d.a f() {
        return new b(t3.e.class);
    }

    @Override // o3.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // o3.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public t3.d h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return t3.d.c0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // o3.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(t3.d dVar) {
        u3.r.c(dVar.a0(), n());
        new f().j(dVar.Y());
        new p3.k().j(dVar.Z());
    }
}
