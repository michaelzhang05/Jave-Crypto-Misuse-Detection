package k7;

import R6.AbstractC1346m;
import R6.AbstractC1348o;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1330a0;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;

/* loaded from: classes5.dex */
public class n extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f33745a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f33746b;

    private n(AbstractC1353u abstractC1353u) {
        if (!C1344k.x(abstractC1353u.x(0)).z(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f33745a = E7.a.d(AbstractC1348o.x(abstractC1353u.x(1)).y());
        this.f33746b = E7.a.d(AbstractC1348o.x(abstractC1353u.x(2)).y());
    }

    public static n m(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj != null) {
            return new n(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        c1337e.a(new C1344k(0L));
        c1337e.a(new C1330a0(this.f33745a));
        c1337e.a(new C1330a0(this.f33746b));
        return new C1338e0(c1337e);
    }

    public byte[] p() {
        return E7.a.d(this.f33745a);
    }

    public byte[] q() {
        return E7.a.d(this.f33746b);
    }

    public n(byte[] bArr, byte[] bArr2) {
        this.f33745a = E7.a.d(bArr);
        this.f33746b = E7.a.d(bArr2);
    }
}
