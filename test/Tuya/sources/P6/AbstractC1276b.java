package P6;

import P6.C1279e;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1276b {

    /* renamed from: a, reason: collision with root package name */
    private static final C1279e.a f8035a = new C1279e.a();

    /* renamed from: b, reason: collision with root package name */
    private static final int f8036b = -1234567890;

    public static final boolean a(byte[] a8, int i8, byte[] b8, int i9, int i10) {
        AbstractC3159y.i(a8, "a");
        AbstractC3159y.i(b8, "b");
        for (int i11 = 0; i11 < i10; i11++) {
            if (a8[i11 + i8] != b8[i11 + i9]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j8, long j9, long j10) {
        if ((j9 | j10) >= 0 && j9 <= j8 && j8 - j9 >= j10) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("size=" + j8 + " offset=" + j9 + " byteCount=" + j10);
    }

    public static final int c() {
        return f8036b;
    }

    public static final int d(C1282h c1282h, int i8) {
        AbstractC3159y.i(c1282h, "<this>");
        if (i8 == f8036b) {
            return c1282h.F();
        }
        return i8;
    }

    public static final int e(int i8) {
        return ((i8 & 255) << 24) | (((-16777216) & i8) >>> 24) | ((16711680 & i8) >>> 8) | ((65280 & i8) << 8);
    }

    public static final long f(long j8) {
        return ((j8 & 255) << 56) | (((-72057594037927936L) & j8) >>> 56) | ((71776119061217280L & j8) >>> 40) | ((280375465082880L & j8) >>> 24) | ((1095216660480L & j8) >>> 8) | ((4278190080L & j8) << 8) | ((16711680 & j8) << 24) | ((65280 & j8) << 40);
    }

    public static final short g(short s8) {
        return (short) (((s8 & 255) << 8) | ((65280 & s8) >>> 8));
    }

    public static final String h(byte b8) {
        return g6.n.n(new char[]{Q6.b.f()[(b8 >> 4) & 15], Q6.b.f()[b8 & 15]});
    }

    public static final String i(int i8) {
        int i9 = 0;
        if (i8 == 0) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        char[] cArr = {Q6.b.f()[(i8 >> 28) & 15], Q6.b.f()[(i8 >> 24) & 15], Q6.b.f()[(i8 >> 20) & 15], Q6.b.f()[(i8 >> 16) & 15], Q6.b.f()[(i8 >> 12) & 15], Q6.b.f()[(i8 >> 8) & 15], Q6.b.f()[(i8 >> 4) & 15], Q6.b.f()[i8 & 15]};
        while (i9 < 8 && cArr[i9] == '0') {
            i9++;
        }
        return g6.n.o(cArr, i9, 8);
    }
}
