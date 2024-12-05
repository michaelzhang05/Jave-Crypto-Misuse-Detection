package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.h;
import androidx.lifecycle.w;

/* loaded from: classes.dex */
public final class v implements m {

    /* renamed from: i, reason: collision with root package name */
    public static final b f3112i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    private static final v f3113j = new v();

    /* renamed from: a, reason: collision with root package name */
    private int f3114a;

    /* renamed from: b, reason: collision with root package name */
    private int f3115b;

    /* renamed from: e, reason: collision with root package name */
    private Handler f3118e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3116c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3117d = true;

    /* renamed from: f, reason: collision with root package name */
    private final n f3119f = new n(this);

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f3120g = new Runnable() { // from class: androidx.lifecycle.t
        @Override // java.lang.Runnable
        public final void run() {
            v.k(v.this);
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private final w.a f3121h = new d();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3122a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            f5.h.e(activity, "activity");
            f5.h.e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f5.f fVar) {
            this();
        }

        public final m a() {
            return v.f3113j;
        }

        public final void b(Context context) {
            f5.h.e(context, "context");
            v.f3113j.j(context);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends e {

        /* loaded from: classes.dex */
        public static final class a extends e {
            final /* synthetic */ v this$0;

            a(v vVar) {
                this.this$0 = vVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                f5.h.e(activity, "activity");
                this.this$0.g();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                f5.h.e(activity, "activity");
                this.this$0.h();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            f5.h.e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                w.f3124b.b(activity).f(v.this.f3121h);
            }
        }

        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            f5.h.e(activity, "activity");
            v.this.f();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            f5.h.e(activity, "activity");
            a.a(activity, new a(v.this));
        }

        @Override // androidx.lifecycle.e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            f5.h.e(activity, "activity");
            v.this.i();
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements w.a {
        d() {
        }

        @Override // androidx.lifecycle.w.a
        public void a() {
            v.this.g();
        }

        @Override // androidx.lifecycle.w.a
        public void b() {
            v.this.h();
        }

        @Override // androidx.lifecycle.w.a
        public void onCreate() {
        }
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(v vVar) {
        f5.h.e(vVar, "this$0");
        vVar.l();
        vVar.m();
    }

    public final void f() {
        int i6 = this.f3115b - 1;
        this.f3115b = i6;
        if (i6 == 0) {
            Handler handler = this.f3118e;
            f5.h.b(handler);
            handler.postDelayed(this.f3120g, 700L);
        }
    }

    public final void g() {
        int i6 = this.f3115b + 1;
        this.f3115b = i6;
        if (i6 == 1) {
            if (this.f3116c) {
                this.f3119f.h(h.a.ON_RESUME);
                this.f3116c = false;
            } else {
                Handler handler = this.f3118e;
                f5.h.b(handler);
                handler.removeCallbacks(this.f3120g);
            }
        }
    }

    public final void h() {
        int i6 = this.f3114a + 1;
        this.f3114a = i6;
        if (i6 == 1 && this.f3117d) {
            this.f3119f.h(h.a.ON_START);
            this.f3117d = false;
        }
    }

    public final void i() {
        this.f3114a--;
        m();
    }

    public final void j(Context context) {
        f5.h.e(context, "context");
        this.f3118e = new Handler();
        this.f3119f.h(h.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        f5.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void l() {
        if (this.f3115b == 0) {
            this.f3116c = true;
            this.f3119f.h(h.a.ON_PAUSE);
        }
    }

    public final void m() {
        if (this.f3114a == 0 && this.f3116c) {
            this.f3119f.h(h.a.ON_STOP);
            this.f3117d = true;
        }
    }

    @Override // androidx.lifecycle.m
    public h r() {
        return this.f3119f;
    }
}
