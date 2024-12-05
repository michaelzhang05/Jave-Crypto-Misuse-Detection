package c.b.a.b;

import c.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FastSafeIterableMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: j, reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f2334j = new HashMap<>();

    @Override // c.b.a.b.b
    public V D(K k2) {
        V v = (V) super.D(k2);
        this.f2334j.remove(k2);
        return v;
    }

    public Map.Entry<K, V> J(K k2) {
        if (contains(k2)) {
            return this.f2334j.get(k2).f2342i;
        }
        return null;
    }

    public boolean contains(K k2) {
        return this.f2334j.containsKey(k2);
    }

    @Override // c.b.a.b.b
    protected b.c<K, V> f(K k2) {
        return this.f2334j.get(k2);
    }

    @Override // c.b.a.b.b
    public V z(K k2, V v) {
        b.c<K, V> f2 = f(k2);
        if (f2 != null) {
            return f2.f2340g;
        }
        this.f2334j.put(k2, x(k2, v));
        return null;
    }
}
