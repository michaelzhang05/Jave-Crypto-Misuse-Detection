package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX WARN: Incorrect field signature: TK; */
/* loaded from: classes2.dex */
public final class ww<K, V> implements Comparable<ww>, Map.Entry<K, V> {

    /* renamed from: f, reason: collision with root package name */
    private final Comparable f12345f;

    /* renamed from: g, reason: collision with root package name */
    private V f12346g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ pw f12347h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ww(pw pwVar, Map.Entry<K, V> entry) {
        this(pwVar, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ww wwVar) {
        return ((Comparable) getKey()).compareTo((Comparable) wwVar.getKey());
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
        return d(this.f12345f, entry.getKey()) && d(this.f12346g, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f12345f;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f12346g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f12345f;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f12346g;
        return hashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f12347h.j();
        V v2 = this.f12346g;
        this.f12346g = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12345f);
        String valueOf2 = String.valueOf(this.f12346g);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public ww(pw pwVar, K k2, V v) {
        this.f12347h = pwVar;
        this.f12345f = k2;
        this.f12346g = v;
    }
}
