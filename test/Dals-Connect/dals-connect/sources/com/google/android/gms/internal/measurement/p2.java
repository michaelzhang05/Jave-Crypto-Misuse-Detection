package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes2.dex */
final class p2<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: f, reason: collision with root package name */
    private int f16010f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f16011g;

    /* renamed from: h, reason: collision with root package name */
    private Iterator<Map.Entry<K, V>> f16012h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ h2 f16013i;

    private p2(h2 h2Var) {
        this.f16013i = h2Var;
        this.f16010f = -1;
    }

    private final Iterator<Map.Entry<K, V>> a() {
        Map map;
        if (this.f16012h == null) {
            map = this.f16013i.f15970h;
            this.f16012h = map.entrySet().iterator();
        }
        return this.f16012h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i2 = this.f16010f + 1;
        list = this.f16013i.f15969g;
        if (i2 >= list.size()) {
            map = this.f16013i.f15970h;
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
        this.f16011g = true;
        int i2 = this.f16010f + 1;
        this.f16010f = i2;
        list = this.f16013i.f15969g;
        if (i2 < list.size()) {
            list2 = this.f16013i.f15969g;
            return (Map.Entry) list2.get(this.f16010f);
        }
        return a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (this.f16011g) {
            this.f16011g = false;
            this.f16013i.q();
            int i2 = this.f16010f;
            list = this.f16013i.f15969g;
            if (i2 < list.size()) {
                h2 h2Var = this.f16013i;
                int i3 = this.f16010f;
                this.f16010f = i3 - 1;
                h2Var.i(i3);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ p2(h2 h2Var, i2 i2Var) {
        this(h2Var);
    }
}
