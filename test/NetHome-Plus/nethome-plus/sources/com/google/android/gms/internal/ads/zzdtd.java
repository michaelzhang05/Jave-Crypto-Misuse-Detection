package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class zzdtd {
    public static final zzdtd a = new zzdtd(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: b, reason: collision with root package name */
    private static final zzdtd f14981b = new zzdtd(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: c, reason: collision with root package name */
    private static final zzdtd f14982c = new zzdtd(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: d, reason: collision with root package name */
    private static final zzdtd f14983d = new zzdtd(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: e, reason: collision with root package name */
    private final double f14984e;

    /* renamed from: f, reason: collision with root package name */
    private final double f14985f;

    /* renamed from: g, reason: collision with root package name */
    private final double f14986g;

    /* renamed from: h, reason: collision with root package name */
    private final double f14987h;

    /* renamed from: i, reason: collision with root package name */
    private final double f14988i;

    /* renamed from: j, reason: collision with root package name */
    private final double f14989j;

    /* renamed from: k, reason: collision with root package name */
    private final double f14990k;
    private final double l;
    private final double m;

    private zzdtd(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.f14984e = d6;
        this.f14985f = d7;
        this.f14986g = d8;
        this.f14987h = d2;
        this.f14988i = d3;
        this.f14989j = d4;
        this.f14990k = d5;
        this.l = d9;
        this.m = d10;
    }

    public static zzdtd a(ByteBuffer byteBuffer) {
        double e2 = zzbc.e(byteBuffer);
        double e3 = zzbc.e(byteBuffer);
        double f2 = zzbc.f(byteBuffer);
        return new zzdtd(e2, e3, zzbc.e(byteBuffer), zzbc.e(byteBuffer), f2, zzbc.f(byteBuffer), zzbc.f(byteBuffer), zzbc.e(byteBuffer), zzbc.e(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdtd.class != obj.getClass()) {
            return false;
        }
        zzdtd zzdtdVar = (zzdtd) obj;
        return Double.compare(zzdtdVar.f14987h, this.f14987h) == 0 && Double.compare(zzdtdVar.f14988i, this.f14988i) == 0 && Double.compare(zzdtdVar.f14989j, this.f14989j) == 0 && Double.compare(zzdtdVar.f14990k, this.f14990k) == 0 && Double.compare(zzdtdVar.l, this.l) == 0 && Double.compare(zzdtdVar.m, this.m) == 0 && Double.compare(zzdtdVar.f14984e, this.f14984e) == 0 && Double.compare(zzdtdVar.f14985f, this.f14985f) == 0 && Double.compare(zzdtdVar.f14986g, this.f14986g) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f14984e);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f14985f);
        int i2 = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f14986g);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.f14987h);
        int i4 = (i3 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        long doubleToLongBits5 = Double.doubleToLongBits(this.f14988i);
        int i5 = (i4 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
        long doubleToLongBits6 = Double.doubleToLongBits(this.f14989j);
        int i6 = (i5 * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)));
        long doubleToLongBits7 = Double.doubleToLongBits(this.f14990k);
        int i7 = (i6 * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)));
        long doubleToLongBits8 = Double.doubleToLongBits(this.l);
        int i8 = (i7 * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)));
        long doubleToLongBits9 = Double.doubleToLongBits(this.m);
        return (i8 * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(a)) {
            return "Rotate 0°";
        }
        if (equals(f14981b)) {
            return "Rotate 90°";
        }
        if (equals(f14982c)) {
            return "Rotate 180°";
        }
        if (equals(f14983d)) {
            return "Rotate 270°";
        }
        double d2 = this.f14984e;
        double d3 = this.f14985f;
        double d4 = this.f14986g;
        double d5 = this.f14987h;
        double d6 = this.f14988i;
        double d7 = this.f14989j;
        double d8 = this.f14990k;
        double d9 = this.l;
        double d10 = this.m;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d8);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }
}
