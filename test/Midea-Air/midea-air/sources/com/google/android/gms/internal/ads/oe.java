package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class oe implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference<zzbtb> f11933f;

    private oe(zzbtb zzbtbVar) {
        this.f11933f = new WeakReference<>(zzbtbVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbtb zzbtbVar = this.f11933f.get();
        if (zzbtbVar != null) {
            zzbtb.Y(zzbtbVar);
        }
    }
}
