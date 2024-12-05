package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes2.dex */
final class j2<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f, reason: collision with root package name */
    private int f15979f;

    /* renamed from: g, reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f15980g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ h2 f15981h;

    private j2(h2 h2Var) {
        List list;
        this.f15981h = h2Var;
        list = h2Var.f15969g;
        this.f15979f = list.size();
    }

    private final Iterator<Map.Entry<K, V>> a() {
        Map map;
        if (this.f15980g == null) {
            map = this.f15981h.f15973k;
            this.f15980g = map.entrySet().iterator();
        }
        return this.f15980g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i2 = this.f15979f;
        if (i2 > 0) {
            list = this.f15981h.f15969g;
            if (i2 <= list.size()) {
                return true;
            }
        }
        return a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (!a().hasNext()) {
            list = this.f15981h.f15969g;
            int i2 = this.f15979f - 1;
            this.f15979f = i2;
            return (Map.Entry) list.get(i2);
        }
        return a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ j2(h2 h2Var, i2 i2Var) {
        this(h2Var);
    }
}
