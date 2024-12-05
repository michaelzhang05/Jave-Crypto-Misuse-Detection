package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.e5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2111e5 {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f16618a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f16619b;

    static {
        Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.ASCII_NAME);
        f16618a = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f16619b = bArr;
        ByteBuffer.wrap(bArr);
        H4.c(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i8, byte[] bArr, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i8 = (i8 * 31) + bArr[i11];
        }
        return i8;
    }

    public static int b(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static int c(boolean z8) {
        return z8 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int a8 = a(length, bArr, 0, length);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object f(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(I5 i52) {
        return false;
    }
}
