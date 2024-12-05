package l1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class H implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public static final H f34266a = new H();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f34267b;

    /* renamed from: c, reason: collision with root package name */
    private static C3295D f34268c;

    private H() {
    }

    public final void a(C3295D c3295d) {
        f34268c = c3295d;
        if (c3295d != null && f34267b) {
            f34267b = false;
            c3295d.k();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC3255y.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC3255y.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC3255y.i(activity, "activity");
        C3295D c3295d = f34268c;
        if (c3295d != null) {
            c3295d.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        O5.I i8;
        AbstractC3255y.i(activity, "activity");
        C3295D c3295d = f34268c;
        if (c3295d != null) {
            c3295d.k();
            i8 = O5.I.f8278a;
        } else {
            i8 = null;
        }
        if (i8 == null) {
            f34267b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC3255y.i(activity, "activity");
        AbstractC3255y.i(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC3255y.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC3255y.i(activity, "activity");
    }
}
