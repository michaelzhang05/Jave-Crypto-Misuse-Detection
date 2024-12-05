package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Parcel;
import android.os.Parcelable;
import l0.C3268c;

/* loaded from: classes3.dex */
public final class G extends R.a {
    public static final Parcelable.Creator<G> CREATOR = new C3268c();

    /* renamed from: a, reason: collision with root package name */
    public final String f17033a;

    /* renamed from: b, reason: collision with root package name */
    public final C f17034b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17035c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17036d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G(G g8, long j8) {
        AbstractC1400p.l(g8);
        this.f17033a = g8.f17033a;
        this.f17034b = g8.f17034b;
        this.f17035c = g8.f17035c;
        this.f17036d = j8;
    }

    public final String toString() {
        return "origin=" + this.f17035c + ",name=" + this.f17033a + ",params=" + String.valueOf(this.f17034b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f17033a, false);
        R.c.p(parcel, 3, this.f17034b, i8, false);
        R.c.q(parcel, 4, this.f17035c, false);
        R.c.n(parcel, 5, this.f17036d);
        R.c.b(parcel, a8);
    }

    public G(String str, C c8, String str2, long j8) {
        this.f17033a = str;
        this.f17034b = c8;
        this.f17035c = str2;
        this.f17036d = j8;
    }
}
