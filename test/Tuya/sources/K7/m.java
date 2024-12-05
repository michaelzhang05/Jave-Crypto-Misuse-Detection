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
public class m extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private final int f33737a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33738b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f33739c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f33740d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f33741e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f33742f;

    /* renamed from: g, reason: collision with root package name */
    private final int f33743g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f33744h;

    public m(int i8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f33737a = 0;
        this.f33738b = i8;
        this.f33739c = E7.a.d(bArr);
        this.f33740d = E7.a.d(bArr2);
        this.f33741e = E7.a.d(bArr3);
        this.f33742f = E7.a.d(bArr4);
        this.f33744h = E7.a.d(bArr5);
        this.f33743g = -1;
    }

    public static m q(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1344k c1344k;
        C1337e c1337e = new C1337e();
        if (this.f33743g >= 0) {
            c1344k = new C1344k(1L);
        } else {
            c1344k = new C1344k(0L);
        }
        c1337e.a(c1344k);
        C1337e c1337e2 = new C1337e();
        c1337e2.a(new C1344k(this.f33738b));
        c1337e2.a(new C1330a0(this.f33739c));
        c1337e2.a(new C1330a0(this.f33740d));
        c1337e2.a(new C1330a0(this.f33741e));
        c1337e2.a(new C1330a0(this.f33742f));
        int i8 = this.f33743g;
        if (i8 >= 0) {
            c1337e2.a(new h0(false, 0, new C1344k(i8)));
        }
        c1337e.a(new C1338e0(c1337e2));
        c1337e.a(new h0(true, 0, new C1330a0(this.f33744h)));
        return new C1338e0(c1337e);
    }

    public byte[] m() {
        return E7.a.d(this.f33744h);
    }

    public int p() {
        return this.f33738b;
    }

    public int r() {
        return this.f33743g;
    }

    public byte[] s() {
        return E7.a.d(this.f33741e);
    }

    public byte[] t() {
        return E7.a.d(this.f33742f);
    }

    public byte[] u() {
        return E7.a.d(this.f33740d);
    }

    public byte[] v() {
        return E7.a.d(this.f33739c);
    }

    public int w() {
        return this.f33737a;
    }

    public m(int i8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i9) {
        this.f33737a = 1;
        this.f33738b = i8;
        this.f33739c = E7.a.d(bArr);
        this.f33740d = E7.a.d(bArr2);
        this.f33741e = E7.a.d(bArr3);
        this.f33742f = E7.a.d(bArr4);
        this.f33744h = E7.a.d(bArr5);
        this.f33743g = i9;
    }

    private m(AbstractC1353u abstractC1353u) {
        int i8;
        C1344k x8 = C1344k.x(abstractC1353u.x(0));
        if (!x8.z(0) && !x8.z(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f33737a = x8.B();
        if (abstractC1353u.size() != 2 && abstractC1353u.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        AbstractC1353u w8 = AbstractC1353u.w(abstractC1353u.x(1));
        this.f33738b = C1344k.x(w8.x(0)).B();
        this.f33739c = E7.a.d(AbstractC1348o.x(w8.x(1)).y());
        this.f33740d = E7.a.d(AbstractC1348o.x(w8.x(2)).y());
        this.f33741e = E7.a.d(AbstractC1348o.x(w8.x(3)).y());
        this.f33742f = E7.a.d(AbstractC1348o.x(w8.x(4)).y());
        if (w8.size() == 6) {
            AbstractC1358z w9 = AbstractC1358z.w(w8.x(5));
            if (w9.y() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            i8 = C1344k.w(w9, false).B();
        } else {
            if (w8.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            i8 = -1;
        }
        this.f33743g = i8;
        if (abstractC1353u.size() == 3) {
            this.f33744h = E7.a.d(AbstractC1348o.w(AbstractC1358z.w(abstractC1353u.x(2)), true).y());
        } else {
            this.f33744h = null;
        }
    }
}
