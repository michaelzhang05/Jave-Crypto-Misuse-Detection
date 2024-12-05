package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z50 extends i60<zzaqg> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Activity f12504b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzyh f12505c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z50(zzyh zzyhVar, Activity activity) {
        this.f12505c = zzyhVar;
        this.f12504b = activity;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzaqg a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zzf(ObjectWrapper.i0(this.f12504b));
    }

    @Override // com.google.android.gms.internal.ads.i60
    protected final /* synthetic */ zzaqg c() {
        zzyh.d(this.f12504b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzaqg d() throws RemoteException {
        zzaqf zzaqfVar;
        zzaqfVar = this.f12505c.f15823g;
        return zzaqfVar.c(this.f12504b);
    }
}
