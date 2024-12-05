package com.facebook.internal.b0.e;

import android.os.Build;
import com.facebook.GraphRequest;
import com.facebook.f;
import com.facebook.h;
import com.facebook.internal.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MonitorLoggingManager.java */
/* loaded from: classes.dex */
public class b implements com.facebook.internal.b0.c {

    /* renamed from: b, reason: collision with root package name */
    private static b f9134b;

    /* renamed from: f, reason: collision with root package name */
    private com.facebook.internal.b0.b f9138f;

    /* renamed from: g, reason: collision with root package name */
    private com.facebook.internal.b0.d f9139g;

    /* renamed from: h, reason: collision with root package name */
    private ScheduledFuture f9140h;
    private static final Integer a = 100;

    /* renamed from: c, reason: collision with root package name */
    private static String f9135c = Build.VERSION.RELEASE;

    /* renamed from: d, reason: collision with root package name */
    private static String f9136d = Build.MODEL;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f9137e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f9141i = new a();

    /* compiled from: MonitorLoggingManager.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                b.this.d();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    private b(com.facebook.internal.b0.b bVar, com.facebook.internal.b0.d dVar) {
        if (this.f9138f == null) {
            this.f9138f = bVar;
        }
        if (this.f9139g == null) {
            this.f9139g = dVar;
        }
    }

    static GraphRequest b(List<? extends com.facebook.internal.b0.a> list) {
        String packageName = f.e().getPackageName();
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends com.facebook.internal.b0.a> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().x());
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", f9135c);
            jSONObject.put("device_model", f9136d);
            jSONObject.put("unique_application_identifier", packageName);
            jSONObject.put("entries", jSONArray);
            return GraphRequest.L(null, String.format("%s/monitorings", f.f()), jSONObject, null);
        } catch (JSONException unused) {
            return null;
        }
    }

    static List<GraphRequest> c(com.facebook.internal.b0.b bVar) {
        ArrayList arrayList = new ArrayList();
        if (x.Q(f.f())) {
            return arrayList;
        }
        while (!bVar.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < a.intValue() && !bVar.isEmpty(); i2++) {
                arrayList2.add(bVar.b());
            }
            GraphRequest b2 = b(arrayList2);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    public static synchronized b e(com.facebook.internal.b0.b bVar, com.facebook.internal.b0.d dVar) {
        b bVar2;
        synchronized (b.class) {
            if (f9134b == null) {
                f9134b = new b(bVar, dVar);
            }
            bVar2 = f9134b;
        }
        return bVar2;
    }

    @Override // com.facebook.internal.b0.c
    public void a() {
        this.f9138f.a(this.f9139g.a());
        d();
    }

    public void d() {
        ScheduledFuture scheduledFuture = this.f9140h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        try {
            new h(c(this.f9138f)).x();
        } catch (Exception unused) {
        }
    }
}
