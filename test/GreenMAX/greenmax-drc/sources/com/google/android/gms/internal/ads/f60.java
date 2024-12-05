package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f60 extends i60<zzaer> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ View f11398b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ HashMap f11399c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ HashMap f11400d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ zzyh f11401e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f60(zzyh zzyhVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.f11401e = zzyhVar;
        this.f11398b = view;
        this.f11399c = hashMap;
        this.f11400d = hashMap2;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzaer a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zza(ObjectWrapper.i0(this.f11398b), ObjectWrapper.i0(this.f11399c), ObjectWrapper.i0(this.f11400d));
    }

    @Override // com.google.android.gms.internal.ads.i60
    protected final /* synthetic */ zzaer c() {
        zzyh.d(this.f11398b.getContext(), "native_ad_view_holder_delegate");
        return new zzabu();
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzaer d() throws RemoteException {
        zzagl zzaglVar;
        zzaglVar = this.f11401e.f15824h;
        return zzaglVar.c(this.f11398b, this.f11399c, this.f11400d);
    }
}
