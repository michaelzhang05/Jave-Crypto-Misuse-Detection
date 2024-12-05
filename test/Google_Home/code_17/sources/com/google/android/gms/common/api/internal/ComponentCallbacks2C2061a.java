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
public final class ComponentCallbacks2C2061a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    private static final ComponentCallbacks2C2061a f15922e = new ComponentCallbacks2C2061a();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f15923a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f15924b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f15925c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f15926d = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0371a {
        void a(boolean z8);
    }

    private ComponentCallbacks2C2061a() {
    }

    public static ComponentCallbacks2C2061a b() {
        return f15922e;
    }

    public static void c(Application application) {
        ComponentCallbacks2C2061a componentCallbacks2C2061a = f15922e;
        synchronized (componentCallbacks2C2061a) {
            try {
                if (!componentCallbacks2C2061a.f15926d) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C2061a);
                    application.registerComponentCallbacks(componentCallbacks2C2061a);
                    componentCallbacks2C2061a.f15926d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void f(boolean z8) {
        synchronized (f15922e) {
            try {
                Iterator it = this.f15925c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0371a) it.next()).a(z8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(InterfaceC0371a interfaceC0371a) {
        synchronized (f15922e) {
            this.f15925c.add(interfaceC0371a);
        }
    }

    public boolean d() {
        return this.f15923a.get();
    }

    public boolean e(boolean z8) {
        if (!this.f15924b.get()) {
            if (V.k.b()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (!this.f15924b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                    this.f15923a.set(true);
                }
            } else {
                return z8;
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f15924b;
        boolean compareAndSet = this.f15923a.compareAndSet(true, false);
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
        AtomicBoolean atomicBoolean = this.f15924b;
        boolean compareAndSet = this.f15923a.compareAndSet(true, false);
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
        if (i8 == 20 && this.f15923a.compareAndSet(false, true)) {
            this.f15924b.set(true);
            f(true);
        }
    }
}
