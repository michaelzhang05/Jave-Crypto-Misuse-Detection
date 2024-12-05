package com.facebook.t.w;

import android.util.Log;
import com.facebook.f;
import com.facebook.internal.m;
import com.facebook.internal.n;
import com.facebook.internal.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RestrictiveDataManager.java */
/* loaded from: classes.dex */
public final class a {
    private static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final String f9673b = "com.facebook.t.w.a";

    /* renamed from: c, reason: collision with root package name */
    private static final List<C0156a> f9674c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static final Set<String> f9675d = new CopyOnWriteArraySet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RestrictiveDataManager.java */
    /* renamed from: com.facebook.t.w.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0156a {
        String a;

        /* renamed from: b, reason: collision with root package name */
        Map<String, String> f9676b;

        C0156a(String str, Map<String, String> map) {
            this.a = str;
            this.f9676b = map;
        }
    }

    public static void a() {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            a = true;
            c();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }

    private static String b(String str, String str2) {
        try {
            if (com.facebook.internal.a0.f.a.c(a.class)) {
                return null;
            }
            try {
                for (C0156a c0156a : new ArrayList(f9674c)) {
                    if (c0156a != null && str.equals(c0156a.a)) {
                        for (String str3 : c0156a.f9676b.keySet()) {
                            if (str2.equals(str3)) {
                                return c0156a.f9676b.get(str3);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                Log.w(f9673b, "getMatchedRuleType failed", e2);
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return null;
        }
    }

    private static void c() {
        String h2;
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            m o = n.o(f.f(), false);
            if (o != null && (h2 = o.h()) != null && !h2.isEmpty()) {
                JSONObject jSONObject = new JSONObject(h2);
                f9674c.clear();
                f9675d.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                        C0156a c0156a = new C0156a(next, new HashMap());
                        if (optJSONObject != null) {
                            c0156a.f9676b = x.l(optJSONObject);
                            f9674c.add(c0156a);
                        }
                        if (jSONObject2.has("process_event_name")) {
                            f9675d.add(c0156a.a);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }

    private static boolean d(String str) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return false;
        }
        try {
            return f9675d.contains(str);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return false;
        }
    }

    public static String e(String str) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return null;
        }
        try {
            return a ? d(str) ? "_removed_" : str : str;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return null;
        }
    }

    public static void f(Map<String, String> map, String str) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            if (a) {
                HashMap hashMap = new HashMap();
                for (String str2 : new ArrayList(map.keySet())) {
                    String b2 = b(str, str2);
                    if (b2 != null) {
                        hashMap.put(str2, b2);
                        map.remove(str2);
                    }
                }
                if (hashMap.size() > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                        map.put("_restrictedParams", jSONObject.toString());
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }
}
