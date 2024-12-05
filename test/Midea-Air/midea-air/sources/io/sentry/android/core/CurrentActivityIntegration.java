package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.Integration;
import io.sentry.i2;
import io.sentry.v1;
import io.sentry.x4;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class CurrentActivityIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private final Application f18562f;

    public CurrentActivityIntegration(Application application) {
        this.f18562f = (Application) io.sentry.util.q.c(application, "Application is required");
    }

    private void b(Activity activity) {
        if (u0.c().b() == activity) {
            u0.c().a();
        }
    }

    private void w(Activity activity) {
        u0.c().d(activity);
    }

    @Override // io.sentry.j2
    public /* synthetic */ void a() {
        i2.a(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18562f.unregisterActivityLifecycleCallbacks(this);
        u0.c().a();
    }

    @Override // io.sentry.Integration
    public void f(v1 v1Var, x4 x4Var) {
        this.f18562f.registerActivityLifecycleCallbacks(this);
    }

    @Override // io.sentry.j2
    public /* synthetic */ String o() {
        return i2.b(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        w(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        w(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        w(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        b(activity);
    }
}
