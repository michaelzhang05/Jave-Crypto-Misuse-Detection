package com.bumptech.glide.load.engine.z;

import com.bumptech.glide.load.engine.z.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: GroupedLinkedMap.java */
/* loaded from: classes.dex */
class h<K extends m, V> {
    private final a<K, V> a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f8631b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GroupedLinkedMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> {
        final K a;

        /* renamed from: b, reason: collision with root package name */
        private List<V> f8632b;

        /* renamed from: c, reason: collision with root package name */
        a<K, V> f8633c;

        /* renamed from: d, reason: collision with root package name */
        a<K, V> f8634d;

        a() {
            this(null);
        }

        public void a(V v) {
            if (this.f8632b == null) {
                this.f8632b = new ArrayList();
            }
            this.f8632b.add(v);
        }

        public V b() {
            int c2 = c();
            if (c2 > 0) {
                return this.f8632b.remove(c2 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f8632b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k2) {
            this.f8634d = this;
            this.f8633c = this;
            this.a = k2;
        }
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.a;
        aVar.f8634d = aVar2;
        aVar.f8633c = aVar2.f8633c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.a;
        aVar.f8634d = aVar2.f8634d;
        aVar.f8633c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f8634d;
        aVar2.f8633c = aVar.f8633c;
        aVar.f8633c.f8634d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f8633c.f8634d = aVar;
        aVar.f8634d.f8633c = aVar;
    }

    public V a(K k2) {
        a<K, V> aVar = this.f8631b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            this.f8631b.put(k2, aVar);
        } else {
            k2.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k2, V v) {
        a<K, V> aVar = this.f8631b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            c(aVar);
            this.f8631b.put(k2, aVar);
        } else {
            k2.a();
        }
        aVar.a(v);
    }

    public V f() {
        for (a aVar = this.a.f8634d; !aVar.equals(this.a); aVar = aVar.f8634d) {
            V v = (V) aVar.b();
            if (v != null) {
                return v;
            }
            e(aVar);
            this.f8631b.remove(aVar.a);
            ((m) aVar.a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a aVar = this.a.f8633c; !aVar.equals(this.a); aVar = aVar.f8633c) {
            z = true;
            sb.append('{');
            sb.append(aVar.a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
