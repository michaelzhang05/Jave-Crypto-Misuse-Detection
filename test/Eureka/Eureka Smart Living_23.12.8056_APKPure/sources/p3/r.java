package p3;

import g3.t;
import g3.v;
import g3.w;
import g3.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import r3.b;
import t3.i0;

/* loaded from: classes.dex */
class r implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f8877a = Logger.getLogger(r.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f8878b = {0};

    /* renamed from: c, reason: collision with root package name */
    private static final r f8879c = new r();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements t {

        /* renamed from: a, reason: collision with root package name */
        private final v f8880a;

        /* renamed from: b, reason: collision with root package name */
        private final b.a f8881b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f8882c;

        private b(v vVar) {
            b.a aVar;
            this.f8880a = vVar;
            if (vVar.i()) {
                r3.b a6 = o3.g.b().a();
                r3.c a7 = o3.f.a(vVar);
                this.f8881b = a6.a(a7, "mac", "compute");
                aVar = a6.a(a7, "mac", "verify");
            } else {
                aVar = o3.f.f8232a;
                this.f8881b = aVar;
            }
            this.f8882c = aVar;
        }

        @Override // g3.t
        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length <= 5) {
                this.f8882c.a();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (v.c cVar : this.f8880a.f(copyOf)) {
                try {
                    ((t) cVar.g()).a(copyOfRange, cVar.f().equals(i0.LEGACY) ? u3.f.a(bArr2, r.f8878b) : bArr2);
                    this.f8882c.b(cVar.d(), r3.length);
                    return;
                } catch (GeneralSecurityException e6) {
                    r.f8877a.info("tag prefix matches a key, but cannot verify: " + e6);
                }
            }
            for (v.c cVar2 : this.f8880a.h()) {
                try {
                    ((t) cVar2.g()).a(bArr, bArr2);
                    this.f8882c.b(cVar2.d(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f8882c.a();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // g3.t
        public byte[] b(byte[] bArr) {
            if (this.f8880a.e().f().equals(i0.LEGACY)) {
                bArr = u3.f.a(bArr, r.f8878b);
            }
            try {
                byte[] a6 = u3.f.a(this.f8880a.e().b(), ((t) this.f8880a.e().g()).b(bArr));
                this.f8881b.b(this.f8880a.e().d(), bArr.length);
                return a6;
            } catch (GeneralSecurityException e6) {
                this.f8881b.a();
                throw e6;
            }
        }
    }

    r() {
    }

    public static void f() {
        x.n(f8879c);
    }

    private void g(v vVar) {
        Iterator it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c cVar : (List) it.next()) {
                if (cVar.c() instanceof p) {
                    p pVar = (p) cVar.c();
                    v3.a a6 = v3.a.a(cVar.b());
                    if (!a6.equals(pVar.a())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + pVar.b() + " has wrong output prefix (" + pVar.a() + ") instead of (" + a6 + ")");
                    }
                }
            }
        }
    }

    @Override // g3.w
    public Class a() {
        return t.class;
    }

    @Override // g3.w
    public Class c() {
        return t.class;
    }

    @Override // g3.w
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public t b(v vVar) {
        g(vVar);
        return new b(vVar);
    }
}
