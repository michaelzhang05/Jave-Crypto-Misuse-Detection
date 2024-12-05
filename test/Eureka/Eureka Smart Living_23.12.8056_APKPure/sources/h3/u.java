package h3;

import g3.l;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import o3.d;
import t3.y;

/* loaded from: classes.dex */
public final class u extends o3.d {

    /* loaded from: classes.dex */
    class a extends o3.m {
        a(Class cls) {
            super(cls);
        }

        @Override // o3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g3.a a(t3.n nVar) {
            return new j3.a(nVar.X().x());
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
            hashMap.put("AES128_GCM_SIV", u.m(16, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_GCM_SIV_RAW", u.m(16, bVar2));
            hashMap.put("AES256_GCM_SIV", u.m(32, bVar));
            hashMap.put("AES256_GCM_SIV_RAW", u.m(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o3.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t3.n a(t3.o oVar) {
            return (t3.n) t3.n.Z().r(com.google.crypto.tink.shaded.protobuf.h.l(u3.p.c(oVar.W()))).s(u.this.n()).i();
        }

        @Override // o3.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public t3.o d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return t3.o.Y(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // o3.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(t3.o oVar) {
            u3.r.a(oVar.W());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u() {
        super(t3.n.class, new a(g3.a.class));
    }

    private static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0127a m(int i6, l.b bVar) {
        return new d.a.C0127a((t3.o) t3.o.X().r(i6).i(), bVar);
    }

    public static void p(boolean z5) {
        if (l()) {
            g3.x.l(new u(), z5);
            x.c();
        }
    }

    @Override // o3.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // o3.d
    public d.a f() {
        return new b(t3.o.class);
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
    public t3.n h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return t3.n.a0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // o3.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(t3.n nVar) {
        u3.r.c(nVar.Y(), n());
        u3.r.a(nVar.X().size());
    }
}
