package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2091s implements r {

    /* renamed from: a, reason: collision with root package name */
    private final String f15881a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f15882b;

    public C2091s(String str, List list) {
        this.f15881a = str;
        ArrayList arrayList = new ArrayList();
        this.f15882b = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f15881a;
    }

    public final ArrayList b() {
        return this.f15882b;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2091s)) {
            return false;
        }
        C2091s c2091s = (C2091s) obj;
        String str = this.f15881a;
        if (str == null ? c2091s.f15881a != null : !str.equals(c2091s.f15881a)) {
            return false;
        }
        return this.f15882b.equals(c2091s.f15882b);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean h() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final int hashCode() {
        int i8;
        String str = this.f15881a;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        return (i8 * 31) + this.f15882b.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator i() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r m(String str, T1 t12, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
