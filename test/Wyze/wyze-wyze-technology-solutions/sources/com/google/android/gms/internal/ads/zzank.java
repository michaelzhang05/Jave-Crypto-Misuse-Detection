package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzank implements MediationAdRequest {
    private final Date a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12819b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f12820c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12821d;

    /* renamed from: e, reason: collision with root package name */
    private final Location f12822e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12823f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f12824g;

    /* renamed from: h, reason: collision with root package name */
    private final int f12825h;

    /* renamed from: i, reason: collision with root package name */
    private final String f12826i;

    public zzank(Date date, int i2, Set<String> set, Location location, boolean z, int i3, boolean z2, int i4, String str) {
        this.a = date;
        this.f12819b = i2;
        this.f12820c = set;
        this.f12822e = location;
        this.f12821d = z;
        this.f12823f = i3;
        this.f12824g = z2;
        this.f12825h = i4;
        this.f12826i = str;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final Date getBirthday() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final int getGender() {
        return this.f12819b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set<String> getKeywords() {
        return this.f12820c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f12822e;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f12824g;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f12821d;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f12823f;
    }
}
