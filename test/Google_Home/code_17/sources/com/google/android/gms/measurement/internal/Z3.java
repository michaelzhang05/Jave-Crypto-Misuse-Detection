package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Z3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f17434a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f17435b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z3(A3 a32, Bundle bundle) {
        this.f17434a = bundle;
        this.f17435b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A3.U(this.f17435b, this.f17434a);
    }
}
