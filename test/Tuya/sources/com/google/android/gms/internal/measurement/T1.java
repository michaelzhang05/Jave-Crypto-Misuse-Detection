package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class T1 {

    /* renamed from: a, reason: collision with root package name */
    public final T1 f15554a;

    /* renamed from: b, reason: collision with root package name */
    final C2147z f15555b;

    /* renamed from: c, reason: collision with root package name */
    final Map f15556c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    final Map f15557d = new HashMap();

    public T1(T1 t12, C2147z c2147z) {
        this.f15554a = t12;
        this.f15555b = c2147z;
    }

    public final T1 a() {
        return new T1(this, this.f15555b);
    }

    public final r b(r rVar) {
        return this.f15555b.a(this, rVar);
    }

    public final r c(C1986f c1986f) {
        r rVar = r.f15866c0;
        Iterator u8 = c1986f.u();
        while (u8.hasNext()) {
            rVar = this.f15555b.a(this, c1986f.s(((Integer) u8.next()).intValue()));
            if (rVar instanceof C2004h) {
                break;
            }
        }
        return rVar;
    }

    public final r d(String str) {
        if (this.f15556c.containsKey(str)) {
            return (r) this.f15556c.get(str);
        }
        T1 t12 = this.f15554a;
        if (t12 != null) {
            return t12.d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void e(String str, r rVar) {
        if (this.f15557d.containsKey(str)) {
            return;
        }
        if (rVar == null) {
            this.f15556c.remove(str);
        } else {
            this.f15556c.put(str, rVar);
        }
    }

    public final void f(String str, r rVar) {
        e(str, rVar);
        this.f15557d.put(str, Boolean.TRUE);
    }

    public final void g(String str, r rVar) {
        T1 t12;
        if (!this.f15556c.containsKey(str) && (t12 = this.f15554a) != null && t12.h(str)) {
            this.f15554a.g(str, rVar);
        } else {
            if (this.f15557d.containsKey(str)) {
                return;
            }
            if (rVar == null) {
                this.f15556c.remove(str);
            } else {
                this.f15556c.put(str, rVar);
            }
        }
    }

    public final boolean h(String str) {
        if (this.f15556c.containsKey(str)) {
            return true;
        }
        T1 t12 = this.f15554a;
        if (t12 != null) {
            return t12.h(str);
        }
        return false;
    }
}
