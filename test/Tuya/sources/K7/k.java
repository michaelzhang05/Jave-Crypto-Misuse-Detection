package k7;

import R6.AbstractC1346m;
import R6.AbstractC1348o;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.AbstractC1358z;
import R6.C1330a0;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;
import R6.h0;

/* loaded from: classes5.dex */
public class k extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private final int f33727a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33728b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33729c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f33730d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f33731e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f33732f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f33733g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f33734h;

    public k(long j8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f33727a = 0;
        this.f33728b = j8;
        this.f33730d = E7.a.d(bArr);
        this.f33731e = E7.a.d(bArr2);
        this.f33732f = E7.a.d(bArr3);
        this.f33733g = E7.a.d(bArr4);
        this.f33734h = E7.a.d(bArr5);
        this.f33729c = -1L;
    }

    public static k q(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1344k c1344k;
        C1337e c1337e = new C1337e();
        if (this.f33729c >= 0) {
            c1344k = new C1344k(1L);
        } else {
            c1344k = new C1344k(0L);
        }
        c1337e.a(c1344k);
        C1337e c1337e2 = new C1337e();
        c1337e2.a(new C1344k(this.f33728b));
        c1337e2.a(new C1330a0(this.f33730d));
        c1337e2.a(new C1330a0(this.f33731e));
        c1337e2.a(new C1330a0(this.f33732f));
        c1337e2.a(new C1330a0(this.f33733g));
        long j8 = this.f33729c;
        if (j8 >= 0) {
            c1337e2.a(new h0(false, 0, new C1344k(j8)));
        }
        c1337e.a(new C1338e0(c1337e2));
        c1337e.a(new h0(true, 0, new C1330a0(this.f33734h)));
        return new C1338e0(c1337e);
    }

    public byte[] m() {
        return E7.a.d(this.f33734h);
    }

    public long p() {
        return this.f33728b;
    }

    public long r() {
        return this.f33729c;
    }

    public byte[] s() {
        return E7.a.d(this.f33732f);
    }

    public byte[] t() {
        return E7.a.d(this.f33733g);
    }

    public byte[] u() {
        return E7.a.d(this.f33731e);
    }

    public byte[] v() {
        return E7.a.d(this.f33730d);
    }

    public int w() {
        return this.f33727a;
    }

    public k(long j8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j9) {
        this.f33727a = 1;
        this.f33728b = j8;
        this.f33730d = E7.a.d(bArr);
        this.f33731e = E7.a.d(bArr2);
        this.f33732f = E7.a.d(bArr3);
        this.f33733g = E7.a.d(bArr4);
        this.f33734h = E7.a.d(bArr5);
        this.f33729c = j9;
    }

    private k(AbstractC1353u abstractC1353u) {
        long j8;
        C1344k x8 = C1344k.x(abstractC1353u.x(0));
        if (!x8.z(0) && !x8.z(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f33727a = x8.B();
        if (abstractC1353u.size() != 2 && abstractC1353u.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        AbstractC1353u w8 = AbstractC1353u.w(abstractC1353u.x(1));
        this.f33728b = C1344k.x(w8.x(0)).E();
        this.f33730d = E7.a.d(AbstractC1348o.x(w8.x(1)).y());
        this.f33731e = E7.a.d(AbstractC1348o.x(w8.x(2)).y());
        this.f33732f = E7.a.d(AbstractC1348o.x(w8.x(3)).y());
        this.f33733g = E7.a.d(AbstractC1348o.x(w8.x(4)).y());
        if (w8.size() == 6) {
            AbstractC1358z w9 = AbstractC1358z.w(w8.x(5));
            if (w9.y() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            j8 = C1344k.w(w9, false).E();
        } else {
            if (w8.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            j8 = -1;
        }
        this.f33729c = j8;
        if (abstractC1353u.size() == 3) {
            this.f33734h = E7.a.d(AbstractC1348o.w(AbstractC1358z.w(abstractC1353u.x(2)), true).y());
        } else {
            this.f33734h = null;
        }
    }
}
