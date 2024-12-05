package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class lb implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzavb f11758f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzbio f11759g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lb(zzbio zzbioVar, zzavb zzavbVar) {
        this.f11759g = zzbioVar;
        this.f11758f = zzavbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f11759g.v(view, this.f11758f, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
