package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class g1<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: f, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f15961f;

    public g1(Iterator<Map.Entry<K, Object>> it) {
        this.f15961f = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15961f.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f15961f.next();
        return next.getValue() instanceof zzuy ? new f1(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f15961f.remove();
    }
}
