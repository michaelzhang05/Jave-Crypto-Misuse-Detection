package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class b6 extends R.a {
    public static final Parcelable.Creator<b6> CREATOR = new N5();

    /* renamed from: A, reason: collision with root package name */
    public final int f17491A;

    /* renamed from: B, reason: collision with root package name */
    public final String f17492B;

    /* renamed from: C, reason: collision with root package name */
    public final int f17493C;

    /* renamed from: D, reason: collision with root package name */
    public final long f17494D;

    /* renamed from: E, reason: collision with root package name */
    public final String f17495E;

    /* renamed from: F, reason: collision with root package name */
    public final String f17496F;

    /* renamed from: a, reason: collision with root package name */
    public final String f17497a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17498b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17499c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17500d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17501e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17502f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17503g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17504h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f17505i;

    /* renamed from: j, reason: collision with root package name */
    public final long f17506j;

    /* renamed from: k, reason: collision with root package name */
    public final String f17507k;

    /* renamed from: l, reason: collision with root package name */
    private final long f17508l;

    /* renamed from: m, reason: collision with root package name */
    public final long f17509m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17510n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17511o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f17512p;

    /* renamed from: q, reason: collision with root package name */
    public final String f17513q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f17514r;

    /* renamed from: s, reason: collision with root package name */
    public final long f17515s;

    /* renamed from: t, reason: collision with root package name */
    public final List f17516t;

    /* renamed from: u, reason: collision with root package name */
    private final String f17517u;

    /* renamed from: v, reason: collision with root package name */
    public final String f17518v;

    /* renamed from: w, reason: collision with root package name */
    public final String f17519w;

    /* renamed from: x, reason: collision with root package name */
    public final String f17520x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f17521y;

    /* renamed from: z, reason: collision with root package name */
    public final long f17522z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b6(String str, String str2, String str3, long j8, String str4, long j9, long j10, String str5, boolean z8, boolean z9, String str6, long j11, long j12, int i8, boolean z10, boolean z11, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, String str11, boolean z12, long j14, int i9, String str12, int i10, long j15, String str13, String str14) {
        AbstractC1400p.f(str);
        this.f17497a = str;
        this.f17498b = TextUtils.isEmpty(str2) ? null : str2;
        this.f17499c = str3;
        this.f17506j = j8;
        this.f17500d = str4;
        this.f17501e = j9;
        this.f17502f = j10;
        this.f17503g = str5;
        this.f17504h = z8;
        this.f17505i = z9;
        this.f17507k = str6;
        this.f17508l = j11;
        this.f17509m = j12;
        this.f17510n = i8;
        this.f17511o = z10;
        this.f17512p = z11;
        this.f17513q = str7;
        this.f17514r = bool;
        this.f17515s = j13;
        this.f17516t = list;
        this.f17517u = null;
        this.f17518v = str9;
        this.f17519w = str10;
        this.f17520x = str11;
        this.f17521y = z12;
        this.f17522z = j14;
        this.f17491A = i9;
        this.f17492B = str12;
        this.f17493C = i10;
        this.f17494D = j15;
        this.f17495E = str13;
        this.f17496F = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f17497a, false);
        R.c.q(parcel, 3, this.f17498b, false);
        R.c.q(parcel, 4, this.f17499c, false);
        R.c.q(parcel, 5, this.f17500d, false);
        R.c.n(parcel, 6, this.f17501e);
        R.c.n(parcel, 7, this.f17502f);
        R.c.q(parcel, 8, this.f17503g, false);
        R.c.c(parcel, 9, this.f17504h);
        R.c.c(parcel, 10, this.f17505i);
        R.c.n(parcel, 11, this.f17506j);
        R.c.q(parcel, 12, this.f17507k, false);
        R.c.n(parcel, 13, this.f17508l);
        R.c.n(parcel, 14, this.f17509m);
        R.c.k(parcel, 15, this.f17510n);
        R.c.c(parcel, 16, this.f17511o);
        R.c.c(parcel, 18, this.f17512p);
        R.c.q(parcel, 19, this.f17513q, false);
        R.c.d(parcel, 21, this.f17514r, false);
        R.c.n(parcel, 22, this.f17515s);
        R.c.s(parcel, 23, this.f17516t, false);
        R.c.q(parcel, 24, this.f17517u, false);
        R.c.q(parcel, 25, this.f17518v, false);
        R.c.q(parcel, 26, this.f17519w, false);
        R.c.q(parcel, 27, this.f17520x, false);
        R.c.c(parcel, 28, this.f17521y);
        R.c.n(parcel, 29, this.f17522z);
        R.c.k(parcel, 30, this.f17491A);
        R.c.q(parcel, 31, this.f17492B, false);
        R.c.k(parcel, 32, this.f17493C);
        R.c.n(parcel, 34, this.f17494D);
        R.c.q(parcel, 35, this.f17495E, false);
        R.c.q(parcel, 36, this.f17496F, false);
        R.c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b6(String str, String str2, String str3, String str4, long j8, long j9, String str5, boolean z8, boolean z9, long j10, String str6, long j11, long j12, int i8, boolean z10, boolean z11, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, String str11, boolean z12, long j14, int i9, String str12, int i10, long j15, String str13, String str14) {
        this.f17497a = str;
        this.f17498b = str2;
        this.f17499c = str3;
        this.f17506j = j10;
        this.f17500d = str4;
        this.f17501e = j8;
        this.f17502f = j9;
        this.f17503g = str5;
        this.f17504h = z8;
        this.f17505i = z9;
        this.f17507k = str6;
        this.f17508l = j11;
        this.f17509m = j12;
        this.f17510n = i8;
        this.f17511o = z10;
        this.f17512p = z11;
        this.f17513q = str7;
        this.f17514r = bool;
        this.f17515s = j13;
        this.f17516t = list;
        this.f17517u = str8;
        this.f17518v = str9;
        this.f17519w = str10;
        this.f17520x = str11;
        this.f17521y = z12;
        this.f17522z = j14;
        this.f17491A = i9;
        this.f17492B = str12;
        this.f17493C = i10;
        this.f17494D = j15;
        this.f17495E = str13;
        this.f17496F = str14;
    }
}
