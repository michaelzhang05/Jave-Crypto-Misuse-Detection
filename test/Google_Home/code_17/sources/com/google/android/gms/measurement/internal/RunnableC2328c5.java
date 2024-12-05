package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.c5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2328c5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ComponentName f17532a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC2314a5 f17533b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2328c5(ServiceConnectionC2314a5 serviceConnectionC2314a5, ComponentName componentName) {
        this.f17532a = componentName;
        this.f17533b = serviceConnectionC2314a5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D4.K(this.f17533b.f17452c, this.f17532a);
    }
}
