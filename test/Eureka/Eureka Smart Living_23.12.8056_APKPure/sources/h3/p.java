package h3;

import g3.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import l3.b;
import o3.d;
import t3.y;

/* loaded from: classes.dex */
public final class p extends o3.d {

    /* loaded from: classes.dex */
    class a extends o3.m {
        a(Class cls) {
            super(cls);
        }

        @Override // o3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g3.a a(t3.l lVar) {
            return new u3.c(lVar.X().x());
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
            l.b bVar = l.b.TINK;
            hashMap.put("AES128_GCM", p.l(16, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_GCM_RAW", p.l(16, bVar2));
            hashMap.put("AES256_GCM", p.l(32, bVar));
            hashMap.put("AES256_GCM_RAW", p.l(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o3.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t3.l a(t3.m mVar) {
            return (t3.l) t3.l.Z().r(com.google.crypto.tink.shaded.protobuf.h.l(u3.p.c(mVar.W()))).s(p.this.m()).i();
        }

        @Override // o3.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public t3.m d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return t3.m.Y(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // o3.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(t3.m mVar) {
            u3.r.a(mVar.W());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p() {
        super(t3.l.class, new a(g3.a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0127a l(int i6, l.b bVar) {
        return new d.a.C0127a((t3.m) t3.m.X().r(i6).i(), bVar);
    }

    public static void o(boolean z5) {
        g3.x.l(new p(), z5);
        s.c();
    }

    @Override // o3.d
    public b.EnumC0114b a() {
        return b.EnumC0114b.f7403b;
    }

    @Override // o3.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // o3.d
    public d.a f() {
        return new b(t3.m.class);
    }

    @Override // o3.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // o3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public t3.l h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return t3.l.a0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // o3.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(t3.l lVar) {
        u3.r.c(lVar.Y(), m());
        u3.r.a(lVar.X().size());
    }
}
