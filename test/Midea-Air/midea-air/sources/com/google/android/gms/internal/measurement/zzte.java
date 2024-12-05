package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class zzte implements Serializable, Iterable<Byte> {

    /* renamed from: f, reason: collision with root package name */
    public static final zzte f16104f = new o0(zzuq.f16138c);

    /* renamed from: g, reason: collision with root package name */
    private static final l0 f16105g;

    /* renamed from: h, reason: collision with root package name */
    private static final Comparator<zzte> f16106h;

    /* renamed from: i, reason: collision with root package name */
    private int f16107i = 0;

    static {
        g0 g0Var = null;
        f16105g = f0.b() ? new p0(g0Var) : new j0(g0Var);
        f16106h = new h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m0 D(int i2) {
        return new m0(i2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int K(int i2, int i3, int i4) {
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

    public static zzte M(String str) {
        return new o0(str.getBytes(zzuq.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(byte b2) {
        return b2 & 255;
    }

    public abstract zzte L(int i2, int i3);

    public final String N() {
        return size() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : f(zzuq.a);
    }

    public abstract boolean O();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int P() {
        return this.f16107i;
    }

    protected abstract int b(int i2, int i3, int i4);

    public abstract boolean equals(Object obj);

    protected abstract String f(Charset charset);

    public final int hashCode() {
        int i2 = this.f16107i;
        if (i2 == 0) {
            int size = size();
            i2 = b(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f16107i = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new g0(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void o(zztd zztdVar) throws IOException;

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract byte w(int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte z(int i2);
}
