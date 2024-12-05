package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
public final class zzays {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    private final double f13110b;

    /* renamed from: c, reason: collision with root package name */
    private final double f13111c;

    /* renamed from: d, reason: collision with root package name */
    public final double f13112d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13113e;

    public zzays(String str, double d2, double d3, double d4, int i2) {
        this.a = str;
        this.f13111c = d2;
        this.f13110b = d3;
        this.f13112d = d4;
        this.f13113e = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzays)) {
            return false;
        }
        zzays zzaysVar = (zzays) obj;
        return Objects.a(this.a, zzaysVar.a) && this.f13110b == zzaysVar.f13110b && this.f13111c == zzaysVar.f13111c && this.f13113e == zzaysVar.f13113e && Double.compare(this.f13112d, zzaysVar.f13112d) == 0;
    }

    public final int hashCode() {
        return Objects.b(this.a, Double.valueOf(this.f13110b), Double.valueOf(this.f13111c), Double.valueOf(this.f13112d), Integer.valueOf(this.f13113e));
    }

    public final String toString() {
        return Objects.c(this).a("name", this.a).a("minBound", Double.valueOf(this.f13111c)).a("maxBound", Double.valueOf(this.f13110b)).a("percent", Double.valueOf(this.f13112d)).a("count", Integer.valueOf(this.f13113e)).toString();
    }
}
