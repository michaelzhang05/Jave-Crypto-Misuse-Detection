package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzckm implements zzcka<zzbnf, zzaov, zzcla> {
    private final Context a;

    /* renamed from: b */
    private final zzboc f14152b;

    /* renamed from: c */
    private View f14153c;

    public zzckm(Context context, zzboc zzbocVar) {
        this.a = context;
        this.f14152b = zzbocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final /* synthetic */ zzbnf a(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzaov, zzcla> zzcjyVar) throws RemoteException, zzcmw {
        zzboc zzbocVar = this.f14152b;
        zzbpr zzbprVar = new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.a);
        View view = this.f14153c;
        zzaov zzaovVar = zzcjyVar.f14136b;
        zzaovVar.getClass();
        zzbng a = zzbocVar.a(zzbprVar, new zzbnk(view, null, mk.a(zzaovVar), zzcxmVar.r.get(0)));
        a.i().Y(this.f14153c);
        zzcjyVar.f14137c.I7(a.f());
        return a.g();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final void b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzaov, zzcla> zzcjyVar) throws RemoteException {
        zzcjyVar.f14136b.R4(zzcxmVar.K, zzcxmVar.s.toString(), zzcxuVar.a.a.f14573d, ObjectWrapper.i0(this.a), new ok(this, zzcjyVar), zzcjyVar.f14137c, zzcxuVar.a.a.f14574e);
    }
}
