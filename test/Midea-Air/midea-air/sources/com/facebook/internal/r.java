package com.facebook.internal;

import android.util.Log;
import cm.aptoide.pt.store.view.StoreTabGridRecyclerFragment;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public class r {
    private static final HashMap<String, String> a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final com.facebook.l f9209b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9210c;

    /* renamed from: d, reason: collision with root package name */
    private StringBuilder f9211d;

    /* renamed from: e, reason: collision with root package name */
    private int f9212e = 3;

    public r(com.facebook.l lVar, String str) {
        y.j(str, StoreTabGridRecyclerFragment.BundleCons.TAG);
        this.f9209b = lVar;
        this.f9210c = "FacebookSDK." + str;
        this.f9211d = new StringBuilder();
    }

    public static void e(com.facebook.l lVar, int i2, String str, String str2) {
        if (com.facebook.f.y(lVar)) {
            String l = l(str2);
            if (!str.startsWith("FacebookSDK.")) {
                str = "FacebookSDK." + str;
            }
            Log.println(i2, str, l);
            if (lVar == com.facebook.l.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    public static void f(com.facebook.l lVar, int i2, String str, String str2, Object... objArr) {
        if (com.facebook.f.y(lVar)) {
            e(lVar, i2, str, String.format(str2, objArr));
        }
    }

    public static void g(com.facebook.l lVar, String str, String str2) {
        e(lVar, 3, str, str2);
    }

    public static void h(com.facebook.l lVar, String str, String str2, Object... objArr) {
        if (com.facebook.f.y(lVar)) {
            e(lVar, 3, str, String.format(str2, objArr));
        }
    }

    public static synchronized void j(String str) {
        synchronized (r.class) {
            if (!com.facebook.f.y(com.facebook.l.INCLUDE_ACCESS_TOKENS)) {
                k(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    public static synchronized void k(String str, String str2) {
        synchronized (r.class) {
            a.put(str, str2);
        }
    }

    private static synchronized String l(String str) {
        synchronized (r.class) {
            for (Map.Entry<String, String> entry : a.entrySet()) {
                str = str.replace(entry.getKey(), entry.getValue());
            }
        }
        return str;
    }

    private boolean m() {
        return com.facebook.f.y(this.f9209b);
    }

    public void a(String str) {
        if (m()) {
            this.f9211d.append(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (m()) {
            this.f9211d.append(String.format(str, objArr));
        }
    }

    public void c(String str, Object obj) {
        b("  %s:\t%s\n", str, obj);
    }

    public void d() {
        i(this.f9211d.toString());
        this.f9211d = new StringBuilder();
    }

    public void i(String str) {
        e(this.f9209b, this.f9212e, this.f9210c, str);
    }
}
