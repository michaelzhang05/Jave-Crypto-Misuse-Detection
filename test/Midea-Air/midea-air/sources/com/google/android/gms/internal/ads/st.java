package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class st implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private final Application f12172f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f12173g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12174h = false;

    public st(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f12173g = new WeakReference<>(activityLifecycleCallbacks);
        this.f12172f = application;
    }

    private final void a(zzdu zzduVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f12173g.get();
            if (activityLifecycleCallbacks != null) {
                zzduVar.a(activityLifecycleCallbacks);
            } else {
                if (this.f12174h) {
                    return;
                }
                this.f12172f.unregisterActivityLifecycleCallbacks(this);
                this.f12174h = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new lu(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new iy(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new kw(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new rv(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new xx(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new fv(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new ix(this, activity));
    }
}
