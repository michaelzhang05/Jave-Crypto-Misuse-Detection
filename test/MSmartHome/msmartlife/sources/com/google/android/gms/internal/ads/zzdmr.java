package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class zzdmr implements Serializable, Iterable<Byte> {

    /* renamed from: f, reason: collision with root package name */
    public static final zzdmr f14805f = new nu(zzdod.f14856c);

    /* renamed from: g, reason: collision with root package name */
    private static final ju f14806g;

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<zzdmr> f14807h;

    /* renamed from: i, reason: collision with root package name */
    private int f14808i = 0;

    static {
        du duVar = null;
        f14806g = zt.a() ? new ou(duVar) : new hu(duVar);
        f14807h = new fu();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int L(byte b2) {
        return b2 & 255;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ku Q(int i2) {
        return new ku(i2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int R(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i3 < i2) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i3);
        sb3.append(" >= ");
        sb3.append(i4);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public static zzdmr S(String str) {
        return new nu(str.getBytes(zzdod.a));
    }

    public static zzdmr T(byte[] bArr, int i2, int i3) {
        R(i2, i2 + i3, bArr.length);
        return new nu(f14806g.a(bArr, i2, i3));
    }

    public static zzdmr V(byte[] bArr) {
        return T(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdmr w(byte[] bArr) {
        return new nu(bArr);
    }

    public abstract boolean D();

    public abstract zzdnd J();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int K() {
        return this.f14808i;
    }

    protected abstract int N(int i2, int i3, int i4);

    public abstract byte O(int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte P(int i2);

    public abstract zzdmr U(int i2, int i3);

    public final byte[] a() {
        int size = size();
        if (size == 0) {
            return zzdod.f14856c;
        }
        byte[] bArr = new byte[size];
        o(bArr, 0, 0, size);
        return bArr;
    }

    protected abstract String b(Charset charset);

    public abstract boolean equals(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f(zzdmq zzdmqVar) throws IOException;

    public final int hashCode() {
        int i2 = this.f14808i;
        if (i2 == 0) {
            int size = size();
            i2 = N(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f14808i = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new du(this);
    }

    protected abstract void o(byte[] bArr, int i2, int i3, int i4);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public final String z() {
        return size() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : b(zzdod.a);
    }
}
