package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.f4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1991f4 extends M3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f15700b = Logger.getLogger(AbstractC1991f4.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f15701c = AbstractC2153z5.C();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15702d = 0;

    /* renamed from: a, reason: collision with root package name */
    C2000g4 f15703a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC1991f4(AbstractC1982e4 abstractC1982e4) {
    }

    public static AbstractC1991f4 A(byte[] bArr, int i8, int i9) {
        return new C1964c4(bArr, 0, i9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i8, Y4 y42, InterfaceC2026j5 interfaceC2026j5) {
        int e8 = ((H3) y42).e(interfaceC2026j5);
        int y8 = y(i8 << 3);
        return y8 + y8 + e8;
    }

    public static int v(int i8) {
        if (i8 >= 0) {
            return y(i8);
        }
        return 10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(Y4 y42, InterfaceC2026j5 interfaceC2026j5) {
        int e8 = ((H3) y42).e(interfaceC2026j5);
        return y(e8) + e8;
    }

    public static int x(String str) {
        int length;
        try {
            length = E5.c(str);
        } catch (D5 unused) {
            length = str.getBytes(B4.f15270b).length;
        }
        return y(length) + length;
    }

    public static int y(int i8) {
        if ((i8 & (-128)) == 0) {
            return 1;
        }
        if ((i8 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i8) == 0) {
            return 3;
        }
        return (i8 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int z(long j8) {
        int i8;
        if (((-128) & j8) == 0) {
            return 1;
        }
        if (j8 < 0) {
            return 10;
        }
        if (((-34359738368L) & j8) != 0) {
            j8 >>>= 28;
            i8 = 6;
        } else {
            i8 = 2;
        }
        if (((-2097152) & j8) != 0) {
            j8 >>>= 14;
            i8 += 2;
        }
        return (j8 & (-16384)) != 0 ? i8 + 1 : i8;
    }

    public final void a() {
        if (d() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(String str, D5 d52) {
        f15700b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) d52);
        byte[] bytes = str.getBytes(B4.f15270b);
        try {
            int length = bytes.length;
            r(length);
            n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e8) {
            throw new C1973d4(e8);
        }
    }

    public abstract int d();

    public abstract void e(byte b8);

    public abstract void f(int i8, boolean z8);

    public abstract void g(int i8, X3 x32);

    public abstract void h(int i8, int i9);

    public abstract void i(int i8);

    public abstract void j(int i8, long j8);

    public abstract void k(long j8);

    public abstract void l(int i8, int i9);

    public abstract void m(int i8);

    public abstract void n(byte[] bArr, int i8, int i9);

    public abstract void o(int i8, String str);

    public abstract void p(int i8, int i9);

    public abstract void q(int i8, int i9);

    public abstract void r(int i8);

    public abstract void s(int i8, long j8);

    public abstract void t(long j8);
}
