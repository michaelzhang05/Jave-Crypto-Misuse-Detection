package G7;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final BigInteger f3427a = BigInteger.valueOf(0);

    /* renamed from: b, reason: collision with root package name */
    private static final BigInteger f3428b = BigInteger.valueOf(1);

    /* renamed from: c, reason: collision with root package name */
    private static final BigInteger f3429c = BigInteger.valueOf(2);

    /* renamed from: d, reason: collision with root package name */
    private static final BigInteger f3430d = BigInteger.valueOf(4);

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f3431e = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};

    /* renamed from: f, reason: collision with root package name */
    private static SecureRandom f3432f = null;

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f3433g = {0, 1, 0, -1, 0, -1, 0, 1};

    public static int a(int i8) {
        if (i8 == 0) {
            return 1;
        }
        if (i8 < 0) {
            i8 = -i8;
        }
        int i9 = 0;
        while (i8 > 0) {
            i9++;
            i8 >>>= 8;
        }
        return i9;
    }
}
