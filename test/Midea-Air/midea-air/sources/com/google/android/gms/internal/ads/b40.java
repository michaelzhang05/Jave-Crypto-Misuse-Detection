package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b40 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Surface f11117f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzto f11118g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b40(zzto zztoVar, Surface surface) {
        this.f11118g = zztoVar;
        this.f11117f = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zztn zztnVar;
        zztnVar = this.f11118g.f15598b;
        zztnVar.j(this.f11117f);
    }
}
