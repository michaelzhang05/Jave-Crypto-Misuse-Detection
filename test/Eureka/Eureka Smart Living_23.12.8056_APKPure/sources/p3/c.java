package p3;

import g3.l;
import g3.t;
import g3.x;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o3.d;
import o3.l;
import t3.y;

/* loaded from: classes.dex */
public final class c extends o3.d {

    /* renamed from: d, reason: collision with root package name */
    private static final o3.l f8816d = o3.l.b(new l.b() { // from class: p3.b
        @Override // o3.l.b
        public final Object a(g3.g gVar) {
            return new q3.b((a) gVar);
        }
    }, p3.a.class, g.class);

    /* loaded from: classes.dex */
    class a extends o3.m {
        a(Class cls) {
            super(cls);
        }

        @Override // o3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(t3.a aVar) {
            return new u3.o(new u3.m(aVar.Y().x()), aVar.Z().X());
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
            t3.b bVar = (t3.b) t3.b.Z().r(32).s((t3.c) t3.c.Y().r(16).i()).i();
            l.b bVar2 = l.b.TINK;
            hashMap.put("AES_CMAC", new d.a.C0127a(bVar, bVar2));
            hashMap.put("AES256_CMAC", new d.a.C0127a((t3.b) t3.b.Z().r(32).s((t3.c) t3.c.Y().r(16).i()).i(), bVar2));
            hashMap.put("AES256_CMAC_RAW", new d.a.C0127a((t3.b) t3.b.Z().r(32).s((t3.c) t3.c.Y().r(16).i()).i(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o3.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t3.a a(t3.b bVar) {
            return (t3.a) t3.a.b0().t(0).r(com.google.crypto.tink.shaded.protobuf.h.l(u3.p.c(bVar.X()))).s(bVar.Y()).i();
        }

        @Override // o3.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public t3.b d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return t3.b.a0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // o3.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(t3.b bVar) {
            c.q(bVar.Y());
            c.r(bVar.X());
        }
    }

    c() {
        super(t3.a.class, new a(t.class));
    }

    public static void o(boolean z5) {
        x.l(new c(), z5);
        f.c();
        o3.h.c().d(f8816d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(t3.c cVar) {
        if (cVar.X() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (cVar.X() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(int i6) {
        if (i6 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // o3.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // o3.d
    public d.a f() {
        return new b(t3.b.class);
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
    public t3.a h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return t3.a.c0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // o3.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(t3.a aVar) {
        u3.r.c(aVar.a0(), m());
        r(aVar.Y().size());
        q(aVar.Z());
    }
}
