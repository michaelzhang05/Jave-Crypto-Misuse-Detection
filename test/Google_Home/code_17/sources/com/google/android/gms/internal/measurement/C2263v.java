package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2263v implements InterfaceC2236s {

    /* renamed from: a, reason: collision with root package name */
    private final String f16862a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f16863b;

    public C2263v(String str, List list) {
        this.f16862a = str;
        ArrayList arrayList = new ArrayList();
        this.f16863b = arrayList;
        arrayList.addAll(list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final String A() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Iterator B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s C(String str, V2 v22, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final String a() {
        return this.f16862a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s b() {
        return this;
    }

    public final ArrayList c() {
        return this.f16863b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2263v)) {
            return false;
        }
        C2263v c2263v = (C2263v) obj;
        String str = this.f16862a;
        if (str == null ? c2263v.f16862a != null : !str.equals(c2263v.f16862a)) {
            return false;
        }
        ArrayList arrayList = this.f16863b;
        ArrayList arrayList2 = c2263v.f16863b;
        if (arrayList != null) {
            return arrayList.equals(arrayList2);
        }
        if (arrayList2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i8;
        String str = this.f16862a;
        int i9 = 0;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i10 = i8 * 31;
        ArrayList arrayList = this.f16863b;
        if (arrayList != null) {
            i9 = arrayList.hashCode();
        }
        return i10 + i9;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Boolean y() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2236s
    public final Double z() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }
}
