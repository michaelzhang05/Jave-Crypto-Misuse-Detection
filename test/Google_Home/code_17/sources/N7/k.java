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
public class k extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private final int f35719a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35720b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35721c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f35722d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f35723e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f35724f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f35725g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f35726h;

    public k(long j8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f35719a = 0;
        this.f35720b = j8;
        this.f35722d = H7.a.d(bArr);
        this.f35723e = H7.a.d(bArr2);
        this.f35724f = H7.a.d(bArr3);
        this.f35725g = H7.a.d(bArr4);
        this.f35726h = H7.a.d(bArr5);
        this.f35721c = -1L;
    }

    public static k n(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1453k c1453k;
        C1446e c1446e = new C1446e();
        if (this.f35721c >= 0) {
            c1453k = new C1453k(1L);
        } else {
            c1453k = new C1453k(0L);
        }
        c1446e.a(c1453k);
        C1446e c1446e2 = new C1446e();
        c1446e2.a(new C1453k(this.f35720b));
        c1446e2.a(new C1439a0(this.f35722d));
        c1446e2.a(new C1439a0(this.f35723e));
        c1446e2.a(new C1439a0(this.f35724f));
        c1446e2.a(new C1439a0(this.f35725g));
        long j8 = this.f35721c;
        if (j8 >= 0) {
            c1446e2.a(new h0(false, 0, new C1453k(j8)));
        }
        c1446e.a(new C1447e0(c1446e2));
        c1446e.a(new h0(true, 0, new C1439a0(this.f35726h)));
        return new C1447e0(c1446e);
    }

    public byte[] l() {
        return H7.a.d(this.f35726h);
    }

    public long m() {
        return this.f35720b;
    }

    public long o() {
        return this.f35721c;
    }

    public byte[] p() {
        return H7.a.d(this.f35724f);
    }

    public byte[] q() {
        return H7.a.d(this.f35725g);
    }

    public byte[] r() {
        return H7.a.d(this.f35723e);
    }

    public byte[] t() {
        return H7.a.d(this.f35722d);
    }

    public int u() {
        return this.f35719a;
    }

    public k(long j8, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j9) {
        this.f35719a = 1;
        this.f35720b = j8;
        this.f35722d = H7.a.d(bArr);
        this.f35723e = H7.a.d(bArr2);
        this.f35724f = H7.a.d(bArr3);
        this.f35725g = H7.a.d(bArr4);
        this.f35726h = H7.a.d(bArr5);
        this.f35721c = j9;
    }

    private k(AbstractC1462u abstractC1462u) {
        long j8;
        C1453k v8 = C1453k.v(abstractC1462u.v(0));
        if (!v8.z(0) && !v8.z(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f35719a = v8.B();
        if (abstractC1462u.size() != 2 && abstractC1462u.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        AbstractC1462u u8 = AbstractC1462u.u(abstractC1462u.v(1));
        this.f35720b = C1453k.v(u8.v(0)).E();
        this.f35722d = H7.a.d(AbstractC1457o.v(u8.v(1)).y());
        this.f35723e = H7.a.d(AbstractC1457o.v(u8.v(2)).y());
        this.f35724f = H7.a.d(AbstractC1457o.v(u8.v(3)).y());
        this.f35725g = H7.a.d(AbstractC1457o.v(u8.v(4)).y());
        if (u8.size() == 6) {
            AbstractC1467z u9 = AbstractC1467z.u(u8.v(5));
            if (u9.y() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            j8 = C1453k.u(u9, false).E();
        } else {
            if (u8.size() != 5) {
                throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
            }
            j8 = -1;
        }
        this.f35721c = j8;
        if (abstractC1462u.size() == 3) {
            this.f35726h = H7.a.d(AbstractC1457o.u(AbstractC1467z.u(abstractC1462u.v(2)), true).y());
        } else {
            this.f35726h = null;
        }
    }
}
