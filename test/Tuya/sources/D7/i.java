package D7;

/* loaded from: classes5.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private b f1895a;

    /* renamed from: b, reason: collision with root package name */
    private int f1896b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f1897c;

    public i(b bVar, int i8) {
        this.f1895a = bVar;
        this.f1896b = i8;
        int[] iArr = new int[i8 + 1];
        this.f1897c = iArr;
        iArr[i8] = 1;
    }

    private int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.f1895a.a(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    private static int c(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    private void d() {
        int length = this.f1897c.length;
        do {
            this.f1896b = length - 1;
            length = this.f1896b;
            if (length < 0) {
                return;
            }
        } while (this.f1897c[length] == 0);
    }

    private static int i(int[] iArr) {
        int c8 = c(iArr);
        if (c8 == -1) {
            return 0;
        }
        return iArr[c8];
    }

    private static boolean j(int[] iArr, int[] iArr2) {
        int c8 = c(iArr);
        if (c8 != c(iArr2)) {
            return false;
        }
        for (int i8 = 0; i8 <= c8; i8++) {
            if (iArr[i8] != iArr2[i8]) {
                return false;
            }
        }
        return true;
    }

    private int[] l(int[] iArr, int[] iArr2) {
        int c8 = c(iArr2);
        if (c8 != -1) {
            int length = iArr.length;
            int[] iArr3 = new int[length];
            int f8 = this.f1895a.f(i(iArr2));
            System.arraycopy(iArr, 0, iArr3, 0, length);
            while (c8 <= c(iArr3)) {
                iArr3 = a(o(p(iArr2, c(iArr3) - c8), this.f1895a.h(i(iArr3), f8)), iArr3);
            }
            return iArr3;
        }
        throw new ArithmeticException("Division by zero");
    }

    private int[] o(int[] iArr, int i8) {
        int c8 = c(iArr);
        if (c8 != -1 && i8 != 0) {
            if (i8 == 1) {
                return d.a(iArr);
            }
            int[] iArr2 = new int[c8 + 1];
            while (c8 >= 0) {
                iArr2[c8] = this.f1895a.h(iArr[c8], i8);
                c8--;
            }
            return iArr2;
        }
        return new int[1];
    }

    private static int[] p(int[] iArr, int i8) {
        int c8 = c(iArr);
        if (c8 == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[c8 + i8 + 1];
        System.arraycopy(iArr, 0, iArr2, i8, c8 + 1);
        return iArr2;
    }

    private static int[] q(int[] iArr) {
        int c8 = c(iArr);
        if (c8 == -1) {
            return new int[1];
        }
        int i8 = c8 + 1;
        if (iArr.length == i8) {
            return d.a(iArr);
        }
        int[] iArr2 = new int[i8];
        System.arraycopy(iArr, 0, iArr2, 0, i8);
        return iArr2;
    }

    public void b(i iVar) {
        this.f1897c = a(this.f1897c, iVar.f1897c);
        d();
    }

    public int e(int i8) {
        int[] iArr = this.f1897c;
        int i9 = this.f1896b;
        int i10 = iArr[i9];
        for (int i11 = i9 - 1; i11 >= 0; i11--) {
            i10 = this.f1895a.h(i10, i8) ^ this.f1897c[i11];
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (this.f1895a.equals(iVar.f1895a) && this.f1896b == iVar.f1896b && j(this.f1897c, iVar.f1897c)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i8) {
        if (i8 >= 0 && i8 <= this.f1896b) {
            return this.f1897c[i8];
        }
        return 0;
    }

    public int g() {
        int[] iArr = this.f1897c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] h() {
        int i8 = 8;
        int i9 = 1;
        while (this.f1895a.d() > i8) {
            i9++;
            i8 += 8;
        }
        byte[] bArr = new byte[this.f1897c.length * i9];
        int i10 = 0;
        for (int i11 = 0; i11 < this.f1897c.length; i11++) {
            int i12 = 0;
            while (i12 < i8) {
                bArr[i10] = (byte) (this.f1897c[i11] >>> i12);
                i12 += 8;
                i10++;
            }
        }
        return bArr;
    }

    public int hashCode() {
        int hashCode = this.f1895a.hashCode();
        int i8 = 0;
        while (true) {
            int[] iArr = this.f1897c;
            if (i8 < iArr.length) {
                hashCode = (hashCode * 31) + iArr[i8];
                i8++;
            } else {
                return hashCode;
            }
        }
    }

    public i k(i iVar) {
        return new i(this.f1895a, l(this.f1897c, iVar.f1897c));
    }

    public void m(int i8) {
        if (this.f1895a.g(i8)) {
            this.f1897c = o(this.f1897c, i8);
            d();
            return;
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public i n(int i8) {
        if (this.f1895a.g(i8)) {
            return new i(this.f1895a, o(this.f1897c, i8));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public String toString() {
        String str = " Polynomial over " + this.f1895a.toString() + ": \n";
        for (int i8 = 0; i8 < this.f1897c.length; i8++) {
            str = str + this.f1895a.b(this.f1897c[i8]) + "Y^" + i8 + "+";
        }
        return str + ";";
    }

    public i(b bVar, byte[] bArr) {
        this.f1895a = bVar;
        int i8 = 8;
        int i9 = 1;
        while (bVar.d() > i8) {
            i9++;
            i8 += 8;
        }
        if (bArr.length % i9 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.f1897c = new int[bArr.length / i9];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f1897c;
            if (i10 >= iArr.length) {
                if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                d();
                return;
            }
            int i12 = 0;
            while (i12 < i8) {
                int[] iArr2 = this.f1897c;
                iArr2[i10] = ((bArr[i11] & 255) << i12) ^ iArr2[i10];
                i12 += 8;
                i11++;
            }
            if (!this.f1895a.g(this.f1897c[i10])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i10++;
        }
    }

    public i(b bVar, int[] iArr) {
        this.f1895a = bVar;
        this.f1897c = q(iArr);
        d();
    }

    public i(i iVar) {
        this.f1895a = iVar.f1895a;
        this.f1896b = iVar.f1896b;
        this.f1897c = d.a(iVar.f1897c);
    }
}
