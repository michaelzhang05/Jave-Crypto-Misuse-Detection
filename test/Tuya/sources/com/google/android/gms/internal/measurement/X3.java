package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class X3 implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final X3 f15622b = new T3(B4.f15272d);

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f15623c;

    /* renamed from: d, reason: collision with root package name */
    private static final V3 f15624d;

    /* renamed from: a, reason: collision with root package name */
    private int f15625a = 0;

    static {
        int i8 = J3.f15360a;
        f15624d = new V3(null);
        f15623c = new O3();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(int i8, int i9, int i10) {
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

    public static X3 u(byte[] bArr, int i8, int i9) {
        r(i8, i8 + i9, bArr.length);
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return new T3(bArr2);
    }

    public abstract byte a(int i8);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte d(int i8);

    public abstract boolean equals(Object obj);

    public abstract int g();

    protected abstract int h(int i8, int i9, int i10);

    public final int hashCode() {
        int i8 = this.f15625a;
        if (i8 == 0) {
            int g8 = g();
            i8 = h(g8, 0, g8);
            if (i8 == 0) {
                i8 = 1;
            }
            this.f15625a = i8;
        }
        return i8;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new N3(this);
    }

    public abstract X3 l(int i8, int i9);

    protected abstract String m(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void p(M3 m32);

    public abstract boolean q();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int t() {
        return this.f15625a;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(g());
        if (g() <= 50) {
            concat = AbstractC2058n5.a(this);
        } else {
            concat = AbstractC2058n5.a(l(0, 47)).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, concat);
    }

    public final String v(Charset charset) {
        if (g() == 0) {
            return "";
        }
        return m(charset);
    }
}
