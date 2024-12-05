package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ua implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ View f12218f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzavb f12219g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ int f12220h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ zzbha f12221i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ua(zzbha zzbhaVar, View view, zzavb zzavbVar, int i2) {
        this.f12221i = zzbhaVar;
        this.f12218f = view;
        this.f12219g = zzavbVar;
        this.f12220h = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12221i.q(this.f12218f, this.f12219g, this.f12220h - 1);
    }
}
