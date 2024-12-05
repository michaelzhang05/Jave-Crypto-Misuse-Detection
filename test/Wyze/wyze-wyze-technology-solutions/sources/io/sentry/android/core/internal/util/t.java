package io.sentry.android.core.internal.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.android.core.s0;
import io.sentry.s4;
import io.sentry.w1;
import io.sentry.x4;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryFrameMetricsCollector.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class t implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private final s0 f18729f;

    /* renamed from: g, reason: collision with root package name */
    private final Set<Window> f18730g;

    /* renamed from: h, reason: collision with root package name */
    private final w1 f18731h;

    /* renamed from: i, reason: collision with root package name */
    private Handler f18732i;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<Window> f18733j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<String, b> f18734k;
    private boolean l;
    private final c m;
    private Window.OnFrameMetricsAvailableListener n;
    private Choreographer o;
    private Field p;
    private long q;
    private long r;

    /* compiled from: SentryFrameMetricsCollector.java */
    /* loaded from: classes2.dex */
    class a implements c {
        a() {
        }

        @Override // io.sentry.android.core.internal.util.t.c
        public /* synthetic */ void a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler) {
            u.a(this, window, onFrameMetricsAvailableListener, handler);
        }

        @Override // io.sentry.android.core.internal.util.t.c
        public /* synthetic */ void b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            u.b(this, window, onFrameMetricsAvailableListener);
        }
    }

    /* compiled from: SentryFrameMetricsCollector.java */
    @ApiStatus.Internal
    /* loaded from: classes2.dex */
    public interface b {
        void a(long j2, long j3, float f2);
    }

    /* compiled from: SentryFrameMetricsCollector.java */
    @ApiStatus.Internal
    /* loaded from: classes2.dex */
    public interface c {
        void a(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Handler handler);

        void b(Window window, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener);
    }

    @SuppressLint({"NewApi"})
    public t(Context context, x4 x4Var, s0 s0Var) {
        this(context, x4Var, s0Var, new a());
    }

    private long a(FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
    }

    @SuppressLint({"NewApi"})
    private long b(FrameMetrics frameMetrics) {
        Field field;
        if (this.f18729f.d() >= 26) {
            return frameMetrics.getMetric(10);
        }
        Choreographer choreographer = this.o;
        if (choreographer == null || (field = this.p) == null) {
            return -1L;
        }
        try {
            Long l = (Long) field.get(choreographer);
            if (l != null) {
                return l.longValue();
            }
            return -1L;
        } catch (IllegalAccessException unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(w1 w1Var) {
        try {
            this.o = Choreographer.getInstance();
        } catch (Throwable th) {
            w1Var.b(s4.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g(s0 s0Var, Window window, FrameMetrics frameMetrics, int i2) {
        float refreshRate;
        long nanoTime = System.nanoTime();
        if (s0Var.d() >= 30) {
            refreshRate = window.getContext().getDisplay().getRefreshRate();
        } else {
            refreshRate = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        long a2 = a(frameMetrics);
        long b2 = b(frameMetrics);
        if (b2 < 0) {
            b2 = nanoTime - a2;
        }
        long max = Math.max(b2, this.r);
        if (max == this.q) {
            return;
        }
        this.q = max;
        this.r = max + a2;
        Iterator<b> it = this.f18734k.values().iterator();
        while (it.hasNext()) {
            it.next().a(this.r, a2, refreshRate);
        }
    }

    private void h(Window window) {
        WeakReference<Window> weakReference = this.f18733j;
        if (weakReference == null || weakReference.get() != window) {
            this.f18733j = new WeakReference<>(window);
            l();
        }
    }

    @SuppressLint({"NewApi"})
    private void k(Window window) {
        if (this.f18730g.contains(window)) {
            if (this.f18729f.d() >= 24) {
                try {
                    this.m.b(window, this.n);
                } catch (Exception e2) {
                    this.f18731h.b(s4.ERROR, "Failed to remove frameMetricsAvailableListener", e2);
                }
            }
            this.f18730g.remove(window);
        }
    }

    @SuppressLint({"NewApi"})
    private void l() {
        WeakReference<Window> weakReference = this.f18733j;
        Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.l || this.f18730g.contains(window) || this.f18734k.isEmpty() || this.f18729f.d() < 24 || this.f18732i == null) {
            return;
        }
        this.f18730g.add(window);
        this.m.a(window, this.n, this.f18732i);
    }

    public String i(b bVar) {
        if (!this.l) {
            return null;
        }
        String uuid = UUID.randomUUID().toString();
        this.f18734k.put(uuid, bVar);
        l();
        return uuid;
    }

    public void j(String str) {
        if (this.l) {
            if (str != null) {
                this.f18734k.remove(str);
            }
            WeakReference<Window> weakReference = this.f18733j;
            Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !this.f18734k.isEmpty()) {
                return;
            }
            k(window);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        h(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        k(activity.getWindow());
        WeakReference<Window> weakReference = this.f18733j;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f18733j = null;
    }

    @SuppressLint({"NewApi", "DiscouragedPrivateApi"})
    public t(Context context, x4 x4Var, s0 s0Var, c cVar) {
        this(context, x4Var.getLogger(), s0Var, cVar);
    }

    @SuppressLint({"NewApi", "DiscouragedPrivateApi"})
    public t(Context context, final w1 w1Var, final s0 s0Var, c cVar) {
        this.f18730g = new CopyOnWriteArraySet();
        this.f18734k = new ConcurrentHashMap();
        this.l = false;
        this.q = 0L;
        this.r = 0L;
        io.sentry.util.q.c(context, "The context is required");
        this.f18731h = (w1) io.sentry.util.q.c(w1Var, "Logger is required");
        this.f18729f = (s0) io.sentry.util.q.c(s0Var, "BuildInfoProvider is required");
        this.m = (c) io.sentry.util.q.c(cVar, "WindowFrameMetricsManager is required");
        if ((context instanceof Application) && s0Var.d() >= 24) {
            this.l = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.f
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    w1.this.b(s4.ERROR, "Error during frames measurements.", th);
                }
            });
            handlerThread.start();
            this.f18732i = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.internal.util.d
                @Override // java.lang.Runnable
                public final void run() {
                    t.this.e(w1Var);
                }
            });
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.p = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                w1Var.b(s4.ERROR, "Unable to get the frame timestamp from the choreographer: ", e2);
            }
            this.n = new Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.e
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i2) {
                    t.this.g(s0Var, window, frameMetrics, i2);
                }
            };
        }
    }
}
