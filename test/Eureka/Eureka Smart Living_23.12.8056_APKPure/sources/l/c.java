package l;

/* loaded from: classes.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f7226a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    static final long[] f7227b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    static final Object[] f7228c = new Object[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int[] iArr, int i6, int i7) {
        int i8 = i6 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            int i11 = iArr[i10];
            if (i11 < i7) {
                i9 = i10 + 1;
            } else {
                if (i11 <= i7) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(long[] jArr, int i6, long j6) {
        int i7 = i6 - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            long j7 = jArr[i9];
            if (j7 < j6) {
                i8 = i9 + 1;
            } else {
                if (j7 <= j6) {
                    return i9;
                }
                i7 = i9 - 1;
            }
        }
        return ~i8;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int d(int i6) {
        for (int i7 = 4; i7 < 32; i7++) {
            int i8 = (1 << i7) - 12;
            if (i6 <= i8) {
                return i8;
            }
        }
        return i6;
    }

    public static int e(int i6) {
        return d(i6 * 4) / 4;
    }

    public static int f(int i6) {
        return d(i6 * 8) / 8;
    }
}
