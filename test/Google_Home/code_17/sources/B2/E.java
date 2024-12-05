package b2;

/* loaded from: classes4.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f15085a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15086b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(byte[] bArr, int i8) {
        this.f15085a = bArr;
        this.f15086b = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(E e8, C1964d c1964d) {
        if (e8 == null) {
            c1964d.g(0);
            return;
        }
        byte[] bArr = e8.f15085a;
        int i8 = e8.f15086b;
        c1964d.h(bArr, i8, (bArr[i8] * 2) + 1);
    }

    public int a() {
        return this.f15085a[this.f15086b];
    }

    public int b(int i8) {
        return this.f15085a[this.f15086b + (i8 * 2) + 1];
    }

    public int c(int i8) {
        return this.f15085a[this.f15086b + (i8 * 2) + 2];
    }

    public String toString() {
        int a8 = a();
        StringBuilder sb = new StringBuilder(a8 * 2);
        for (int i8 = 0; i8 < a8; i8++) {
            int b8 = b(i8);
            if (b8 != 0) {
                if (b8 != 1) {
                    if (b8 != 2) {
                        if (b8 == 3) {
                            sb.append(c(i8));
                            sb.append(';');
                        } else {
                            throw new AssertionError();
                        }
                    } else {
                        sb.append('*');
                    }
                } else {
                    sb.append('.');
                }
            } else {
                sb.append('[');
            }
        }
        return sb.toString();
    }
}
