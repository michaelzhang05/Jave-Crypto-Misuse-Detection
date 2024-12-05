package com.google.gson.t.n;

import com.google.gson.JsonSyntaxException;
import com.google.gson.q;
import com.google.gson.r;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: MapTypeAdapterFactory.java */
/* loaded from: classes2.dex */
public final class g implements r {

    /* renamed from: f, reason: collision with root package name */
    private final com.google.gson.t.c f16927f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f16928g;

    /* compiled from: MapTypeAdapterFactory.java */
    /* loaded from: classes2.dex */
    private final class a<K, V> extends q<Map<K, V>> {
        private final q<K> a;

        /* renamed from: b, reason: collision with root package name */
        private final q<V> f16929b;

        /* renamed from: c, reason: collision with root package name */
        private final com.google.gson.t.i<? extends Map<K, V>> f16930c;

        public a(com.google.gson.e eVar, Type type, q<K> qVar, Type type2, q<V> qVar2, com.google.gson.t.i<? extends Map<K, V>> iVar) {
            this.a = new m(eVar, qVar, type);
            this.f16929b = new m(eVar, qVar2, type2);
            this.f16930c = iVar;
        }

        private String e(com.google.gson.j jVar) {
            if (jVar.z()) {
                com.google.gson.m f2 = jVar.f();
                if (f2.R()) {
                    return String.valueOf(f2.N());
                }
                if (f2.P()) {
                    return Boolean.toString(f2.D());
                }
                if (f2.T()) {
                    return f2.O();
                }
                throw new AssertionError();
            }
            if (jVar.w()) {
                return "null";
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> b(com.google.gson.stream.a aVar) throws IOException {
            com.google.gson.stream.b x0 = aVar.x0();
            if (x0 == com.google.gson.stream.b.NULL) {
                aVar.t0();
                return null;
            }
            Map<K, V> a = this.f16930c.a();
            if (x0 == com.google.gson.stream.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.L()) {
                    aVar.a();
                    K b2 = this.a.b(aVar);
                    if (a.put(b2, this.f16929b.b(aVar)) == null) {
                        aVar.z();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + b2);
                    }
                }
                aVar.z();
            } else {
                aVar.b();
                while (aVar.L()) {
                    com.google.gson.t.f.a.a(aVar);
                    K b3 = this.a.b(aVar);
                    if (a.put(b3, this.f16929b.b(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + b3);
                    }
                }
                aVar.D();
            }
            return a;
        }

        @Override // com.google.gson.q
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(com.google.gson.stream.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.c0();
                return;
            }
            if (!g.this.f16928g) {
                cVar.o();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.T(String.valueOf(entry.getKey()));
                    this.f16929b.d(cVar, entry.getValue());
                }
                cVar.D();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i2 = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                com.google.gson.j c2 = this.a.c(entry2.getKey());
                arrayList.add(c2);
                arrayList2.add(entry2.getValue());
                z |= c2.o() || c2.x();
            }
            if (z) {
                cVar.f();
                int size = arrayList.size();
                while (i2 < size) {
                    cVar.f();
                    com.google.gson.t.l.b((com.google.gson.j) arrayList.get(i2), cVar);
                    this.f16929b.d(cVar, arrayList2.get(i2));
                    cVar.z();
                    i2++;
                }
                cVar.z();
                return;
            }
            cVar.o();
            int size2 = arrayList.size();
            while (i2 < size2) {
                cVar.T(e((com.google.gson.j) arrayList.get(i2)));
                this.f16929b.d(cVar, arrayList2.get(i2));
                i2++;
            }
            cVar.D();
        }
    }

    public g(com.google.gson.t.c cVar, boolean z) {
        this.f16927f = cVar;
        this.f16928g = z;
    }

    private q<?> a(com.google.gson.e eVar, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return eVar.j(com.google.gson.u.a.get(type));
        }
        return n.f16962f;
    }

    @Override // com.google.gson.r
    public <T> q<T> b(com.google.gson.e eVar, com.google.gson.u.a<T> aVar) {
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        Type[] j2 = com.google.gson.t.b.j(type, com.google.gson.t.b.k(type));
        return new a(eVar, j2[0], a(eVar, j2[0]), j2[1], eVar.j(com.google.gson.u.a.get(j2[1])), this.f16927f.a(aVar));
    }
}
