package com.google.android.gms.internal.measurement;

import java.util.Map;

/* loaded from: classes2.dex */
final class f1<K> implements Map.Entry<K, Object> {

    /* renamed from: f, reason: collision with root package name */
    private Map.Entry<K, zzuy> f15955f;

    private f1(Map.Entry<K, zzuy> entry) {
        this.f15955f = entry;
    }

    public final zzuy a() {
        return this.f15955f.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f15955f.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f15955f.getValue() == null) {
            return null;
        }
        return zzuy.e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzvv) {
            return this.f15955f.getValue().b((zzvv) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
