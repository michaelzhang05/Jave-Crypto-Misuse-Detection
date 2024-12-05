package e.d.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.flurry.sdk.a;
import com.flurry.sdk.b0;
import com.flurry.sdk.c2;
import com.flurry.sdk.d1;
import com.flurry.sdk.e7;
import com.flurry.sdk.k0;
import com.flurry.sdk.m2;
import com.flurry.sdk.w4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: j, reason: collision with root package name */
        private e.d.a.a f17390j;
        private c a = null;

        /* renamed from: b, reason: collision with root package name */
        private boolean f17382b = false;

        /* renamed from: c, reason: collision with root package name */
        private int f17383c = 5;

        /* renamed from: d, reason: collision with root package name */
        private long f17384d = 10000;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17385e = true;

        /* renamed from: f, reason: collision with root package name */
        private boolean f17386f = true;

        /* renamed from: g, reason: collision with root package name */
        private boolean f17387g = false;

        /* renamed from: h, reason: collision with root package name */
        private int f17388h = f.a;

        /* renamed from: i, reason: collision with root package name */
        private List<e> f17389i = new ArrayList();

        /* renamed from: k, reason: collision with root package name */
        private boolean f17391k = false;
        private boolean l = false;

        public void a(Context context, String str) {
            boolean z;
            if (b.a()) {
                if (!TextUtils.isEmpty(str)) {
                    b0.b(context);
                    k0.a().f9974c = str;
                    com.flurry.sdk.a v = com.flurry.sdk.a.v();
                    c cVar = this.a;
                    boolean z2 = this.f17382b;
                    int i2 = this.f17383c;
                    long j2 = this.f17384d;
                    boolean z3 = this.f17385e;
                    boolean z4 = this.f17386f;
                    boolean z5 = this.f17387g;
                    int i3 = this.f17388h;
                    List<e> list = this.f17389i;
                    e.d.a.a aVar = this.f17390j;
                    boolean z6 = this.f17391k;
                    boolean z7 = this.l;
                    if (com.flurry.sdk.a.o.get()) {
                        d1.n("FlurryAgentImpl", "Invalid call to Init. Flurry is already initialized");
                        return;
                    }
                    d1.n("FlurryAgentImpl", "Initializing Flurry SDK");
                    if (com.flurry.sdk.a.o.get()) {
                        d1.n("FlurryAgentImpl", "Invalid call to register. Flurry is already initialized");
                    } else {
                        v.q = list;
                    }
                    m2.a();
                    v.m(new a.b(context, list));
                    w4 a = w4.a();
                    e7 a2 = e7.a();
                    if (a2 != null) {
                        z = z6;
                        a2.f9837b.v(a.f10241h);
                        a2.f9838c.v(a.f10242i);
                        a2.f9839d.v(a.f10239f);
                        a2.f9840e.v(a.f10240g);
                        a2.f9841f.v(a.l);
                        a2.f9842g.v(a.f10237d);
                        a2.f9843h.v(a.f10238e);
                        a2.f9844i.v(a.f10244k);
                        a2.f9845j.v(a.f10235b);
                        a2.f9846k.v(a.f10243j);
                        a2.l.v(a.f10236c);
                        a2.m.v(a.m);
                        a2.o.v(a.n);
                        a2.p.v(a.o);
                        a2.q.v(a.p);
                    } else {
                        z = z6;
                    }
                    k0.a().c();
                    e7.a().f9845j.a();
                    e7.a().f9842g.q = z3;
                    if (aVar != null) {
                        e7.a().m.x(aVar);
                    }
                    if (z2) {
                        d1.g();
                    } else {
                        d1.a();
                    }
                    d1.b(i2);
                    v.m(new a.C0158a(j2, cVar));
                    v.m(new a.g(z4, z5));
                    v.m(new a.d(i3, context));
                    v.m(new a.e(z));
                    com.flurry.sdk.a.o.set(true);
                    if (z7) {
                        d1.n("FlurryAgentImpl", "Force start session");
                        v.w(context.getApplicationContext());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("API key not specified");
            }
        }

        public a b(boolean z) {
            this.f17385e = z;
            return this;
        }

        public a c(boolean z) {
            this.f17386f = z;
            return this;
        }

        public a d(boolean z) {
            this.f17382b = z;
            return this;
        }

        public a e(int i2) {
            this.f17388h = i2;
            return this;
        }
    }

    /* renamed from: e.d.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0216b {
        public static void a(String str, String str2) {
            if (b.a()) {
                com.flurry.sdk.a v = com.flurry.sdk.a.v();
                if (!com.flurry.sdk.a.o.get()) {
                    d1.n("FlurryAgentImpl", "Invalid call to UserProperties.add. Flurry is not initialized");
                } else {
                    v.m(new a.c(str, str2));
                }
            }
        }
    }

    static /* synthetic */ boolean a() {
        return b();
    }

    private static boolean b() {
        if (c2.g(16)) {
            return true;
        }
        d1.j("FlurryAgent", String.format(Locale.getDefault(), "Device SDK Version older than %d", 16));
        return false;
    }

    public static d c(String str) {
        return !b() ? d.kFlurryEventFailed : com.flurry.sdk.a.v().u(str, Collections.emptyMap(), false, false);
    }

    public static d d(String str, Map<String, String> map) {
        d dVar = d.kFlurryEventFailed;
        if (!b()) {
            return dVar;
        }
        if (str == null) {
            d1.j("FlurryAgent", "String eventId passed to logEvent was null.");
            return dVar;
        }
        if (map == null) {
            d1.l("FlurryAgent", "String parameters passed to logEvent was null.");
        }
        return com.flurry.sdk.a.v().u(str, map, false, false);
    }

    public static void e(Context context) {
        if (b()) {
            com.flurry.sdk.a v = com.flurry.sdk.a.v();
            if (context instanceof Activity) {
                d1.e("FlurryAgentImpl", "Activity's session is controlled by Flurry SDK");
            } else if (!com.flurry.sdk.a.o.get()) {
                d1.n("FlurryAgentImpl", "Invalid call to onStartSession. Flurry is not initialized");
            } else {
                v.m(new a.h());
            }
        }
    }

    public static void f(String str, String str2, Throwable th, Map<String, String> map) {
        if (b()) {
            com.flurry.sdk.a v = com.flurry.sdk.a.v();
            if (!com.flurry.sdk.a.o.get()) {
                d1.n("FlurryAgentImpl", "Invalid call to onError. Flurry is not initialized");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            v.m(new a.j(str, currentTimeMillis, str2, th, hashMap));
        }
    }

    public static void g(Context context) {
        if (b()) {
            com.flurry.sdk.a.v().w(context);
        }
    }
}
