package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2173d extends S.a {
    public static final Parcelable.Creator<C2173d> CREATOR = new C2179e();

    /* renamed from: a, reason: collision with root package name */
    public String f16446a;

    /* renamed from: b, reason: collision with root package name */
    public String f16447b;

    /* renamed from: c, reason: collision with root package name */
    public u4 f16448c;

    /* renamed from: d, reason: collision with root package name */
    public long f16449d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16450e;

    /* renamed from: f, reason: collision with root package name */
    public String f16451f;

    /* renamed from: g, reason: collision with root package name */
    public final C2270v f16452g;

    /* renamed from: h, reason: collision with root package name */
    public long f16453h;

    /* renamed from: i, reason: collision with root package name */
    public C2270v f16454i;

    /* renamed from: j, reason: collision with root package name */
    public final long f16455j;

    /* renamed from: k, reason: collision with root package name */
    public final C2270v f16456k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2173d(C2173d c2173d) {
        AbstractC1319p.l(c2173d);
        this.f16446a = c2173d.f16446a;
        this.f16447b = c2173d.f16447b;
        this.f16448c = c2173d.f16448c;
        this.f16449d = c2173d.f16449d;
        this.f16450e = c2173d.f16450e;
        this.f16451f = c2173d.f16451f;
        this.f16452g = c2173d.f16452g;
        this.f16453h = c2173d.f16453h;
        this.f16454i = c2173d.f16454i;
        this.f16455j = c2173d.f16455j;
        this.f16456k = c2173d.f16456k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.q(parcel, 2, this.f16446a, false);
        S.c.q(parcel, 3, this.f16447b, false);
        S.c.p(parcel, 4, this.f16448c, i8, false);
        S.c.n(parcel, 5, this.f16449d);
        S.c.c(parcel, 6, this.f16450e);
        S.c.q(parcel, 7, this.f16451f, false);
        S.c.p(parcel, 8, this.f16452g, i8, false);
        S.c.n(parcel, 9, this.f16453h);
        S.c.p(parcel, 10, this.f16454i, i8, false);
        S.c.n(parcel, 11, this.f16455j);
        S.c.p(parcel, 12, this.f16456k, i8, false);
        S.c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2173d(String str, String str2, u4 u4Var, long j8, boolean z8, String str3, C2270v c2270v, long j9, C2270v c2270v2, long j10, C2270v c2270v3) {
        this.f16446a = str;
        this.f16447b = str2;
        this.f16448c = u4Var;
        this.f16449d = j8;
        this.f16450e = z8;
        this.f16451f = str3;
        this.f16452g = c2270v;
        this.f16453h = j9;
        this.f16454i = c2270v2;
        this.f16455j = j10;
        this.f16456k = c2270v3;
    }
}
