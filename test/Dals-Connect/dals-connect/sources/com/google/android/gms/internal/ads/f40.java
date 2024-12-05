package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class f40 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f, reason: collision with root package name */
    private final Application f11393f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f11394g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f11395h = false;

    public f40(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f11394g = new WeakReference<>(activityLifecycleCallbacks);
        this.f11393f = application;
    }

    private final void a(zzun zzunVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f11394g.get();
            if (activityLifecycleCallbacks != null) {
                zzunVar.a(activityLifecycleCallbacks);
            } else {
                if (this.f11395h) {
                    return;
                }
                this.f11393f.unregisterActivityLifecycleCallbacks(this);
                this.f11395h = true;
            }
        } catch (Exception e2) {
            zzbad.c("Error while dispatching lifecycle callback.", e2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new g40(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new m40(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new j40(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new i40(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new l40(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new h40(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new k40(this, activity));
    }
}
