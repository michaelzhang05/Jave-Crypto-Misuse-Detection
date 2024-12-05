package L1;

import K1.i;
import K1.j;
import K1.l;
import K1.m;
import K1.u;
import O1.o;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public class b extends o implements l {
    public b(SecretKey secretKey) {
        super(secretKey);
    }

    @Override // K1.l
    public j b(m mVar, byte[] bArr) {
        i t8 = mVar.t();
        if (t8.equals(i.f5760l)) {
            K1.d v8 = mVar.v();
            if (v8.c() == Z1.e.f(i().getEncoded())) {
                return O1.l.c(mVar, bArr, i(), null, g());
            }
            throw new u(v8.c(), v8);
        }
        throw new K1.f(O1.e.c(t8, o.f7747e));
    }
}
