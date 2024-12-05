package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class lz implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Surface f11780f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzhd f11781g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lz(zzhd zzhdVar, Surface surface) {
        this.f11781g = zzhdVar;
        this.f11780f = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhh zzhhVar;
        zzhhVar = this.f11781g.H;
        zzhhVar.g(this.f11780f);
    }
}
