package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzcmg implements zzcka<zzbyn, zzaov, zzcla> {
    private final Context a;

    /* renamed from: b */
    private final zzbxo f14206b;

    /* renamed from: c */
    private zzang f14207c;

    public zzcmg(Context context, zzbxo zzbxoVar) {
        this.a = context;
        this.f14206b = zzbxoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final /* synthetic */ zzbyn a(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzaov, zzcla> zzcjyVar) throws RemoteException, zzcmw {
        if (zzcxuVar.a.a.f14576g.contains(Integer.toString(6))) {
            zzbyt J = zzbyt.J(this.f14207c);
            if (zzcxuVar.a.a.f14576g.contains(Integer.toString(J.w()))) {
                zzbyw b2 = this.f14206b.b(new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.a), new zzbzf(J), new zzcag(null, null, this.f14207c));
                zzcjyVar.f14137c.I7(b2.f());
                return b2.g();
            }
            throw new zzcmw("No corresponding native ad listener", 0);
        }
        throw new zzcmw("Unified must be used for RTB.", 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final void b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzaov, zzcla> zzcjyVar) throws RemoteException {
        zzcjyVar.f14136b.e4(zzcxmVar.K, zzcxmVar.s.toString(), zzcxuVar.a.a.f14573d, ObjectWrapper.i0(this.a), new ml(this, zzcjyVar), zzcjyVar.f14137c);
    }
}
