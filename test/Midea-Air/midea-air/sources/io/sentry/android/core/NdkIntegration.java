package io.sentry.android.core;

import io.sentry.Integration;
import io.sentry.i2;
import io.sentry.s4;
import io.sentry.v1;
import io.sentry.w1;
import io.sentry.x4;
import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class NdkIntegration implements Integration, Closeable {

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f18574f;

    /* renamed from: g, reason: collision with root package name */
    private SentryAndroidOptions f18575g;

    public NdkIntegration(Class<?> cls) {
        this.f18574f = cls;
    }

    private void b(x4 x4Var) {
        x4Var.setEnableNdk(false);
        x4Var.setEnableScopeSync(false);
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.f18575g;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class<?> cls = this.f18574f;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", new Class[0]).invoke(null, new Object[0]);
                        this.f18575g.getLogger().c(s4.DEBUG, "NdkIntegration removed.", new Object[0]);
                    } catch (NoSuchMethodException e2) {
                        this.f18575g.getLogger().b(s4.ERROR, "Failed to invoke the SentryNdk.close method.", e2);
                    }
                } finally {
                    b(this.f18575g);
                }
                b(this.f18575g);
            }
        } catch (Throwable th) {
            b(this.f18575g);
        }
    }

    @Override // io.sentry.Integration
    public final void f(v1 v1Var, x4 x4Var) {
        io.sentry.util.q.c(v1Var, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.q.c(x4Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) x4Var : null, "SentryAndroidOptions is required");
        this.f18575g = sentryAndroidOptions;
        boolean isEnableNdk = sentryAndroidOptions.isEnableNdk();
        w1 logger = this.f18575g.getLogger();
        s4 s4Var = s4.DEBUG;
        logger.c(s4Var, "NdkIntegration enabled: %s", Boolean.valueOf(isEnableNdk));
        if (isEnableNdk && this.f18574f != null) {
            if (this.f18575g.getCacheDirPath() == null) {
                this.f18575g.getLogger().c(s4.ERROR, "No cache dir path is defined in options.", new Object[0]);
                b(this.f18575g);
                return;
            }
            try {
                this.f18574f.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f18575g);
                this.f18575g.getLogger().c(s4Var, "NdkIntegration installed.", new Object[0]);
                a();
                return;
            } catch (NoSuchMethodException e2) {
                b(this.f18575g);
                this.f18575g.getLogger().b(s4.ERROR, "Failed to invoke the SentryNdk.init method.", e2);
                return;
            } catch (Throwable th) {
                b(this.f18575g);
                this.f18575g.getLogger().b(s4.ERROR, "Failed to initialize SentryNdk.", th);
                return;
            }
        }
        b(this.f18575g);
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }
}
