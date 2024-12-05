package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2105e {

    /* renamed from: d, reason: collision with root package name */
    private static final x0.r f16608d = x0.r.v("_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    private String f16609a;

    /* renamed from: b, reason: collision with root package name */
    private long f16610b;

    /* renamed from: c, reason: collision with root package name */
    private Map f16611c;

    public C2105e(String str, long j8, Map map) {
        this.f16609a = str;
        this.f16610b = j8;
        HashMap hashMap = new HashMap();
        this.f16611c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        if (f16608d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
            return obj2;
        }
        if (obj instanceof Double) {
            return obj2;
        }
        if (obj instanceof Long) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (obj instanceof String) {
            return obj2.toString();
        }
        return obj2;
    }

    public final long a() {
        return this.f16610b;
    }

    public final Object b(String str) {
        if (this.f16611c.containsKey(str)) {
            return this.f16611c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new C2105e(this.f16609a, this.f16610b, new HashMap(this.f16611c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f16611c.remove(str);
        } else {
            this.f16611c.put(str, c(str, this.f16611c.get(str), obj));
        }
    }

    public final String e() {
        return this.f16609a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2105e)) {
            return false;
        }
        C2105e c2105e = (C2105e) obj;
        if (this.f16610b != c2105e.f16610b || !this.f16609a.equals(c2105e.f16609a)) {
            return false;
        }
        return this.f16611c.equals(c2105e.f16611c);
    }

    public final void f(String str) {
        this.f16609a = str;
    }

    public final Map g() {
        return this.f16611c;
    }

    public final int hashCode() {
        int hashCode = this.f16609a.hashCode() * 31;
        long j8 = this.f16610b;
        return ((hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f16611c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f16609a + "', timestamp=" + this.f16610b + ", params=" + String.valueOf(this.f16611c) + "}";
    }
}
