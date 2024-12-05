package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class p40 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ View f11973f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ zzuu f11974g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p40(zzuu zzuuVar, View view) {
        this.f11974g = zzuuVar;
        this.f11973f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11974g.d(this.f11973f);
    }
}
