package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class kv<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: f, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f11737f;

    public kv(Iterator<Map.Entry<K, Object>> it) {
        this.f11737f = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11737f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f11737f.next();
        return next.getValue() instanceof zzdon ? new jv(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f11737f.remove();
    }
}
