package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzcnd implements zzcka<zzcdb, zzaov, zzcla> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzcdf f14254b;

    public zzcnd(Context context, zzcdf zzcdfVar) {
        this.a = context;
        this.f14254b = zzcdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final /* synthetic */ zzcdb a(zzcxu zzcxuVar, zzcxm zzcxmVar, final zzcjy<zzaov, zzcla> zzcjyVar) throws RemoteException, zzcmw {
        final zzcjx zzcjxVar = new zzcjx(zzcxmVar);
        zzcdc a = this.f14254b.a(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.a), new zzcdd(new zzbwz(zzcjyVar, zzcjxVar) { // from class: com.google.android.gms.internal.ads.rl
            private final zzcjy a;

            /* renamed from: b, reason: collision with root package name */
            private final zzcjx f12117b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = zzcjyVar;
                this.f12117b = zzcjxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwz
            public final void a(boolean z, Context context) {
                zzcjy zzcjyVar2 = this.a;
                zzcjx zzcjxVar2 = this.f12117b;
                try {
                    if (((zzaov) zzcjyVar2.f14136b).B2(ObjectWrapper.i0(context))) {
                        zzcjxVar2.b();
                    } else {
                        zzbad.i("Can't show rewarded video.");
                    }
                } catch (RemoteException e2) {
                    zzbad.d("Can't show rewarded video.", e2);
                }
            }
        }));
        zzcjxVar.a(a.d());
        zzcjyVar.f14137c.I7(a.l());
        return a.j();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final void b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzaov, zzcla> zzcjyVar) throws RemoteException {
        zzcjyVar.f14136b.s5(zzcxmVar.K, zzcxmVar.s.toString(), zzcxuVar.a.a.f14573d, ObjectWrapper.i0(this.a), new tl(this, zzcjyVar), zzcjyVar.f14137c);
    }
}
