package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import io.sentry.Integration;
import io.sentry.i2;
import io.sentry.n1;
import io.sentry.protocol.e;
import io.sentry.s4;
import io.sentry.v1;
import io.sentry.w1;
import io.sentry.x4;
import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class AppComponentsBreadcrumbsIntegration implements Integration, Closeable, ComponentCallbacks2 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f18555f;

    /* renamed from: g, reason: collision with root package name */
    private v1 f18556g;

    /* renamed from: h, reason: collision with root package name */
    private SentryAndroidOptions f18557h;

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.f18555f = (Context) io.sentry.util.q.c(context, "Context is required");
    }

    private void b(Integer num) {
        if (this.f18556g != null) {
            io.sentry.v0 v0Var = new io.sentry.v0();
            if (num != null) {
                if (num.intValue() < 40) {
                    return;
                } else {
                    v0Var.m("level", num);
                }
            }
            v0Var.p("system");
            v0Var.l("device.event");
            v0Var.o("Low memory");
            v0Var.m("action", "LOW_MEMORY");
            v0Var.n(s4.WARNING);
            this.f18556g.e(v0Var);
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f18555f.unregisterComponentCallbacks(this);
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.f18557h;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().a(s4.DEBUG, th, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f18557h;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(s4.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.Integration
    public void f(v1 v1Var, x4 x4Var) {
        this.f18556g = (v1) io.sentry.util.q.c(v1Var, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.q.c(x4Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x4Var : null, "SentryAndroidOptions is required");
        this.f18557h = sentryAndroidOptions;
        w1 logger = sentryAndroidOptions.getLogger();
        s4 s4Var = s4.DEBUG;
        logger.c(s4Var, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f18557h.isEnableAppComponentBreadcrumbs()));
        if (this.f18557h.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f18555f.registerComponentCallbacks(this);
                x4Var.getLogger().c(s4Var, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                a();
            } catch (Throwable th) {
                this.f18557h.setEnableAppComponentBreadcrumbs(false);
                x4Var.getLogger().a(s4.INFO, th, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        if (this.f18556g != null) {
            e.b a = io.sentry.android.core.internal.util.o.a(this.f18555f.getResources().getConfiguration().orientation);
            String lowerCase = a != null ? a.name().toLowerCase(Locale.ROOT) : "undefined";
            io.sentry.v0 v0Var = new io.sentry.v0();
            v0Var.p("navigation");
            v0Var.l("device.orientation");
            v0Var.m("position", lowerCase);
            v0Var.n(s4.INFO);
            n1 n1Var = new n1();
            n1Var.j("android:configuration", configuration);
            this.f18556g.i(v0Var, n1Var);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b(null);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        b(Integer.valueOf(i2));
    }
}
