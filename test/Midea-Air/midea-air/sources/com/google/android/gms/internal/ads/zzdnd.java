package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzdnd {
    int a;

    /* renamed from: b, reason: collision with root package name */
    int f14809b;

    /* renamed from: c, reason: collision with root package name */
    private int f14810c;

    /* renamed from: d, reason: collision with root package name */
    ru f14811d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14812e;

    private zzdnd() {
        this.f14809b = 100;
        this.f14810c = Integer.MAX_VALUE;
        this.f14812e = false;
    }

    public static int B(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdnd v(byte[] bArr, int i2, int i3, boolean z) {
        qu quVar = new qu(bArr, i2, i3, z);
        try {
            quVar.z(i3);
            return quVar;
        } catch (zzdok e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static long w(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public abstract void A(int i2);

    public abstract double a() throws IOException;

    public abstract float b() throws IOException;

    public abstract String c() throws IOException;

    public abstract int d() throws IOException;

    public abstract long e() throws IOException;

    public abstract long f() throws IOException;

    public abstract int g() throws IOException;

    public abstract long h() throws IOException;

    public abstract int i() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract String k() throws IOException;

    public abstract zzdmr l() throws IOException;

    public abstract int m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long s() throws IOException;

    public abstract boolean t() throws IOException;

    public abstract int u();

    public abstract void x(int i2) throws zzdok;

    public abstract boolean y(int i2) throws IOException;

    public abstract int z(int i2) throws zzdok;
}
