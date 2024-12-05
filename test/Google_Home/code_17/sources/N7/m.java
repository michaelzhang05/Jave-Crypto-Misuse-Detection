package n7;

import U6.AbstractC1455m;
import U6.AbstractC1457o;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.AbstractC1467z;
import U6.C1439a0;
import U6.C1446e;
import U6.C1447e0;
import U6.C1453k;
import U6.h0;

/* loaded from: classes5.dex */
public class m extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private final int f35729a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35730b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f35731c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f35732d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f35733e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f35734f;

    /* renamed from: g, reason: collision with root package name */
    private final int f35735g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f35736h;

    public m(int i8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f35729a = 0;
        this.f35730b = i8;
        this.f35731c = H7.a.d(bArr);
        this.f35732d = H7.a.d(bArr2);
        this.f35733e = H7.a.d(bArr3);
        this.f35734f = H7.a.d(bArr4);
        this.f35736h = H7.a.d(bArr5);
        this.f35735g = -1;
    }

    public static m n(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1453k c1453k;
        C1446e c1446e = new C1446e();
        if (this.f35735g >= 0) {
            c1453k = new C1453k(1L);
        } else {
            c1453k = new C1453k(0L);
        }
        c1446e.a(c1453k);
        C1446e c1446e2 = new C1446e();
        c1446e2.a(new C1453k(this.f35730b));
        c1446e2.a(new C1439a0(this.f35731c));
        c1446e2.a(new C1439a0(this.f35732d));
        c1446e2.a(new C1439a0(this.f35733e));
        c1446e2.a(new C1439a0(this.f35734f));
        int i8 = this.f35735g;
        if (i8 >= 0) {
            c1446e2.a(new h0(false, 0, new C1453k(i8)));
        }
        c1446e.a(new C1447e0(c1446e2));
        c1446e.a(new h0(true, 0, new C1439a0(this.f35736h)));
        return new C1447e0(c1446e);
    }

    public byte[] l() {
        return H7.a.d(this.f35736h);
    }

    public int m() {
        return this.f35730b;
    }

    public int o() {
        return this.f35735g;
    }

    public byte[] p() {
        return H7.a.d(this.f35733e);
    }

    public byte[] q() {
        return H7.a.d(this.f35734f);
    }

    public byte[] r() {
        return H7.a.d(this.f35732d);
    }

    public byte[] t() {
        return H7.a.d(this.f35731c);
    }

    public int u() {
        return this.f35729a;
    }

    public m(int i8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i9) {
        this.f35729a = 1;
        this.f35730b = i8;
        this.f35731c = H7.a.d(bArr);
        this.f35732d = H7.a.d(bArr2);
        this.f35733e = H7.a.d(bArr3);
        this.f35734f = H7.a.d(bArr4);
        this.f35736h = H7.a.d(bArr5);
        this.f35735g = i9;
    }

    private m(AbstractC1462u abstractC1462u) {
        int i8;
        C1453k v8 = C1453k.v(abstractC1462u.v(0));
        if (!v8.z(0) && !v8.z(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f35729a = v8.B();
        if (abstractC1462u.size() != 2 && abstractC1462u.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        AbstractC1462u u8 = AbstractC1462u.u(abstractC1462u.v(1));
        this.f35730b = C1453k.v(u8.v(0)).B();
        this.f35731c = H7.a.d(AbstractC1457o.v(u8.v(1)).y());
        this.f35732d = H7.a.d(AbstractC1457o.v(u8.v(2)).y());
        this.f35733e = H7.a.d(AbstractC1457o.v(u8.v(3)).y());
        this.f35734f = H7.a.d(AbstractC1457o.v(u8.v(4)).y());
        if (u8.size() == 6) {
            AbstractC1467z u9 = AbstractC1467z.u(u8.v(5));
            if (u9.y() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            i8 = C1453k.u(u9, false).B();
        } else {
            if (u8.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            i8 = -1;
        }
        this.f35735g = i8;
        if (abstractC1462u.size() == 3) {
            this.f35736h = H7.a.d(AbstractC1457o.u(AbstractC1467z.u(abstractC1462u.v(2)), true).y());
        } else {
            this.f35736h = null;
        }
    }
}
