package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes2.dex */
final class xw<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f, reason: collision with root package name */
    private int f12400f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12401g;

    /* renamed from: h, reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f12402h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ pw f12403i;

    private xw(pw pwVar) {
        this.f12403i = pwVar;
        this.f12400f = -1;
    }

    private final Iterator<Map.Entry<K, V>> a() {
        Map map;
        if (this.f12402h == null) {
            map = this.f12403i.f12013h;
            this.f12402h = map.entrySet().iterator();
        }
        return this.f12402h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i2 = this.f12400f + 1;
        list = this.f12403i.f12012g;
        if (i2 >= list.size()) {
            map = this.f12403i.f12013h;
            if (map.isEmpty() || !a().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.f12401g = true;
        int i2 = this.f12400f + 1;
        this.f12400f = i2;
        list = this.f12403i.f12012g;
        if (i2 < list.size()) {
            list2 = this.f12403i.f12012g;
            return (Map.Entry) list2.get(this.f12400f);
        }
        return a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f12401g) {
            this.f12401g = false;
            this.f12403i.j();
            int i2 = this.f12400f;
            list = this.f12403i.f12012g;
            if (i2 < list.size()) {
                pw pwVar = this.f12403i;
                int i3 = this.f12400f;
                this.f12400f = i3 - 1;
                pwVar.r(i3);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ xw(pw pwVar, qw qwVar) {
        this(pwVar);
    }
}
