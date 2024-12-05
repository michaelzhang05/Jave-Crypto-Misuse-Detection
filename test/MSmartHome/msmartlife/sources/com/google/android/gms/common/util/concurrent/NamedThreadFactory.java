package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ThreadFactory;

@KeepForSdk
/* loaded from: classes2.dex */
public class NamedThreadFactory implements ThreadFactory {

    /* renamed from: f, reason: collision with root package name */
    private final String f11006f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadFactory f11007g;

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f11007g.newThread(new a(runnable, 0));
        newThread.setName(this.f11006f);
        return newThread;
    }
}
