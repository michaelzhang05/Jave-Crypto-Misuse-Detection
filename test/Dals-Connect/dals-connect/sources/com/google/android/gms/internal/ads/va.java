package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class va implements View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ zzavb f12281f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzbha f12282g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public va(zzbha zzbhaVar, zzavb zzavbVar) {
        this.f12282g = zzbhaVar;
        this.f12281f = zzavbVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f12282g.q(view, this.f12281f, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
