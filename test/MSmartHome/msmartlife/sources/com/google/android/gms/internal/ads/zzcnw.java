package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcnw implements zzcka<zzcdb, zzams, zzclb> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f14275b;

    /* renamed from: c, reason: collision with root package name */
    private final zzcdf f14276c;

    public zzcnw(Context context, Executor executor, zzcdf zzcdfVar) {
        this.a = context;
        this.f14275b = executor;
        this.f14276c = zzcdfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzclb> zzcjyVar) {
        try {
            zzcjyVar.f14136b.H6(zzcxuVar.a.a.f14573d, zzcxmVar.s.toString());
        } catch (Exception e2) {
            String valueOf = String.valueOf(zzcjyVar.a);
            zzbad.d(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final /* synthetic */ zzcdb a(zzcxu zzcxuVar, zzcxm zzcxmVar, final zzcjy<zzams, zzclb> zzcjyVar) throws RemoteException, zzcmw {
        zzcdc a = this.f14276c.a(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.a), new zzcdd(new zzbwz(zzcjyVar) { // from class: com.google.android.gms.internal.ads.dm
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
                    ((zzams) zzcjyVar2.f14136b).showVideo();
                } catch (RemoteException e2) {
                    zzbad.d("Cannot show rewarded video.", e2);
                }
            }
        }));
        a.a().V(new zzccy(zzcjyVar.f14136b), this.f14275b);
        zzbse b2 = a.b();
        zzbri c2 = a.c();
        zzcjyVar.f14137c.I7(new hm(this, a.h(), c2, b2, a.k()));
        return a.j();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final void b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzclb> zzcjyVar) throws RemoteException {
        if (!zzcjyVar.f14136b.isInitialized()) {
            zzcjyVar.f14137c.J7(new em(this, zzcxuVar, zzcxmVar, zzcjyVar));
            zzcjyVar.f14136b.g4(ObjectWrapper.i0(this.a), zzcxuVar.a.a.f14573d, null, zzcjyVar.f14137c, zzcxmVar.s.toString());
            return;
        }
        e(zzcxuVar, zzcxmVar, zzcjyVar);
    }
}
