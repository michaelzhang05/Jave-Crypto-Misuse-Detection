package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HostnameCache.java */
/* loaded from: classes2.dex */
public final class o1 {
    private static final long a = TimeUnit.HOURS.toMillis(5);

    /* renamed from: b, reason: collision with root package name */
    private static final long f19041b = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: c, reason: collision with root package name */
    private static o1 f19042c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19043d;

    /* renamed from: e, reason: collision with root package name */
    private volatile String f19044e;

    /* renamed from: f, reason: collision with root package name */
    private volatile long f19045f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f19046g;

    /* renamed from: h, reason: collision with root package name */
    private final Callable<InetAddress> f19047h;

    /* renamed from: i, reason: collision with root package name */
    private final ExecutorService f19048i;

    /* compiled from: HostnameCache.java */
    /* loaded from: classes2.dex */
    private static final class b implements ThreadFactory {

        /* renamed from: f, reason: collision with root package name */
        private int f19049f;

        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("SentryHostnameCache-");
            int i2 = this.f19049f;
            this.f19049f = i2 + 1;
            sb.append(i2);
            Thread thread = new Thread(runnable, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private o1() {
        this(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o1 c() {
        if (f19042c == null) {
            f19042c = new o1();
        }
        return f19042c;
    }

    private void d() {
        this.f19045f = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    private /* synthetic */ Void f() throws Exception {
        try {
            this.f19044e = this.f19047h.call().getCanonicalHostName();
            this.f19045f = System.currentTimeMillis() + this.f19043d;
            this.f19046g.set(false);
            return null;
        } catch (Throwable th) {
            this.f19046g.set(false);
            throw th;
        }
    }

    private void h() {
        try {
            this.f19048i.submit(new Callable() { // from class: io.sentry.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    o1.this.g();
                    return null;
                }
            }).get(f19041b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            d();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f19048i.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        if (this.f19045f < System.currentTimeMillis() && this.f19046g.compareAndSet(false, true)) {
            h();
        }
        return this.f19044e;
    }

    public /* synthetic */ Void g() {
        f();
        return null;
    }

    o1(long j2) {
        this(j2, new Callable() { // from class: io.sentry.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InetAddress localHost;
                localHost = InetAddress.getLocalHost();
                return localHost;
            }
        });
    }

    o1(long j2, Callable<InetAddress> callable) {
        this.f19046g = new AtomicBoolean(false);
        this.f19048i = Executors.newSingleThreadExecutor(new b());
        this.f19043d = j2;
        this.f19047h = (Callable) io.sentry.util.q.c(callable, "getLocalhost is required");
        h();
    }
}
