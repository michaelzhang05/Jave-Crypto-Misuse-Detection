package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.s4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2241s4 implements Serializable, Iterable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC2241s4 f16818b = new C4(AbstractC2111e5.f16619b);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC2268v4 f16819c = new F4();

    /* renamed from: a, reason: collision with root package name */
    private int f16820a = 0;

    static {
        new C2259u4();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int e(byte b8) {
        return b8 & 255;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i8, int i9, int i10) {
        int i11 = i9 - i8;
        if ((i8 | i9 | i11 | (i10 - i9)) < 0) {
            if (i8 >= 0) {
                if (i9 < i8) {
                    throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i8 + ", " + i9);
                }
                throw new IndexOutOfBoundsException("End index: " + i9 + " >= " + i10);
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i8 + " < 0");
        }
        return i11;
    }

    public static AbstractC2241s4 k(String str) {
        return new C4(str.getBytes(AbstractC2111e5.f16618a));
    }

    public static AbstractC2241s4 m(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    public static AbstractC2241s4 n(byte[] bArr, int i8, int i9) {
        f(i8, i8 + i9, bArr.length);
        return new C4(f16819c.a(bArr, i8, i9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2286x4 u(int i8) {
        return new C2286x4(i8);
    }

    public abstract byte c(int i8);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int d() {
        return this.f16820a;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i8 = this.f16820a;
        if (i8 == 0) {
            int r8 = r();
            i8 = t(r8, 0, r8);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f16820a = i8;
        }
        return i8;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return new C2232r4(this);
    }

    public abstract AbstractC2241s4 j(int i8, int i9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void o(AbstractC2215p4 abstractC2215p4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte q(int i8);

    public abstract int r();

    protected abstract int t(int i8, int i9, int i10);

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(r());
        if (r() <= 50) {
            str = AbstractC2199n6.a(this);
        } else {
            str = AbstractC2199n6.a(j(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, str);
    }
}
