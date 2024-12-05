package D7;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private int[] f1894a;

    public h(byte[] bArr) {
        if (bArr.length > 4) {
            int e8 = f.e(bArr, 0);
            int a8 = e.a(e8 - 1);
            if (bArr.length == (e8 * a8) + 4) {
                this.f1894a = new int[e8];
                for (int i8 = 0; i8 < e8; i8++) {
                    this.f1894a[i8] = f.f(bArr, (i8 * a8) + 4, a8);
                }
                if (b(this.f1894a)) {
                    return;
                } else {
                    throw new IllegalArgumentException("invalid encoding");
                }
            }
            throw new IllegalArgumentException("invalid encoding");
        }
        throw new IllegalArgumentException("invalid encoding");
    }

    private boolean b(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i8 : iArr) {
            if (i8 < 0 || i8 >= length || zArr[i8]) {
                return false;
            }
            zArr[i8] = true;
        }
        return true;
    }

    public byte[] a() {
        int length = this.f1894a.length;
        int a8 = e.a(length - 1);
        byte[] bArr = new byte[(length * a8) + 4];
        f.a(length, bArr, 0);
        for (int i8 = 0; i8 < length; i8++) {
            f.b(this.f1894a[i8], bArr, (i8 * a8) + 4, a8);
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return d.b(this.f1894a, ((h) obj).f1894a);
    }

    public int hashCode() {
        return E7.a.n(this.f1894a);
    }

    public String toString() {
        String str = "[" + this.f1894a[0];
        for (int i8 = 1; i8 < this.f1894a.length; i8++) {
            str = str + ", " + this.f1894a[i8];
        }
        return str + "]";
    }
}
