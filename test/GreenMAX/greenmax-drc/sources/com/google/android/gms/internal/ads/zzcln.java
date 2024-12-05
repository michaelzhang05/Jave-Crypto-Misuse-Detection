package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzcln implements zzcka<zzbvx, zzams, zzcla> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbws f14194b;

    /* renamed from: c, reason: collision with root package name */
    private final zzbai f14195c;

    public zzcln(Context context, zzbai zzbaiVar, zzbws zzbwsVar) {
        this.a = context;
        this.f14195c = zzbaiVar;
        this.f14194b = zzbwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final /* synthetic */ zzbvx a(zzcxu zzcxuVar, zzcxm zzcxmVar, final zzcjy<zzams, zzcla> zzcjyVar) throws RemoteException, zzcmw {
        zzbvy a = this.f14194b.a(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.a), new zzbvz(new zzbwz(zzcjyVar) { // from class: com.google.android.gms.internal.ads.bl
            private final zzcjy a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzcjyVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwz
            public final void a(boolean z, Context context) {
                zzcjy zzcjyVar2 = this.a;
                try {
                    ((zzams) zzcjyVar2.f14136b).setImmersiveMode(z);
                    ((zzams) zzcjyVar2.f14136b).showInterstitial();
                } catch (RemoteException unused) {
                    zzbad.h("Cannot show interstitial.");
                }
            }
        }));
        zzcjyVar.f14137c.I7(a.f());
        return a.h();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final void b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzcla> zzcjyVar) throws RemoteException {
        if (this.f14195c.f13152h < 4100000) {
            zzcjyVar.f14136b.Q2(ObjectWrapper.i0(this.a), zzcxuVar.a.a.f14573d, zzcxmVar.s.toString(), zzcjyVar.f14137c);
        } else {
            zzcjyVar.f14136b.u6(ObjectWrapper.i0(this.a), zzcxuVar.a.a.f14573d, zzcxmVar.s.toString(), zzazc.a(zzcxmVar.p), zzcjyVar.f14137c);
        }
    }
}
