package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class kb implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ View f11700f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzavb f11701g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f11702h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzbio f11703i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kb(zzbio zzbioVar, View view, zzavb zzavbVar, int i2) {
        this.f11703i = zzbioVar;
        this.f11700f = view;
        this.f11701g = zzavbVar;
        this.f11702h = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11703i.v(this.f11700f, this.f11701g, this.f11702h - 1);
    }
}
