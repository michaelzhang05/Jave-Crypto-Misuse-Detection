package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzj;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class th implements zzj {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzcdn f12201f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public th(zzcdn zzcdnVar) {
        this.f12201f = zzcdnVar;
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final void zzlc() {
        zzbtb zzbtbVar;
        zzbtbVar = this.f12201f.f13931h;
        zzbtbVar.onPause();
    }

    @Override // com.google.android.gms.ads.internal.zzj
    public final void zzld() {
        zzbtb zzbtbVar;
        zzbtbVar = this.f12201f.f13931h;
        zzbtbVar.onResume();
    }
}
