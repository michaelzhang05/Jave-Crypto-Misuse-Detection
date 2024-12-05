package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f5707a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f5708b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f5709c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f5710d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f5711e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f5712f;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(int i6);
    }

    /* loaded from: classes.dex */
    public interface d extends List, RandomAccess {
        void b();

        d d(int i6);

        boolean f();
    }

    static {
        byte[] bArr = new byte[0];
        f5710d = bArr;
        f5711e = ByteBuffer.wrap(bArr);
        f5712f = i.h(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z5) {
        return z5 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i6, int i7) {
        int h6 = h(i7, bArr, i6, i7);
        if (h6 == 0) {
            return 1;
        }
        return h6;
    }

    public static int f(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return o1.m(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i6, byte[] bArr, int i7, int i8) {
        for (int i9 = i7; i9 < i7 + i8; i9++) {
            i6 = (i6 * 31) + bArr[i9];
        }
        return i6;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f5708b);
    }
}
