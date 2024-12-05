package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;

/* loaded from: classes3.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    final String f16759a;

    /* renamed from: b, reason: collision with root package name */
    final String f16760b;

    /* renamed from: c, reason: collision with root package name */
    final long f16761c;

    /* renamed from: d, reason: collision with root package name */
    final long f16762d;

    /* renamed from: e, reason: collision with root package name */
    final long f16763e;

    /* renamed from: f, reason: collision with root package name */
    final long f16764f;

    /* renamed from: g, reason: collision with root package name */
    final long f16765g;

    /* renamed from: h, reason: collision with root package name */
    final Long f16766h;

    /* renamed from: i, reason: collision with root package name */
    final Long f16767i;

    /* renamed from: j, reason: collision with root package name */
    final Long f16768j;

    /* renamed from: k, reason: collision with root package name */
    final Boolean f16769k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(String str, String str2, long j8, long j9, long j10, long j11, long j12, Long l8, Long l9, Long l10, Boolean bool) {
        boolean z8;
        boolean z9;
        boolean z10;
        AbstractC1319p.f(str);
        AbstractC1319p.f(str2);
        if (j8 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1319p.a(z8);
        if (j9 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1319p.a(z9);
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC1319p.a(z10);
        AbstractC1319p.a(j12 >= 0);
        this.f16759a = str;
        this.f16760b = str2;
        this.f16761c = j8;
        this.f16762d = j9;
        this.f16763e = j10;
        this.f16764f = j11;
        this.f16765g = j12;
        this.f16766h = l8;
        this.f16767i = l9;
        this.f16768j = l10;
        this.f16769k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r a(Long l8, Long l9, Boolean bool) {
        return new r(this.f16759a, this.f16760b, this.f16761c, this.f16762d, this.f16763e, this.f16764f, this.f16765g, this.f16766h, l8, l9, bool);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r b(long j8, long j9) {
        return new r(this.f16759a, this.f16760b, this.f16761c, this.f16762d, this.f16763e, this.f16764f, j8, Long.valueOf(j9), this.f16767i, this.f16768j, this.f16769k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r c(long j8) {
        return new r(this.f16759a, this.f16760b, this.f16761c, this.f16762d, this.f16763e, j8, this.f16765g, this.f16766h, this.f16767i, this.f16768j, this.f16769k);
    }
}
