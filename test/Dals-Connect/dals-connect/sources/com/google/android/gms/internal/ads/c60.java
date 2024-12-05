package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c60 extends i60<zzzf> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f11218b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f11219c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ zzamp f11220d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ zzyh f11221e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c60(zzyh zzyhVar, Context context, String str, zzamp zzampVar) {
        this.f11221e = zzyhVar;
        this.f11218b = context;
        this.f11219c = str;
        this.f11220d = zzampVar;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzzf a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zza(ObjectWrapper.i0(this.f11218b), this.f11219c, this.f11220d, 15000000);
    }

    @Override // com.google.android.gms.internal.ads.i60
    protected final /* synthetic */ zzzf c() {
        zzyh.d(this.f11218b, "native_ad");
        return new zzabl();
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzzf d() throws RemoteException {
        zzxw zzxwVar;
        zzxwVar = this.f11221e.f15818b;
        return zzxwVar.c(this.f11218b, this.f11219c, this.f11220d);
    }
}
