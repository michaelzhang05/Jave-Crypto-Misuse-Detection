package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2313a4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f17448a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17449b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2313a4(A3 a32, Bundle bundle) {
        this.f17448a = bundle;
        this.f17449b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A3.Q0(this.f17449b, this.f17448a);
    }
}
