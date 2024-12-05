package n7;

import U6.AbstractC1455m;
import U6.AbstractC1457o;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.C1439a0;
import U6.C1446e;
import U6.C1447e0;
import U6.C1453k;

/* loaded from: classes5.dex */
public class n extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f35737a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f35738b;

    private n(AbstractC1462u abstractC1462u) {
        if (!C1453k.v(abstractC1462u.v(0)).z(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f35737a = H7.a.d(AbstractC1457o.v(abstractC1462u.v(1)).y());
        this.f35738b = H7.a.d(AbstractC1457o.v(abstractC1462u.v(2)).y());
    }

    public static n l(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj != null) {
            return new n(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e();
        c1446e.a(new C1453k(0L));
        c1446e.a(new C1439a0(this.f35737a));
        c1446e.a(new C1439a0(this.f35738b));
        return new C1447e0(c1446e);
    }

    public byte[] m() {
        return H7.a.d(this.f35737a);
    }

    public byte[] n() {
        return H7.a.d(this.f35738b);
    }

    public n(byte[] bArr, byte[] bArr2) {
        this.f35737a = H7.a.d(bArr);
        this.f35738b = H7.a.d(bArr2);
    }
}
