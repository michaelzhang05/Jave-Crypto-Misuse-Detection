package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import s1.C3990a;
import s1.EnumC3991b;

/* loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements r {

    /* renamed from: a, reason: collision with root package name */
    private final c f18640a;

    /* loaded from: classes4.dex */
    private static final class Adapter<E> extends TypeAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final TypeAdapter f18641a;

        /* renamed from: b, reason: collision with root package name */
        private final h f18642b;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, h hVar) {
            this.f18641a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f18642b = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection b(C3990a c3990a) {
            if (c3990a.N() == EnumC3991b.NULL) {
                c3990a.J();
                return null;
            }
            Collection collection = (Collection) this.f18642b.a();
            c3990a.a();
            while (c3990a.v()) {
                collection.add(this.f18641a.b(c3990a));
            }
            c3990a.m();
            return collection;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(s1.c cVar, Collection collection) {
            if (collection == null) {
                cVar.A();
                return;
            }
            cVar.f();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f18641a.d(cVar, it.next());
            }
            cVar.m();
        }
    }

    public CollectionTypeAdapterFactory(c cVar) {
        this.f18640a = cVar;
    }

    @Override // com.google.gson.r
    public TypeAdapter a(Gson gson, TypeToken typeToken) {
        Type d8 = typeToken.d();
        Class c8 = typeToken.c();
        if (!Collection.class.isAssignableFrom(c8)) {
            return null;
        }
        Type h8 = b.h(d8, c8);
        return new Adapter(gson, h8, gson.k(TypeToken.b(h8)), this.f18640a.b(typeToken));
    }
}
