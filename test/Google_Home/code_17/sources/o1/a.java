package O1;

import N1.i;
import N1.k;
import R1.l;
import R1.m;
import R1.o;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class a extends o implements k {

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7833g;

    /* renamed from: h, reason: collision with root package name */
    private final m f7834h;

    public a(SecretKey secretKey, boolean z8) {
        super(secretKey);
        this.f7834h = new m();
        this.f7833g = z8;
    }

    @Override // N1.k
    public byte[] f(N1.m mVar, c2.c cVar, c2.c cVar2, c2.c cVar3, c2.c cVar4) {
        if (!this.f7833g) {
            i t8 = mVar.t();
            if (t8.equals(i.f7539l)) {
                if (cVar != null) {
                    throw new N1.f("Unexpected present JWE encrypted key");
                }
            } else {
                throw new N1.f(R1.e.c(t8, o.f9603e));
            }
        }
        if (cVar2 != null) {
            if (cVar4 != null) {
                this.f7834h.a(mVar);
                return l.b(mVar, null, cVar2, cVar3, cVar4, i(), g());
            }
            throw new N1.f("Missing JWE authentication tag");
        }
        throw new N1.f("Unexpected present JWE initialization vector (IV)");
    }

    public a(byte[] bArr) {
        this(new SecretKeySpec(bArr, "AES"), false);
    }
}
