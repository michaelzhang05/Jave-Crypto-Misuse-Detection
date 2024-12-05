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
import s1.C3990a;
import s1.EnumC3991b;

/* loaded from: classes4.dex */
public final class MapTypeAdapterFactory implements r {

    /* renamed from: a, reason: collision with root package name */
    private final c f18650a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f18651b;

    /* loaded from: classes4.dex */
    private final class Adapter<K, V> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter f18652a;

        /* renamed from: b, reason: collision with root package name */
        private final TypeAdapter f18653b;

        /* renamed from: c, reason: collision with root package name */
        private final h f18654c;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, Type type2, TypeAdapter typeAdapter2, h hVar) {
            this.f18652a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f18653b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f18654c = hVar;
        }

        private String e(f fVar) {
            if (fVar.l()) {
                k e8 = fVar.e();
                if (e8.r()) {
                    return String.valueOf(e8.n());
                }
                if (e8.p()) {
                    return Boolean.toString(e8.m());
                }
                if (e8.t()) {
                    return e8.o();
                }
                throw new AssertionError();
            }
            if (fVar.j()) {
                return "null";
            }
            throw new AssertionError();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map b(C3990a c3990a) {
            EnumC3991b N8 = c3990a.N();
            if (N8 == EnumC3991b.NULL) {
                c3990a.J();
                return null;
            }
            Map map = (Map) this.f18654c.a();
            if (N8 == EnumC3991b.BEGIN_ARRAY) {
                c3990a.a();
                while (c3990a.v()) {
                    c3990a.a();
                    Object b8 = this.f18652a.b(c3990a);
                    if (map.put(b8, this.f18653b.b(c3990a)) == null) {
                        c3990a.m();
                    } else {
                        throw new m("duplicate key: " + b8);
                    }
                }
                c3990a.m();
            } else {
                c3990a.b();
                while (c3990a.v()) {
                    e.f18795a.a(c3990a);
                    Object b9 = this.f18652a.b(c3990a);
                    if (map.put(b9, this.f18653b.b(c3990a)) != null) {
                        throw new m("duplicate key: " + b9);
                    }
                }
                c3990a.n();
            }
            return map;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(s1.c cVar, Map map) {
            boolean z8;
            if (map == null) {
                cVar.A();
                return;
            }
            if (!MapTypeAdapterFactory.this.f18651b) {
                cVar.g();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.x(String.valueOf(entry.getKey()));
                    this.f18653b.d(cVar, entry.getValue());
                }
                cVar.n();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i8 = 0;
            boolean z9 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                f c8 = this.f18652a.c(entry2.getKey());
                arrayList.add(c8);
                arrayList2.add(entry2.getValue());
                if (!c8.f() && !c8.k()) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                z9 |= z8;
            }
            if (z9) {
                cVar.f();
                int size = arrayList.size();
                while (i8 < size) {
                    cVar.f();
                    l.a((f) arrayList.get(i8), cVar);
                    this.f18653b.d(cVar, arrayList2.get(i8));
                    cVar.m();
                    i8++;
                }
                cVar.m();
                return;
            }
            cVar.g();
            int size2 = arrayList.size();
            while (i8 < size2) {
                cVar.x(e((f) arrayList.get(i8)));
                this.f18653b.d(cVar, arrayList2.get(i8));
                i8++;
            }
            cVar.n();
        }
    }

    public MapTypeAdapterFactory(c cVar, boolean z8) {
        this.f18650a = cVar;
        this.f18651b = z8;
    }

    private TypeAdapter b(Gson gson, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return gson.k(TypeToken.b(type));
        }
        return TypeAdapters.f18732f;
    }

    @Override // com.google.gson.r
    public TypeAdapter a(Gson gson, TypeToken typeToken) {
        Type d8 = typeToken.d();
        Class c8 = typeToken.c();
        if (!Map.class.isAssignableFrom(c8)) {
            return null;
        }
        Type[] j8 = b.j(d8, c8);
        return new Adapter(gson, j8[0], b(gson, j8[0]), j8[1], gson.k(TypeToken.b(j8[1])), this.f18650a.b(typeToken));
    }
}
