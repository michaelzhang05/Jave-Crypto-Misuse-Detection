package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzckj implements zzcka<zzbnf, zzams, zzcla> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbai f14148b;

    /* renamed from: c, reason: collision with root package name */
    private final zzboc f14149c;

    public zzckj(Context context, zzbai zzbaiVar, zzboc zzbocVar) {
        this.a = context;
        this.f14148b = zzbaiVar;
        this.f14149c = zzbocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final /* synthetic */ zzbnf a(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzcla> zzcjyVar) throws RemoteException, zzcmw {
        zzboc zzbocVar = this.f14149c;
        zzbpr zzbprVar = new zzbpr(zzcxuVar, zzcxmVar, zzcjyVar.a);
        View view = (View) ObjectWrapper.R(zzcjyVar.f14136b.l1());
        zzams zzamsVar = zzcjyVar.f14136b;
        zzamsVar.getClass();
        zzbng a = zzbocVar.a(zzbprVar, new zzbnk(view, null, lk.a(zzamsVar), zzcxmVar.r.get(0)));
        a.i().Y((View) ObjectWrapper.R(zzcjyVar.f14136b.l1()));
        zzcjyVar.f14137c.I7(a.f());
        return a.g();
    }

    @Override // com.google.android.gms.internal.ads.zzcka
    public final void b(zzcxu zzcxuVar, zzcxm zzcxmVar, zzcjy<zzams, zzcla> zzcjyVar) throws RemoteException {
        zzyd a = zzcxy.a(this.a, zzcxmVar.r);
        if (this.f14148b.f13152h < 4100000) {
            zzcjyVar.f14136b.m2(ObjectWrapper.i0(this.a), a, zzcxuVar.a.a.f14573d, zzcxmVar.s.toString(), zzcjyVar.f14137c);
        } else {
            zzcjyVar.f14136b.w4(ObjectWrapper.i0(this.a), a, zzcxuVar.a.a.f14573d, zzcxmVar.s.toString(), zzazc.a(zzcxmVar.p), zzcjyVar.f14137c);
        }
    }
}
