package L1;

import K1.q;
import K1.s;
import O1.m;
import O1.v;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class d extends v implements s {

    /* renamed from: e, reason: collision with root package name */
    private final m f6046e;

    public d(byte[] bArr) {
        this(bArr, null);
    }

    @Override // K1.s
    public boolean d(q qVar, byte[] bArr, Z1.c cVar) {
        if (!this.f6046e.d(qVar)) {
            return false;
        }
        return P1.a.a(O1.s.a(v.h(qVar.t()), i(), bArr, e().a()), cVar.a());
    }

    public d(SecretKey secretKey) {
        this(secretKey.getEncoded());
    }

    public d(byte[] bArr, Set set) {
        super(bArr, v.f7755d);
        m mVar = new m();
        this.f6046e = mVar;
        mVar.e(set);
    }
}
