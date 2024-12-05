package O1;

import N1.q;
import N1.s;
import R1.m;
import R1.v;
import java.util.Set;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class d extends v implements s {

    /* renamed from: e, reason: collision with root package name */
    private final m f7837e;

    public d(byte[] bArr) {
        this(bArr, null);
    }

    @Override // N1.s
    public boolean b(q qVar, byte[] bArr, c2.c cVar) {
        if (!this.f7837e.d(qVar)) {
            return false;
        }
        return S1.a.a(R1.s.a(v.h(qVar.t()), i(), bArr, d().a()), cVar.a());
    }

    public d(SecretKey secretKey) {
        this(secretKey.getEncoded());
    }

    public d(byte[] bArr, Set set) {
        super(bArr, v.f9611d);
        m mVar = new m();
        this.f7837e = mVar;
        mVar.e(set);
    }
}
