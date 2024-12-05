package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;

/* loaded from: classes3.dex */
final class D {

    /* renamed from: a, reason: collision with root package name */
    final String f16989a;

    /* renamed from: b, reason: collision with root package name */
    final String f16990b;

    /* renamed from: c, reason: collision with root package name */
    final long f16991c;

    /* renamed from: d, reason: collision with root package name */
    final long f16992d;

    /* renamed from: e, reason: collision with root package name */
    final long f16993e;

    /* renamed from: f, reason: collision with root package name */
    final long f16994f;

    /* renamed from: g, reason: collision with root package name */
    final long f16995g;

    /* renamed from: h, reason: collision with root package name */
    final Long f16996h;

    /* renamed from: i, reason: collision with root package name */
    final Long f16997i;

    /* renamed from: j, reason: collision with root package name */
    final Long f16998j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f16999k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(String str, String str2, long j8, long j9, long j10, long j11, Long l8, Long l9, Long l10, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j10, 0L, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final D a(long j8) {
        return new D(this.f16989a, this.f16990b, this.f16991c, this.f16992d, this.f16993e, j8, this.f16995g, this.f16996h, this.f16997i, this.f16998j, this.f16999k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final D b(long j8, long j9) {
        return new D(this.f16989a, this.f16990b, this.f16991c, this.f16992d, this.f16993e, this.f16994f, j8, Long.valueOf(j9), this.f16997i, this.f16998j, this.f16999k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final D c(Long l8, Long l9, Boolean bool) {
        Boolean bool2;
        if (bool != null && !bool.booleanValue()) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        return new D(this.f16989a, this.f16990b, this.f16991c, this.f16992d, this.f16993e, this.f16994f, this.f16995g, this.f16996h, l8, l9, bool2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(String str, String str2, long j8, long j9, long j10, long j11, long j12, Long l8, Long l9, Long l10, Boolean bool) {
        AbstractC1400p.f(str);
        AbstractC1400p.f(str2);
        AbstractC1400p.a(j8 >= 0);
        AbstractC1400p.a(j9 >= 0);
        AbstractC1400p.a(j10 >= 0);
        AbstractC1400p.a(j12 >= 0);
        this.f16989a = str;
        this.f16990b = str2;
        this.f16991c = j8;
        this.f16992d = j9;
        this.f16993e = j10;
        this.f16994f = j11;
        this.f16995g = j12;
        this.f16996h = l8;
        this.f16997i = l9;
        this.f16998j = l10;
        this.f16999k = bool;
    }
}
