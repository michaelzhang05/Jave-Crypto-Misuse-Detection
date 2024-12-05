package com.facebook.t.r;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.m;
import com.facebook.internal.n;
import com.facebook.internal.x;
import com.facebook.t.r.f;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CodelessManager.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static SensorManager f9522b;

    /* renamed from: c, reason: collision with root package name */
    private static e f9523c;

    /* renamed from: d, reason: collision with root package name */
    private static String f9524d;

    /* renamed from: f, reason: collision with root package name */
    private static Boolean f9526f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile Boolean f9527g;
    private static final f a = new f();

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f9525e = new AtomicBoolean(true);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodelessManager.java */
    /* loaded from: classes.dex */
    public static class a implements f.a {
        final /* synthetic */ m a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f9528b;

        a(m mVar, String str) {
            this.a = mVar;
            this.f9528b = str;
        }

        @Override // com.facebook.t.r.f.a
        public void a() {
            m mVar = this.a;
            boolean z = mVar != null && mVar.b();
            boolean z2 = com.facebook.f.l();
            if (z && z2) {
                b.a(this.f9528b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodelessManager.java */
    /* renamed from: com.facebook.t.r.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0144b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9529f;

        RunnableC0144b(String str) {
            this.f9529f = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                boolean z = true;
                GraphRequest L = GraphRequest.L(null, String.format(Locale.US, "%s/app_indexing_session", this.f9529f), null, null);
                Bundle y = L.y();
                if (y == null) {
                    y = new Bundle();
                }
                com.facebook.internal.a h2 = com.facebook.internal.a.h(com.facebook.f.e());
                JSONArray jSONArray = new JSONArray();
                String str = Build.MODEL;
                if (str == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                jSONArray.put(str);
                if (h2 != null && h2.b() != null) {
                    jSONArray.put(h2.b());
                } else {
                    jSONArray.put(HttpUrl.FRAGMENT_ENCODE_SET);
                }
                jSONArray.put("0");
                jSONArray.put(com.facebook.t.u.b.f() ? "1" : "0");
                Locale v = x.v();
                jSONArray.put(v.getLanguage() + "_" + v.getCountry());
                String jSONArray2 = jSONArray.toString();
                y.putString("device_session_id", b.j());
                y.putString("extinfo", jSONArray2);
                L.a0(y);
                JSONObject h3 = L.g().h();
                if (h3 == null || !h3.optBoolean("is_app_indexing_enabled", false)) {
                    z = false;
                }
                b.c(Boolean.valueOf(z));
                if (!b.b().booleanValue()) {
                    b.d(null);
                } else if (b.e() != null) {
                    b.e().j();
                }
                b.f(Boolean.FALSE);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f9526f = bool;
        f9527g = bool;
    }

    static /* synthetic */ void a(String str) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return;
        }
        try {
            g(str);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
        }
    }

    static /* synthetic */ Boolean b() {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            return f9526f;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    static /* synthetic */ Boolean c(Boolean bool) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            f9526f = bool;
            return bool;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    static /* synthetic */ String d(String str) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            f9524d = str;
            return str;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    static /* synthetic */ e e() {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            return f9523c;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    static /* synthetic */ Boolean f(Boolean bool) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            f9527g = bool;
            return bool;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    private static void g(String str) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return;
        }
        try {
            if (f9527g.booleanValue()) {
                return;
            }
            f9527g = Boolean.TRUE;
            com.facebook.f.m().execute(new RunnableC0144b(str));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
        }
    }

    public static void h() {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return;
        }
        try {
            f9525e.set(false);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
        }
    }

    public static void i() {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return;
        }
        try {
            f9525e.set(true);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String j() {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            if (f9524d == null) {
                f9524d = UUID.randomUUID().toString();
            }
            return f9524d;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean k() {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return false;
        }
        try {
            return f9526f.booleanValue();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return false;
        }
    }

    public static void l(Activity activity) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return;
        }
        try {
            c.e().d(activity);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
        }
    }

    public static void m(Activity activity) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return;
        }
        try {
            if (f9525e.get()) {
                c.e().h(activity);
                e eVar = f9523c;
                if (eVar != null) {
                    eVar.l();
                }
                SensorManager sensorManager = f9522b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(a);
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
        }
    }

    public static void n(Activity activity) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return;
        }
        try {
            if (f9525e.get()) {
                c.e().c(activity);
                Context applicationContext = activity.getApplicationContext();
                String f2 = com.facebook.f.f();
                m j2 = n.j(f2);
                if (j2 != null && j2.b()) {
                    SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                    f9522b = sensorManager;
                    if (sensorManager == null) {
                        return;
                    }
                    Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                    f9523c = new e(activity);
                    f fVar = a;
                    fVar.a(new a(j2, f2));
                    f9522b.registerListener(fVar, defaultSensor, 2);
                    if (j2.b()) {
                        f9523c.j();
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void o(Boolean bool) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return;
        }
        try {
            f9526f = bool;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
        }
    }
}
