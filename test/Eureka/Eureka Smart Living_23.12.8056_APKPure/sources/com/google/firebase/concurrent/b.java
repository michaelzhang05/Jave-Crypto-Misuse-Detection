package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f5722e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f5723a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private final String f5724b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5725c;

    /* renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f5726d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, int i6, StrictMode.ThreadPolicy threadPolicy) {
        this.f5724b = str;
        this.f5725c = i6;
        this.f5726d = threadPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f5725c);
        StrictMode.ThreadPolicy threadPolicy = this.f5726d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread newThread = f5722e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.b(runnable);
            }
        });
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f5724b, Long.valueOf(this.f5723a.getAndIncrement())));
        return newThread;
    }
}
