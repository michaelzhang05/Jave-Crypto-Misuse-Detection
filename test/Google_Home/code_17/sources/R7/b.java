package R7;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f9657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f9658b;

    public b(a aVar) {
        this.f9658b = aVar;
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC3255y.i(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        AbstractC3255y.i(activity, "activity");
        AbstractC3255y.i(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC3255y.i(activity, "activity");
        WeakReference weakReference = this.f9657a;
        if (weakReference == null || !AbstractC3255y.d((Activity) weakReference.get(), activity)) {
            if (!c.f9659a) {
                this.f9658b.a();
                c.f9659a = true;
            }
            this.f9657a = new WeakReference(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Activity activity2;
        AbstractC3255y.i(activity, "activity");
        WeakReference weakReference = this.f9657a;
        if (weakReference == null) {
            activity2 = null;
        } else {
            activity2 = (Activity) weakReference.get();
        }
        if (AbstractC3255y.d(activity2, activity)) {
            if (c.f9659a) {
                this.f9658b.b();
                c.f9659a = false;
            }
            this.f9657a = null;
        }
    }
}
