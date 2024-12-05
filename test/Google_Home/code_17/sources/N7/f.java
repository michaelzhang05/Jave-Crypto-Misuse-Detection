package n7;

import U6.AbstractC1455m;
import U6.AbstractC1457o;
import U6.AbstractC1460s;
import U6.AbstractC1462u;
import U6.C1439a0;
import U6.C1446e;
import U6.C1447e0;
import U6.C1453k;
import U6.C1456n;
import U6.InterfaceC1444d;
import s7.C4020a;
import t7.AbstractC4043a;

/* loaded from: classes5.dex */
public class f extends AbstractC1455m {

    /* renamed from: a, reason: collision with root package name */
    private C1453k f35696a;

    /* renamed from: b, reason: collision with root package name */
    private C1456n f35697b;

    /* renamed from: c, reason: collision with root package name */
    private byte[][] f35698c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f35699d;

    /* renamed from: e, reason: collision with root package name */
    private byte[][] f35700e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f35701f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f35702g;

    /* renamed from: h, reason: collision with root package name */
    private C4020a[] f35703h;

    private f(AbstractC1462u abstractC1462u) {
        int i8 = 0;
        if (abstractC1462u.v(0) instanceof C1453k) {
            this.f35696a = C1453k.v(abstractC1462u.v(0));
        } else {
            this.f35697b = C1456n.B(abstractC1462u.v(0));
        }
        AbstractC1462u abstractC1462u2 = (AbstractC1462u) abstractC1462u.v(1);
        this.f35698c = new byte[abstractC1462u2.size()];
        for (int i9 = 0; i9 < abstractC1462u2.size(); i9++) {
            this.f35698c[i9] = ((AbstractC1457o) abstractC1462u2.v(i9)).y();
        }
        this.f35699d = ((AbstractC1457o) ((AbstractC1462u) abstractC1462u.v(2)).v(0)).y();
        AbstractC1462u abstractC1462u3 = (AbstractC1462u) abstractC1462u.v(3);
        this.f35700e = new byte[abstractC1462u3.size()];
        for (int i10 = 0; i10 < abstractC1462u3.size(); i10++) {
            this.f35700e[i10] = ((AbstractC1457o) abstractC1462u3.v(i10)).y();
        }
        this.f35701f = ((AbstractC1457o) ((AbstractC1462u) abstractC1462u.v(4)).v(0)).y();
        this.f35702g = ((AbstractC1457o) ((AbstractC1462u) abstractC1462u.v(5)).v(0)).y();
        AbstractC1462u abstractC1462u4 = (AbstractC1462u) abstractC1462u.v(6);
        byte[][][][] bArr = new byte[abstractC1462u4.size()][][];
        byte[][][][] bArr2 = new byte[abstractC1462u4.size()][][];
        byte[][][] bArr3 = new byte[abstractC1462u4.size()][];
        byte[][] bArr4 = new byte[abstractC1462u4.size()];
        int i11 = 0;
        while (i11 < abstractC1462u4.size()) {
            AbstractC1462u abstractC1462u5 = (AbstractC1462u) abstractC1462u4.v(i11);
            AbstractC1462u abstractC1462u6 = (AbstractC1462u) abstractC1462u5.v(i8);
            bArr[i11] = new byte[abstractC1462u6.size()][];
            for (int i12 = 0; i12 < abstractC1462u6.size(); i12++) {
                AbstractC1462u abstractC1462u7 = (AbstractC1462u) abstractC1462u6.v(i12);
                bArr[i11][i12] = new byte[abstractC1462u7.size()];
                for (int i13 = 0; i13 < abstractC1462u7.size(); i13++) {
                    bArr[i11][i12][i13] = ((AbstractC1457o) abstractC1462u7.v(i13)).y();
                }
            }
            AbstractC1462u abstractC1462u8 = (AbstractC1462u) abstractC1462u5.v(1);
            bArr2[i11] = new byte[abstractC1462u8.size()][];
            for (int i14 = 0; i14 < abstractC1462u8.size(); i14++) {
                AbstractC1462u abstractC1462u9 = (AbstractC1462u) abstractC1462u8.v(i14);
                bArr2[i11][i14] = new byte[abstractC1462u9.size()];
                for (int i15 = 0; i15 < abstractC1462u9.size(); i15++) {
                    bArr2[i11][i14][i15] = ((AbstractC1457o) abstractC1462u9.v(i15)).y();
                }
            }
            AbstractC1462u abstractC1462u10 = (AbstractC1462u) abstractC1462u5.v(2);
            bArr3[i11] = new byte[abstractC1462u10.size()];
            for (int i16 = 0; i16 < abstractC1462u10.size(); i16++) {
                bArr3[i11][i16] = ((AbstractC1457o) abstractC1462u10.v(i16)).y();
            }
            bArr4[i11] = ((AbstractC1457o) abstractC1462u5.v(3)).y();
            i11++;
            i8 = 0;
        }
        int length = this.f35702g.length - 1;
        this.f35703h = new C4020a[length];
        int i17 = 0;
        while (i17 < length) {
            byte[] bArr5 = this.f35702g;
            int i18 = i17 + 1;
            this.f35703h[i17] = new C4020a(bArr5[i17], bArr5[i18], AbstractC4043a.f(bArr[i17]), AbstractC4043a.f(bArr2[i17]), AbstractC4043a.d(bArr3[i17]), AbstractC4043a.b(bArr4[i17]));
            i17 = i18;
        }
    }

    public static f n(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(AbstractC1462u.u(obj));
        }
        return null;
    }

    @Override // U6.AbstractC1455m, U6.InterfaceC1444d
    public AbstractC1460s d() {
        C1446e c1446e = new C1446e();
        InterfaceC1444d interfaceC1444d = this.f35696a;
        if (interfaceC1444d == null) {
            interfaceC1444d = this.f35697b;
        }
        c1446e.a(interfaceC1444d);
        C1446e c1446e2 = new C1446e();
        int i8 = 0;
        while (true) {
            byte[][] bArr = this.f35698c;
            if (i8 >= bArr.length) {
                break;
            }
            c1446e2.a(new C1439a0(bArr[i8]));
            i8++;
        }
        c1446e.a(new C1447e0(c1446e2));
        C1446e c1446e3 = new C1446e();
        c1446e3.a(new C1439a0(this.f35699d));
        c1446e.a(new C1447e0(c1446e3));
        C1446e c1446e4 = new C1446e();
        int i9 = 0;
        while (true) {
            byte[][] bArr2 = this.f35700e;
            if (i9 >= bArr2.length) {
                break;
            }
            c1446e4.a(new C1439a0(bArr2[i9]));
            i9++;
        }
        c1446e.a(new C1447e0(c1446e4));
        C1446e c1446e5 = new C1446e();
        c1446e5.a(new C1439a0(this.f35701f));
        c1446e.a(new C1447e0(c1446e5));
        C1446e c1446e6 = new C1446e();
        c1446e6.a(new C1439a0(this.f35702g));
        c1446e.a(new C1447e0(c1446e6));
        C1446e c1446e7 = new C1446e();
        for (int i10 = 0; i10 < this.f35703h.length; i10++) {
            C1446e c1446e8 = new C1446e();
            byte[][][] e8 = AbstractC4043a.e(this.f35703h[i10].a());
            C1446e c1446e9 = new C1446e();
            for (byte[][] bArr3 : e8) {
                C1446e c1446e10 = new C1446e();
                int i11 = 0;
                while (true) {
                    if (i11 < bArr3.length) {
                        c1446e10.a(new C1439a0(bArr3[i11]));
                        i11++;
                    }
                }
                c1446e9.a(new C1447e0(c1446e10));
            }
            c1446e8.a(new C1447e0(c1446e9));
            byte[][][] e9 = AbstractC4043a.e(this.f35703h[i10].b());
            C1446e c1446e11 = new C1446e();
            for (byte[][] bArr4 : e9) {
                C1446e c1446e12 = new C1446e();
                int i12 = 0;
                while (true) {
                    if (i12 < bArr4.length) {
                        c1446e12.a(new C1439a0(bArr4[i12]));
                        i12++;
                    }
                }
                c1446e11.a(new C1447e0(c1446e12));
            }
            c1446e8.a(new C1447e0(c1446e11));
            byte[][] c8 = AbstractC4043a.c(this.f35703h[i10].d());
            C1446e c1446e13 = new C1446e();
            for (byte[] bArr5 : c8) {
                c1446e13.a(new C1439a0(bArr5));
            }
            c1446e8.a(new C1447e0(c1446e13));
            c1446e8.a(new C1439a0(AbstractC4043a.a(this.f35703h[i10].c())));
            c1446e7.a(new C1447e0(c1446e8));
        }
        c1446e.a(new C1447e0(c1446e7));
        return new C1447e0(c1446e);
    }

    public short[] l() {
        return AbstractC4043a.b(this.f35699d);
    }

    public short[] m() {
        return AbstractC4043a.b(this.f35701f);
    }

    public short[][] o() {
        return AbstractC4043a.d(this.f35698c);
    }

    public short[][] p() {
        return AbstractC4043a.d(this.f35700e);
    }

    public C4020a[] q() {
        return this.f35703h;
    }

    public int[] r() {
        return AbstractC4043a.g(this.f35702g);
    }

    public f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C4020a[] c4020aArr) {
        this.f35696a = new C1453k(1L);
        this.f35698c = AbstractC4043a.c(sArr);
        this.f35699d = AbstractC4043a.a(sArr2);
        this.f35700e = AbstractC4043a.c(sArr3);
        this.f35701f = AbstractC4043a.a(sArr4);
        this.f35702g = AbstractC4043a.h(iArr);
        this.f35703h = c4020aArr;
    }
}
