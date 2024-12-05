package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.e2;
import io.sentry.internal.gestures.b;
import io.sentry.j5;
import io.sentry.n1;
import io.sentry.protocol.z;
import io.sentry.r5;
import io.sentry.s3;
import io.sentry.s4;
import io.sentry.t3;
import io.sentry.t5;
import io.sentry.util.v;
import io.sentry.v0;
import io.sentry.v1;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.VisibleForTesting;

/* compiled from: SentryGestureListener.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class g implements GestureDetector.OnGestureListener {
    private final WeakReference<Activity> a;

    /* renamed from: b, reason: collision with root package name */
    private final v1 f18674b;

    /* renamed from: c, reason: collision with root package name */
    private final SentryAndroidOptions f18675c;

    /* renamed from: d, reason: collision with root package name */
    private io.sentry.internal.gestures.b f18676d = null;

    /* renamed from: e, reason: collision with root package name */
    private e2 f18677e = null;

    /* renamed from: f, reason: collision with root package name */
    private String f18678f = null;

    /* renamed from: g, reason: collision with root package name */
    private final b f18679g = new b();

    /* compiled from: SentryGestureListener.java */
    /* loaded from: classes2.dex */
    private static final class b {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private io.sentry.internal.gestures.b f18680b;

        /* renamed from: c, reason: collision with root package name */
        private float f18681c;

        /* renamed from: d, reason: collision with root package name */
        private float f18682d;

        private b() {
            this.a = null;
            this.f18681c = 0.0f;
            this.f18682d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String i(MotionEvent motionEvent) {
            float x = motionEvent.getX() - this.f18681c;
            float y = motionEvent.getY() - this.f18682d;
            return Math.abs(x) > Math.abs(y) ? x > 0.0f ? "right" : "left" : y > 0.0f ? "down" : "up";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            this.f18680b = null;
            this.a = null;
            this.f18681c = 0.0f;
            this.f18682d = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(io.sentry.internal.gestures.b bVar) {
            this.f18680b = bVar;
        }
    }

    public g(Activity activity, v1 v1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.a = new WeakReference<>(activity);
        this.f18674b = v1Var;
        this.f18675c = sentryAndroidOptions;
    }

    private void a(io.sentry.internal.gestures.b bVar, String str, Map<String, Object> map, MotionEvent motionEvent) {
        if (this.f18675c.isEnableUserInteractionBreadcrumbs()) {
            n1 n1Var = new n1();
            n1Var.j("android:motionEvent", motionEvent);
            n1Var.j("android:view", bVar.f());
            this.f18674b.i(v0.r(str, bVar.d(), bVar.a(), bVar.e(), map), n1Var);
        }
    }

    private View d(String str) {
        Activity activity = this.a.get();
        if (activity == null) {
            this.f18675c.getLogger().c(s4.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.f18675c.getLogger().c(s4.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        this.f18675c.getLogger().c(s4.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    private String e(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g(s3 s3Var, e2 e2Var, e2 e2Var2) {
        if (e2Var2 == null) {
            s3Var.z(e2Var);
        } else {
            this.f18675c.getLogger().c(s4.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", e2Var.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i(s3 s3Var, e2 e2Var) {
        if (e2Var == this.f18677e) {
            s3Var.e();
        }
    }

    private void o(io.sentry.internal.gestures.b bVar, String str) {
        io.sentry.internal.gestures.b bVar2 = this.f18676d;
        if (this.f18675c.isTracingEnabled() && this.f18675c.isEnableUserInteractionTracing()) {
            Activity activity = this.a.get();
            if (activity == null) {
                this.f18675c.getLogger().c(s4.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
                return;
            }
            String b2 = bVar.b();
            if (this.f18677e != null) {
                if (bVar.equals(bVar2) && str.equals(this.f18678f) && !this.f18677e.b()) {
                    this.f18675c.getLogger().c(s4.DEBUG, "The view with id: " + b2 + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                    if (this.f18675c.getIdleTimeout() != null) {
                        this.f18677e.l();
                        return;
                    }
                    return;
                }
                p(j5.OK);
            }
            t5 t5Var = new t5();
            t5Var.n(true);
            t5Var.k(this.f18675c.getIdleTimeout());
            t5Var.d(true);
            final e2 g2 = this.f18674b.g(new r5(e(activity) + "." + b2, z.COMPONENT, "ui.action." + str), t5Var);
            g2.m().m("auto.ui.gesture_listener." + bVar.c());
            this.f18674b.j(new t3() { // from class: io.sentry.android.core.internal.gestures.c
                @Override // io.sentry.t3
                public final void a(s3 s3Var) {
                    g.this.k(g2, s3Var);
                }
            });
            this.f18677e = g2;
            this.f18676d = bVar;
            this.f18678f = str;
            return;
        }
        if (bVar.equals(bVar2) && str.equals(this.f18678f)) {
            return;
        }
        v.e(this.f18674b);
        this.f18676d = bVar;
        this.f18678f = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void k(final s3 s3Var, final e2 e2Var) {
        s3Var.D(new s3.c() { // from class: io.sentry.android.core.internal.gestures.a
            @Override // io.sentry.s3.c
            public final void a(e2 e2Var2) {
                g.this.g(s3Var, e2Var, e2Var2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m(final s3 s3Var) {
        s3Var.D(new s3.c() { // from class: io.sentry.android.core.internal.gestures.b
            @Override // io.sentry.s3.c
            public final void a(e2 e2Var) {
                g.this.i(s3Var, e2Var);
            }
        });
    }

    public void n(MotionEvent motionEvent) {
        View d2 = d("onUp");
        io.sentry.internal.gestures.b bVar = this.f18679g.f18680b;
        if (d2 == null || bVar == null) {
            return;
        }
        if (this.f18679g.a != null) {
            a(bVar, this.f18679g.a, Collections.singletonMap("direction", this.f18679g.i(motionEvent)), motionEvent);
            o(bVar, this.f18679g.a);
            this.f18679g.j();
            return;
        }
        this.f18675c.getLogger().c(s4.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f18679g.j();
        this.f18679g.f18681c = motionEvent.getX();
        this.f18679g.f18682d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        this.f18679g.a = "swipe";
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        View d2 = d("onScroll");
        if (d2 != null && motionEvent != null && this.f18679g.a == null) {
            io.sentry.internal.gestures.b a2 = j.a(this.f18675c, d2, motionEvent.getX(), motionEvent.getY(), b.a.SCROLLABLE);
            if (a2 == null) {
                this.f18675c.getLogger().c(s4.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            this.f18675c.getLogger().c(s4.DEBUG, "Scroll target found: " + a2.b(), new Object[0]);
            this.f18679g.k(a2);
            this.f18679g.a = "scroll";
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View d2 = d("onSingleTapUp");
        if (d2 != null && motionEvent != null) {
            io.sentry.internal.gestures.b a2 = j.a(this.f18675c, d2, motionEvent.getX(), motionEvent.getY(), b.a.CLICKABLE);
            if (a2 == null) {
                this.f18675c.getLogger().c(s4.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            a(a2, "click", Collections.emptyMap(), motionEvent);
            o(a2, "click");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(j5 j5Var) {
        e2 e2Var = this.f18677e;
        if (e2Var != null) {
            e2Var.d(j5Var);
        }
        this.f18674b.j(new t3() { // from class: io.sentry.android.core.internal.gestures.d
            @Override // io.sentry.t3
            public final void a(s3 s3Var) {
                g.this.m(s3Var);
            }
        });
        this.f18677e = null;
        if (this.f18676d != null) {
            this.f18676d = null;
        }
        this.f18678f = null;
    }
}
