package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes2.dex */
final class rw<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f, reason: collision with root package name */
    private int f12126f;

    /* renamed from: g, reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f12127g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ pw f12128h;

    private rw(pw pwVar) {
        List list;
        this.f12128h = pwVar;
        list = pwVar.f12012g;
        this.f12126f = list.size();
    }

    private final Iterator<Map.Entry<K, V>> a() {
        Map map;
        if (this.f12127g == null) {
            map = this.f12128h.f12016k;
            this.f12127g = map.entrySet().iterator();
        }
        return this.f12127g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i2 = this.f12126f;
        if (i2 > 0) {
            list = this.f12128h.f12012g;
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
            list = this.f12128h.f12012g;
            int i2 = this.f12126f - 1;
            this.f12126f = i2;
            return (Map.Entry) list.get(i2);
        }
        return a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ rw(pw pwVar, qw qwVar) {
        this(pwVar);
    }
}
