package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import io.sentry.Integration;
import io.sentry.i2;
import io.sentry.s4;
import io.sentry.v1;
import io.sentry.w1;
import io.sentry.x4;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class UserInteractionIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private final Application f18610f;

    /* renamed from: g, reason: collision with root package name */
    private v1 f18611g;

    /* renamed from: h, reason: collision with root package name */
    private SentryAndroidOptions f18612h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f18613i;

    public UserInteractionIntegration(Application application, b1 b1Var) {
        this.f18610f = (Application) io.sentry.util.q.c(application, "Application is required");
        this.f18613i = b1Var.b("androidx.core.view.GestureDetectorCompat", this.f18612h);
    }

    private void b(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f18612h;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(s4.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f18611g == null || this.f18612h == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.f();
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.h(callback, activity, new io.sentry.android.core.internal.gestures.g(activity, this.f18611g, this.f18612h), this.f18612h));
    }

    private void w(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f18612h;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(s4.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.h) {
            io.sentry.android.core.internal.gestures.h hVar = (io.sentry.android.core.internal.gestures.h) callback;
            hVar.c();
            if (hVar.a() instanceof io.sentry.android.core.internal.gestures.f) {
                window.setCallback(null);
            } else {
                window.setCallback(hVar.a());
            }
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18610f.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f18612h;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(s4.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.Integration
    public void f(v1 v1Var, x4 x4Var) {
        this.f18612h = (SentryAndroidOptions) io.sentry.util.q.c(x4Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x4Var : null, "SentryAndroidOptions is required");
        this.f18611g = (v1) io.sentry.util.q.c(v1Var, "Hub is required");
        boolean z = this.f18612h.isEnableUserInteractionBreadcrumbs() || this.f18612h.isEnableUserInteractionTracing();
        w1 logger = this.f18612h.getLogger();
        s4 s4Var = s4.DEBUG;
        logger.c(s4Var, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z));
        if (z) {
            if (this.f18613i) {
                this.f18610f.registerActivityLifecycleCallbacks(this);
                this.f18612h.getLogger().c(s4Var, "UserInteractionIntegration installed.", new Object[0]);
                a();
                return;
            }
            x4Var.getLogger().c(s4.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        w(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
