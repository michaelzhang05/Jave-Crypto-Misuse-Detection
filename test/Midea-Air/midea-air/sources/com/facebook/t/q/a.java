package com.facebook.t.q;

import android.app.Activity;
import com.facebook.f;
import com.facebook.internal.m;
import com.facebook.internal.n;
import com.facebook.internal.x;

/* compiled from: MetadataIndexer.java */
/* loaded from: classes.dex */
public final class a {
    private static final String a = "com.facebook.t.q.a";

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f9498b = Boolean.FALSE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MetadataIndexer.java */
    /* renamed from: com.facebook.t.q.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0142a implements Runnable {
        RunnableC0142a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                if (com.facebook.internal.a.l(f.e())) {
                    return;
                }
                a.a();
                a.b(Boolean.TRUE);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    static /* synthetic */ void a() {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            e();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }

    static /* synthetic */ Boolean b(Boolean bool) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return null;
        }
        try {
            f9498b = bool;
            return bool;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return null;
        }
    }

    public static void c() {
        try {
            if (com.facebook.internal.a0.f.a.c(a.class)) {
                return;
            }
            try {
                f.m().execute(new RunnableC0142a());
            } catch (Exception e2) {
                x.U(a, e2);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }

    public static void d(Activity activity) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            if (f9498b.booleanValue() && !c.e().isEmpty()) {
                d.h(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }

    private static void e() {
        String g2;
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            m o = n.o(f.f(), false);
            if (o == null || (g2 = o.g()) == null) {
                return;
            }
            c.g(g2);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }
}
