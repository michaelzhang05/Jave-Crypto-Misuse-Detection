package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2270v extends S.a {
    public static final Parcelable.Creator<C2270v> CREATOR = new C2275w();

    /* renamed from: a, reason: collision with root package name */
    public final String f16884a;

    /* renamed from: b, reason: collision with root package name */
    public final C2260t f16885b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16886c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16887d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2270v(C2270v c2270v, long j8) {
        AbstractC1319p.l(c2270v);
        this.f16884a = c2270v.f16884a;
        this.f16885b = c2270v.f16885b;
        this.f16886c = c2270v.f16886c;
        this.f16887d = j8;
    }

    public final String toString() {
        return "origin=" + this.f16886c + ",name=" + this.f16884a + ",params=" + String.valueOf(this.f16885b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        C2275w.a(this, parcel, i8);
    }

    public C2270v(String str, C2260t c2260t, String str2, long j8) {
        this.f16884a = str;
        this.f16885b = c2260t;
        this.f16886c = str2;
        this.f16887d = j8;
    }
}
