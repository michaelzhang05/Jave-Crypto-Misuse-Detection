package O1;

import N1.i;
import N1.j;
import N1.l;
import N1.m;
import N1.u;
import R1.o;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class b extends o implements l {
    public b(SecretKey secretKey) {
        super(secretKey);
    }

    @Override // N1.l
    public j c(m mVar, byte[] bArr) {
        i t8 = mVar.t();
        if (t8.equals(i.f7539l)) {
            N1.d v8 = mVar.v();
            if (v8.c() == c2.e.f(i().getEncoded())) {
                return R1.l.c(mVar, bArr, i(), null, g());
            }
            throw new u(v8.c(), v8);
        }
        throw new N1.f(R1.e.c(t8, o.f9603e));
    }
}
