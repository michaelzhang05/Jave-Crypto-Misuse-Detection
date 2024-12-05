package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class my implements ThreadFactory {

    /* renamed from: f, reason: collision with root package name */
    private final ThreadFactory f11829f = Executors.defaultThreadFactory();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f11830g = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f11829f.newThread(runnable);
        int andIncrement = this.f11830g.getAndIncrement();
        StringBuilder sb = new StringBuilder(16);
        sb.append("gads-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
