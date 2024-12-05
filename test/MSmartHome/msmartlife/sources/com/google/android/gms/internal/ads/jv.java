package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
final class jv<K> implements Map.Entry<K, Object> {

    /* renamed from: f, reason: collision with root package name */
    private Map.Entry<K, zzdon> f11665f;

    private jv(Map.Entry<K, zzdon> entry) {
        this.f11665f = entry;
    }

    public final zzdon a() {
        return this.f11665f.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f11665f.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f11665f.getValue() == null) {
            return null;
        }
        return zzdon.e();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzdpk) {
            return this.f11665f.getValue().d((zzdpk) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
