package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
@TargetApi(14)
/* loaded from: classes2.dex */
public final class n40 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private Activity f11845f;

    /* renamed from: g, reason: collision with root package name */
    private Context f11846g;
    private Runnable m;
    private long o;

    /* renamed from: h, reason: collision with root package name */
    private final Object f11847h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private boolean f11848i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11849j = false;

    /* renamed from: k, reason: collision with root package name */
    private final List<zzut> f11850k = new ArrayList();
    private final List<zzvg> l = new ArrayList();
    private boolean n = false;

    private final void c(Activity activity) {
        synchronized (this.f11847h) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f11845f = activity;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean g(n40 n40Var, boolean z) {
        n40Var.f11848i = false;
        return false;
    }

    public final Activity a() {
        return this.f11845f;
    }

    public final Context b() {
        return this.f11846g;
    }

    public final void e(Application application, Context context) {
        if (this.n) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            c((Activity) context);
        }
        this.f11846g = application;
        this.o = ((Long) zzyt.e().c(zzacu.e1)).longValue();
        this.n = true;
    }

    public final void f(zzut zzutVar) {
        synchronized (this.f11847h) {
            this.f11850k.add(zzutVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f11847h) {
            Activity activity2 = this.f11845f;
            if (activity2 == null) {
                return;
            }
            if (activity2.equals(activity)) {
                this.f11845f = null;
            }
            Iterator<zzvg> it = this.l.iterator();
            while (it.hasNext()) {
                try {
                    if (it.next().a(activity)) {
                        it.remove();
                    }
                } catch (Exception e2) {
                    zzk.zzlk().e(e2, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity);
        synchronized (this.f11847h) {
            Iterator<zzvg> it = this.l.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onActivityPaused(activity);
                } catch (Exception e2) {
                    zzk.zzlk().e(e2, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
                }
            }
        }
        this.f11849j = true;
        Runnable runnable = this.m;
        if (runnable != null) {
            zzaxi.a.removeCallbacks(runnable);
        }
        Handler handler = zzaxi.a;
        o40 o40Var = new o40(this);
        this.m = o40Var;
        handler.postDelayed(o40Var, this.o);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity);
        this.f11849j = false;
        boolean z = !this.f11848i;
        this.f11848i = true;
        Runnable runnable = this.m;
        if (runnable != null) {
            zzaxi.a.removeCallbacks(runnable);
        }
        synchronized (this.f11847h) {
            Iterator<zzvg> it = this.l.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onActivityResumed(activity);
                } catch (Exception e2) {
                    zzk.zzlk().e(e2, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
                }
            }
            if (z) {
                Iterator<zzut> it2 = this.f11850k.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().a(true);
                    } catch (Exception e3) {
                        zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e3);
                    }
                }
            } else {
                zzbad.e("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
