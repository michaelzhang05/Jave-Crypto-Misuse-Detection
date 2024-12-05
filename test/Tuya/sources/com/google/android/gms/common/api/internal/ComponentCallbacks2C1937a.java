package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ComponentCallbacks2C1937a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    private static final ComponentCallbacks2C1937a f15121e = new ComponentCallbacks2C1937a();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f15122a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f15123b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f15124c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f15125d = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0376a {
        void a(boolean z8);
    }

    private ComponentCallbacks2C1937a() {
    }

    public static ComponentCallbacks2C1937a b() {
        return f15121e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C1937a componentCallbacks2C1937a = f15121e;
        synchronized (componentCallbacks2C1937a) {
            try {
                if (!componentCallbacks2C1937a.f15125d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C1937a);
                    application.registerComponentCallbacks(componentCallbacks2C1937a);
                    componentCallbacks2C1937a.f15125d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z8) {
        synchronized (f15121e) {
            try {
                Iterator it = this.f15124c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0376a) it.next()).a(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(InterfaceC0376a interfaceC0376a) {
        synchronized (f15121e) {
            this.f15124c.add(interfaceC0376a);
        }
    }

    public boolean d() {
        return this.f15122a.get();
    }

    public boolean e(boolean z8) {
        if (!this.f15123b.get()) {
            if (W.k.b()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (!this.f15123b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                    this.f15122a.set(true);
                }
            } else {
                return z8;
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f15123b;
        boolean compareAndSet = this.f15122a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
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
        AtomicBoolean atomicBoolean = this.f15123b;
        boolean compareAndSet = this.f15122a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
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
    public final void onTrimMemory(int i8) {
        if (i8 == 20 && this.f15122a.compareAndSet(false, true)) {
            this.f15123b.set(true);
            f(true);
        }
    }
}
