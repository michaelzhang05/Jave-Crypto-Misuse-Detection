package com.flurry.sdk;

import android.app.Activity;
import android.view.ViewTreeObserver;
import com.flurry.sdk.o1;
import com.flurry.sdk.v3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class q1 {
    private static q1 a;

    /* renamed from: b, reason: collision with root package name */
    private o1.b f10127b;

    /* renamed from: c, reason: collision with root package name */
    m1 f10128c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10130e = false;

    /* renamed from: f, reason: collision with root package name */
    long f10131f = 0;

    /* renamed from: g, reason: collision with root package name */
    long f10132g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f10133h = 0;

    /* renamed from: i, reason: collision with root package name */
    boolean f10134i = false;

    /* renamed from: d, reason: collision with root package name */
    Map<String, m1> f10129d = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class a implements o1.b {

        /* renamed from: com.flurry.sdk.q1$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        final class ViewTreeObserverOnGlobalLayoutListenerC0168a implements ViewTreeObserver.OnGlobalLayoutListener {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Activity f10135f;

            ViewTreeObserverOnGlobalLayoutListenerC0168a(Activity activity) {
                this.f10135f = activity;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                m1 m1Var;
                this.f10135f.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                q1 q1Var = q1.this;
                if (!q1Var.f10130e || (m1Var = q1Var.f10128c) == null) {
                    return;
                }
                double nanoTime = System.nanoTime() - q1.this.f10131f;
                Double.isNaN(nanoTime);
                m1Var.f10026h = (long) (nanoTime / 1000000.0d);
                d1.c(3, "ScreenTimeMonitor", "Start timed event for activity: " + q1.this.f10128c.f10020b);
                m1 m1Var2 = q1.this.f10128c;
                if (m1Var2.f10024f) {
                    return;
                }
                d1.c(4, "ActivityScreenData", "Start timed activity event: " + m1Var2.f10020b);
                com.flurry.sdk.a v = com.flurry.sdk.a.v();
                String str = m1Var2.a;
                v3.a aVar = v3.a.PERFORMANCE;
                String str2 = m1Var2.f10021c;
                if (str2 != null) {
                    m1Var2.f10023e.put("fl.previous.screen", str2);
                }
                m1Var2.f10023e.put("fl.current.screen", m1Var2.f10020b);
                m1Var2.f10023e.put("fl.resume.time", Long.toString(m1Var2.f10025g));
                m1Var2.f10023e.put("fl.layout.time", Long.toString(m1Var2.f10026h));
                Map<String, String> map = m1Var2.f10023e;
                if (!c2.g(16)) {
                    e.d.a.d dVar = e.d.a.d.kFlurryEventFailed;
                } else {
                    v.t(str, aVar, map, true, true);
                }
                m1Var2.f10024f = true;
            }
        }

        a() {
        }

        @Override // com.flurry.sdk.o1.b
        public final void a() {
            q1.this.f10131f = System.nanoTime();
        }

        @Override // com.flurry.sdk.o1.b
        public final void b(Activity activity) {
            d1.c(3, "ScreenTimeMonitor", "onActivityStarted for activity: " + activity.toString());
            q1 q1Var = q1.this;
            m1 m1Var = q1Var.f10128c;
            q1Var.f10128c = new m1(activity.getClass().getSimpleName(), m1Var == null ? null : m1Var.f10020b);
            q1.this.f10129d.put(activity.toString(), q1.this.f10128c);
            q1 q1Var2 = q1.this;
            int i2 = q1Var2.f10133h + 1;
            q1Var2.f10133h = i2;
            if (i2 == 1 && !q1Var2.f10134i) {
                d1.c(3, "ScreenTimeMonitor", "onForeground for activity: " + activity.toString());
                long nanoTime = System.nanoTime();
                q1 q1Var3 = q1.this;
                double d2 = nanoTime - q1Var3.f10132g;
                Double.isNaN(d2);
                long j2 = (long) (d2 / 1000000.0d);
                q1Var3.f10132g = nanoTime;
                q1Var3.f10131f = nanoTime;
                if (q1Var3.f10130e) {
                    q1.b("fl.background.time", activity.getClass().getSimpleName(), j2);
                }
            }
            activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0168a(activity));
        }

        @Override // com.flurry.sdk.o1.b
        public final void c(Activity activity) {
            m1 remove = q1.this.f10129d.remove(activity.toString());
            q1.this.f10134i = activity.isChangingConfigurations();
            q1 q1Var = q1.this;
            int i2 = q1Var.f10133h - 1;
            q1Var.f10133h = i2;
            if (i2 == 0 && !q1Var.f10134i) {
                d1.c(3, "ScreenTimeMonitor", "onBackground for activity: " + activity.toString());
                long nanoTime = System.nanoTime();
                q1 q1Var2 = q1.this;
                double d2 = nanoTime - q1Var2.f10132g;
                Double.isNaN(d2);
                long j2 = (long) (d2 / 1000000.0d);
                q1Var2.f10132g = nanoTime;
                if (q1Var2.f10130e) {
                    q1.b("fl.foreground.time", activity.getClass().getSimpleName(), j2);
                }
            }
            if (!q1.this.f10130e || remove == null) {
                return;
            }
            d1.c(3, "ScreenTimeMonitor", "End timed event: " + remove.f10020b);
            if (remove.f10024f) {
                d1.c(4, "ActivityScreenData", "End timed activity event: " + remove.f10020b);
                com.flurry.sdk.a v = com.flurry.sdk.a.v();
                String str = remove.a;
                v3.a aVar = v3.a.PERFORMANCE;
                double nanoTime2 = System.nanoTime() - remove.f10022d;
                Double.isNaN(nanoTime2);
                remove.f10023e.put("fl.duration", Long.toString((long) (nanoTime2 / 1000000.0d)));
                Map<String, String> map = remove.f10023e;
                if (!c2.g(16)) {
                    e.d.a.d dVar = e.d.a.d.kFlurryEventFailed;
                } else {
                    v.t(str, aVar, map, true, false);
                }
                remove.f10024f = false;
            }
        }

        @Override // com.flurry.sdk.o1.b
        public final void d(Activity activity) {
            m1 m1Var;
            q1 q1Var = q1.this;
            if (!q1Var.f10130e || (m1Var = q1Var.f10128c) == null) {
                return;
            }
            double nanoTime = System.nanoTime() - q1.this.f10131f;
            Double.isNaN(nanoTime);
            m1Var.f10025g = (long) (nanoTime / 1000000.0d);
        }
    }

    private q1() {
    }

    public static synchronized q1 a() {
        q1 q1Var;
        synchronized (q1.class) {
            if (a == null) {
                a = new q1();
            }
            q1Var = a;
        }
        return q1Var;
    }

    static /* synthetic */ void b(String str, String str2, long j2) {
        HashMap hashMap = new HashMap();
        hashMap.put("fl.current.screen", str2);
        hashMap.put(str, Long.toString(j2));
        com.flurry.sdk.a.v().s("Flurry.ForegroundTime", v3.a.PERFORMANCE, hashMap);
    }

    public final void c() {
        if (this.f10127b != null) {
            return;
        }
        d1.c(3, "ScreenTimeMonitor", "Register Screen Time metrics.");
        long nanoTime = System.nanoTime();
        this.f10132g = nanoTime;
        this.f10131f = nanoTime;
        this.f10127b = new a();
        o1.a().c(this.f10127b);
    }
}
