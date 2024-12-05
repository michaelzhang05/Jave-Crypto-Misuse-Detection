package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class zzdod {
    static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f14855b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f14856c;

    /* renamed from: d, reason: collision with root package name */
    private static final ByteBuffer f14857d;

    /* renamed from: e, reason: collision with root package name */
    private static final zzdnd f14858e;

    static {
        byte[] bArr = new byte[0];
        f14856c = bArr;
        f14857d = ByteBuffer.wrap(bArr);
        f14858e = zzdnd.v(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(T t) {
        t.getClass();
        return t;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int c2 = c(length, bArr, 0, length);
        if (c2 == 0) {
            return 1;
        }
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean e(byte[] bArr) {
        return kx.d(bArr);
    }

    public static String f(byte[] bArr) {
        return new String(bArr, a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object g(Object obj, Object obj2) {
        return ((zzdpk) obj).b().Y((zzdpk) obj2).i0();
    }

    public static int h(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int i(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(zzdpk zzdpkVar) {
        return false;
    }
}
