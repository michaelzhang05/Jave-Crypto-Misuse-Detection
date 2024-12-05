package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@KeepForSdk
/* loaded from: classes2.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f, reason: collision with root package name */
    private static final BackgroundDetector f10563f = new BackgroundDetector();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f10564g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f10565h = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList<BackgroundStateChangeListener> f10566i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private boolean f10567j = false;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void a(boolean z);
    }

    @KeepForSdk
    private BackgroundDetector() {
    }

    @KeepForSdk
    public static BackgroundDetector b() {
        return f10563f;
    }

    @KeepForSdk
    public static void c(Application application) {
        BackgroundDetector backgroundDetector = f10563f;
        synchronized (backgroundDetector) {
            if (!backgroundDetector.f10567j) {
                application.registerActivityLifecycleCallbacks(backgroundDetector);
                application.registerComponentCallbacks(backgroundDetector);
                backgroundDetector.f10567j = true;
            }
        }
    }

    private final void e(boolean z) {
        synchronized (f10563f) {
            ArrayList<BackgroundStateChangeListener> arrayList = this.f10566i;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                BackgroundStateChangeListener backgroundStateChangeListener = arrayList.get(i2);
                i2++;
                backgroundStateChangeListener.a(z);
            }
        }
    }

    @KeepForSdk
    public final void a(BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f10563f) {
            this.f10566i.add(backgroundStateChangeListener);
        }
    }

    @KeepForSdk
    public final boolean d() {
        return this.f10564g.get();
    }

    @KeepForSdk
    @TargetApi(16)
    public final boolean f(boolean z) {
        if (!this.f10565h.get()) {
            if (!PlatformVersion.c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f10565h.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f10564g.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f10564g.compareAndSet(true, false);
        this.f10565h.set(true);
        if (compareAndSet) {
            e(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f10564g.compareAndSet(true, false);
        this.f10565h.set(true);
        if (compareAndSet) {
            e(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f10564g.compareAndSet(false, true)) {
            this.f10565h.set(true);
            e(true);
        }
    }
}
