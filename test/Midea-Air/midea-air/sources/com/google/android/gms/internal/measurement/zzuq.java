package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class zzuq {
    static final Charset a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f16137b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f16138c;

    /* renamed from: d, reason: collision with root package name */
    private static final ByteBuffer f16139d;

    /* renamed from: e, reason: collision with root package name */
    private static final zztq f16140e;

    static {
        byte[] bArr = new byte[0];
        f16138c = bArr;
        f16139d = ByteBuffer.wrap(bArr);
        f16140e = zztq.a(bArr, 0, bArr.length, false);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object e(Object obj, Object obj2) {
        return ((zzvv) obj).b().L((zzvv) obj2).P();
    }

    public static int f(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(zzvv zzvvVar) {
        return false;
    }

    public static boolean h(byte[] bArr) {
        return b3.j(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int j(boolean z) {
        return z ? 1231 : 1237;
    }
}
