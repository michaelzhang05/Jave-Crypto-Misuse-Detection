package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes2.dex */
public final class zzcuc implements zzdti<zzcub> {
    private final zzdtu<ApplicationInfo> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<PackageInfo> f14454b;

    private zzcuc(zzdtu<ApplicationInfo> zzdtuVar, zzdtu<PackageInfo> zzdtuVar2) {
        this.a = zzdtuVar;
        this.f14454b = zzdtuVar2;
    }

    public static zzcuc a(zzdtu<ApplicationInfo> zzdtuVar, zzdtu<PackageInfo> zzdtuVar2) {
        return new zzcuc(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzcub(this.a.get(), this.f14454b.get());
    }
}
