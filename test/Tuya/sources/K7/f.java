package k7;

import R6.AbstractC1346m;
import R6.AbstractC1348o;
import R6.AbstractC1351s;
import R6.AbstractC1353u;
import R6.C1330a0;
import R6.C1337e;
import R6.C1338e0;
import R6.C1344k;
import R6.C1347n;
import R6.InterfaceC1335d;
import p7.C3626a;
import q7.AbstractC3664a;

/* loaded from: classes5.dex */
public class f extends AbstractC1346m {

    /* renamed from: a, reason: collision with root package name */
    private C1344k f33704a;

    /* renamed from: b, reason: collision with root package name */
    private C1347n f33705b;

    /* renamed from: c, reason: collision with root package name */
    private byte[][] f33706c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f33707d;

    /* renamed from: e, reason: collision with root package name */
    private byte[][] f33708e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f33709f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f33710g;

    /* renamed from: h, reason: collision with root package name */
    private C3626a[] f33711h;

    private f(AbstractC1353u abstractC1353u) {
        int i8 = 0;
        if (abstractC1353u.x(0) instanceof C1344k) {
            this.f33704a = C1344k.x(abstractC1353u.x(0));
        } else {
            this.f33705b = C1347n.B(abstractC1353u.x(0));
        }
        AbstractC1353u abstractC1353u2 = (AbstractC1353u) abstractC1353u.x(1);
        this.f33706c = new byte[abstractC1353u2.size()];
        for (int i9 = 0; i9 < abstractC1353u2.size(); i9++) {
            this.f33706c[i9] = ((AbstractC1348o) abstractC1353u2.x(i9)).y();
        }
        this.f33707d = ((AbstractC1348o) ((AbstractC1353u) abstractC1353u.x(2)).x(0)).y();
        AbstractC1353u abstractC1353u3 = (AbstractC1353u) abstractC1353u.x(3);
        this.f33708e = new byte[abstractC1353u3.size()];
        for (int i10 = 0; i10 < abstractC1353u3.size(); i10++) {
            this.f33708e[i10] = ((AbstractC1348o) abstractC1353u3.x(i10)).y();
        }
        this.f33709f = ((AbstractC1348o) ((AbstractC1353u) abstractC1353u.x(4)).x(0)).y();
        this.f33710g = ((AbstractC1348o) ((AbstractC1353u) abstractC1353u.x(5)).x(0)).y();
        AbstractC1353u abstractC1353u4 = (AbstractC1353u) abstractC1353u.x(6);
        byte[][][][] bArr = new byte[abstractC1353u4.size()][][];
        byte[][][][] bArr2 = new byte[abstractC1353u4.size()][][];
        byte[][][] bArr3 = new byte[abstractC1353u4.size()][];
        byte[][] bArr4 = new byte[abstractC1353u4.size()];
        int i11 = 0;
        while (i11 < abstractC1353u4.size()) {
            AbstractC1353u abstractC1353u5 = (AbstractC1353u) abstractC1353u4.x(i11);
            AbstractC1353u abstractC1353u6 = (AbstractC1353u) abstractC1353u5.x(i8);
            bArr[i11] = new byte[abstractC1353u6.size()][];
            for (int i12 = 0; i12 < abstractC1353u6.size(); i12++) {
                AbstractC1353u abstractC1353u7 = (AbstractC1353u) abstractC1353u6.x(i12);
                bArr[i11][i12] = new byte[abstractC1353u7.size()];
                for (int i13 = 0; i13 < abstractC1353u7.size(); i13++) {
                    bArr[i11][i12][i13] = ((AbstractC1348o) abstractC1353u7.x(i13)).y();
                }
            }
            AbstractC1353u abstractC1353u8 = (AbstractC1353u) abstractC1353u5.x(1);
            bArr2[i11] = new byte[abstractC1353u8.size()][];
            for (int i14 = 0; i14 < abstractC1353u8.size(); i14++) {
                AbstractC1353u abstractC1353u9 = (AbstractC1353u) abstractC1353u8.x(i14);
                bArr2[i11][i14] = new byte[abstractC1353u9.size()];
                for (int i15 = 0; i15 < abstractC1353u9.size(); i15++) {
                    bArr2[i11][i14][i15] = ((AbstractC1348o) abstractC1353u9.x(i15)).y();
                }
            }
            AbstractC1353u abstractC1353u10 = (AbstractC1353u) abstractC1353u5.x(2);
            bArr3[i11] = new byte[abstractC1353u10.size()];
            for (int i16 = 0; i16 < abstractC1353u10.size(); i16++) {
                bArr3[i11][i16] = ((AbstractC1348o) abstractC1353u10.x(i16)).y();
            }
            bArr4[i11] = ((AbstractC1348o) abstractC1353u5.x(3)).y();
            i11++;
            i8 = 0;
        }
        int length = this.f33710g.length - 1;
        this.f33711h = new C3626a[length];
        int i17 = 0;
        while (i17 < length) {
            byte[] bArr5 = this.f33710g;
            int i18 = i17 + 1;
            this.f33711h[i17] = new C3626a(bArr5[i17], bArr5[i18], AbstractC3664a.f(bArr[i17]), AbstractC3664a.f(bArr2[i17]), AbstractC3664a.d(bArr3[i17]), AbstractC3664a.b(bArr4[i17]));
            i17 = i18;
        }
    }

    public static f q(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(AbstractC1353u.w(obj));
        }
        return null;
    }

    @Override // R6.AbstractC1346m, R6.InterfaceC1335d
    public AbstractC1351s d() {
        C1337e c1337e = new C1337e();
        InterfaceC1335d interfaceC1335d = this.f33704a;
        if (interfaceC1335d == null) {
            interfaceC1335d = this.f33705b;
        }
        c1337e.a(interfaceC1335d);
        C1337e c1337e2 = new C1337e();
        int i8 = 0;
        while (true) {
            byte[][] bArr = this.f33706c;
            if (i8 >= bArr.length) {
                break;
            }
            c1337e2.a(new C1330a0(bArr[i8]));
            i8++;
        }
        c1337e.a(new C1338e0(c1337e2));
        C1337e c1337e3 = new C1337e();
        c1337e3.a(new C1330a0(this.f33707d));
        c1337e.a(new C1338e0(c1337e3));
        C1337e c1337e4 = new C1337e();
        int i9 = 0;
        while (true) {
            byte[][] bArr2 = this.f33708e;
            if (i9 >= bArr2.length) {
                break;
            }
            c1337e4.a(new C1330a0(bArr2[i9]));
            i9++;
        }
        c1337e.a(new C1338e0(c1337e4));
        C1337e c1337e5 = new C1337e();
        c1337e5.a(new C1330a0(this.f33709f));
        c1337e.a(new C1338e0(c1337e5));
        C1337e c1337e6 = new C1337e();
        c1337e6.a(new C1330a0(this.f33710g));
        c1337e.a(new C1338e0(c1337e6));
        C1337e c1337e7 = new C1337e();
        for (int i10 = 0; i10 < this.f33711h.length; i10++) {
            C1337e c1337e8 = new C1337e();
            byte[][][] e8 = AbstractC3664a.e(this.f33711h[i10].a());
            C1337e c1337e9 = new C1337e();
            for (byte[][] bArr3 : e8) {
                C1337e c1337e10 = new C1337e();
                int i11 = 0;
                while (true) {
                    if (i11 < bArr3.length) {
                        c1337e10.a(new C1330a0(bArr3[i11]));
                        i11++;
                    }
                }
                c1337e9.a(new C1338e0(c1337e10));
            }
            c1337e8.a(new C1338e0(c1337e9));
            byte[][][] e9 = AbstractC3664a.e(this.f33711h[i10].b());
            C1337e c1337e11 = new C1337e();
            for (byte[][] bArr4 : e9) {
                C1337e c1337e12 = new C1337e();
                int i12 = 0;
                while (true) {
                    if (i12 < bArr4.length) {
                        c1337e12.a(new C1330a0(bArr4[i12]));
                        i12++;
                    }
                }
                c1337e11.a(new C1338e0(c1337e12));
            }
            c1337e8.a(new C1338e0(c1337e11));
            byte[][] c8 = AbstractC3664a.c(this.f33711h[i10].d());
            C1337e c1337e13 = new C1337e();
            for (byte[] bArr5 : c8) {
                c1337e13.a(new C1330a0(bArr5));
            }
            c1337e8.a(new C1338e0(c1337e13));
            c1337e8.a(new C1330a0(AbstractC3664a.a(this.f33711h[i10].c())));
            c1337e7.a(new C1338e0(c1337e8));
        }
        c1337e.a(new C1338e0(c1337e7));
        return new C1338e0(c1337e);
    }

    public short[] m() {
        return AbstractC3664a.b(this.f33707d);
    }

    public short[] p() {
        return AbstractC3664a.b(this.f33709f);
    }

    public short[][] r() {
        return AbstractC3664a.d(this.f33706c);
    }

    public short[][] s() {
        return AbstractC3664a.d(this.f33708e);
    }

    public C3626a[] t() {
        return this.f33711h;
    }

    public int[] u() {
        return AbstractC3664a.g(this.f33710g);
    }

    public f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C3626a[] c3626aArr) {
        this.f33704a = new C1344k(1L);
        this.f33706c = AbstractC3664a.c(sArr);
        this.f33707d = AbstractC3664a.a(sArr2);
        this.f33708e = AbstractC3664a.c(sArr3);
        this.f33709f = AbstractC3664a.a(sArr4);
        this.f33710g = AbstractC3664a.h(iArr);
        this.f33711h = c3626aArr;
    }
}
