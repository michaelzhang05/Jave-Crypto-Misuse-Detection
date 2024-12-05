package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* loaded from: classes2.dex */
public final class zzchy extends zzars {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzchx f14085f;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzchy(zzchx zzchxVar) {
        this.f14085f = zzchxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzarr
    public final void A0(ParcelFileDescriptor parcelFileDescriptor) {
        this.f14085f.a.b(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.zzarr
    public final void a6(zzaym zzaymVar) {
        this.f14085f.a.c(new zzayn(zzaymVar.f13103f, zzaymVar.f13104g));
    }
}
