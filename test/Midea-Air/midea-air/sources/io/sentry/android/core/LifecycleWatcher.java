package io.sentry.android.core;

import androidx.lifecycle.DefaultLifecycleObserver;
import io.sentry.d5;
import io.sentry.s3;
import io.sentry.s4;
import io.sentry.t3;
import io.sentry.v1;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LifecycleWatcher implements DefaultLifecycleObserver {
    private final AtomicLong a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18565b;

    /* renamed from: c, reason: collision with root package name */
    private TimerTask f18566c;

    /* renamed from: d, reason: collision with root package name */
    private final Timer f18567d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f18568e;

    /* renamed from: f, reason: collision with root package name */
    private final v1 f18569f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f18570g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f18571h;

    /* renamed from: i, reason: collision with root package name */
    private final io.sentry.transport.q f18572i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            LifecycleWatcher.this.e("end");
            LifecycleWatcher.this.f18569f.endSession();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleWatcher(v1 v1Var, long j2, boolean z, boolean z2) {
        this(v1Var, j2, z, z2, io.sentry.transport.o.b());
    }

    private void d(String str) {
        if (this.f18571h) {
            io.sentry.v0 v0Var = new io.sentry.v0();
            v0Var.p("navigation");
            v0Var.m("state", str);
            v0Var.l("app.lifecycle");
            v0Var.n(s4.INFO);
            this.f18569f.e(v0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        this.f18569f.e(io.sentry.android.core.internal.util.i.a(str));
    }

    private void f() {
        synchronized (this.f18568e) {
            TimerTask timerTask = this.f18566c;
            if (timerTask != null) {
                timerTask.cancel();
                this.f18566c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void h(s3 s3Var) {
        d5 r;
        if (this.a.get() != 0 || (r = s3Var.r()) == null || r.k() == null) {
            return;
        }
        this.a.set(r.k().getTime());
    }

    private void i() {
        synchronized (this.f18568e) {
            f();
            if (this.f18567d != null) {
                a aVar = new a();
                this.f18566c = aVar;
                this.f18567d.schedule(aVar, this.f18565b);
            }
        }
    }

    private void j() {
        if (this.f18570g) {
            f();
            long a2 = this.f18572i.a();
            this.f18569f.j(new t3() { // from class: io.sentry.android.core.z
                @Override // io.sentry.t3
                public final void a(s3 s3Var) {
                    LifecycleWatcher.this.h(s3Var);
                }
            });
            long j2 = this.a.get();
            if (j2 == 0 || j2 + this.f18565b <= a2) {
                e("start");
                this.f18569f.startSession();
            }
            this.a.set(a2);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.d
    public /* synthetic */ void onCreate(androidx.lifecycle.j jVar) {
        androidx.lifecycle.b.a(this, jVar);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.d
    public /* synthetic */ void onDestroy(androidx.lifecycle.j jVar) {
        androidx.lifecycle.b.b(this, jVar);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.d
    public /* synthetic */ void onPause(androidx.lifecycle.j jVar) {
        androidx.lifecycle.b.c(this, jVar);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.d
    public /* synthetic */ void onResume(androidx.lifecycle.j jVar) {
        androidx.lifecycle.b.d(this, jVar);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.d
    public void onStart(androidx.lifecycle.j jVar) {
        j();
        d("foreground");
        r0.a().c(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.d
    public void onStop(androidx.lifecycle.j jVar) {
        if (this.f18570g) {
            this.a.set(this.f18572i.a());
            i();
        }
        r0.a().c(true);
        d("background");
    }

    LifecycleWatcher(v1 v1Var, long j2, boolean z, boolean z2, io.sentry.transport.q qVar) {
        this.a = new AtomicLong(0L);
        this.f18568e = new Object();
        this.f18565b = j2;
        this.f18570g = z;
        this.f18571h = z2;
        this.f18569f = v1Var;
        this.f18572i = qVar;
        if (z) {
            this.f18567d = new Timer(true);
        } else {
            this.f18567d = null;
        }
    }
}
