package com.facebook.t.x;

import android.app.Activity;
import com.facebook.internal.m;
import com.facebook.internal.n;
import com.facebook.t.v.c;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SuggestedEventsManager.java */
/* loaded from: classes.dex */
public final class d {
    private static final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f9683b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f9684c = new HashSet();

    public static synchronized void a() {
        synchronized (d.class) {
            if (com.facebook.internal.a0.f.a.c(d.class)) {
                return;
            }
            try {
                AtomicBoolean atomicBoolean = a;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean.set(true);
                b();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, d.class);
            }
        }
    }

    private static void b() {
        String l;
        File j2;
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return;
        }
        try {
            m o = n.o(com.facebook.f.f(), false);
            if (o == null || (l = o.l()) == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject(l);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    f9683b.add(jSONArray.getString(i2));
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    f9684c.add(jSONArray2.getString(i3));
                }
            }
            if ((f9683b.isEmpty() && f9684c.isEmpty()) || (j2 = com.facebook.t.v.c.j(c.e.MTML_APP_EVENT_PREDICTION)) == null) {
                return;
            }
            a.d(j2);
            Activity p = com.facebook.t.u.a.p();
            if (p != null) {
                e(p);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(String str) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return false;
        }
        try {
            return f9684c.contains(str);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(String str) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return false;
        }
        try {
            return f9683b.contains(str);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
            return false;
        }
    }

    public static void e(Activity activity) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return;
        }
        try {
            if (a.get() && a.f() && (!f9683b.isEmpty() || !f9684c.isEmpty())) {
                e.d(activity);
            } else {
                e.f(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
        }
    }
}
