package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class D4 extends S.a {
    public static final Parcelable.Creator<D4> CREATOR = new E4();

    /* renamed from: a, reason: collision with root package name */
    public final String f16061a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16062b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16063c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16064d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16065e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16066f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16067g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f16068h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f16069i;

    /* renamed from: j, reason: collision with root package name */
    public final long f16070j;

    /* renamed from: k, reason: collision with root package name */
    public final String f16071k;

    /* renamed from: l, reason: collision with root package name */
    public final long f16072l;

    /* renamed from: m, reason: collision with root package name */
    public final long f16073m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16074n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f16075o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f16076p;

    /* renamed from: q, reason: collision with root package name */
    public final String f16077q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f16078r;

    /* renamed from: s, reason: collision with root package name */
    public final long f16079s;

    /* renamed from: t, reason: collision with root package name */
    public final List f16080t;

    /* renamed from: u, reason: collision with root package name */
    public final String f16081u;

    /* renamed from: v, reason: collision with root package name */
    public final String f16082v;

    /* renamed from: w, reason: collision with root package name */
    public final String f16083w;

    /* renamed from: x, reason: collision with root package name */
    public final String f16084x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f16085y;

    /* renamed from: z, reason: collision with root package name */
    public final long f16086z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D4(String str, String str2, String str3, long j8, String str4, long j9, long j10, String str5, boolean z8, boolean z9, String str6, long j11, long j12, int i8, boolean z10, boolean z11, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, String str11, boolean z12, long j14) {
        AbstractC1319p.f(str);
        this.f16061a = str;
        this.f16062b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f16063c = str3;
        this.f16070j = j8;
        this.f16064d = str4;
        this.f16065e = j9;
        this.f16066f = j10;
        this.f16067g = str5;
        this.f16068h = z8;
        this.f16069i = z9;
        this.f16071k = str6;
        this.f16072l = 0L;
        this.f16073m = j12;
        this.f16074n = i8;
        this.f16075o = z10;
        this.f16076p = z11;
        this.f16077q = str7;
        this.f16078r = bool;
        this.f16079s = j13;
        this.f16080t = list;
        this.f16081u = null;
        this.f16082v = str9;
        this.f16083w = str10;
        this.f16084x = str11;
        this.f16085y = z12;
        this.f16086z = j14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f16061a, false);
        S.c.q(parcel, 3, this.f16062b, false);
        S.c.q(parcel, 4, this.f16063c, false);
        S.c.q(parcel, 5, this.f16064d, false);
        S.c.n(parcel, 6, this.f16065e);
        S.c.n(parcel, 7, this.f16066f);
        S.c.q(parcel, 8, this.f16067g, false);
        S.c.c(parcel, 9, this.f16068h);
        S.c.c(parcel, 10, this.f16069i);
        S.c.n(parcel, 11, this.f16070j);
        S.c.q(parcel, 12, this.f16071k, false);
        S.c.n(parcel, 13, this.f16072l);
        S.c.n(parcel, 14, this.f16073m);
        S.c.k(parcel, 15, this.f16074n);
        S.c.c(parcel, 16, this.f16075o);
        S.c.c(parcel, 18, this.f16076p);
        S.c.q(parcel, 19, this.f16077q, false);
        S.c.d(parcel, 21, this.f16078r, false);
        S.c.n(parcel, 22, this.f16079s);
        S.c.s(parcel, 23, this.f16080t, false);
        S.c.q(parcel, 24, this.f16081u, false);
        S.c.q(parcel, 25, this.f16082v, false);
        S.c.q(parcel, 26, this.f16083w, false);
        S.c.q(parcel, 27, this.f16084x, false);
        S.c.c(parcel, 28, this.f16085y);
        S.c.n(parcel, 29, this.f16086z);
        S.c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public D4(String str, String str2, String str3, String str4, long j8, long j9, String str5, boolean z8, boolean z9, long j10, String str6, long j11, long j12, int i8, boolean z10, boolean z11, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, String str11, boolean z12, long j14) {
        this.f16061a = str;
        this.f16062b = str2;
        this.f16063c = str3;
        this.f16070j = j10;
        this.f16064d = str4;
        this.f16065e = j8;
        this.f16066f = j9;
        this.f16067g = str5;
        this.f16068h = z8;
        this.f16069i = z9;
        this.f16071k = str6;
        this.f16072l = j11;
        this.f16073m = j12;
        this.f16074n = i8;
        this.f16075o = z10;
        this.f16076p = z11;
        this.f16077q = str7;
        this.f16078r = bool;
        this.f16079s = j13;
        this.f16080t = list;
        this.f16081u = str8;
        this.f16082v = str9;
        this.f16083w = str10;
        this.f16084x = str11;
        this.f16085y = z12;
        this.f16086z = j14;
    }
}
