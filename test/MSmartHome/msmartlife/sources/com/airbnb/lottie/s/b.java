package com.airbnb.lottie.s;

/* compiled from: DocumentData.java */
/* loaded from: classes.dex */
public class b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8095b;

    /* renamed from: c, reason: collision with root package name */
    public final double f8096c;

    /* renamed from: d, reason: collision with root package name */
    final int f8097d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8098e;

    /* renamed from: f, reason: collision with root package name */
    final double f8099f;

    /* renamed from: g, reason: collision with root package name */
    public final double f8100g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8101h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8102i;

    /* renamed from: j, reason: collision with root package name */
    public final double f8103j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f8104k;

    public b(String str, String str2, double d2, int i2, int i3, double d3, double d4, int i4, int i5, double d5, boolean z) {
        this.a = str;
        this.f8095b = str2;
        this.f8096c = d2;
        this.f8097d = i2;
        this.f8098e = i3;
        this.f8099f = d3;
        this.f8100g = d4;
        this.f8101h = i4;
        this.f8102i = i5;
        this.f8103j = d5;
        this.f8104k = z;
    }

    public int hashCode() {
        double hashCode = ((this.a.hashCode() * 31) + this.f8095b.hashCode()) * 31;
        double d2 = this.f8096c;
        Double.isNaN(hashCode);
        int i2 = (((((int) (hashCode + d2)) * 31) + this.f8097d) * 31) + this.f8098e;
        long doubleToLongBits = Double.doubleToLongBits(this.f8099f);
        return (((i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f8101h;
    }
}
