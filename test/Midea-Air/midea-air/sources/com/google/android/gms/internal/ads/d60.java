package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class d60 extends i60<zzaab> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f11293b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzyh f11294c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d60(zzyh zzyhVar, Context context) {
        this.f11294c = zzyhVar;
        this.f11293b = context;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzaab a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zza(ObjectWrapper.i0(this.f11293b), 15000000);
    }

    @Override // com.google.android.gms.internal.ads.i60
    protected final /* synthetic */ zzaab c() {
        zzyh.d(this.f11293b, "mobile_ads_settings");
        return new zzabr();
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzaab d() throws RemoteException {
        zzabk zzabkVar;
        zzabkVar = this.f11294c.f15819c;
        return zzabkVar.c(this.f11293b);
    }
}
