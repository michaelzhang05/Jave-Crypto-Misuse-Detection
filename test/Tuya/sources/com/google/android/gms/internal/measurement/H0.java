package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class H0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadFactory f15340a = Executors.defaultThreadFactory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public H0(X0 x02) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f15340a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
