package com.facebook.t.x;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewObserver.java */
/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: f, reason: collision with root package name */
    private static final String f9685f = e.class.getCanonicalName();

    /* renamed from: g, reason: collision with root package name */
    private static final Map<Integer, e> f9686g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f9687h;

    /* renamed from: i, reason: collision with root package name */
    private final Handler f9688i = new Handler(Looper.getMainLooper());

    /* renamed from: j, reason: collision with root package name */
    private AtomicBoolean f9689j = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewObserver.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                View e2 = com.facebook.t.u.b.e((Activity) e.a(e.this).get());
                Activity activity = (Activity) e.a(e.this).get();
                if (e2 != null && activity != null) {
                    for (View view : c.a(e2)) {
                        if (!com.facebook.t.r.g.d.g(view)) {
                            String d2 = c.d(view);
                            if (!d2.isEmpty() && d2.length() <= 300) {
                                f.c(view, e2, activity.getLocalClassName());
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    private e(Activity activity) {
        this.f9687h = new WeakReference<>(activity);
    }

    static /* synthetic */ WeakReference a(e eVar) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            return eVar.f9687h;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    private void b() {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            a aVar = new a();
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                aVar.run();
            } else {
                this.f9688i.post(aVar);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    private void c() {
        View e2;
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            if (this.f9689j.getAndSet(true) || (e2 = com.facebook.t.u.b.e(this.f9687h.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = e2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                b();
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(Activity activity) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return;
        }
        try {
            int hashCode = activity.hashCode();
            Map<Integer, e> map = f9686g;
            if (map.containsKey(Integer.valueOf(hashCode))) {
                return;
            }
            e eVar = new e(activity);
            map.put(Integer.valueOf(hashCode), eVar);
            eVar.c();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
        }
    }

    private void e() {
        View e2;
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            if (this.f9689j.getAndSet(false) && (e2 = com.facebook.t.u.b.e(this.f9687h.get())) != null) {
                ViewTreeObserver viewTreeObserver = e2.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    if (Build.VERSION.SDK_INT < 16) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    } else {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(Activity activity) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return;
        }
        try {
            int hashCode = activity.hashCode();
            Map<Integer, e> map = f9686g;
            if (map.containsKey(Integer.valueOf(hashCode))) {
                e eVar = map.get(Integer.valueOf(hashCode));
                map.remove(Integer.valueOf(hashCode));
                eVar.e();
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            b();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }
}
