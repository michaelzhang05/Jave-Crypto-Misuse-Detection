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

/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    private static final a f4557e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f4558a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f4559b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f4560c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f4561d = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0078a {
        void a(boolean z5);
    }

    private a() {
    }

    public static a b() {
        return f4557e;
    }

    public static void c(Application application) {
        a aVar = f4557e;
        synchronized (aVar) {
            if (!aVar.f4561d) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f4561d = true;
            }
        }
    }

    private final void f(boolean z5) {
        synchronized (f4557e) {
            Iterator it = this.f4560c.iterator();
            while (it.hasNext()) {
                ((InterfaceC0078a) it.next()).a(z5);
            }
        }
    }

    public void a(InterfaceC0078a interfaceC0078a) {
        synchronized (f4557e) {
            this.f4560c.add(interfaceC0078a);
        }
    }

    public boolean d() {
        return this.f4558a.get();
    }

    public boolean e(boolean z5) {
        if (!this.f4559b.get()) {
            if (!z1.i.b()) {
                return z5;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f4559b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f4558a.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f4558a.compareAndSet(true, false);
        this.f4559b.set(true);
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
        boolean compareAndSet = this.f4558a.compareAndSet(true, false);
        this.f4559b.set(true);
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
    public final void onTrimMemory(int i6) {
        if (i6 == 20 && this.f4558a.compareAndSet(false, true)) {
            this.f4559b.set(true);
            f(true);
        }
    }
}
