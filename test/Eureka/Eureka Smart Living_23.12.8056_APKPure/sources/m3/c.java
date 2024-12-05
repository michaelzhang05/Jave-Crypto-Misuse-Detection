package m3;

import g3.e;
import g3.v;
import g3.w;
import g3.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import o3.f;
import o3.g;
import r3.b;

/* loaded from: classes.dex */
public class c implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f7877a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final c f7878b = new c();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        private final v f7879a;

        /* renamed from: b, reason: collision with root package name */
        private final b.a f7880b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f7881c;

        public a(v vVar) {
            b.a aVar;
            this.f7879a = vVar;
            if (vVar.i()) {
                r3.b a6 = g.b().a();
                r3.c a7 = f.a(vVar);
                this.f7880b = a6.a(a7, "daead", "encrypt");
                aVar = a6.a(a7, "daead", "decrypt");
            } else {
                aVar = f.f8232a;
                this.f7880b = aVar;
            }
            this.f7881c = aVar;
        }

        @Override // g3.e
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a6 = u3.f.a(this.f7879a.e().b(), ((e) this.f7879a.e().g()).a(bArr, bArr2));
                this.f7880b.b(this.f7879a.e().d(), bArr.length);
                return a6;
            } catch (GeneralSecurityException e6) {
                this.f7880b.a();
                throw e6;
            }
        }

        @Override // g3.e
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c cVar : this.f7879a.f(copyOf)) {
                    try {
                        byte[] b6 = ((e) cVar.g()).b(copyOfRange, bArr2);
                        this.f7881c.b(cVar.d(), copyOfRange.length);
                        return b6;
                    } catch (GeneralSecurityException e6) {
                        c.f7877a.info("ciphertext prefix matches a key, but cannot decrypt: " + e6);
                    }
                }
            }
            for (v.c cVar2 : this.f7879a.h()) {
                try {
                    byte[] b7 = ((e) cVar2.g()).b(bArr, bArr2);
                    this.f7881c.b(cVar2.d(), bArr.length);
                    return b7;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f7881c.a();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    c() {
    }

    public static void e() {
        x.n(f7878b);
    }

    @Override // g3.w
    public Class a() {
        return e.class;
    }

    @Override // g3.w
    public Class c() {
        return e.class;
    }

    @Override // g3.w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public e b(v vVar) {
        return new a(vVar);
    }
}
