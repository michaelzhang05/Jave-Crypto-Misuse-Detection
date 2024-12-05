package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class T2 {

    /* renamed from: a, reason: collision with root package name */
    final Uri f15558a;

    /* renamed from: b, reason: collision with root package name */
    final String f15559b;

    /* renamed from: c, reason: collision with root package name */
    final String f15560c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f15561d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f15562e;

    private T2(String str, Uri uri, String str2, String str3, boolean z8, boolean z9, boolean z10, boolean z11, InterfaceC1963c3 interfaceC1963c3) {
        this.f15558a = uri;
        this.f15559b = "";
        this.f15560c = "";
        this.f15561d = z8;
        this.f15562e = z10;
    }

    public final T2 a() {
        return new T2(null, this.f15558a, this.f15559b, this.f15560c, this.f15561d, false, true, false, null);
    }

    public final T2 b() {
        if (this.f15559b.isEmpty()) {
            return new T2(null, this.f15558a, this.f15559b, this.f15560c, true, false, this.f15562e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final X2 c(String str, double d8) {
        return new R2(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final X2 d(String str, long j8) {
        return new P2(this, str, Long.valueOf(j8), true);
    }

    public final X2 e(String str, String str2) {
        return new S2(this, str, str2, true);
    }

    public final X2 f(String str, boolean z8) {
        return new Q2(this, str, Boolean.valueOf(z8), true);
    }

    public T2(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
