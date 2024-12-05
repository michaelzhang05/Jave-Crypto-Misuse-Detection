package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.internal.b;
import com.google.gson.internal.c;
import com.google.gson.internal.e;
import com.google.gson.internal.h;
import com.google.gson.internal.l;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p1.C3596a;
import p1.EnumC3597b;

/* loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements r {

    /* renamed from: a, reason: collision with root package name */
    private final c f17595a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f17596b;

    /* loaded from: classes3.dex */
    private final class Adapter<K, V> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter f17597a;

        /* renamed from: b, reason: collision with root package name */
        private final TypeAdapter f17598b;

        /* renamed from: c, reason: collision with root package name */
        private final h f17599c;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, Type type2, TypeAdapter typeAdapter2, h hVar) {
            this.f17597a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f17598b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f17599c = hVar;
        }

        private String e(f fVar) {
            if (fVar.m()) {
                k g8 = fVar.g();
                if (g8.u()) {
                    return String.valueOf(g8.q());
                }
                if (g8.s()) {
                    return Boolean.toString(g8.p());
                }
                if (g8.v()) {
                    return g8.r();
                }
                throw new AssertionError();
            }
            if (fVar.i()) {
                return "null";
            }
            throw new AssertionError();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map b(C3596a c3596a) {
            EnumC3597b N8 = c3596a.N();
            if (N8 == EnumC3597b.NULL) {
                c3596a.J();
                return null;
            }
            Map map = (Map) this.f17599c.a();
            if (N8 == EnumC3597b.BEGIN_ARRAY) {
                c3596a.a();
                while (c3596a.t()) {
                    c3596a.a();
                    Object b8 = this.f17597a.b(c3596a);
                    if (map.put(b8, this.f17598b.b(c3596a)) == null) {
                        c3596a.h();
                    } else {
                        throw new m("duplicate key: " + b8);
                    }
                }
                c3596a.h();
            } else {
                c3596a.b();
                while (c3596a.t()) {
                    e.f17740a.a(c3596a);
                    Object b9 = this.f17597a.b(c3596a);
                    if (map.put(b9, this.f17598b.b(c3596a)) != null) {
                        throw new m("duplicate key: " + b9);
                    }
                }
                c3596a.l();
            }
            return map;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(p1.c cVar, Map map) {
            boolean z8;
            if (map == null) {
                cVar.x();
                return;
            }
            if (!MapTypeAdapterFactory.this.f17596b) {
                cVar.f();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.u(String.valueOf(entry.getKey()));
                    this.f17598b.d(cVar, entry.getValue());
                }
                cVar.l();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i8 = 0;
            boolean z9 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                f c8 = this.f17597a.c(entry2.getKey());
                arrayList.add(c8);
                arrayList2.add(entry2.getValue());
                if (!c8.h() && !c8.l()) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                z9 |= z8;
            }
            if (z9) {
                cVar.e();
                int size = arrayList.size();
                while (i8 < size) {
                    cVar.e();
                    l.a((f) arrayList.get(i8), cVar);
                    this.f17598b.d(cVar, arrayList2.get(i8));
                    cVar.h();
                    i8++;
                }
                cVar.h();
                return;
            }
            cVar.f();
            int size2 = arrayList.size();
            while (i8 < size2) {
                cVar.u(e((f) arrayList.get(i8)));
                this.f17598b.d(cVar, arrayList2.get(i8));
                i8++;
            }
            cVar.l();
        }
    }

    public MapTypeAdapterFactory(c cVar, boolean z8) {
        this.f17595a = cVar;
        this.f17596b = z8;
    }

    private TypeAdapter b(Gson gson, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return gson.k(TypeToken.b(type));
        }
        return TypeAdapters.f17677f;
    }

    @Override // com.google.gson.r
    public TypeAdapter a(Gson gson, TypeToken typeToken) {
        Type d8 = typeToken.d();
        Class c8 = typeToken.c();
        if (!Map.class.isAssignableFrom(c8)) {
            return null;
        }
        Type[] j8 = b.j(d8, c8);
        return new Adapter(gson, j8[0], b(gson, j8[0]), j8[1], gson.k(TypeToken.b(j8[1])), this.f17595a.b(typeToken));
    }
}
