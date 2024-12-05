package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a60 extends i60<zzzk> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f11058b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzyd f11059c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f11060d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ zzyh f11061e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a60(zzyh zzyhVar, Context context, zzyd zzydVar, String str) {
        this.f11061e = zzyhVar;
        this.f11058b = context;
        this.f11059c = zzydVar;
        this.f11060d = str;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzzk a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zza(ObjectWrapper.i0(this.f11058b), this.f11059c, this.f11060d, 15000000);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzzk c() {
        zzyh.d(this.f11058b, "search");
        return new zzabp();
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzzk d() throws RemoteException {
        zzxx zzxxVar;
        zzxxVar = this.f11061e.a;
        return zzxxVar.c(this.f11058b, this.f11059c, this.f11060d, null, 3);
    }
}
