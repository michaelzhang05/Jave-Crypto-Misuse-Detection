package b2;

/* loaded from: classes4.dex */
public class s {

    /* renamed from: n, reason: collision with root package name */
    static final s f15206n = new s();

    /* renamed from: a, reason: collision with root package name */
    short f15207a;

    /* renamed from: b, reason: collision with root package name */
    private short f15208b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f15209c;

    /* renamed from: d, reason: collision with root package name */
    int f15210d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f15211e;

    /* renamed from: f, reason: collision with root package name */
    short f15212f;

    /* renamed from: g, reason: collision with root package name */
    short f15213g;

    /* renamed from: h, reason: collision with root package name */
    short f15214h;

    /* renamed from: i, reason: collision with root package name */
    short f15215i;

    /* renamed from: j, reason: collision with root package name */
    p f15216j;

    /* renamed from: k, reason: collision with root package name */
    s f15217k;

    /* renamed from: l, reason: collision with root package name */
    m f15218l;

    /* renamed from: m, reason: collision with root package name */
    s f15219m;

    private void b(int i8, int i9, int i10) {
        if (this.f15211e == null) {
            this.f15211e = new int[6];
        }
        int[] iArr = this.f15211e;
        int i11 = iArr[0];
        if (i11 + 2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f15211e = iArr2;
        }
        int[] iArr3 = this.f15211e;
        iArr3[i11 + 1] = i8;
        int i12 = i11 + 2;
        iArr3[i12] = i9 | i10;
        iArr3[0] = i12;
    }

    private s g(s sVar) {
        for (m mVar = this.f15218l; mVar != null; mVar = mVar.f15172c) {
            if ((this.f15207a & 16) == 0 || mVar != this.f15218l.f15172c) {
                s sVar2 = mVar.f15171b;
                if (sVar2.f15219m == null) {
                    sVar2.f15219m = sVar;
                    sVar = sVar2;
                }
            }
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(u uVar, boolean z8) {
        short s8;
        uVar.o(this);
        if (z8 && (s8 = this.f15208b) != 0) {
            uVar.q(s8 & 65535, this);
            if (this.f15209c != null) {
                int i8 = 1;
                while (true) {
                    int[] iArr = this.f15209c;
                    if (i8 <= iArr[0]) {
                        uVar.q(iArr[i8], this);
                        i8++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i8) {
        if (this.f15208b == 0) {
            this.f15208b = (short) i8;
            return;
        }
        if (this.f15209c == null) {
            this.f15209c = new int[4];
        }
        int[] iArr = this.f15209c;
        int i9 = iArr[0] + 1;
        iArr[0] = i9;
        if (i9 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f15209c = iArr2;
        }
        this.f15209c[i9] = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(s sVar) {
        s sVar2 = f15206n;
        this.f15219m = sVar2;
        s sVar3 = sVar2;
        s sVar4 = this;
        while (sVar4 != f15206n) {
            s sVar5 = sVar4.f15219m;
            sVar4.f15219m = sVar3;
            if ((sVar4.f15207a & 64) != 0 && sVar4.f15215i != sVar.f15215i) {
                sVar4.f15218l = new m(sVar4.f15213g, sVar.f15218l.f15171b, sVar4.f15218l);
            }
            sVar3 = sVar4;
            sVar4 = sVar4.g(sVar5);
        }
        while (sVar3 != f15206n) {
            s sVar6 = sVar3.f15219m;
            sVar3.f15219m = null;
            sVar3 = sVar6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final s e() {
        p pVar = this.f15216j;
        if (pVar == null) {
            return this;
        }
        return pVar.f15186a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(short s8) {
        this.f15219m = f15206n;
        s sVar = this;
        while (sVar != f15206n) {
            s sVar2 = sVar.f15219m;
            sVar.f15219m = null;
            if (sVar.f15215i == 0) {
                sVar.f15215i = s8;
                sVar = sVar.g(sVar2);
            } else {
                sVar = sVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(C1964d c1964d, int i8, boolean z8) {
        if ((this.f15207a & 4) == 0) {
            if (z8) {
                b(i8, 536870912, c1964d.f15102b);
                c1964d.i(-1);
                return;
            } else {
                b(i8, 268435456, c1964d.f15102b);
                c1964d.k(-1);
                return;
            }
        }
        if (z8) {
            c1964d.i(this.f15210d - i8);
        } else {
            c1964d.k(this.f15210d - i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(byte[] bArr, int i8) {
        this.f15207a = (short) (this.f15207a | 4);
        this.f15210d = i8;
        int[] iArr = this.f15211e;
        boolean z8 = false;
        if (iArr == null) {
            return false;
        }
        for (int i9 = iArr[0]; i9 > 0; i9 -= 2) {
            int[] iArr2 = this.f15211e;
            int i10 = iArr2[i9 - 1];
            int i11 = iArr2[i9];
            int i12 = i8 - i10;
            int i13 = 268435455 & i11;
            if ((i11 & (-268435456)) == 268435456) {
                if (i12 < -32768 || i12 > 32767) {
                    int i14 = bArr[i10] & 255;
                    if (i14 < 198) {
                        bArr[i10] = (byte) (i14 + 49);
                    } else {
                        bArr[i10] = (byte) (i14 + 20);
                    }
                    z8 = true;
                }
                bArr[i13] = (byte) (i12 >>> 8);
                bArr[i13 + 1] = (byte) i12;
            } else {
                bArr[i13] = (byte) (i12 >>> 24);
                bArr[i13 + 1] = (byte) (i12 >>> 16);
                bArr[i13 + 2] = (byte) (i12 >>> 8);
                bArr[i13 + 3] = (byte) i12;
            }
        }
        return z8;
    }

    public String toString() {
        return "L" + System.identityHashCode(this);
    }
}
