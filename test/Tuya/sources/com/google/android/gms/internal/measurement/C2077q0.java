package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2077q0 extends S.a {
    public static final Parcelable.Creator<C2077q0> CREATOR = new C2084r0();

    /* renamed from: a, reason: collision with root package name */
    public final long f15845a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15846b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15847c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15848d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15849e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15850f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f15851g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15852h;

    public C2077q0(long j8, long j9, boolean z8, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f15845a = j8;
        this.f15846b = j9;
        this.f15847c = z8;
        this.f15848d = str;
        this.f15849e = str2;
        this.f15850f = str3;
        this.f15851g = bundle;
        this.f15852h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = S.c.a(parcel);
        S.c.n(parcel, 1, this.f15845a);
        S.c.n(parcel, 2, this.f15846b);
        S.c.c(parcel, 3, this.f15847c);
        S.c.q(parcel, 4, this.f15848d, false);
        S.c.q(parcel, 5, this.f15849e, false);
        S.c.q(parcel, 6, this.f15850f, false);
        S.c.e(parcel, 7, this.f15851g, false);
        S.c.q(parcel, 8, this.f15852h, false);
        S.c.b(parcel, a8);
    }
}
