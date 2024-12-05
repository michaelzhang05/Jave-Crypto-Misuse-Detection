package com.airbnb.lottie.s;

/* compiled from: MutablePair.java */
/* loaded from: classes.dex */
public class h<T> {
    T a;

    /* renamed from: b, reason: collision with root package name */
    T f8115b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t, T t2) {
        this.a = t;
        this.f8115b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c.h.j.f)) {
            return false;
        }
        c.h.j.f fVar = (c.h.j.f) obj;
        return a(fVar.a, this.a) && a(fVar.f2746b, this.f8115b);
    }

    public int hashCode() {
        T t = this.a;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f8115b;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.a) + " " + String.valueOf(this.f8115b) + "}";
    }
}
