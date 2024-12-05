package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.f6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2122f6 implements Comparable, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f16640a;

    /* renamed from: b, reason: collision with root package name */
    private Object f16641b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Z5 f16642c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2122f6(Z5 z52, Map.Entry entry) {
        this(z52, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C2122f6) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (a(this.f16640a, entry.getKey()) && a(this.f16641b, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f16640a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16641b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f16640a;
        int i8 = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f16641b;
        if (obj != null) {
            i8 = obj.hashCode();
        }
        return hashCode ^ i8;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f16642c.r();
        Object obj2 = this.f16641b;
        this.f16641b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f16640a) + "=" + String.valueOf(this.f16641b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2122f6(Z5 z52, Comparable comparable, Object obj) {
        this.f16642c = z52;
        this.f16640a = comparable;
        this.f16641b = obj;
    }
}
