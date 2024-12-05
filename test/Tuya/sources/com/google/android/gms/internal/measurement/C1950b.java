package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1950b {

    /* renamed from: a, reason: collision with root package name */
    private String f15643a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15644b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f15645c;

    public C1950b(String str, long j8, Map map) {
        this.f15643a = str;
        this.f15644b = j8;
        HashMap hashMap = new HashMap();
        this.f15645c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final long a() {
        return this.f15644b;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1950b clone() {
        return new C1950b(this.f15643a, this.f15644b, new HashMap(this.f15645c));
    }

    public final Object c(String str) {
        if (this.f15645c.containsKey(str)) {
            return this.f15645c.get(str);
        }
        return null;
    }

    public final String d() {
        return this.f15643a;
    }

    public final Map e() {
        return this.f15645c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1950b)) {
            return false;
        }
        C1950b c1950b = (C1950b) obj;
        if (this.f15644b != c1950b.f15644b || !this.f15643a.equals(c1950b.f15643a)) {
            return false;
        }
        return this.f15645c.equals(c1950b.f15645c);
    }

    public final void f(String str) {
        this.f15643a = str;
    }

    public final void g(String str, Object obj) {
        if (obj == null) {
            this.f15645c.remove(str);
        } else {
            this.f15645c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f15643a.hashCode() * 31;
        long j8 = this.f15644b;
        return ((hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f15645c.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.f15643a + "', timestamp=" + this.f15644b + ", params=" + this.f15645c.toString() + "}";
    }
}
