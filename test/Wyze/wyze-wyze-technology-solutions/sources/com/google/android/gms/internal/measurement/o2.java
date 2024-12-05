package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX WARN: Incorrect field signature: TK; */
/* loaded from: classes2.dex */
public final class o2<K, V> implements Comparable<o2>, Map.Entry<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private final Comparable f16005f;

    /* renamed from: g, reason: collision with root package name */
    private V f16006g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ h2 f16007h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o2(h2 h2Var, Map.Entry<K, V> entry) {
        this(h2Var, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(o2 o2Var) {
        return ((Comparable) getKey()).compareTo((Comparable) o2Var.getKey());
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
        return d(this.f16005f, entry.getKey()) && d(this.f16006g, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f16005f;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f16006g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f16005f;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f16006g;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f16007h.q();
        V v2 = this.f16006g;
        this.f16006g = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16005f);
        String valueOf2 = String.valueOf(this.f16006g);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public o2(h2 h2Var, K k2, V v) {
        this.f16007h = h2Var;
        this.f16005f = k2;
        this.f16006g = v;
    }
}
