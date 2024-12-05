package h3;

import g3.l;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o3.d;
import t3.y;

/* loaded from: classes.dex */
public final class h extends o3.d {

    /* loaded from: classes.dex */
    class a extends o3.m {
        a(Class cls) {
            super(cls);
        }

        @Override // o3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g3.a a(t3.i iVar) {
            return new u3.b(iVar.Y().x(), iVar.Z().X());
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
            hashMap.put("AES128_EAX", h.l(16, 16, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_EAX_RAW", h.l(16, 16, bVar2));
            hashMap.put("AES256_EAX", h.l(32, 16, bVar));
            hashMap.put("AES256_EAX_RAW", h.l(32, 16, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o3.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t3.i a(t3.j jVar) {
            return (t3.i) t3.i.b0().r(com.google.crypto.tink.shaded.protobuf.h.l(u3.p.c(jVar.X()))).s(jVar.Y()).t(h.this.m()).i();
        }

        @Override // o3.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public t3.j d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return t3.j.a0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // o3.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(t3.j jVar) {
            u3.r.a(jVar.X());
            if (jVar.Y().X() != 12 && jVar.Y().X() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
        super(t3.i.class, new a(g3.a.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0127a l(int i6, int i7, l.b bVar) {
        return new d.a.C0127a((t3.j) t3.j.Z().r(i6).s((t3.k) t3.k.Y().r(i7).i()).i(), bVar);
    }

    public static void o(boolean z5) {
        g3.x.l(new h(), z5);
        n.c();
    }

    @Override // o3.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // o3.d
    public d.a f() {
        return new b(t3.j.class);
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
    public t3.i h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return t3.i.c0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // o3.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(t3.i iVar) {
        u3.r.c(iVar.a0(), m());
        u3.r.a(iVar.Y().size());
        if (iVar.Z().X() != 12 && iVar.Z().X() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
