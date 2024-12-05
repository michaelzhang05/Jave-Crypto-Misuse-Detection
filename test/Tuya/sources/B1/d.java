package B1;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private boolean f675a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f676b;

    /* renamed from: c, reason: collision with root package name */
    private a f677c;

    /* loaded from: classes3.dex */
    public interface a {
        void a(boolean z8);
    }

    private void c(boolean z8) {
        if (this.f676b != z8) {
            this.f676b = z8;
            if (this.f675a) {
                f(z8);
                a aVar = this.f677c;
                if (aVar != null) {
                    aVar.a(z8);
                }
            }
        }
    }

    private boolean d() {
        if (e().importance == 100 || h()) {
            return true;
        }
        return false;
    }

    public void a(a aVar) {
        this.f677c = aVar;
    }

    public void b(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    ActivityManager.RunningAppProcessInfo e() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public boolean g() {
        return this.f676b;
    }

    protected boolean h() {
        return false;
    }

    public void i() {
        this.f675a = true;
        boolean d8 = d();
        this.f676b = d8;
        f(d8);
    }

    public void j() {
        this.f675a = false;
        this.f677c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        c(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        c(d());
    }

    protected void f(boolean z8) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
