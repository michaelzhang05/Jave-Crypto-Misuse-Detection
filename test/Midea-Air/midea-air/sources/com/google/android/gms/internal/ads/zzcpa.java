package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class zzcpa implements zzcou<zzbvx> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzbws f14310b;

    public zzcpa(Context context, zzbws zzbwsVar) {
        this.a = context;
        this.f14310b = zzbwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcou
    public final /* synthetic */ zzbvx a(zzcxu zzcxuVar, zzcxm zzcxmVar, View view, zzcoz zzcozVar) {
        zzbvy a = this.f14310b.a(new zzbpr(zzcxuVar, zzcxmVar, null), new sm(this, rm.a));
        zzcozVar.a(new tm(this, a));
        return a.h();
    }
}
