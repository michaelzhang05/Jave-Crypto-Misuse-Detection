package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@zzard
/* loaded from: classes2.dex */
public final class zzaxg {
    public static final zzbbl a;

    /* renamed from: b, reason: collision with root package name */
    public static final zzbbl f13077b;

    /* renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f13078c;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = zzbbm.a(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, timeUnit, new SynchronousQueue(), c("Default")));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), c("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f13077b = zzbbm.a(threadPoolExecutor);
        f13078c = new ScheduledThreadPoolExecutor(3, c("Schedule"));
    }

    public static <T> zzbbh<T> a(Callable<T> callable) {
        return a.submit(callable);
    }

    public static zzbbh<?> b(Runnable runnable) {
        return a.submit(runnable);
    }

    private static ThreadFactory c(String str) {
        return new d5(str);
    }
}
