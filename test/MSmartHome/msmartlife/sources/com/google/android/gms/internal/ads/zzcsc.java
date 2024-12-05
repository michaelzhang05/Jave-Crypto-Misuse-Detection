package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class zzcsc implements zzcuz<Bundle> {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f14415b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14416c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14417d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14418e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14419f;

    /* renamed from: g, reason: collision with root package name */
    private final float f14420g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f14421h;

    public zzcsc(int i2, boolean z, boolean z2, int i3, int i4, int i5, float f2, boolean z3) {
        this.a = i2;
        this.f14415b = z;
        this.f14416c = z2;
        this.f14417d = i3;
        this.f14418e = i4;
        this.f14419f = i5;
        this.f14420g = f2;
        this.f14421h = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.a);
        bundle2.putBoolean("ma", this.f14415b);
        bundle2.putBoolean("sp", this.f14416c);
        bundle2.putInt("muv", this.f14417d);
        bundle2.putInt("rm", this.f14418e);
        bundle2.putInt("riv", this.f14419f);
        bundle2.putFloat("android_app_volume", this.f14420g);
        bundle2.putBoolean("android_app_muted", this.f14421h);
    }
}
