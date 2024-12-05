package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b60 extends i60<zzzk> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f11126b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzyd f11127c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f11128d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ zzamp f11129e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzyh f11130f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b60(zzyh zzyhVar, Context context, zzyd zzydVar, String str, zzamp zzampVar) {
        this.f11130f = zzyhVar;
        this.f11126b = context;
        this.f11127c = zzydVar;
        this.f11128d = str;
        this.f11129e = zzampVar;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzzk a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zzb(ObjectWrapper.i0(this.f11126b), this.f11127c, this.f11128d, this.f11129e, 15000000);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzzk c() {
        zzyh.d(this.f11126b, "interstitial");
        return new zzabp();
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzzk d() throws RemoteException {
        zzxx zzxxVar;
        zzxxVar = this.f11130f.a;
        return zzxxVar.c(this.f11126b, this.f11127c, this.f11128d, this.f11129e, 2);
    }
}
