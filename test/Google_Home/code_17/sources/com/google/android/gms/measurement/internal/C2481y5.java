package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.y5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2481y5 extends R.a {
    public static final Parcelable.Creator<C2481y5> CREATOR = new B5();

    /* renamed from: a, reason: collision with root package name */
    public final String f17928a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17929b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17930c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2481y5(String str, long j8, int i8) {
        this.f17928a = str;
        this.f17929b = j8;
        this.f17930c = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 1, this.f17928a, false);
        R.c.n(parcel, 2, this.f17929b);
        R.c.k(parcel, 3, this.f17930c);
        R.c.b(parcel, a8);
    }
}
