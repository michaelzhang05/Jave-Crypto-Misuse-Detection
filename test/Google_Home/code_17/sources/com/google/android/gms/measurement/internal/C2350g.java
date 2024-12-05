package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2350g extends R.a {
    public static final Parcelable.Creator<C2350g> CREATOR = new C2343f();

    /* renamed from: a, reason: collision with root package name */
    public String f17578a;

    /* renamed from: b, reason: collision with root package name */
    public String f17579b;

    /* renamed from: c, reason: collision with root package name */
    public V5 f17580c;

    /* renamed from: d, reason: collision with root package name */
    public long f17581d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17582e;

    /* renamed from: f, reason: collision with root package name */
    public String f17583f;

    /* renamed from: g, reason: collision with root package name */
    public G f17584g;

    /* renamed from: h, reason: collision with root package name */
    public long f17585h;

    /* renamed from: i, reason: collision with root package name */
    public G f17586i;

    /* renamed from: j, reason: collision with root package name */
    public long f17587j;

    /* renamed from: k, reason: collision with root package name */
    public G f17588k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2350g(C2350g c2350g) {
        AbstractC1400p.l(c2350g);
        this.f17578a = c2350g.f17578a;
        this.f17579b = c2350g.f17579b;
        this.f17580c = c2350g.f17580c;
        this.f17581d = c2350g.f17581d;
        this.f17582e = c2350g.f17582e;
        this.f17583f = c2350g.f17583f;
        this.f17584g = c2350g.f17584g;
        this.f17585h = c2350g.f17585h;
        this.f17586i = c2350g.f17586i;
        this.f17587j = c2350g.f17587j;
        this.f17588k = c2350g.f17588k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f17578a, false);
        R.c.q(parcel, 3, this.f17579b, false);
        R.c.p(parcel, 4, this.f17580c, i8, false);
        R.c.n(parcel, 5, this.f17581d);
        R.c.c(parcel, 6, this.f17582e);
        R.c.q(parcel, 7, this.f17583f, false);
        R.c.p(parcel, 8, this.f17584g, i8, false);
        R.c.n(parcel, 9, this.f17585h);
        R.c.p(parcel, 10, this.f17586i, i8, false);
        R.c.n(parcel, 11, this.f17587j);
        R.c.p(parcel, 12, this.f17588k, i8, false);
        R.c.b(parcel, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2350g(String str, String str2, V5 v52, long j8, boolean z8, String str3, G g8, long j9, G g9, long j10, G g10) {
        this.f17578a = str;
        this.f17579b = str2;
        this.f17580c = v52;
        this.f17581d = j8;
        this.f17582e = z8;
        this.f17583f = str3;
        this.f17584g = g8;
        this.f17585h = j9;
        this.f17586i = g9;
        this.f17587j = j10;
        this.f17588k = g10;
    }
}
