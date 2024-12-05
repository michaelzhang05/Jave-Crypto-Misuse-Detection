package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f17205e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f17206a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private final String f17207b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17208c;

    /* renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f17209d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, int i8, StrictMode.ThreadPolicy threadPolicy) {
        this.f17207b = str;
        this.f17208c = i8;
        this.f17209d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f17208c);
        StrictMode.ThreadPolicy threadPolicy = this.f17209d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f17205e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f17207b, Long.valueOf(this.f17206a.getAndIncrement())));
        return newThread;
    }
}
