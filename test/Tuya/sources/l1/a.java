package L1;

import K1.i;
import K1.k;
import O1.l;
import O1.m;
import O1.o;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class a extends o implements k {

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6042g;

    /* renamed from: h, reason: collision with root package name */
    private final m f6043h;

    public a(SecretKey secretKey, boolean z8) {
        super(secretKey);
        this.f6043h = new m();
        this.f6042g = z8;
    }

    @Override // K1.k
    public byte[] a(K1.m mVar, Z1.c cVar, Z1.c cVar2, Z1.c cVar3, Z1.c cVar4) {
        if (!this.f6042g) {
            i t8 = mVar.t();
            if (t8.equals(i.f5760l)) {
                if (cVar != null) {
                    throw new K1.f("Unexpected present JWE encrypted key");
                }
            } else {
                throw new K1.f(O1.e.c(t8, o.f7747e));
            }
        }
        if (cVar2 != null) {
            if (cVar4 != null) {
                this.f6043h.a(mVar);
                return l.b(mVar, null, cVar2, cVar3, cVar4, i(), g());
            }
            throw new K1.f("Missing JWE authentication tag");
        }
        throw new K1.f("Unexpected present JWE initialization vector (IV)");
    }

    public a(byte[] bArr) {
        this(new SecretKeySpec(bArr, "AES"), false);
    }
}
