package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e60 extends i60<zzaem> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ FrameLayout f11338b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ FrameLayout f11339c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Context f11340d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ zzyh f11341e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e60(zzyh zzyhVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f11341e = zzyhVar;
        this.f11338b = frameLayout;
        this.f11339c = frameLayout2;
        this.f11340d = context;
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzaem a(zzzv zzzvVar) throws RemoteException {
        return zzzvVar.zzc(ObjectWrapper.i0(this.f11338b), ObjectWrapper.i0(this.f11339c));
    }

    @Override // com.google.android.gms.internal.ads.i60
    protected final /* synthetic */ zzaem c() {
        zzyh.d(this.f11340d, "native_ad_view_delegate");
        return new zzabt();
    }

    @Override // com.google.android.gms.internal.ads.i60
    public final /* synthetic */ zzaem d() throws RemoteException {
        zzagk zzagkVar;
        zzagkVar = this.f11341e.f15820d;
        return zzagkVar.c(this.f11340d, this.f11338b, this.f11339c);
    }
}
