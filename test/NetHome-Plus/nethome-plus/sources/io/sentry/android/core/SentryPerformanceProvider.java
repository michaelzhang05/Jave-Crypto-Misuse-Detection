package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import io.sentry.f4;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class SentryPerformanceProvider extends x0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g, reason: collision with root package name */
    private static f4 f18596g = h0.a();

    /* renamed from: h, reason: collision with root package name */
    private static long f18597h = SystemClock.uptimeMillis();

    /* renamed from: i, reason: collision with root package name */
    private boolean f18598i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18599j = false;

    /* renamed from: k, reason: collision with root package name */
    private Application f18600k;

    public SentryPerformanceProvider() {
        q0.e().i(f18597h, f18596g);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (!SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            super.attachInfo(context, providerInfo);
            return;
        }
        throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f18598i) {
            return;
        }
        q0.e().j(bundle == null);
        this.f18598i = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (!this.f18599j) {
            this.f18599j = true;
            q0.e().g();
        }
        Application application = this.f18600k;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
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

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        if (!(context instanceof Application)) {
            return true;
        }
        Application application = (Application) context;
        this.f18600k = application;
        application.registerActivityLifecycleCallbacks(this);
        return true;
    }
}
