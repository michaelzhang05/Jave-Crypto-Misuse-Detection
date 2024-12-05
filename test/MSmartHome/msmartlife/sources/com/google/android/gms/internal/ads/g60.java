package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
final class g60 extends i60<zzasw> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Context f11468b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ zzamp f11469c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ zzyh f11470d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g60(zzyh zzyhVar, Context context, zzamp zzampVar) {
        this.f11470d = zzyhVar;
        this.f11468b = context;
        this.f11469c = zzampVar;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzasw a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zza(ObjectWrapper.i0(this.f11468b), this.f11469c, 15000000);
    }

    @Override // com.google.android.gms.internal.ads.i60
    protected final /* synthetic */ zzasw c() {
        zzyh.d(this.f11468b, "rewarded_video");
        return new zzabx();
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzasw d() throws RemoteException {
        zzatf zzatfVar;
        zzatfVar = this.f11470d.f15821e;
        return zzatfVar.c(this.f11468b, this.f11469c);
    }
}
