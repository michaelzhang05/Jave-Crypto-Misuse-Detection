package Y1;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    final h f12773a;

    /* renamed from: b, reason: collision with root package name */
    private final C1516e f12774b;

    /* renamed from: c, reason: collision with root package name */
    private int f12775c;

    /* renamed from: d, reason: collision with root package name */
    private String f12776d;

    /* renamed from: e, reason: collision with root package name */
    private int f12777e;

    /* renamed from: f, reason: collision with root package name */
    private a[] f12778f;

    /* renamed from: g, reason: collision with root package name */
    private int f12779g;

    /* renamed from: h, reason: collision with root package name */
    private C1515d f12780h;

    /* renamed from: i, reason: collision with root package name */
    private int f12781i;

    /* renamed from: j, reason: collision with root package name */
    private C1515d f12782j;

    /* renamed from: k, reason: collision with root package name */
    private int f12783k;

    /* renamed from: l, reason: collision with root package name */
    private a[] f12784l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(h hVar) {
        this.f12773a = hVar;
        this.f12774b = null;
        this.f12778f = new a[256];
        this.f12779g = 1;
        this.f12780h = new C1515d();
    }

    private void A(int i8, String str, String str2) {
        a(new a(i8, 12, str, str2, Y(12, str, str2)));
    }

    private void E(int i8, String str) {
        a(new a(i8, 1, str, W(1, str)));
    }

    private B F(int i8, String str) {
        int W7 = W(i8, str);
        for (a N8 = N(W7); N8 != null; N8 = N8.f12786i) {
            if (N8.f12767b == i8 && N8.f12785h == W7 && N8.f12770e.equals(str)) {
                return N8;
            }
        }
        this.f12780h.e(i8, D(str));
        int i9 = this.f12779g;
        this.f12779g = i9 + 1;
        return c0(new a(i9, i8, str, W7));
    }

    private void G(int i8, int i9, String str) {
        a(new a(i8, i9, str, W(i9, str)));
    }

    private int J(a aVar) {
        if (this.f12784l == null) {
            this.f12784l = new a[16];
        }
        int i8 = this.f12783k;
        a[] aVarArr = this.f12784l;
        if (i8 == aVarArr.length) {
            a[] aVarArr2 = new a[aVarArr.length * 2];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
            this.f12784l = aVarArr2;
        }
        a[] aVarArr3 = this.f12784l;
        int i9 = this.f12783k;
        this.f12783k = i9 + 1;
        aVarArr3[i9] = aVar;
        return c0(aVar).f12766a;
    }

    private void M(C1516e c1516e, char[] cArr) {
        byte[] bArr = c1516e.f12820c;
        int e8 = c1516e.e();
        int I8 = c1516e.I(e8 - 2);
        while (true) {
            if (I8 <= 0) {
                break;
            }
            if ("BootstrapMethods".equals(c1516e.H(e8, cArr))) {
                this.f12781i = c1516e.I(e8 + 6);
                break;
            } else {
                e8 += c1516e.t(e8 + 2) + 6;
                I8--;
            }
        }
        if (this.f12781i > 0) {
            int i8 = e8 + 8;
            int t8 = c1516e.t(e8 + 2) - 2;
            C1515d c1515d = new C1515d(t8);
            this.f12782j = c1515d;
            c1515d.h(bArr, i8, t8);
            int i9 = i8;
            for (int i10 = 0; i10 < this.f12781i; i10++) {
                int i11 = i9 - i8;
                int I9 = c1516e.I(i9);
                int I10 = c1516e.I(i9 + 2);
                i9 += 4;
                int hashCode = c1516e.o(I9, cArr).hashCode();
                while (true) {
                    int i12 = I10 - 1;
                    if (I10 > 0) {
                        int I11 = c1516e.I(i9);
                        i9 += 2;
                        hashCode ^= c1516e.o(I11, cArr).hashCode();
                        I10 = i12;
                    }
                }
                a(new a(i10, 64, i11, hashCode & Integer.MAX_VALUE));
            }
        }
    }

    private a N(int i8) {
        a[] aVarArr = this.f12778f;
        return aVarArr[i8 % aVarArr.length];
    }

    private static int U(int i8, int i9) {
        return (i8 + i9) & Integer.MAX_VALUE;
    }

    private static int V(int i8, long j8) {
        return (i8 + ((int) j8) + ((int) (j8 >>> 32))) & Integer.MAX_VALUE;
    }

    private static int W(int i8, String str) {
        return (i8 + str.hashCode()) & Integer.MAX_VALUE;
    }

    private static int X(int i8, String str, int i9) {
        return (i8 + str.hashCode() + i9) & Integer.MAX_VALUE;
    }

    private static int Y(int i8, String str, String str2) {
        return (i8 + (str.hashCode() * str2.hashCode())) & Integer.MAX_VALUE;
    }

    private static int Z(int i8, String str, String str2, int i9) {
        return (i8 + (str.hashCode() * str2.hashCode() * (i9 + 1))) & Integer.MAX_VALUE;
    }

    private void a(a aVar) {
        this.f12777e++;
        int i8 = aVar.f12785h;
        a[] aVarArr = this.f12778f;
        int length = i8 % aVarArr.length;
        aVar.f12786i = aVarArr[length];
        aVarArr[length] = aVar;
    }

    private static int a0(int i8, String str, String str2, String str3) {
        return (i8 + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
    }

    private B b(int i8, int i9, int i10) {
        byte[] bArr = this.f12782j.f12816a;
        for (a N8 = N(i10); N8 != null; N8 = N8.f12786i) {
            if (N8.f12767b == 64 && N8.f12785h == i10) {
                int i11 = (int) N8.f12771f;
                for (int i12 = 0; i12 < i9; i12++) {
                    if (bArr[i8 + i12] != bArr[i11 + i12]) {
                        break;
                    }
                }
                this.f12782j.f12817b = i8;
                return N8;
            }
        }
        int i13 = this.f12781i;
        this.f12781i = i13 + 1;
        return c0(new a(i13, 64, i8, i10));
    }

    private static int b0(int i8, String str, String str2, String str3, int i9) {
        return (i8 + (str.hashCode() * str2.hashCode() * str3.hashCode() * i9)) & Integer.MAX_VALUE;
    }

    private a c0(a aVar) {
        int i8 = this.f12777e;
        a[] aVarArr = this.f12778f;
        if (i8 > (aVarArr.length * 3) / 4) {
            int length = aVarArr.length;
            int i9 = (length * 2) + 1;
            a[] aVarArr2 = new a[i9];
            for (int i10 = length - 1; i10 >= 0; i10--) {
                a aVar2 = this.f12778f[i10];
                while (aVar2 != null) {
                    int i11 = aVar2.f12785h % i9;
                    a aVar3 = aVar2.f12786i;
                    aVar2.f12786i = aVarArr2[i11];
                    aVarArr2[i11] = aVar2;
                    aVar2 = aVar3;
                }
            }
            this.f12778f = aVarArr2;
        }
        this.f12777e++;
        int i12 = aVar.f12785h;
        a[] aVarArr3 = this.f12778f;
        int length2 = i12 % aVarArr3.length;
        aVar.f12786i = aVarArr3[length2];
        aVarArr3[length2] = aVar;
        return aVar;
    }

    private B h(int i8, String str, String str2, int i9) {
        int Z7 = Z(i8, str, str2, i9);
        for (a N8 = N(Z7); N8 != null; N8 = N8.f12786i) {
            if (N8.f12767b == i8 && N8.f12785h == Z7 && N8.f12771f == i9 && N8.f12769d.equals(str) && N8.f12770e.equals(str2)) {
                return N8;
            }
        }
        this.f12780h.f(i8, i9, z(str, str2));
        int i10 = this.f12779g;
        this.f12779g = i10 + 1;
        return c0(new a(i10, i8, null, str, str2, i9, Z7));
    }

    private void i(int i8, int i9, String str, String str2, int i10) {
        a(new a(i9, i8, null, str, str2, i10, Z(i8, str, str2, i10)));
    }

    private B m(int i8, int i9) {
        int U7 = U(i8, i9);
        for (a N8 = N(U7); N8 != null; N8 = N8.f12786i) {
            if (N8.f12767b == i8 && N8.f12785h == U7 && N8.f12771f == i9) {
                return N8;
            }
        }
        this.f12780h.g(i8).i(i9);
        int i10 = this.f12779g;
        this.f12779g = i10 + 1;
        return c0(new a(i10, i8, i9, U7));
    }

    private void n(int i8, int i9, int i10) {
        a(new a(i8, i9, i10, U(i9, i10)));
    }

    private B q(int i8, long j8) {
        int V7 = V(i8, j8);
        for (a N8 = N(V7); N8 != null; N8 = N8.f12786i) {
            if (N8.f12767b == i8 && N8.f12785h == V7 && N8.f12771f == j8) {
                return N8;
            }
        }
        int i9 = this.f12779g;
        this.f12780h.g(i8).j(j8);
        this.f12779g += 2;
        return c0(new a(i9, i8, j8, V7));
    }

    private void r(int i8, int i9, long j8) {
        a(new a(i8, i9, j8, V(i9, j8)));
    }

    private a s(int i8, String str, String str2, String str3) {
        int a02 = a0(i8, str, str2, str3);
        for (a N8 = N(a02); N8 != null; N8 = N8.f12786i) {
            if (N8.f12767b == i8 && N8.f12785h == a02 && N8.f12768c.equals(str) && N8.f12769d.equals(str2) && N8.f12770e.equals(str3)) {
                return N8;
            }
        }
        this.f12780h.f(i8, e(str).f12766a, z(str2, str3));
        int i9 = this.f12779g;
        this.f12779g = i9 + 1;
        return c0(new a(i9, i8, str, str2, str3, 0L, a02));
    }

    private void t(int i8, int i9, String str, String str2, String str3) {
        a(new a(i8, i9, str, str2, str3, 0L, a0(i9, str, str2, str3)));
    }

    private void v(int i8, int i9, String str, String str2, String str3) {
        a(new a(i8, 15, str, str2, str3, i9, b0(15, str, str2, str3, i9)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B B(String str) {
        return F(20, str);
    }

    B C(String str) {
        return F(8, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int D(String str) {
        int W7 = W(1, str);
        for (a N8 = N(W7); N8 != null; N8 = N8.f12786i) {
            if (N8.f12767b == 1 && N8.f12785h == W7 && N8.f12770e.equals(str)) {
                return N8.f12766a;
            }
        }
        this.f12780h.g(1).l(str);
        int i8 = this.f12779g;
        this.f12779g = i8 + 1;
        return c0(new a(i8, 1, str, W7)).f12766a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int H(int i8, int i9) {
        long j8;
        long j9;
        if (i8 < i9) {
            j8 = i8;
            j9 = i9;
        } else {
            j8 = i9;
            j9 = i8;
        }
        long j10 = j8 | (j9 << 32);
        int U7 = U(TsExtractor.TS_STREAM_TYPE_HDMV_DTS, i8 + i9);
        for (a N8 = N(U7); N8 != null; N8 = N8.f12786i) {
            if (N8.f12767b == 130 && N8.f12785h == U7 && N8.f12771f == j10) {
                return N8.f12772g;
            }
        }
        a[] aVarArr = this.f12784l;
        int I8 = I(this.f12773a.r(aVarArr[i8].f12770e, aVarArr[i9].f12770e));
        c0(new a(this.f12783k, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, j10, U7)).f12772g = I8;
        return I8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int I(String str) {
        int W7 = W(128, str);
        for (a N8 = N(W7); N8 != null; N8 = N8.f12786i) {
            if (N8.f12767b == 128 && N8.f12785h == W7 && N8.f12770e.equals(str)) {
                return N8.f12766a;
            }
        }
        return J(new a(this.f12783k, 128, str, W7));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int K(String str, int i8) {
        int X7 = X(TsExtractor.TS_STREAM_TYPE_AC3, str, i8);
        for (a N8 = N(X7); N8 != null; N8 = N8.f12786i) {
            if (N8.f12767b == 129 && N8.f12785h == X7 && N8.f12771f == i8 && N8.f12770e.equals(str)) {
                return N8.f12766a;
            }
        }
        return J(new a(this.f12783k, TsExtractor.TS_STREAM_TYPE_AC3, str, i8, X7));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int L() {
        if (this.f12782j != null) {
            D("BootstrapMethods");
            return this.f12782j.f12817b + 8;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String O() {
        return this.f12776d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int P() {
        return this.f12779g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int Q() {
        return this.f12780h.f12817b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int R() {
        return this.f12775c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1516e S() {
        return this.f12774b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B T(int i8) {
        return this.f12784l[i8];
    }

    B c(q qVar, Object... objArr) {
        C1515d c1515d = this.f12782j;
        if (c1515d == null) {
            c1515d = new C1515d();
            this.f12782j = c1515d;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr[i8] = d(objArr[i8]).f12766a;
        }
        int i9 = c1515d.f12817b;
        c1515d.k(u(qVar.d(), qVar.c(), qVar.b(), qVar.a(), qVar.e()).f12766a);
        c1515d.k(length);
        for (int i10 = 0; i10 < length; i10++) {
            c1515d.k(iArr[i10]);
        }
        int i11 = c1515d.f12817b - i9;
        int hashCode = qVar.hashCode();
        for (Object obj : objArr) {
            hashCode ^= obj.hashCode();
        }
        return b(i9, i11, hashCode & Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B d(Object obj) {
        if (obj instanceof Integer) {
            return l(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return l(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return l(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return l(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return l(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return k(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return p(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return f(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return C((String) obj);
        }
        if (obj instanceof D) {
            D d8 = (D) obj;
            int l8 = d8.l();
            if (l8 == 10) {
                return e(d8.f());
            }
            if (l8 == 11) {
                return w(d8.d());
            }
            return e(d8.d());
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return u(qVar.d(), qVar.c(), qVar.b(), qVar.a(), qVar.e());
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return g(iVar.d(), iVar.c(), iVar.a(), iVar.b());
        }
        throw new IllegalArgumentException("value " + obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(C1515d c1515d) {
        if (this.f12782j != null) {
            C1515d k8 = c1515d.k(D("BootstrapMethods")).i(this.f12782j.f12817b + 2).k(this.f12781i);
            C1515d c1515d2 = this.f12782j;
            k8.h(c1515d2.f12816a, 0, c1515d2.f12817b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B e(String str) {
        return F(7, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0(C1515d c1515d) {
        C1515d k8 = c1515d.k(this.f12779g);
        C1515d c1515d2 = this.f12780h;
        k8.h(c1515d2.f12816a, 0, c1515d2.f12817b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B f(double d8) {
        return q(6, Double.doubleToRawLongBits(d8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f0(int i8, String str) {
        this.f12775c = i8;
        this.f12776d = str;
        return e(str).f12766a;
    }

    B g(String str, String str2, q qVar, Object... objArr) {
        return h(17, str, str2, c(qVar, objArr).f12766a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B j(String str, String str2, String str3) {
        return s(9, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B k(float f8) {
        return m(4, Float.floatToRawIntBits(f8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B l(int i8) {
        return m(3, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B o(String str, String str2, q qVar, Object... objArr) {
        return h(18, str, str2, c(qVar, objArr).f12766a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B p(long j8) {
        return q(5, j8);
    }

    B u(int i8, String str, String str2, String str3, boolean z8) {
        int b02 = b0(15, str, str2, str3, i8);
        for (a N8 = N(b02); N8 != null; N8 = N8.f12786i) {
            if (N8.f12767b == 15 && N8.f12785h == b02 && N8.f12771f == i8 && N8.f12768c.equals(str) && N8.f12769d.equals(str2) && N8.f12770e.equals(str3)) {
                return N8;
            }
        }
        if (i8 <= 4) {
            this.f12780h.d(15, i8, j(str, str2, str3).f12766a);
        } else {
            this.f12780h.d(15, i8, x(str, str2, str3, z8).f12766a);
        }
        int i9 = this.f12779g;
        this.f12779g = i9 + 1;
        return c0(new a(i9, 15, str, str2, str3, i8, b02));
    }

    B w(String str) {
        return F(16, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B x(String str, String str2, String str3, boolean z8) {
        int i8;
        if (z8) {
            i8 = 11;
        } else {
            i8 = 10;
        }
        return s(i8, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public B y(String str) {
        return F(19, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int z(String str, String str2) {
        int Y7 = Y(12, str, str2);
        for (a N8 = N(Y7); N8 != null; N8 = N8.f12786i) {
            if (N8.f12767b == 12 && N8.f12785h == Y7 && N8.f12769d.equals(str) && N8.f12770e.equals(str2)) {
                return N8.f12766a;
            }
        }
        this.f12780h.f(12, D(str), D(str2));
        int i8 = this.f12779g;
        this.f12779g = i8 + 1;
        return c0(new a(i8, 12, str, str2, Y7)).f12766a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a extends B {

        /* renamed from: h, reason: collision with root package name */
        final int f12785h;

        /* renamed from: i, reason: collision with root package name */
        a f12786i;

        a(int i8, int i9, String str, String str2, String str3, long j8, int i10) {
            super(i8, i9, str, str2, str3, j8);
            this.f12785h = i10;
        }

        a(int i8, int i9, String str, int i10) {
            super(i8, i9, null, null, str, 0L);
            this.f12785h = i10;
        }

        a(int i8, int i9, String str, long j8, int i10) {
            super(i8, i9, null, null, str, j8);
            this.f12785h = i10;
        }

        a(int i8, int i9, String str, String str2, int i10) {
            super(i8, i9, null, str, str2, 0L);
            this.f12785h = i10;
        }

        a(int i8, int i9, long j8, int i10) {
            super(i8, i9, null, null, null, j8);
            this.f12785h = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C(h hVar, C1516e c1516e) {
        this.f12773a = hVar;
        this.f12774b = c1516e;
        byte[] bArr = c1516e.f12820c;
        int f8 = c1516e.f(1) - 1;
        int i8 = c1516e.f12819b - f8;
        this.f12779g = c1516e.g();
        C1515d c1515d = new C1515d(i8);
        this.f12780h = c1515d;
        c1515d.h(bArr, f8, i8);
        this.f12778f = new a[this.f12779g * 2];
        char[] cArr = new char[c1516e.h()];
        boolean z8 = false;
        int i9 = 1;
        while (i9 < this.f12779g) {
            int f9 = c1516e.f(i9);
            byte b8 = bArr[f9 - 1];
            switch (b8) {
                case 1:
                    E(i9, c1516e.K(i9, cArr));
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                    n(i9, b8, c1516e.t(f9));
                    break;
                case 5:
                case 6:
                    r(i9, b8, c1516e.v(f9));
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    G(i9, b8, c1516e.H(f9, cArr));
                    break;
                case 9:
                case 10:
                case 11:
                    int f10 = c1516e.f(c1516e.I(f9 + 2));
                    t(i9, b8, c1516e.m(f9, cArr), c1516e.H(f10, cArr), c1516e.H(f10 + 2, cArr));
                    break;
                case 12:
                    A(i9, c1516e.H(f9, cArr), c1516e.H(f9 + 2, cArr));
                    break;
                case 15:
                    int f11 = c1516e.f(c1516e.I(f9 + 1));
                    int f12 = c1516e.f(c1516e.I(f11 + 2));
                    v(i9, c1516e.l(f9), c1516e.m(f11, cArr), c1516e.H(f12, cArr), c1516e.H(f12 + 2, cArr));
                    break;
                case 17:
                case 18:
                    int f13 = c1516e.f(c1516e.I(f9 + 2));
                    i(b8, i9, c1516e.H(f13, cArr), c1516e.H(f13 + 2, cArr), c1516e.I(f9));
                    z8 = true;
                    break;
            }
            i9 += (b8 == 5 || b8 == 6) ? 2 : 1;
        }
        if (z8) {
            M(c1516e, cArr);
        }
    }
}
