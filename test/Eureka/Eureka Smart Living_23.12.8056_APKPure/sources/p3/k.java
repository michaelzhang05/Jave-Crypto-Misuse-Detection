package p3;

import g3.l;
import g3.t;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import l3.b;
import o3.d;
import o3.l;
import t3.u;
import t3.v;
import t3.w;
import t3.x;
import t3.y;

/* loaded from: classes.dex */
public final class k extends o3.d {

    /* renamed from: d, reason: collision with root package name */
    private static final o3.l f8844d = o3.l.b(new l.b() { // from class: p3.j
        @Override // o3.l.b
        public final Object a(g3.g gVar) {
            return new q3.c((i) gVar);
        }
    }, i.class, g.class);

    /* loaded from: classes.dex */
    class a extends o3.m {
        a(Class cls) {
            super(cls);
        }

        @Override // o3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(v vVar) {
            u Y = vVar.a0().Y();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.Z().x(), "HMAC");
            int Z = vVar.a0().Z();
            int i6 = c.f8846a[Y.ordinal()];
            if (i6 == 1) {
                return new u3.o(new u3.n("HMACSHA1", secretKeySpec), Z);
            }
            if (i6 == 2) {
                return new u3.o(new u3.n("HMACSHA224", secretKeySpec), Z);
            }
            if (i6 == 3) {
                return new u3.o(new u3.n("HMACSHA256", secretKeySpec), Z);
            }
            if (i6 == 4) {
                return new u3.o(new u3.n("HMACSHA384", secretKeySpec), Z);
            }
            if (i6 == 5) {
                return new u3.o(new u3.n("HMACSHA512", secretKeySpec), Z);
            }
            throw new GeneralSecurityException("unknown hash");
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
            u uVar = u.SHA256;
            l.b bVar = l.b.TINK;
            hashMap.put("HMAC_SHA256_128BITTAG", k.m(32, 16, uVar, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", k.m(32, 16, uVar, bVar2));
            hashMap.put("HMAC_SHA256_256BITTAG", k.m(32, 32, uVar, bVar));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", k.m(32, 32, uVar, bVar2));
            u uVar2 = u.SHA512;
            hashMap.put("HMAC_SHA512_128BITTAG", k.m(64, 16, uVar2, bVar));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", k.m(64, 16, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_256BITTAG", k.m(64, 32, uVar2, bVar));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", k.m(64, 32, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_512BITTAG", k.m(64, 64, uVar2, bVar));
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", k.m(64, 64, uVar2, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // o3.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public v a(w wVar) {
            return (v) v.c0().t(k.this.n()).s(wVar.Z()).r(com.google.crypto.tink.shaded.protobuf.h.l(u3.p.c(wVar.Y()))).i();
        }

        @Override // o3.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public w d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return w.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // o3.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(w wVar) {
            if (wVar.Y() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            k.r(wVar.Z());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8846a;

        static {
            int[] iArr = new int[u.values().length];
            f8846a = iArr;
            try {
                iArr[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8846a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8846a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8846a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8846a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k() {
        super(v.class, new a(t.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0127a m(int i6, int i7, u uVar, l.b bVar) {
        return new d.a.C0127a((w) w.a0().s((x) x.a0().r(uVar).s(i7).i()).r(i6).i(), bVar);
    }

    public static void p(boolean z5) {
        g3.x.l(new k(), z5);
        n.c();
        o3.h.c().d(f8844d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(x xVar) {
        if (xVar.Z() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i6 = c.f8846a[xVar.Y().ordinal()];
        if (i6 == 1) {
            if (xVar.Z() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i6 == 2) {
            if (xVar.Z() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i6 == 3) {
            if (xVar.Z() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i6 == 4) {
            if (xVar.Z() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i6 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (xVar.Z() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // o3.d
    public b.EnumC0114b a() {
        return b.EnumC0114b.f7403b;
    }

    @Override // o3.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // o3.d
    public d.a f() {
        return new b(w.class);
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
    public v h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return v.d0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // o3.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(v vVar) {
        u3.r.c(vVar.b0(), n());
        if (vVar.Z().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        r(vVar.a0());
    }
}
