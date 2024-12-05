package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class X3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f17406a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17407b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X3(A3 a32, long j8) {
        this.f17406a = j8;
        this.f17407b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17407b.M0(this.f17406a);
        this.f17407b.q().O(new AtomicReference());
    }
}
