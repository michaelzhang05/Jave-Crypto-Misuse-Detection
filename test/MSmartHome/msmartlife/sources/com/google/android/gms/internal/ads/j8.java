package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class j8 implements zzgh {
    private WeakReference<zzgh> a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ zzbdk f11639b;

    private j8(zzbdk zzbdkVar) {
        this.f11639b = zzbdkVar;
        this.a = new WeakReference<>(null);
    }

    public final void a(zzgh zzghVar) {
        this.a = new WeakReference<>(zzghVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    public final void b(boolean z, int i2) {
        zzgh zzghVar = this.a.get();
        if (zzghVar != null) {
            zzghVar.b(z, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    public final void c(zzgd zzgdVar) {
        zzbdk.b(this.f11639b, "PlayerError", zzgdVar.getMessage());
        zzgh zzghVar = this.a.get();
        if (zzghVar != null) {
            zzghVar.c(zzgdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    public final void d() {
        zzgh zzghVar = this.a.get();
        if (zzghVar != null) {
            zzghVar.d();
        }
    }
}
