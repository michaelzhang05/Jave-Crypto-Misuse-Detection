package com.flurry.sdk;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class z0<K, V> {
    public final Map<K, List<V>> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f10269b;

    public final Collection<Map.Entry<K, V>> a() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, List<V>> entry : this.a.entrySet()) {
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                arrayList.add(new AbstractMap.SimpleImmutableEntry(entry.getKey(), it.next()));
            }
        }
        return arrayList;
    }

    public final List<V> b(K k2, boolean z) {
        ArrayList arrayList;
        List<V> list = this.a.get(k2);
        if (!z || list != null) {
            return list;
        }
        if (this.f10269b > 0) {
            arrayList = new ArrayList(this.f10269b);
        } else {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = arrayList;
        this.a.put(k2, arrayList2);
        return arrayList2;
    }

    public final void c(K k2, V v) {
        if (k2 == null) {
            return;
        }
        b(k2, true).add(v);
    }
}
