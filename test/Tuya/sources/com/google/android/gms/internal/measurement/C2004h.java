package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2004h implements r {

    /* renamed from: a, reason: collision with root package name */
    private final r f15722a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15723b;

    public C2004h(String str) {
        this.f15722a = r.f15866c0;
        this.f15723b = str;
    }

    public final r a() {
        return this.f15722a;
    }

    public final String b() {
        return this.f15723b;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return new C2004h(this.f15723b, this.f15722a.d());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2004h)) {
            return false;
        }
        C2004h c2004h = (C2004h) obj;
        if (this.f15723b.equals(c2004h.f15723b) && this.f15722a.equals(c2004h.f15722a)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean h() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final int hashCode() {
        return (this.f15723b.hashCode() * 31) + this.f15722a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator i() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r m(String str, T1 t12, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C2004h(String str, r rVar) {
        this.f15722a = rVar;
        this.f15723b = str;
    }
}
