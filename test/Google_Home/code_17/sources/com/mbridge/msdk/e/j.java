package com.mbridge.msdk.e;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f19949a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f19950b;

    /* loaded from: classes4.dex */
    private static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f19953a;

        public a(Runnable runnable) {
            this.f19953a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (y.a(this.f19953a)) {
                return;
            }
            try {
                this.f19953a.run();
            } catch (Exception e8) {
                if (com.mbridge.msdk.e.a.f19804a) {
                    Log.e("TrackManager", "execute error", e8);
                }
            }
        }
    }

    public j() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f19949a = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.e.j.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeTrackThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
        this.f19950b = new ThreadPoolExecutor(1, 1, 0L, timeUnit, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.e.j.2
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeTrackDatabaseThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    public final void a(Runnable runnable) {
        this.f19949a.execute(new a(runnable));
    }

    public final void b(Runnable runnable) {
        this.f19950b.execute(new a(runnable));
    }
}
