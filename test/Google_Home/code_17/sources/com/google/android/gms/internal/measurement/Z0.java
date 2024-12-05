package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class Z0 extends R.a {
    public static final Parcelable.Creator<Z0> CREATOR = new C2087c1();

    /* renamed from: a, reason: collision with root package name */
    public final long f16517a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16518b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16519c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16520d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16521e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16522f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f16523g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16524h;

    public Z0(long j8, long j9, boolean z8, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f16517a = j8;
        this.f16518b = j9;
        this.f16519c = z8;
        this.f16520d = str;
        this.f16521e = str2;
        this.f16522f = str3;
        this.f16523g = bundle;
        this.f16524h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.n(parcel, 1, this.f16517a);
        R.c.n(parcel, 2, this.f16518b);
        R.c.c(parcel, 3, this.f16519c);
        R.c.q(parcel, 4, this.f16520d, false);
        R.c.q(parcel, 5, this.f16521e, false);
        R.c.q(parcel, 6, this.f16522f, false);
        R.c.e(parcel, 7, this.f16523g, false);
        R.c.q(parcel, 8, this.f16524h, false);
        R.c.b(parcel, a8);
    }
}
