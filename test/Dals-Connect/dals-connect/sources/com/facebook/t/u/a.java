package com.facebook.t.u;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.k;
import com.facebook.internal.m;
import com.facebook.internal.n;
import com.facebook.internal.r;
import com.facebook.internal.x;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ActivityLifecycleTracker.java */
/* loaded from: classes.dex */
public class a {
    private static final String a = "com.facebook.t.u.a";

    /* renamed from: c, reason: collision with root package name */
    private static volatile ScheduledFuture f9602c;

    /* renamed from: f, reason: collision with root package name */
    private static volatile j f9605f;

    /* renamed from: h, reason: collision with root package name */
    private static String f9607h;

    /* renamed from: i, reason: collision with root package name */
    private static long f9608i;

    /* renamed from: k, reason: collision with root package name */
    private static WeakReference<Activity> f9610k;

    /* renamed from: b, reason: collision with root package name */
    private static final ScheduledExecutorService f9601b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f9603d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static AtomicInteger f9604e = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private static AtomicBoolean f9606g = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    private static int f9609j = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityLifecycleTracker.java */
    /* renamed from: com.facebook.t.u.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0150a implements k.c {
        C0150a() {
        }

        @Override // com.facebook.internal.k.c
        public void a(boolean z) {
            if (z) {
                com.facebook.t.r.b.i();
            } else {
                com.facebook.t.r.b.h();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityLifecycleTracker.java */
    /* loaded from: classes.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            r.g(com.facebook.l.APP_EVENTS, a.a, "onActivityCreated");
            com.facebook.t.u.b.a();
            a.t(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            r.g(com.facebook.l.APP_EVENTS, a.a, "onActivityDestroyed");
            a.u(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            r.g(com.facebook.l.APP_EVENTS, a.a, "onActivityPaused");
            com.facebook.t.u.b.a();
            a.v(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            r.g(com.facebook.l.APP_EVENTS, a.a, "onActivityResumed");
            com.facebook.t.u.b.a();
            a.w(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            r.g(com.facebook.l.APP_EVENTS, a.a, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            a.c();
            r.g(com.facebook.l.APP_EVENTS, a.a, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            r.g(com.facebook.l.APP_EVENTS, a.a, "onActivityStopped");
            com.facebook.t.g.k();
            a.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityLifecycleTracker.java */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                if (a.f9605f == null) {
                    j unused = a.f9605f = j.h();
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityLifecycleTracker.java */
    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f9611f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f9612g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f9613h;

        d(long j2, String str, Context context) {
            this.f9611f = j2;
            this.f9612g = str;
            this.f9613h = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                if (a.f9605f == null) {
                    j unused = a.f9605f = new j(Long.valueOf(this.f9611f), null);
                    k.c(this.f9612g, null, a.f9607h, this.f9613h);
                } else if (a.f9605f.e() != null) {
                    long longValue = this.f9611f - a.f9605f.e().longValue();
                    if (longValue > a.k() * 1000) {
                        k.e(this.f9612g, a.f9605f, a.f9607h);
                        k.c(this.f9612g, null, a.f9607h, this.f9613h);
                        j unused2 = a.f9605f = new j(Long.valueOf(this.f9611f), null);
                    } else if (longValue > 1000) {
                        a.f9605f.i();
                    }
                }
                a.f9605f.j(Long.valueOf(this.f9611f));
                a.f9605f.k();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ActivityLifecycleTracker.java */
    /* loaded from: classes.dex */
    public static class e implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f9614f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f9615g;

        /* compiled from: ActivityLifecycleTracker.java */
        /* renamed from: com.facebook.t.u.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0151a implements Runnable {
            RunnableC0151a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (com.facebook.internal.a0.f.a.c(this)) {
                    return;
                }
                try {
                    if (a.f9605f == null) {
                        j unused = a.f9605f = new j(Long.valueOf(e.this.f9614f), null);
                    }
                    if (a.f9604e.get() <= 0) {
                        k.e(e.this.f9615g, a.f9605f, a.f9607h);
                        j.a();
                        j unused2 = a.f9605f = null;
                    }
                    synchronized (a.f9603d) {
                        ScheduledFuture unused3 = a.f9602c = null;
                    }
                } catch (Throwable th) {
                    com.facebook.internal.a0.f.a.b(th, this);
                }
            }
        }

        e(long j2, String str) {
            this.f9614f = j2;
            this.f9615g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                if (a.f9605f == null) {
                    j unused = a.f9605f = new j(Long.valueOf(this.f9614f), null);
                }
                a.f9605f.j(Long.valueOf(this.f9614f));
                if (a.f9604e.get() <= 0) {
                    RunnableC0151a runnableC0151a = new RunnableC0151a();
                    synchronized (a.f9603d) {
                        ScheduledFuture unused2 = a.f9602c = a.f9601b.schedule(runnableC0151a, a.k(), TimeUnit.SECONDS);
                    }
                }
                long j2 = a.f9608i;
                com.facebook.t.u.d.e(this.f9615g, j2 > 0 ? (this.f9614f - j2) / 1000 : 0L);
                a.f9605f.k();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    static /* synthetic */ int c() {
        int i2 = f9609j;
        f9609j = i2 + 1;
        return i2;
    }

    static /* synthetic */ int d() {
        int i2 = f9609j;
        f9609j = i2 - 1;
        return i2;
    }

    static /* synthetic */ int k() {
        return r();
    }

    private static void o() {
        synchronized (f9603d) {
            if (f9602c != null) {
                f9602c.cancel(false);
            }
            f9602c = null;
        }
    }

    public static Activity p() {
        WeakReference<Activity> weakReference = f9610k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static UUID q() {
        if (f9605f != null) {
            return f9605f.d();
        }
        return null;
    }

    private static int r() {
        m j2 = n.j(com.facebook.f.f());
        if (j2 == null) {
            return com.facebook.t.u.e.a();
        }
        return j2.j();
    }

    public static boolean s() {
        return f9609j == 0;
    }

    public static void t(Activity activity) {
        f9601b.execute(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(Activity activity) {
        com.facebook.t.r.b.l(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(Activity activity) {
        if (f9604e.decrementAndGet() < 0) {
            f9604e.set(0);
            Log.w(a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        o();
        long currentTimeMillis = System.currentTimeMillis();
        String q = x.q(activity);
        com.facebook.t.r.b.m(activity);
        f9601b.execute(new e(currentTimeMillis, q));
    }

    public static void w(Activity activity) {
        f9610k = new WeakReference<>(activity);
        f9604e.incrementAndGet();
        o();
        long currentTimeMillis = System.currentTimeMillis();
        f9608i = currentTimeMillis;
        String q = x.q(activity);
        com.facebook.t.r.b.n(activity);
        com.facebook.t.q.a.d(activity);
        com.facebook.t.x.d.e(activity);
        f9601b.execute(new d(currentTimeMillis, q, activity.getApplicationContext()));
    }

    public static void x(Application application, String str) {
        if (f9606g.compareAndSet(false, true)) {
            com.facebook.internal.k.a(k.d.CodelessEvents, new C0150a());
            f9607h = str;
            application.registerActivityLifecycleCallbacks(new b());
        }
    }
}
