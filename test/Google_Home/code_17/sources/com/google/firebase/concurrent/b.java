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
    private static final ThreadFactory f18240e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f18241a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private final String f18242b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18243c;

    /* renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f18244d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, int i8, StrictMode.ThreadPolicy threadPolicy) {
        this.f18242b = str;
        this.f18243c = i8;
        this.f18244d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f18243c);
        StrictMode.ThreadPolicy threadPolicy = this.f18244d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f18240e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f18242b, Long.valueOf(this.f18241a.getAndIncrement())));
        return newThread;
    }
}
