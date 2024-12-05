package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcgy implements zzdti<zzbbh<zzarx>> {
    private final zzdtu<zzczt> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<zzbbh<Bundle>> f14039b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzbai> f14040c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<ApplicationInfo> f14041d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<String> f14042e;

    /* renamed from: f, reason: collision with root package name */
    private final zzdtu<List<String>> f14043f;

    /* renamed from: g, reason: collision with root package name */
    private final zzdtu<PackageInfo> f14044g;

    /* renamed from: h, reason: collision with root package name */
    private final zzdtu<zzbbh<String>> f14045h;

    /* renamed from: i, reason: collision with root package name */
    private final zzdtu<zzaxb> f14046i;

    /* renamed from: j, reason: collision with root package name */
    private final zzdtu<String> f14047j;

    private zzcgy(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbh<Bundle>> zzdtuVar2, zzdtu<zzbai> zzdtuVar3, zzdtu<ApplicationInfo> zzdtuVar4, zzdtu<String> zzdtuVar5, zzdtu<List<String>> zzdtuVar6, zzdtu<PackageInfo> zzdtuVar7, zzdtu<zzbbh<String>> zzdtuVar8, zzdtu<zzaxb> zzdtuVar9, zzdtu<String> zzdtuVar10) {
        this.a = zzdtuVar;
        this.f14039b = zzdtuVar2;
        this.f14040c = zzdtuVar3;
        this.f14041d = zzdtuVar4;
        this.f14042e = zzdtuVar5;
        this.f14043f = zzdtuVar6;
        this.f14044g = zzdtuVar7;
        this.f14045h = zzdtuVar8;
        this.f14046i = zzdtuVar9;
        this.f14047j = zzdtuVar10;
    }

    public static zzcgy a(zzdtu<zzczt> zzdtuVar, zzdtu<zzbbh<Bundle>> zzdtuVar2, zzdtu<zzbai> zzdtuVar3, zzdtu<ApplicationInfo> zzdtuVar4, zzdtu<String> zzdtuVar5, zzdtu<List<String>> zzdtuVar6, zzdtu<PackageInfo> zzdtuVar7, zzdtu<zzbbh<String>> zzdtuVar8, zzdtu<zzaxb> zzdtuVar9, zzdtu<String> zzdtuVar10) {
        return new zzcgy(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5, zzdtuVar6, zzdtuVar7, zzdtuVar8, zzdtuVar9, zzdtuVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzczt zzcztVar = this.a.get();
        final zzbbh<Bundle> zzbbhVar = this.f14039b.get();
        final zzbai zzbaiVar = this.f14040c.get();
        final ApplicationInfo applicationInfo = this.f14041d.get();
        final String str = this.f14042e.get();
        final List<String> list = this.f14043f.get();
        final PackageInfo packageInfo = this.f14044g.get();
        final zzbbh<String> zzbbhVar2 = this.f14045h.get();
        final zzaxb zzaxbVar = this.f14046i.get();
        final String str2 = this.f14047j.get();
        return (zzbbh) zzdto.b(zzcztVar.b(zzczs.REQUEST_PARCEL, zzbbhVar, zzbbhVar2).a(new Callable(zzbbhVar, zzbaiVar, applicationInfo, str, list, packageInfo, zzbbhVar2, zzaxbVar, str2) { // from class: com.google.android.gms.internal.ads.zi

            /* renamed from: f, reason: collision with root package name */
            private final zzbbh f12527f;

            /* renamed from: g, reason: collision with root package name */
            private final zzbai f12528g;

            /* renamed from: h, reason: collision with root package name */
            private final ApplicationInfo f12529h;

            /* renamed from: i, reason: collision with root package name */
            private final String f12530i;

            /* renamed from: j, reason: collision with root package name */
            private final List f12531j;

            /* renamed from: k, reason: collision with root package name */
            private final PackageInfo f12532k;
            private final zzbbh l;
            private final zzaxb m;
            private final String n;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12527f = zzbbhVar;
                this.f12528g = zzbaiVar;
                this.f12529h = applicationInfo;
                this.f12530i = str;
                this.f12531j = list;
                this.f12532k = packageInfo;
                this.l = zzbbhVar2;
                this.m = zzaxbVar;
                this.n = str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzbbh zzbbhVar3 = this.f12527f;
                zzbai zzbaiVar2 = this.f12528g;
                ApplicationInfo applicationInfo2 = this.f12529h;
                String str3 = this.f12530i;
                List list2 = this.f12531j;
                PackageInfo packageInfo2 = this.f12532k;
                zzbbh zzbbhVar4 = this.l;
                zzaxb zzaxbVar2 = this.m;
                return new zzarx((Bundle) zzbbhVar3.get(), zzbaiVar2, applicationInfo2, str3, list2, packageInfo2, (String) zzbbhVar4.get(), zzaxbVar2.E(), this.n);
            }
        }).f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
