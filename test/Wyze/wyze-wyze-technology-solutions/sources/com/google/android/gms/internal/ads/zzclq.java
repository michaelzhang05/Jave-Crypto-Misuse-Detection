package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzclq implements zzcka<zzbvx, zzaov, zzcla> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbws f14198b;

    public zzclq(Context context, zzbws zzbwsVar) {
        this.a = context;
        this.f14198b = zzbwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final /* synthetic */ zzbvx a(zzcxu zzcxuVar, zzcxm zzcxmVar, final zzcjy<zzaov, zzcla> zzcjyVar) throws RemoteException, zzcmw {
        final zzcjx zzcjxVar = new zzcjx(zzcxmVar);
        zzbvy a = this.f14198b.a(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.a), new zzbvz(new zzbwz(zzcjyVar, zzcjxVar) { // from class: com.google.android.gms.internal.ads.cl
            private final zzcjy a;

            /* renamed from: b, reason: collision with root package name */
            private final zzcjx f11251b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzcjyVar;
                this.f11251b = zzcjxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwz
            public final void a(boolean z, Context context) {
                zzcjy zzcjyVar2 = this.a;
                zzcjx zzcjxVar2 = this.f11251b;
                try {
                    if (((zzaov) zzcjyVar2.f14136b).l2(ObjectWrapper.i0(context))) {
                        zzcjxVar2.b();
                    } else {
                        zzbad.i("Cannot show interstitial.");
                    }
                } catch (RemoteException e2) {
                    zzbad.d("Cannot show interstitial.", e2);
                }
            }
        }));
        zzcjxVar.a(a.d());
        zzcjyVar.f14137c.I7(a.f());
        return a.h();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final void b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzaov, zzcla> zzcjyVar) throws RemoteException {
        zzcjyVar.f14136b.T6(zzcxmVar.K, zzcxmVar.s.toString(), zzcxuVar.a.a.f14573d, ObjectWrapper.i0(this.a), new el(this, zzcjyVar), zzcjyVar.f14137c);
    }
}
