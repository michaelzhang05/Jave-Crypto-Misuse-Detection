package com.airbnb.lottie;

import java.util.Arrays;

/* compiled from: LottieResult.java */
/* loaded from: classes.dex */
public final class k<V> {
    private final V a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f7949b;

    public k(V v) {
        this.a = v;
        this.f7949b = null;
    }

    public Throwable a() {
        return this.f7949b;
    }

    public V b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (b() != null && b().equals(kVar.b())) {
            return true;
        }
        if (a() == null || kVar.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public k(Throwable th) {
        this.f7949b = th;
        this.a = null;
    }
}
