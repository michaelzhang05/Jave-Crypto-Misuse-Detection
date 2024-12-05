package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcvu implements zzcva<zzcvt> {
    private final zzawi a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f14514b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14515c;

    /* renamed from: d, reason: collision with root package name */
    private final PackageInfo f14516d;

    public zzcvu(zzawi zzawiVar, Executor executor, String str, PackageInfo packageInfo) {
        this.a = zzawiVar;
        this.f14514b = executor;
        this.f14515c = str;
        this.f14516d = packageInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbbh a(Throwable th) throws Exception {
        return zzbar.o(new zzcvt(this.f14515c));
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    public final zzbbh<zzcvt> b() {
        return zzbar.e(zzbar.d(this.a.b(this.f14515c, this.f14516d), hp.a, this.f14514b), Throwable.class, new zzbal(this) { // from class: com.google.android.gms.internal.ads.ip
            private final zzcvu a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return this.a.a((Throwable) obj);
            }
        }, this.f14514b);
    }
}
