package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h60 extends i60<zzatt> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f11516b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f11517c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ zzamp f11518d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ zzyh f11519e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h60(zzyh zzyhVar, Context context, String str, zzamp zzampVar) {
        this.f11519e = zzyhVar;
        this.f11516b = context;
        this.f11517c = str;
        this.f11518d = zzampVar;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzatt a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zzb(ObjectWrapper.i0(this.f11516b), this.f11517c, this.f11518d, 15000000);
    }

    @Override // com.google.android.gms.internal.ads.i60
    protected final /* synthetic */ zzatt c() {
        zzyh.d(this.f11516b, "rewarded");
        return new zzabv();
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzatt d() throws RemoteException {
        return zzauj.a(this.f11516b, this.f11517c, this.f11518d);
    }
}
