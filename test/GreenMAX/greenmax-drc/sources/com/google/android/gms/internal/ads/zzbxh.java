package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzbxh implements zzdti<zzbxg> {
    private final zzdtu<zzavf> a;

    /* renamed from: b, reason: collision with root package name */
    private final zzdtu<Context> f13632b;

    /* renamed from: c, reason: collision with root package name */
    private final zzdtu<zzavg> f13633c;

    /* renamed from: d, reason: collision with root package name */
    private final zzdtu<View> f13634d;

    /* renamed from: e, reason: collision with root package name */
    private final zzdtu<Integer> f13635e;

    private zzbxh(zzdtu<zzavf> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzavg> zzdtuVar3, zzdtu<View> zzdtuVar4, zzdtu<Integer> zzdtuVar5) {
        this.a = zzdtuVar;
        this.f13632b = zzdtuVar2;
        this.f13633c = zzdtuVar3;
        this.f13634d = zzdtuVar4;
        this.f13635e = zzdtuVar5;
    }

    public static zzbxh a(zzdtu<zzavf> zzdtuVar, zzdtu<Context> zzdtuVar2, zzdtu<zzavg> zzdtuVar3, zzdtu<View> zzdtuVar4, zzdtu<Integer> zzdtuVar5) {
        return new zzbxh(zzdtuVar, zzdtuVar2, zzdtuVar3, zzdtuVar4, zzdtuVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        return new zzbxg(this.a.get(), this.f13632b.get(), this.f13633c.get(), this.f13634d.get(), this.f13635e.get().intValue());
    }
}
