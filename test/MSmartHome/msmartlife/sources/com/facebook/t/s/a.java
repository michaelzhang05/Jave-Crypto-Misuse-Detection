package com.facebook.t.s;

import com.facebook.f;
import com.facebook.internal.m;
import com.facebook.internal.n;
import com.facebook.internal.x;
import com.facebook.t.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: EventDeactivationManager.java */
/* loaded from: classes.dex */
public final class a {
    private static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    private static final List<C0149a> f9597b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f9598c = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EventDeactivationManager.java */
    /* renamed from: com.facebook.t.s.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0149a {
        String a;

        /* renamed from: b, reason: collision with root package name */
        List<String> f9599b;

        C0149a(String str, List<String> list) {
            this.a = str;
            this.f9599b = list;
        }
    }

    public static void a() {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            a = true;
            b();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }

    private static synchronized void b() {
        m o;
        synchronized (a.class) {
            if (com.facebook.internal.a0.f.a.c(a.class)) {
                return;
            }
            try {
                o = n.o(f.f(), false);
            } catch (Exception unused) {
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, a.class);
                return;
            }
            if (o == null) {
                return;
            }
            String h2 = o.h();
            if (!h2.isEmpty()) {
                JSONObject jSONObject = new JSONObject(h2);
                f9597b.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            f9598c.add(next);
                        } else {
                            JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            C0149a c0149a = new C0149a(next, new ArrayList());
                            if (optJSONArray != null) {
                                c0149a.f9599b = x.k(optJSONArray);
                            }
                            f9597b.add(c0149a);
                        }
                    }
                }
            }
        }
    }

    public static void c(Map<String, String> map, String str) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            if (a) {
                ArrayList<String> arrayList = new ArrayList(map.keySet());
                for (C0149a c0149a : new ArrayList(f9597b)) {
                    if (c0149a.a.equals(str)) {
                        for (String str2 : arrayList) {
                            if (c0149a.f9599b.contains(str2)) {
                                map.remove(str2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }

    public static void d(List<c> list) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            if (a) {
                Iterator<c> it = list.iterator();
                while (it.hasNext()) {
                    if (f9598c.contains(it.next().e())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }
}
