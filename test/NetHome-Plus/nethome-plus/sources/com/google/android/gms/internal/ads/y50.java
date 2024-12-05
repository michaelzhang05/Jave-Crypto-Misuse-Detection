package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y50 extends i60<zzzk> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f12432b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzyd f12433c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f12434d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ zzamp f12435e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzyh f12436f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y50(zzyh zzyhVar, Context context, zzyd zzydVar, String str, zzamp zzampVar) {
        this.f12436f = zzyhVar;
        this.f12432b = context;
        this.f12433c = zzydVar;
        this.f12434d = str;
        this.f12435e = zzampVar;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzzk a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zza(ObjectWrapper.i0(this.f12432b), this.f12433c, this.f12434d, this.f12435e, 15000000);
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzzk c() {
        zzyh.d(this.f12432b, "banner");
        return new zzabp();
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzzk d() throws RemoteException {
        zzxx zzxxVar;
        zzxxVar = this.f12436f.a;
        return zzxxVar.c(this.f12432b, this.f12433c, this.f12434d, this.f12435e, 1);
    }
}
