package com.facebook.t.q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MetadataRule.java */
/* loaded from: classes.dex */
public final class c {
    private static final Set<c> a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private String f9499b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f9500c;

    /* renamed from: d, reason: collision with root package name */
    private String f9501d;

    private c(String str, List<String> list, String str2) {
        this.f9499b = str;
        this.f9500c = list;
        this.f9501d = str2;
    }

    private static void a(JSONObject jSONObject) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("k");
                    String optString2 = optJSONObject.optString("v");
                    if (!optString.isEmpty()) {
                        a.add(new c(next, Arrays.asList(optString.split(",")), optString2));
                    }
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
        }
    }

    public static Set<String> b() {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            HashSet hashSet = new HashSet();
            Iterator<c> it = a.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().d());
            }
            return hashSet;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set<c> e() {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            return new HashSet(a);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(String str) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return;
        }
        try {
            a.clear();
            a(new JSONObject(str));
        } catch (JSONException unused) {
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> c() {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f9500c);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return null;
        }
        try {
            return this.f9499b;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return null;
        }
        try {
            return this.f9501d;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
            return null;
        }
    }
}
