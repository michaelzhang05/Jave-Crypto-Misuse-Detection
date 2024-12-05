package io.sentry.android.core;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.sentry.Integration;
import io.sentry.d2;
import io.sentry.d3;
import io.sentry.e2;
import io.sentry.f4;
import io.sentry.h2;
import io.sentry.i2;
import io.sentry.j5;
import io.sentry.m1;
import io.sentry.n1;
import io.sentry.r5;
import io.sentry.s3;
import io.sentry.s4;
import io.sentry.s5;
import io.sentry.t3;
import io.sentry.t5;
import io.sentry.v1;
import io.sentry.v2;
import io.sentry.w1;
import io.sentry.x4;
import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.VisibleForTesting;

/* loaded from: classes2.dex */
public final class ActivityLifecycleIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private final Application f18532f;

    /* renamed from: g, reason: collision with root package name */
    private final s0 f18533g;

    /* renamed from: h, reason: collision with root package name */
    private v1 f18534h;

    /* renamed from: i, reason: collision with root package name */
    private SentryAndroidOptions f18535i;
    private boolean l;
    private final boolean n;
    private d2 p;
    private final f0 w;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18536j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18537k = false;
    private boolean m = false;
    private m1 o = null;
    private final WeakHashMap<Activity, d2> q = new WeakHashMap<>();
    private final WeakHashMap<Activity, d2> r = new WeakHashMap<>();
    private f4 s = h0.a();
    private final Handler t = new Handler(Looper.getMainLooper());
    private Future<?> u = null;
    private final WeakHashMap<Activity, e2> v = new WeakHashMap<>();

    public ActivityLifecycleIntegration(Application application, s0 s0Var, f0 f0Var) {
        Application application2 = (Application) io.sentry.util.q.c(application, "Application is required");
        this.f18532f = application2;
        this.f18533g = (s0) io.sentry.util.q.c(s0Var, "BuildInfoProvider is required");
        this.w = (f0) io.sentry.util.q.c(f0Var, "ActivityFramesTracker is required");
        if (s0Var.d() >= 29) {
            this.l = true;
        }
        this.n = t0.m(application2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void I0(WeakReference weakReference, String str, e2 e2Var) {
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            this.w.n(activity, e2Var.k());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f18535i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(s4.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    private void J() {
        f4 a = q0.e().a();
        if (!this.f18536j || a == null) {
            return;
        }
        T(this.p, a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void K0(d2 d2Var, d2 d2Var2) {
        if (d2Var == null || d2Var.b()) {
            return;
        }
        d2Var.j(s0(d2Var));
        f4 n = d2Var2 != null ? d2Var2.n() : null;
        if (n == null) {
            n = d2Var.q();
        }
        Y(d2Var, n, j5.DEADLINE_EXCEEDED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void G0(d2 d2Var, d2 d2Var2) {
        SentryAndroidOptions sentryAndroidOptions = this.f18535i;
        if (sentryAndroidOptions != null && d2Var2 != null) {
            f4 a = sentryAndroidOptions.getDateProvider().a();
            long millis = TimeUnit.NANOSECONDS.toMillis(a.f(d2Var2.q()));
            Long valueOf = Long.valueOf(millis);
            v2.a aVar = v2.a.MILLISECOND;
            d2Var2.h("time_to_initial_display", valueOf, aVar);
            if (d2Var != null && d2Var.b()) {
                d2Var.c(a);
                d2Var2.h("time_to_full_display", Long.valueOf(millis), aVar);
            }
            T(d2Var2, a);
            return;
        }
        P(d2Var2);
    }

    private void O0(Bundle bundle) {
        if (this.m) {
            return;
        }
        q0.e().j(bundle == null);
    }

    private void P(d2 d2Var) {
        if (d2Var == null || d2Var.b()) {
            return;
        }
        d2Var.g();
    }

    private void P0(d2 d2Var) {
        if (d2Var != null) {
            d2Var.m().m("auto.ui.activity");
        }
    }

    private void Q0(Activity activity) {
        final WeakReference weakReference = new WeakReference(activity);
        if (this.f18534h == null || w0(activity)) {
            return;
        }
        boolean z = this.f18536j;
        if (!z) {
            this.v.put(activity, d3.r());
            io.sentry.util.v.e(this.f18534h);
            return;
        }
        if (z) {
            R0();
            final String i0 = i0(activity);
            f4 d2 = this.n ? q0.e().d() : null;
            Boolean f2 = q0.e().f();
            t5 t5Var = new t5();
            if (this.f18535i.isEnableActivityLifecycleTracingAutoFinish()) {
                t5Var.k(this.f18535i.getIdleTimeout());
                t5Var.d(true);
            }
            t5Var.n(true);
            t5Var.m(new s5() { // from class: io.sentry.android.core.p
                @Override // io.sentry.s5
                public final void a(e2 e2Var) {
                    ActivityLifecycleIntegration.this.I0(weakReference, i0, e2Var);
                }
            });
            f4 f4Var = (this.m || d2 == null || f2 == null) ? this.s : d2;
            t5Var.l(f4Var);
            final e2 g2 = this.f18534h.g(new r5(i0, io.sentry.protocol.z.COMPONENT, "ui.load"), t5Var);
            P0(g2);
            if (!this.m && d2 != null && f2 != null) {
                d2 f3 = g2.f(q0(f2.booleanValue()), k0(f2.booleanValue()), d2, h2.SENTRY);
                this.p = f3;
                P0(f3);
                J();
            }
            String u0 = u0(i0);
            h2 h2Var = h2.SENTRY;
            final d2 f4 = g2.f("ui.load.initial_display", u0, f4Var, h2Var);
            this.q.put(activity, f4);
            P0(f4);
            if (this.f18537k && this.o != null && this.f18535i != null) {
                final d2 f5 = g2.f("ui.load.full_display", t0(i0), f4Var, h2Var);
                P0(f5);
                try {
                    this.r.put(activity, f5);
                    this.u = this.f18535i.getExecutorService().b(new Runnable() { // from class: io.sentry.android.core.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityLifecycleIntegration.this.K0(f5, f4);
                        }
                    }, 30000L);
                } catch (RejectedExecutionException e2) {
                    this.f18535i.getLogger().b(s4.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e2);
                }
            }
            this.f18534h.j(new t3() { // from class: io.sentry.android.core.j
                @Override // io.sentry.t3
                public final void a(s3 s3Var) {
                    ActivityLifecycleIntegration.this.M0(g2, s3Var);
                }
            });
            this.v.put(activity, g2);
        }
    }

    private void R0() {
        for (Map.Entry<Activity, e2> entry : this.v.entrySet()) {
            g0(entry.getValue(), this.q.get(entry.getKey()), this.r.get(entry.getKey()));
        }
    }

    private void S0(Activity activity, boolean z) {
        if (this.f18536j && z) {
            g0(this.v.get(activity), null, null);
        }
    }

    private void T(d2 d2Var, f4 f4Var) {
        Y(d2Var, f4Var, null);
    }

    private void Y(d2 d2Var, f4 f4Var, j5 j5Var) {
        if (d2Var == null || d2Var.b()) {
            return;
        }
        if (j5Var == null) {
            j5Var = d2Var.getStatus() != null ? d2Var.getStatus() : j5.OK;
        }
        d2Var.o(j5Var, f4Var);
    }

    private void b(Activity activity, String str) {
        SentryAndroidOptions sentryAndroidOptions = this.f18535i;
        if (sentryAndroidOptions == null || this.f18534h == null || !sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()) {
            return;
        }
        io.sentry.v0 v0Var = new io.sentry.v0();
        v0Var.p("navigation");
        v0Var.m("state", str);
        v0Var.m("screen", i0(activity));
        v0Var.l("ui.lifecycle");
        v0Var.n(s4.INFO);
        n1 n1Var = new n1();
        n1Var.j("android:activity", activity);
        this.f18534h.i(v0Var, n1Var);
    }

    private void c0(d2 d2Var, j5 j5Var) {
        if (d2Var == null || d2Var.b()) {
            return;
        }
        d2Var.d(j5Var);
    }

    private void g0(final e2 e2Var, d2 d2Var, d2 d2Var2) {
        if (e2Var == null || e2Var.b()) {
            return;
        }
        c0(d2Var, j5.DEADLINE_EXCEEDED);
        J0(d2Var2, d2Var);
        z();
        j5 status = e2Var.getStatus();
        if (status == null) {
            status = j5.OK;
        }
        e2Var.d(status);
        v1 v1Var = this.f18534h;
        if (v1Var != null) {
            v1Var.j(new t3() { // from class: io.sentry.android.core.o
                @Override // io.sentry.t3
                public final void a(s3 s3Var) {
                    ActivityLifecycleIntegration.this.B0(e2Var, s3Var);
                }
            });
        }
    }

    private String i0(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private String k0(boolean z) {
        return z ? "Cold Start" : "Warm Start";
    }

    private String q0(boolean z) {
        return z ? "app.start.cold" : "app.start.warm";
    }

    private String s0(d2 d2Var) {
        String description = d2Var.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return d2Var.getDescription() + " - Deadline Exceeded";
    }

    private String t0(String str) {
        return str + " full display";
    }

    private String u0(String str) {
        return str + " initial display";
    }

    private boolean v0(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    private boolean w0(Activity activity) {
        return this.v.containsKey(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void y0(s3 s3Var, e2 e2Var, e2 e2Var2) {
        if (e2Var2 == null) {
            s3Var.z(e2Var);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f18535i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(s4.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", e2Var.getName());
        }
    }

    private void z() {
        Future<?> future = this.u;
        if (future != null) {
            future.cancel(false);
            this.u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void z0(e2 e2Var, s3 s3Var, e2 e2Var2) {
        if (e2Var2 == e2Var) {
            s3Var.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void B0(final s3 s3Var, final e2 e2Var) {
        s3Var.D(new s3.c() { // from class: io.sentry.android.core.i
            @Override // io.sentry.s3.c
            public final void a(e2 e2Var2) {
                ActivityLifecycleIntegration.z0(e2.this, s3Var, e2Var2);
            }
        });
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18532f.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f18535i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(s4.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.w.p();
    }

    @Override // io.sentry.Integration
    public void f(v1 v1Var, x4 x4Var) {
        this.f18535i = (SentryAndroidOptions) io.sentry.util.q.c(x4Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x4Var : null, "SentryAndroidOptions is required");
        this.f18534h = (v1) io.sentry.util.q.c(v1Var, "Hub is required");
        w1 logger = this.f18535i.getLogger();
        s4 s4Var = s4.DEBUG;
        logger.c(s4Var, "ActivityLifecycleIntegration enabled: %s", Boolean.valueOf(this.f18535i.isEnableActivityLifecycleBreadcrumbs()));
        this.f18536j = v0(this.f18535i);
        this.o = this.f18535i.getFullyDisplayedReporter();
        this.f18537k = this.f18535i.isEnableTimeToFullDisplayTracing();
        this.f18532f.registerActivityLifecycleCallbacks(this);
        this.f18535i.getLogger().c(s4Var, "ActivityLifecycleIntegration installed.", new Object[0]);
        a();
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        O0(bundle);
        b(activity, "created");
        if (this.f18534h != null) {
            final String a = io.sentry.android.core.internal.util.j.a(activity);
            this.f18534h.j(new t3() { // from class: io.sentry.android.core.m
                @Override // io.sentry.t3
                public final void a(s3 s3Var) {
                    s3Var.y(a);
                }
            });
        }
        Q0(activity);
        final d2 d2Var = this.r.get(activity);
        this.m = true;
        m1 m1Var = this.o;
        if (m1Var != null) {
            m1Var.b(new m1.a() { // from class: io.sentry.android.core.l
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityDestroyed(Activity activity) {
        if (this.f18536j || this.f18535i.isEnableActivityLifecycleBreadcrumbs()) {
            b(activity, "destroyed");
            c0(this.p, j5.CANCELLED);
            d2 d2Var = this.q.get(activity);
            d2 d2Var2 = this.r.get(activity);
            c0(d2Var, j5.DEADLINE_EXCEEDED);
            J0(d2Var2, d2Var);
            z();
            S0(activity, true);
            this.p = null;
            this.q.remove(activity);
            this.r.remove(activity);
        }
        this.v.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityPaused(Activity activity) {
        if (!this.l) {
            v1 v1Var = this.f18534h;
            if (v1Var == null) {
                this.s = h0.a();
            } else {
                this.s = v1Var.l().getDateProvider().a();
            }
        }
        b(activity, "paused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        if (this.l) {
            v1 v1Var = this.f18534h;
            if (v1Var == null) {
                this.s = h0.a();
            } else {
                this.s = v1Var.l().getDateProvider().a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"NewApi"})
    public synchronized void onActivityResumed(Activity activity) {
        if (this.f18536j) {
            f4 d2 = q0.e().d();
            f4 a = q0.e().a();
            if (d2 != null && a == null) {
                q0.e().g();
            }
            J();
            final d2 d2Var = this.q.get(activity);
            final d2 d2Var2 = this.r.get(activity);
            View findViewById = activity.findViewById(R.id.content);
            if (this.f18533g.d() >= 16 && findViewById != null) {
                io.sentry.android.core.internal.util.p.e(findViewById, new Runnable() { // from class: io.sentry.android.core.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityLifecycleIntegration.this.E0(d2Var2, d2Var);
                    }
                }, this.f18533g);
            } else {
                this.t.post(new Runnable() { // from class: io.sentry.android.core.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityLifecycleIntegration.this.G0(d2Var2, d2Var);
                    }
                });
            }
        }
        b(activity, "resumed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        b(activity, "saveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (this.f18536j) {
            this.w.a(activity);
        }
        b(activity, "started");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        b(activity, "stopped");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void M0(final s3 s3Var, final e2 e2Var) {
        s3Var.D(new s3.c() { // from class: io.sentry.android.core.g
            @Override // io.sentry.s3.c
            public final void a(e2 e2Var2) {
                ActivityLifecycleIntegration.this.y0(s3Var, e2Var, e2Var2);
            }
        });
    }
}
