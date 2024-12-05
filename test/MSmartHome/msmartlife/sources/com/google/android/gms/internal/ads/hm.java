package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
final class hm extends zzatl {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzbsv f11536f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzbri f11537g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ zzbse f11538h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzbvj f11539i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hm(zzcnw zzcnwVar, zzbsv zzbsvVar, zzbri zzbriVar, zzbse zzbseVar, zzbvj zzbvjVar) {
        this.f11536f = zzbsvVar;
        this.f11537g = zzbriVar;
        this.f11538h = zzbseVar;
        this.f11539i = zzbvjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void M0(IObjectWrapper iObjectWrapper) {
        this.f11536f.zzta();
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void R1(IObjectWrapper iObjectWrapper) {
        this.f11539i.r();
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void V2(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void X3(IObjectWrapper iObjectWrapper, zzato zzatoVar) {
        this.f11539i.R(zzatoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void c4(IObjectWrapper iObjectWrapper) {
        this.f11538h.f0();
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void e7(IObjectWrapper iObjectWrapper) {
        this.f11537g.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void h2(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void l5(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.f11538h.i0();
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void r3(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void r6(IObjectWrapper iObjectWrapper) {
        this.f11536f.zzsz();
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void t1(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void zzb(Bundle bundle) {
    }
}
