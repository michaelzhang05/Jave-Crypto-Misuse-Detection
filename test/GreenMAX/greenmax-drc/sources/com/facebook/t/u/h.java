package com.facebook.t.u;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InAppPurchaseActivityLifecycleTracker.java */
/* loaded from: classes.dex */
public class h {
    private static final String a = "com.facebook.t.u.h";

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f9625b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f9626c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f9627d = null;

    /* renamed from: e, reason: collision with root package name */
    private static ServiceConnection f9628e;

    /* renamed from: f, reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f9629f;

    /* renamed from: g, reason: collision with root package name */
    private static Intent f9630g;

    /* renamed from: h, reason: collision with root package name */
    private static Object f9631h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppPurchaseActivityLifecycleTracker.java */
    /* loaded from: classes.dex */
    public static class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Object unused = h.f9631h = i.a(com.facebook.f.e(), iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppPurchaseActivityLifecycleTracker.java */
    /* loaded from: classes.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {

        /* compiled from: InAppPurchaseActivityLifecycleTracker.java */
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
                    Context e2 = com.facebook.f.e();
                    h.f(e2, i.i(e2, h.f9631h), false);
                    h.f(e2, i.j(e2, h.f9631h), true);
                } catch (Throwable th) {
                    com.facebook.internal.a0.f.a.b(th, this);
                }
            }
        }

        /* compiled from: InAppPurchaseActivityLifecycleTracker.java */
        /* renamed from: com.facebook.t.u.h$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0152b implements Runnable {
            RunnableC0152b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (com.facebook.internal.a0.f.a.c(this)) {
                    return;
                }
                try {
                    Context e2 = com.facebook.f.e();
                    ArrayList<String> i2 = i.i(e2, h.f9631h);
                    if (i2.isEmpty()) {
                        i2 = i.g(e2, h.f9631h);
                    }
                    h.f(e2, i2, false);
                } catch (Throwable th) {
                    com.facebook.internal.a0.f.a.b(th, this);
                }
            }
        }

        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            try {
                com.facebook.f.m().execute(new a());
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            try {
                if (h.f9627d.booleanValue() && activity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")) {
                    com.facebook.f.m().execute(new RunnableC0152b());
                }
            } catch (Exception unused) {
            }
        }
    }

    private static void e() {
        if (f9626c != null) {
            return;
        }
        try {
            Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
            Boolean bool = Boolean.TRUE;
            f9626c = bool;
            try {
                Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                f9627d = bool;
            } catch (ClassNotFoundException unused) {
                f9627d = Boolean.FALSE;
            }
            i.b();
            f9630g = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
            f9628e = new a();
            f9629f = new b();
        } catch (ClassNotFoundException unused2) {
            f9626c = Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context, ArrayList<String> arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                String string = new JSONObject(next).getString("productId");
                hashMap.put(string, next);
                arrayList2.add(string);
            } catch (JSONException e2) {
                Log.e(a, "Error parsing in-app purchase data.", e2);
            }
        }
        for (Map.Entry<String, String> entry : i.k(context, arrayList2, f9631h, z).entrySet()) {
            d.f((String) hashMap.get(entry.getKey()), entry.getValue(), z);
        }
    }

    private static void g() {
        if (f9625b.compareAndSet(false, true)) {
            Context e2 = com.facebook.f.e();
            if (e2 instanceof Application) {
                ((Application) e2).registerActivityLifecycleCallbacks(f9629f);
                e2.bindService(f9630g, f9628e, 1);
            }
        }
    }

    public static void h() {
        e();
        if (f9626c.booleanValue() && d.c()) {
            g();
        }
    }
}
