package com.facebook.t;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.internal.x;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

/* compiled from: UserDataStore.java */
/* loaded from: classes.dex */
public class p {
    private static final String a = "p";

    /* renamed from: b, reason: collision with root package name */
    private static SharedPreferences f9492b;

    /* renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f9493c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f9494d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f9495e = new ConcurrentHashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserDataStore.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9496f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f9497g;

        a(String str, String str2) {
            this.f9496f = str;
            this.f9497g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                if (!p.a().get()) {
                    p.b();
                }
                p.c().edit().putString(this.f9496f, this.f9497g).apply();
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    static /* synthetic */ AtomicBoolean a() {
        if (com.facebook.internal.a0.f.a.c(p.class)) {
            return null;
        }
        try {
            return f9493c;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, p.class);
            return null;
        }
    }

    static /* synthetic */ void b() {
        if (com.facebook.internal.a0.f.a.c(p.class)) {
            return;
        }
        try {
            f();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, p.class);
        }
    }

    static /* synthetic */ SharedPreferences c() {
        if (com.facebook.internal.a0.f.a.c(p.class)) {
            return null;
        }
        try {
            return f9492b;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, p.class);
            return null;
        }
    }

    public static String d() {
        if (com.facebook.internal.a0.f.a.c(p.class)) {
            return null;
        }
        try {
            if (!f9493c.get()) {
                f();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f9494d);
            hashMap.putAll(e());
            return x.X(hashMap);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, p.class);
            return null;
        }
    }

    private static Map<String, String> e() {
        if (com.facebook.internal.a0.f.a.c(p.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> b2 = com.facebook.t.q.c.b();
            for (String str : f9495e.keySet()) {
                if (b2.contains(str)) {
                    hashMap.put(str, f9495e.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, p.class);
            return null;
        }
    }

    private static synchronized void f() {
        synchronized (p.class) {
            if (com.facebook.internal.a0.f.a.c(p.class)) {
                return;
            }
            try {
                if (f9493c.get()) {
                    return;
                }
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.facebook.f.e());
                f9492b = defaultSharedPreferences;
                String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", HttpUrl.FRAGMENT_ENCODE_SET);
                String string2 = f9492b.getString("com.facebook.appevents.UserDataStore.internalUserData", HttpUrl.FRAGMENT_ENCODE_SET);
                f9494d.putAll(x.a(string));
                f9495e.putAll(x.a(string2));
                f9493c.set(true);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, p.class);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g() {
        if (com.facebook.internal.a0.f.a.c(p.class)) {
            return;
        }
        try {
            if (f9493c.get()) {
                return;
            }
            f();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, p.class);
        }
    }

    private static String h(String str, String str2) {
        if (com.facebook.internal.a0.f.a.c(p.class)) {
            return null;
        }
        try {
            String lowerCase = str2.trim().toLowerCase();
            if ("em".equals(str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                Log.e(a, "Setting email failure: this is not a valid email address");
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if ("ph".equals(str)) {
                return lowerCase.replaceAll("[^0-9]", HttpUrl.FRAGMENT_ENCODE_SET);
            }
            if (!"ge".equals(str)) {
                return lowerCase;
            }
            String substring = lowerCase.length() > 0 ? lowerCase.substring(0, 1) : HttpUrl.FRAGMENT_ENCODE_SET;
            if (!"f".equals(substring) && !"m".equals(substring)) {
                Log.e(a, "Setting gender failure: the supported value for gender is f or m");
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            return substring;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, p.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Map<String, String> map) {
        if (com.facebook.internal.a0.f.a.c(p.class)) {
            return;
        }
        try {
            if (!f9493c.get()) {
                f();
            }
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                String q0 = x.q0(h(key, map.get(key).trim()));
                ConcurrentHashMap<String, String> concurrentHashMap = f9495e;
                if (concurrentHashMap.containsKey(key)) {
                    String str = concurrentHashMap.get(key);
                    String[] split = str != null ? str.split(",") : new String[0];
                    HashSet hashSet = new HashSet(Arrays.asList(split));
                    if (hashSet.contains(q0)) {
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (split.length == 0) {
                        sb.append(q0);
                    } else if (split.length < 5) {
                        sb.append(str);
                        sb.append(",");
                        sb.append(q0);
                    } else {
                        for (int i2 = 1; i2 < 5; i2++) {
                            sb.append(split[i2]);
                            sb.append(",");
                        }
                        sb.append(q0);
                        hashSet.remove(split[0]);
                    }
                    f9495e.put(key, sb.toString());
                } else {
                    concurrentHashMap.put(key, q0);
                }
            }
            j("com.facebook.appevents.UserDataStore.internalUserData", x.X(f9495e));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, p.class);
        }
    }

    private static void j(String str, String str2) {
        if (com.facebook.internal.a0.f.a.c(p.class)) {
            return;
        }
        try {
            com.facebook.f.m().execute(new a(str, str2));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, p.class);
        }
    }
}
