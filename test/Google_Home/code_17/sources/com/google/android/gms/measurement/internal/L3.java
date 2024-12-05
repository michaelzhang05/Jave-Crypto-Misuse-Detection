package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class L3 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ A3 f17245a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L3(A3 a32) {
        this.f17245a = a32;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f17245a.e().D(runnable);
    }
}
