package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.f;
import androidx.lifecycle.s;

/* loaded from: classes.dex */
public class ProcessLifecycleOwner implements j {

    /* renamed from: f, reason: collision with root package name */
    private static final ProcessLifecycleOwner f1244f = new ProcessLifecycleOwner();

    /* renamed from: k, reason: collision with root package name */
    private Handler f1249k;

    /* renamed from: g, reason: collision with root package name */
    private int f1245g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f1246h = 0;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1247i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1248j = true;
    private final k l = new k(this);
    private Runnable m = new a();
    s.a n = new b();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProcessLifecycleOwner.this.f();
            ProcessLifecycleOwner.this.g();
        }
    }

    /* loaded from: classes.dex */
    class b implements s.a {
        b() {
        }

        @Override // androidx.lifecycle.s.a
        public void a() {
        }

        @Override // androidx.lifecycle.s.a
        public void onResume() {
            ProcessLifecycleOwner.this.b();
        }

        @Override // androidx.lifecycle.s.a
        public void onStart() {
            ProcessLifecycleOwner.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends androidx.lifecycle.c {

        /* loaded from: classes.dex */
        class a extends androidx.lifecycle.c {
            a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                ProcessLifecycleOwner.this.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                ProcessLifecycleOwner.this.c();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                s.f(activity).h(ProcessLifecycleOwner.this.n);
            }
        }

        @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ProcessLifecycleOwner.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ProcessLifecycleOwner.this.d();
        }
    }

    private ProcessLifecycleOwner() {
    }

    public static j h() {
        return f1244f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Context context) {
        f1244f.e(context);
    }

    void a() {
        int i2 = this.f1246h - 1;
        this.f1246h = i2;
        if (i2 == 0) {
            this.f1249k.postDelayed(this.m, 700L);
        }
    }

    void b() {
        int i2 = this.f1246h + 1;
        this.f1246h = i2;
        if (i2 == 1) {
            if (this.f1247i) {
                this.l.i(f.a.ON_RESUME);
                this.f1247i = false;
            } else {
                this.f1249k.removeCallbacks(this.m);
            }
        }
    }

    void c() {
        int i2 = this.f1245g + 1;
        this.f1245g = i2;
        if (i2 == 1 && this.f1248j) {
            this.l.i(f.a.ON_START);
            this.f1248j = false;
        }
    }

    void d() {
        this.f1245g--;
        g();
    }

    void e(Context context) {
        this.f1249k = new Handler();
        this.l.i(f.a.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    void f() {
        if (this.f1246h == 0) {
            this.f1247i = true;
            this.l.i(f.a.ON_PAUSE);
        }
    }

    void g() {
        if (this.f1245g == 0 && this.f1247i) {
            this.l.i(f.a.ON_STOP);
            this.f1248j = true;
        }
    }

    @Override // androidx.lifecycle.j
    public f getLifecycle() {
        return this.l;
    }
}
