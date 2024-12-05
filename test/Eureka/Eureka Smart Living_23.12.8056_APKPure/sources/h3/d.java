package h3;

import g3.v;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import r3.b;

/* loaded from: classes.dex */
public class d implements g3.w {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f6837a = Logger.getLogger(d.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final d f6838b = new d();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements g3.a {

        /* renamed from: a, reason: collision with root package name */
        private final g3.v f6839a;

        /* renamed from: b, reason: collision with root package name */
        private final b.a f6840b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f6841c;

        private b(g3.v vVar) {
            b.a aVar;
            this.f6839a = vVar;
            if (vVar.i()) {
                r3.b a6 = o3.g.b().a();
                r3.c a7 = o3.f.a(vVar);
                this.f6840b = a6.a(a7, "aead", "encrypt");
                aVar = a6.a(a7, "aead", "decrypt");
            } else {
                aVar = o3.f.f8232a;
                this.f6840b = aVar;
            }
            this.f6841c = aVar;
        }

        @Override // g3.a
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a6 = u3.f.a(this.f6839a.e().b(), ((g3.a) this.f6839a.e().g()).a(bArr, bArr2));
                this.f6840b.b(this.f6839a.e().d(), bArr.length);
                return a6;
            } catch (GeneralSecurityException e6) {
                this.f6840b.a();
                throw e6;
            }
        }

        @Override // g3.a
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c cVar : this.f6839a.f(copyOf)) {
                    try {
                        byte[] b6 = ((g3.a) cVar.g()).b(copyOfRange, bArr2);
                        this.f6841c.b(cVar.d(), copyOfRange.length);
                        return b6;
                    } catch (GeneralSecurityException e6) {
                        d.f6837a.info("ciphertext prefix matches a key, but cannot decrypt: " + e6);
                    }
                }
            }
            for (v.c cVar2 : this.f6839a.h()) {
                try {
                    byte[] b7 = ((g3.a) cVar2.g()).b(bArr, bArr2);
                    this.f6841c.b(cVar2.d(), bArr.length);
                    return b7;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f6841c.a();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    d() {
    }

    public static void e() {
        g3.x.n(f6838b);
    }

    @Override // g3.w
    public Class a() {
        return g3.a.class;
    }

    @Override // g3.w
    public Class c() {
        return g3.a.class;
    }

    @Override // g3.w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public g3.a b(g3.v vVar) {
        return new b(vVar);
    }
}
