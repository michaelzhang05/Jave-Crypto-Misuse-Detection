package io.sentry.android.core;

import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.Integration;
import io.sentry.i2;
import io.sentry.s4;
import io.sentry.v1;
import io.sentry.w1;
import io.sentry.x4;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class AppLifecycleIntegration implements Integration, Closeable {

    /* renamed from: f, reason: collision with root package name */
    volatile LifecycleWatcher f18558f;

    /* renamed from: g, reason: collision with root package name */
    private SentryAndroidOptions f18559g;

    /* renamed from: h, reason: collision with root package name */
    private final c1 f18560h;

    public AppLifecycleIntegration() {
        this(new c1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void z() {
        LifecycleWatcher lifecycleWatcher = this.f18558f;
        if (lifecycleWatcher != null) {
            ProcessLifecycleOwner.h().getLifecycle().c(lifecycleWatcher);
            SentryAndroidOptions sentryAndroidOptions = this.f18559g;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(s4.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
            }
        }
        this.f18558f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void J(v1 v1Var) {
        SentryAndroidOptions sentryAndroidOptions = this.f18559g;
        if (sentryAndroidOptions == null) {
            return;
        }
        this.f18558f = new LifecycleWatcher(v1Var, sentryAndroidOptions.getSessionTrackingIntervalMillis(), this.f18559g.isEnableAutoSessionTracking(), this.f18559g.isEnableAppLifecycleBreadcrumbs());
        try {
            ProcessLifecycleOwner.h().getLifecycle().a(this.f18558f);
            this.f18559g.getLogger().c(s4.DEBUG, "AppLifecycleIntegration installed.", new Object[0]);
            a();
        } catch (Throwable th) {
            this.f18558f = null;
            this.f18559g.getLogger().b(s4.ERROR, "AppLifecycleIntegration failed to get Lifecycle and could not be installed.", th);
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f18558f == null) {
            return;
        }
        if (io.sentry.android.core.internal.util.h.e().d()) {
            w();
        } else {
            this.f18560h.b(new Runnable() { // from class: io.sentry.android.core.w
                @Override // java.lang.Runnable
                public final void run() {
                    AppLifecycleIntegration.this.z();
                }
            });
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008d -> B:14:0x0098). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0080 -> B:14:0x0098). Please report as a decompilation issue!!! */
    @Override // io.sentry.Integration
    public void f(final v1 v1Var, x4 x4Var) {
        io.sentry.util.q.c(v1Var, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.q.c(x4Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x4Var : null, "SentryAndroidOptions is required");
        this.f18559g = sentryAndroidOptions;
        w1 logger = sentryAndroidOptions.getLogger();
        s4 s4Var = s4.DEBUG;
        logger.c(s4Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f18559g.isEnableAutoSessionTracking()));
        this.f18559g.getLogger().c(s4Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f18559g.isEnableAppLifecycleBreadcrumbs()));
        if (this.f18559g.isEnableAutoSessionTracking() || this.f18559g.isEnableAppLifecycleBreadcrumbs()) {
            try {
                Class.forName("androidx.lifecycle.DefaultLifecycleObserver");
                Class.forName("androidx.lifecycle.ProcessLifecycleOwner");
                if (io.sentry.android.core.internal.util.h.e().d()) {
                    D(v1Var);
                    x4Var = x4Var;
                } else {
                    this.f18560h.b(new Runnable() { // from class: io.sentry.android.core.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppLifecycleIntegration.this.J(v1Var);
                        }
                    });
                    x4Var = x4Var;
                }
            } catch (ClassNotFoundException e2) {
                w1 logger2 = x4Var.getLogger();
                logger2.b(s4.INFO, "androidx.lifecycle is not available, AppLifecycleIntegration won't be installed", e2);
                x4Var = logger2;
            } catch (IllegalStateException e3) {
                w1 logger3 = x4Var.getLogger();
                logger3.b(s4.ERROR, "AppLifecycleIntegration could not be installed", e3);
                x4Var = logger3;
            }
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }

    AppLifecycleIntegration(c1 c1Var) {
        this.f18560h = c1Var;
    }
}
